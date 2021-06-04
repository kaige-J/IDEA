package cn.jkg.taotao.controller;

import cn.jkg.taotao.pojo.EasyUIDataGridResult;
import cn.jkg.taotao.pojo.TaotaoResult;
import cn.jkg.taotao.pojo.TbItemParam;
import cn.jkg.taotao.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.controller
 * @ClassName: ItemParamController
 * @Author: jkg
 * @Description: 商品规格参数
 * @Date: 2021/6/3 22:30
 */
@Controller
@RequestMapping("/item/param")
public class ItemParamController {
    @Autowired
    private ItemParamService itemParamService;

    @RequestMapping("/list")
    @ResponseBody
    private EasyUIDataGridResult showItemParamList (@RequestParam(defaultValue = "1") Integer page,
                                                    @RequestParam(defaultValue = "30") Integer rows){
        return itemParamService.getItemParamList(page, rows);
    }

    @RequestMapping("/query/itemcatid/{cid}")
    @ResponseBody
    private TaotaoResult queryItemParamByCID(@PathVariable Long cid){
        TbItemParam itemParam = itemParamService.getItemParamByCID(cid);
        if (itemParam != null){
            return TaotaoResult.ok(itemParam);
        }
        return TaotaoResult.build(404,"该商品的没有模板存在！", null);
    }

    @RequestMapping("/save/{cid}")
    @ResponseBody
    private TaotaoResult addItemParam(@PathVariable Long cid, TbItemParam itemParam){
        itemParam.setItemCatId(cid);
        itemParam.setCreated(new Date());
        itemParam.setUpdated(new Date());
        boolean b = itemParamService.addItemParam(itemParam);
        if (b) {
            return TaotaoResult.ok();
        }
        return TaotaoResult.build(404, "添加失败");
    }
    @RequestMapping("/delete")
    @ResponseBody
    private TaotaoResult deleteItemParam(@RequestParam("ids") List<String> ids){
        boolean b = itemParamService.deleteItemParamsByIDS(ids);
        if (b){
            return TaotaoResult.ok();
        }
        return TaotaoResult.build(404,"删除失败");
    }
}

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
}

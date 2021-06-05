package cn.jkg.taotao.controller;

import cn.jkg.taotao.pojo.TaotaoResult;
import cn.jkg.taotao.pojo.TbItemParamItem;
import cn.jkg.taotao.service.ItemParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.controller
 * @ClassName: ItemParamItemControlle
 * @Author: jkg
 * @Description: 商品规格参数数据
 * @Date: 2021/6/5 14:35
 */
@Controller
@RequestMapping("/item/param/item")
public class ItemParamItemControlle {
    @Autowired
    private ItemParamItemService itemParamItemService;

    @RequestMapping("/query/{id}")
    @ResponseBody
    private TaotaoResult queryItemParamItemByItemID(@PathVariable Long id){
        TbItemParamItem paramItem = itemParamItemService.getItemParamItemByItemID(id);
        if (paramItem != null){
            return TaotaoResult.ok(paramItem);
        }
        return TaotaoResult.build(404, "查询商品模板数据失败！", null);
    }
}

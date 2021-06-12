package cn.jkg.taotao.controller;

import cn.jkg.taotao.pojo.*;
import cn.jkg.taotao.service.ItemService;
import cn.jkg.taotao.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.controller
 * @ClassName: ItemController
 * @Author: jkg
 * @Description: 商品
 * @Date: 2021/5/30 02:52
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    private TbItem getItemByID(@PathVariable Long itemId){
        return itemService.getItemById(itemId);
    }

    @RequestMapping("/list")
    @ResponseBody
    private EasyUIDataGridResult getItemList(@RequestParam(defaultValue = "1") Integer page,
                                             @RequestParam(defaultValue = "30") Integer rows){
        return itemService.getItemList(page,rows);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    private TaotaoResult createItem(TbItem item, String desc, String itemParams){
        long id = IDUtils.genItemId();
        Date date = new Date();
        item.setCreated(date);
        item.setUpdated(date);
        item.setId(id);
        //商品的状态：1 正常 2 下架 3 删除
        item.setStatus((byte) 1);

        TbItemDesc itemDesc = new TbItemDesc();
        itemDesc.setItemDesc(desc);
        itemDesc.setItemId(id);
        itemDesc.setCreated(date);
        itemDesc.setUpdated(date);

        TbItemParamItem itemParamItem = new TbItemParamItem();
        itemParamItem.setItemId(id);
        itemParamItem.setParamData(itemParams);
        itemParamItem.setCreated(date);
        itemParamItem.setUpdated(date);

        boolean b = itemService.createItem(item, itemDesc, itemParamItem);
        if (b){
            return TaotaoResult.ok();
        }
        return new TaotaoResult();
    }

    @RequestMapping("/delete")
    @ResponseBody
    private TaotaoResult deleteItemsByIDS(@RequestParam(value = "ids") List ids){
        boolean b = itemService.deleteItemsByIDS(ids);
        if (b){
            return TaotaoResult.ok();
        }
        return TaotaoResult.build(404,"删除失败！",null);
    }
    @RequestMapping(value = "/rest/update", method = RequestMethod.POST)
    @ResponseBody
    private TaotaoResult updateItemByID(TbItem item, String desc, String itemParams, Long itemParamId){
        Date update = new Date();

        item.setUpdated(update);

        TbItemDesc itemDesc = new TbItemDesc();
        itemDesc.setUpdated(update);
        itemDesc.setItemDesc(desc);
        itemDesc.setItemId(item.getId());

        TbItemParamItem paramItem = new TbItemParamItem();
        paramItem.setId(itemParamId);
        paramItem.setItemId(item.getId());
        paramItem.setParamData(itemParams);
        paramItem.setUpdated(update);

        boolean b = itemService.updateItemByID(item, itemDesc, paramItem);
        if (b){
            return TaotaoResult.ok();
        }
        return TaotaoResult.build(404,null);
    }
}

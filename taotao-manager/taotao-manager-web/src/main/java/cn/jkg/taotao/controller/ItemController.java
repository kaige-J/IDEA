package cn.jkg.taotao.controller;

import cn.jkg.taotao.pojo.TbItem;
import cn.jkg.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.controller
 * @ClassName: ItemController
 * @Author: jkg
 * @Description: 商品
 * @Date: 2021/5/30 02:52
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    private TbItem getItemByID(@PathVariable Long itemId){
        TbItem item = itemService.getItemById(itemId);
        return item;
    }
}

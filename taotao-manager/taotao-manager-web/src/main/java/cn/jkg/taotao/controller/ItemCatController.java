package cn.jkg.taotao.controller;

import cn.jkg.taotao.pojo.EasyUITreeNode;
import cn.jkg.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.controller
 * @ClassName: ItemCatController
 * @Author: jkg
 * @Description: 商品类目种类 item_cat
 * @Date: 2021/5/31 00:53
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    private List<EasyUITreeNode> getItemCatList(@RequestParam(value = "id", defaultValue = "0") Long parenId){
        //传递的参数是id与parentId不同，需要我们使用@RequestParam(value="id",defaultValue="0")，来把id设置给parentId
        return itemCatService.getItemCatList(parenId);
    }
}

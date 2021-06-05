package cn.jkg.taotao.controller;

import cn.jkg.taotao.pojo.TaotaoResult;
import cn.jkg.taotao.pojo.TbItemDesc;
import cn.jkg.taotao.service.ItemDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.controller
 * @ClassName: ItemDescController
 * @Author: jkg
 * @Description: 商品描述
 * @Date: 2021/6/5 13:43
 */
@Controller
@RequestMapping("/item/desc")
public class ItemDescController {
    @Autowired
    private ItemDescService itemDescService;

    @RequestMapping("/query/{id}")
    @ResponseBody
    private TaotaoResult getItemDescByItemID(@PathVariable Long id){
        TbItemDesc itemDesc = itemDescService.getItemDescByItemID(id);
        if (itemDesc != null){
            return TaotaoResult.ok(itemDesc);
        }
        return TaotaoResult.build(404,"查询商品描述失败！", null);
    }

}

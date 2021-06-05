package cn.jkg.taotao.service;

import cn.jkg.taotao.pojo.TbItemParamItem;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service.impl
 * @ClassName: ItemParamItemService
 * @Author: jkg
 * @Description: 商品规格数据
 * @Date: 2021/6/5 14:28
 */
public interface ItemParamItemService {
    /**
     * @Author jkg
     * @Description 通过商品id查询商品规格数据
     * @Date 14:30 2021/6/5
     * @Param [java.lang.Long] [itemId]
     * @return cn.jkg.taotao.pojo.TbItemParamItem
     **/
    TbItemParamItem getItemParamItemByItemID(Long itemId);
}

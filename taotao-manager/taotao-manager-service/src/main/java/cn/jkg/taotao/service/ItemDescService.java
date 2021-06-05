package cn.jkg.taotao.service;

import cn.jkg.taotao.pojo.TbItemDesc;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service
 * @ClassName: ItemDescService
 * @Author: jkg
 * @Description: 商品描述
 * @Date: 2021/6/5 13:35
 */
public interface ItemDescService {
    /**
     * @Author jkg
     * @Description 根据商品id查询商品描述
     * @Date 13:37 2021/6/5
     * @Param [java.lang.Long] [itemID]
     * @return cn.jkg.taotao.pojo.TbItemDesc
     **/
    TbItemDesc getItemDescByItemID(Long itemID);
}

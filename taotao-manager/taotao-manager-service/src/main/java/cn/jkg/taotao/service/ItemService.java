package cn.jkg.taotao.service;


import cn.jkg.taotao.pojo.TbItem;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service.impl
 * @ClassName: ItemService
 * @Author: jkg
 * @Description: 商品Item接口文件
 * @Date: 2021/5/30 01:45
 */
public interface ItemService {
    /**
     * @Author jkg
     * @Description 根据商品 ID 查找商品
     * @Date 02:33 2021/5/30
     * @Param [java.lang.Long] [itemId]
     * @return cn.jkg.taotao.pojo.TbItem
     **/
    TbItem getItemById(Long itemId);
}

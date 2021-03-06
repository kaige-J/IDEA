package cn.jkg.taotao.service;


import cn.jkg.taotao.pojo.*;

import java.util.List;

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
    /**
     * @Author jkg
     * @Description 得到商品的表格数据
     * @Date 21:27 2021/5/30
     * @Param [java.lang.Integer, java.lang.Integer] [page, rows]
     * @return cn.jkg.taotao.pojo.EasyUIDataGridResult
     **/
    EasyUIDataGridResult getItemList(Integer page, Integer rows);
    /**
     * @Author jkg
     * @Description 添加商品
     * @Date 21:57 2021/6/2
     * @Param [cn.jkg.taotao.pojo.TbItem, cn.jkg.taotao.pojo.TbItemDesc, cn.jkg.taotao.pojo.TbItemParamItem] [item, desc, param]
     * @return boolean
     **/
    boolean createItem(TbItem item, TbItemDesc desc, TbItemParamItem param);
    /**
     * @Author jkg
     * @Description 根据商品id列表删除对应的商品
     * @Date 17:05 2021/6/6
     * @Param [java.util.List] [ids]
     * @return boolean
     **/
    boolean deleteItemsByIDS(List ids);
    /**
     * @Author jkg
     * @Description 修改商品的信息
     * @Date 01:37 2021/6/13
     * @Param [cn.jkg.taotao.pojo.TbItem, cn.jkg.taotao.pojo.TbItemDesc, cn.jkg.taotao.pojo.TbItemParamItem] [item, desc, param]
     * @return boolean
     **/
    boolean updateItemByID(TbItem item, TbItemDesc desc, TbItemParamItem param);
}

package cn.jkg.taotao.service;


import cn.jkg.taotao.pojo.*;

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
     * @Date 01:39 2021/6/2
     * @Param [cn.jkg.taotao.pojo.TbItem, cn.jkg.taotao.pojo.TbItemDesc, cn.jkg.taotao.pojo.TbItemParam] [item, desc, param]
     * @return boolean
     **/
    boolean createItem(TbItem item, TbItemDesc desc, TbItemParam param);
}

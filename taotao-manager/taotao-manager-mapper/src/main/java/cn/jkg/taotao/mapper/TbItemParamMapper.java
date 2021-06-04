package cn.jkg.taotao.mapper;

import cn.jkg.taotao.pojo.TbItemParam;

import java.util.List;

public interface TbItemParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemParam record);

    int insertSelective(TbItemParam record);

    TbItemParam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemParam record);

    int updateByPrimaryKey(TbItemParam record);
    /**
     * @Author jkg
     * @Description 查询所有商品模板
     * @Date 23:44 2021/6/4
     * @Param [] []
     * @return java.util.List
     **/
    List selectAllItemParams();
    /**
     * @Author jkg
     * @Description 根据商品类型id查找商品模板
     * @Date 23:43 2021/6/4
     * @Param [java.lang.Long] [cid]
     * @return cn.jkg.taotao.pojo.TbItemParam
     **/
    TbItemParam selectByItemCatID(Long cid);
    /**
     * @Author jkg
     * @Description 根据商品模板IDS删除商品模板
     * @Date 23:43 2021/6/4
     * @Param [java.util.List] [ids]
     * @return int
     **/
    int deleteByIDS(List ids);
}
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

    List selectAllItemParams();

    TbItemParam selectByItemCatID(Long cid);
}
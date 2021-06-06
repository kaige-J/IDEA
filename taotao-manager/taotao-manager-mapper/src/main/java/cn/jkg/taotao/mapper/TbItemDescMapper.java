package cn.jkg.taotao.mapper;

import cn.jkg.taotao.pojo.TbItemDesc;

import java.util.List;

public interface TbItemDescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemDesc record);

    int insertSelective(TbItemDesc record);

    TbItemDesc selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(TbItemDesc record);

    int updateByPrimaryKey(TbItemDesc record);

    int deleteByIDS(List ids);
}
package cn.jkg.taotao.mapper;

import cn.jkg.taotao.pojo.TbItemParamItem;

import java.util.List;

public interface TbItemParamItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemParamItem record);

    int insertSelective(TbItemParamItem record);

    TbItemParamItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemParamItem record);

    int updateByPrimaryKey(TbItemParamItem record);

    TbItemParamItem selectByItemID(Long itemID);

    int deleteByIDS(List ids);
}
package cn.jkg.taotao.mapper;

import cn.jkg.taotao.pojo.TbContent;

public interface TbContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    TbContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKey(TbContent record);
}
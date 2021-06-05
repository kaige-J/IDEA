package cn.jkg.taotao.service.impl;

import cn.jkg.taotao.mapper.TbItemDescMapper;
import cn.jkg.taotao.pojo.TbItemDesc;
import cn.jkg.taotao.service.ItemDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service.impl
 * @ClassName: ItemDescServiceImpl
 * @Author: jkg
 * @Description:
 * @Date: 2021/6/5 13:39
 */
@Service
public class ItemDescServiceImpl implements ItemDescService {
    @Autowired
    private TbItemDescMapper itemDescMapper;
    /**
     * @param itemID
     * @return cn.jkg.taotao.pojo.TbItemDesc
     * @Author jkg
     * @Description 根据商品id查询商品描述
     * @Date 13:37 2021/6/5
     * @Param [java.lang.Long] [itemID]
     */
    @Override
    public TbItemDesc getItemDescByItemID(Long itemID) {
        return itemDescMapper.selectByPrimaryKey(itemID);
    }
}

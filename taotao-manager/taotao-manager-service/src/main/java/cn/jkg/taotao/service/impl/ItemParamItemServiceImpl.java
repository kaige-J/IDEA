package cn.jkg.taotao.service.impl;

import cn.jkg.taotao.mapper.TbItemParamItemMapper;
import cn.jkg.taotao.pojo.TbItemParamItem;
import cn.jkg.taotao.service.ItemParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service.impl
 * @ClassName: ItemParamItemServiceImpl
 * @Author: jkg
 * @Description:
 * @Date: 2021/6/5 14:32
 */
@Service
public class ItemParamItemServiceImpl implements ItemParamItemService {
    @Autowired
    private TbItemParamItemMapper itemParamItemMapper;
    /**
     * @param itemId
     * @return cn.jkg.taotao.pojo.TbItemParamItem
     * @Author jkg
     * @Description 通过商品id查询商品规格数据
     * @Date 14:30 2021/6/5
     * @Param [java.lang.Long] [itemId]
     */
    @Override
    public TbItemParamItem getItemParamItemByItemID(Long itemId) {
        return itemParamItemMapper.selectByItemID(itemId);
    }
}

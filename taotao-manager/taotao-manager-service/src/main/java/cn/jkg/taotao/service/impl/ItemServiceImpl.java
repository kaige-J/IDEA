package cn.jkg.taotao.service.impl;

import cn.jkg.taotao.mapper.TbItemMapper;
import cn.jkg.taotao.pojo.EasyUIDataGridResult;
import cn.jkg.taotao.pojo.TbItem;
import cn.jkg.taotao.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service.impl
 * @ClassName: ItemServiceImpl
 * @Author: jkg
 * @Description: 商品 item 实现类
 * @Date: 2021/5/30 02:36
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;
    /**
     * @param itemId
     * @return cn.jkg.taotao.pojo.TbItem
     * @Author jkg
     * @Description 根据商品 ID 查找商品
     * @Date 02:33 2021/5/30
     * @Param [java.lang.Long] [itemId]
     */
    @Override
    public TbItem getItemById(Long itemId) {
        TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
        return tbItem;
    }

    /**
     * @param page
     * @param rows
     * @return cn.jkg.taotao.pojo.EasyUIDataGridResult
     * @Author jkg
     * @Description 得到商品的表格数据
     * @Date 21:27 2021/5/30
     * @Param [java.lang.Integer, java.lang.Integer] [page, rows]
     */
    @Override
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        EasyUIDataGridResult dataGrid = new EasyUIDataGridResult();
        PageHelper.startPage(page, rows);
        List<TbItem> items = itemMapper.selectAllItems();
        PageInfo info = new PageInfo(items);
        dataGrid.setTotal(info.getTotal());
        dataGrid.setRows(items);
        return dataGrid;
    }
}

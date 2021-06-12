package cn.jkg.taotao.service.impl;

import cn.jkg.taotao.mapper.TbItemDescMapper;
import cn.jkg.taotao.mapper.TbItemMapper;
import cn.jkg.taotao.mapper.TbItemParamItemMapper;
import cn.jkg.taotao.pojo.*;
import cn.jkg.taotao.service.ItemService;
import cn.jkg.taotao.utils.IDUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
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
    @Autowired
    private TbItemDescMapper itemDescMapper;
    @Autowired
    private TbItemParamItemMapper itemParamItemMapper;
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

    /**
     * @Author jkg
     * @Description 添加商品
     * @Date 22:01 2021/6/2
     * @Param [cn.jkg.taotao.pojo.TbItem, cn.jkg.taotao.pojo.TbItemDesc, cn.jkg.taotao.pojo.TbItemParamItem] [item, desc, param]
     * @return boolean
     **/
    @Override
    public boolean createItem(TbItem item, TbItemDesc desc, TbItemParamItem param) {
        int i1 = itemMapper.insert(item);
        int i2 = itemDescMapper.insert(desc);
        int i3 = itemParamItemMapper.insert(param);
        if (i1 != 0 && i2 != 0 && i3 != 0) {
            return true;
        }
        return false;
    }

    /**
     * @param ids
     * @return boolean
     * @Author jkg
     * @Description 根据商品id列表删除对应的商品
     * @Date 17:05 2021/6/6
     * @Param [java.util.List] [ids]
     */
    @Override
    public boolean deleteItemsByIDS(List ids) {
        int i1 = itemDescMapper.deleteByIDS(ids);
        int i2 = itemParamItemMapper.deleteByIDS(ids);
        int i3 = itemMapper.deleteByIDS(ids);
        if (i1 != 0 && i2 != 0 && i3 != 0) {
            return true;
        }
        return false;
    }
}

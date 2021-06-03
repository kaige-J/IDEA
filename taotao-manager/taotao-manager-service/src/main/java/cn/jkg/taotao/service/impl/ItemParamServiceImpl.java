package cn.jkg.taotao.service.impl;

import cn.jkg.taotao.mapper.TbItemParamMapper;
import cn.jkg.taotao.pojo.EasyUIDataGridResult;
import cn.jkg.taotao.service.ItemParamService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service.impl
 * @ClassName: ItemParamServiceImpl
 * @Author: jkg
 * @Description:
 * @Date: 2021/6/3 22:21
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {
    @Autowired
    private TbItemParamMapper itemParamMapper;
    /**
     * @param page
     * @param rows
     * @return cn.jkg.taotao.pojo.EasyUIDataGridResult
     * @Author jkg
     * @Description 获取商品规则参数列表数据
     * @Date 22:17 2021/6/3
     * @Param [java.lang.Integer, java.lang.Integer] [page, rows]
     */
    @Override
    public EasyUIDataGridResult getItemParamList(Integer page, Integer rows) {
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        PageHelper.startPage(page,rows);
        List list = itemParamMapper.selectAllItemParams();
        PageInfo info = new PageInfo(list);
        result.setRows(list);
        result.setTotal(info.getTotal());
        return result;
    }
}

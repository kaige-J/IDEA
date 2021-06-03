package cn.jkg.taotao.service;

import cn.jkg.taotao.pojo.EasyUIDataGridResult;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service
 * @ClassName: ItemParamService
 * @Author: jkg
 * @Description: 商品规则参数
 * @Date: 2021/6/3 22:13
 */
public interface ItemParamService {
    /**
     * @Author jkg
     * @Description 获取商品规则参数列表数据
     * @Date 22:17 2021/6/3
     * @Param [java.lang.Integer, java.lang.Integer] [page, rows]
     * @return cn.jkg.taotao.pojo.EasyUIDataGridResult
     **/
    EasyUIDataGridResult getItemParamList(Integer page , Integer rows);
}

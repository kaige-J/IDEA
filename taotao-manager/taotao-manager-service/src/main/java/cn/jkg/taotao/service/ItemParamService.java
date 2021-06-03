package cn.jkg.taotao.service;

import cn.jkg.taotao.pojo.EasyUIDataGridResult;
import cn.jkg.taotao.pojo.TbItemParam;

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
    /**
     * @Author jkg
     * @Description 通过商品类别id查询商品模板
     * @Date 23:22 2021/6/3
     * @Param [java.lang.Long] [cid]
     * @return cn.jkg.taotao.pojo.TbItemParam
     **/
    TbItemParam getItemParamByCID(Long cid);
}

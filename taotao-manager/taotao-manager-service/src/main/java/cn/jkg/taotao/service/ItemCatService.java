package cn.jkg.taotao.service;

import cn.jkg.taotao.pojo.EasyUITreeNode;

import java.util.List;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service
 * @ClassName: ItemCatService
 * @Author: jkg
 * @Description: 商品类型接口
 * @Date: 2021/6/1 01:03
 */
public interface ItemCatService {
    /**
     * @Author jkg
     * @Description 根据父节点查询所有子节点
     * @Date 01:27 2021/6/1
     * @Param [java.lang.Long] [parentId]
     * @return java.util.List<cn.jkg.taotao.pojo.EasyUITreeNode>
     **/
    List<EasyUITreeNode> getItemCatList(Long parentId);
}

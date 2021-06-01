package cn.jkg.taotao.service.impl;

import cn.jkg.taotao.mapper.TbItemCatMapper;
import cn.jkg.taotao.pojo.EasyUITreeNode;
import cn.jkg.taotao.pojo.TbItemCat;
import cn.jkg.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service.impl
 * @ClassName: ItemCatServiceImpl
 * @Author: jkg
 * @Description:
 * @Date: 2021/6/1 01:06
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private TbItemCatMapper itemCatMapper;

    /**
     * @Author jkg
     * @Description 根据父节点查询所有子节点
     * @Date 01:27 2021/6/1
     * @Param [java.lang.Long] [parentId]
     * @return java.util.List<cn.jkg.taotao.pojo.EasyUITreeNode>
     **/
    @Override
    public List<EasyUITreeNode> getItemCatList(Long parentId) {
        List<EasyUITreeNode> nodes = new ArrayList<>();
        List<TbItemCat> cats = itemCatMapper.selectItemCatsByParentId(parentId);

        for (TbItemCat cat : cats) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(cat.getId());
            node.setText(cat.getName());
            node.setState(cat.getIsParent() ? "closed" : "open");
            nodes.add(node);
        }
        return nodes;
    }
}

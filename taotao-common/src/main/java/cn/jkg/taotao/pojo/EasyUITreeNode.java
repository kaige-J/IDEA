package cn.jkg.taotao.pojo;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.pojo
 * @ClassName: EasyUITreeNode
 * @Author: jkg
 * @Description: 商品类型itemCat 树节点数据
 * @Date: 2021/6/1 00:39
 */
public class EasyUITreeNode {
    private Long id;
    private String text;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

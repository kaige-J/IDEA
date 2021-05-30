package cn.jkg.taotao.pojo;

import java.util.List;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao
 * @ClassName: EasyUIDataGridResult
 * @Author: jkg
 * @Description: easyUI表格显示数据
 * @Date: 2021/5/30 21:08
 */
public class EasyUIDataGridResult {
    private Long total;
    private List<?> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}

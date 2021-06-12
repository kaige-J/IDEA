package cn.jkg.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.controller
 * @ClassName: PageController
 * @Author: jkg
 * @Description: 展示 inde页面
 * @Date: 2021/5/30 10:44
 */
@Controller
public class PageController {
    /**
     * @Author jkg
     * @Description 返回 index 页面
     * @Date 10:50 2021/5/30
     * @Param [] []
     * @return java.lang.String
     **/
    @RequestMapping("/")
    private String showIndex(){
        return "index";
    }

    @RequestMapping("/{page}")
    private String showPage(@PathVariable String page){
        return page;
    }
}

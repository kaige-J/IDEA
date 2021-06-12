package cn.jkg.taotao.controller;

import cn.jkg.taotao.pojo.PictureResult;
import cn.jkg.taotao.service.PictureService;
import cn.jkg.taotao.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.controller
 * @ClassName: PictureController
 * @Author: jkg
 * @Description: 图片
 * @Date: 2021/6/12 18:26
 */
@Controller
@RequestMapping("/pic")
public class PictureController {
    @Autowired
    private PictureService pictureService;

    @RequestMapping("/upload")
    @ResponseBody
    public String uploadFile(MultipartFile uploadFile) {
        PictureResult result = pictureService.uploadPic(uploadFile);
        return JsonUtils.objectToJson(result);
    }
}

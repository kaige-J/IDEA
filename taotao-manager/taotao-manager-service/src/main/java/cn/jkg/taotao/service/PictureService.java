package cn.jkg.taotao.service;

import cn.jkg.taotao.pojo.PictureResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service
 * @ClassName: PictureService
 * @Author: jkg
 * @Description: 图片上传
 * @Date: 2021/6/2 23:53
 */
public interface PictureService {
    /**
     * @Author jkg
     * @Description 上传图片
     * @Date 23:56 2021/6/2
     * @Param [org.springframework.web.multipart.MultipartFile] [picFile]
     * @return cn.jkg.taotao.pojo.PictureResult
     **/
    PictureResult uploadPic(MultipartFile picFile);
}

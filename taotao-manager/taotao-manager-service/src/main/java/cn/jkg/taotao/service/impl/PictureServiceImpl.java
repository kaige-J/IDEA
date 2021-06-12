package cn.jkg.taotao.service.impl;

import cn.jkg.taotao.pojo.PictureResult;
import cn.jkg.taotao.service.PictureService;
import cn.jkg.taotao.utils.FastDFSClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ProjectName: IDEA
 * @Package: cn.jkg.taotao.service.impl
 * @ClassName: PictureServiceImpl
 * @Author: jkg
 * @Description:
 * @Date: 2021/6/2 23:57
 */
@Service
public class PictureServiceImpl implements PictureService {
    private static Logger logger = Logger.getLogger(PictureServiceImpl.class);

    @Value("${IMAGE_SERVER_BASE_URL}")
    private String IMAGE_SERVER_BASE_URL;
    /**
     * @param picFile
     * @return cn.jkg.taotao.pojo.PictureResult
     * @Author jkg
     * @Description 上传图片
     * @Date 23:56 2021/6/2
     * @Param [org.springframework.web.multipart.MultipartFile] [picFile]
     */
    @Override
    public PictureResult uploadPic(MultipartFile picFile) {
        PictureResult picResult = new PictureResult();
        try {
            if (picFile.isEmpty()) {
                picResult.setError(1);
                picResult.setMessage("图片为空！");
            } else {
                String originalFileName = picFile.getOriginalFilename();
                String exName = originalFileName.substring(originalFileName.indexOf(".") + 1);
                FastDFSClient fdfsClient = new FastDFSClient("properties/client.properties");
                String[] uploadFile = fdfsClient.uploadFile(picFile.getBytes(), exName);
                if (uploadFile != null) {
                    picResult.setUrl(IMAGE_SERVER_BASE_URL + uploadFile[0] +"/"+ uploadFile[1]);
                    picResult.setError(0);
                    picResult.setMessage("上传图片成功！");
                } else {
                    picResult.setError(1);
                    picResult.setMessage("上传图片失败！");
                }
            }
        } catch (Exception e) {
            picResult.setError(1);
            picResult.setMessage("上传图片失败！");
            logger.error(e);
            e.printStackTrace();
        }
        return picResult;
    }
}

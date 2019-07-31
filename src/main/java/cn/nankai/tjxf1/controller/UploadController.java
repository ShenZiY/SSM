package cn.nankai.tjxf1.controller;

import cn.nankai.tjxf1.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping
public class UploadController {
    @Autowired
    private UploadService uploadService;

    @RequestMapping("/picLoad")
    public String picLoad(){
        return "picLoad";
    }



    @RequestMapping("/upload")
    //参数file是从前端提交过来的
    public String upload(@RequestParam("file")MultipartFile pictureFile) throws Exception {
        String FILEPATH = "F:\\pictures\\";
        String originalFilename = "";
        String newFileName = "";
        String description = "layui";

        //进行图片的上传
        if (pictureFile!=null && pictureFile.getOriginalFilename()!=null && pictureFile.getOriginalFilename().length()>0) {
            //图片上传成功后，将图片的地址写到数据库
            originalFilename = pictureFile.getOriginalFilename();

            newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));

            //新文件
            File file = new File(FILEPATH + newFileName);

            //将内存中的文件写入磁盘
            pictureFile.transferTo(file);
        }

        uploadService.insertFile(originalFilename, FILEPATH+newFileName, description);

        return "index1";
    }

    @RequestMapping("/uploadMultipart")
    public String uploadMultipart(@RequestParam("file")MultipartFile[] pictureFile) throws Exception {
        String FILEPATH = "F:\\pictures\\";
        String originalFilename = "";
        String newFileName = "";
        String description = "layui";

        //进行图片的上传
        for (int i = 0; i<pictureFile.length; i++) {
            if (pictureFile[i]!=null && pictureFile[i].getOriginalFilename()!=null && pictureFile[i].getOriginalFilename().length()>0) {
                originalFilename = pictureFile[i].getOriginalFilename();
                newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));

                File file = new File(FILEPATH + newFileName);

                pictureFile[i].transferTo(file);
            }
            //此处打算往数据库存所有照片的路径
            uploadService.insertFile(originalFilename, FILEPATH+newFileName, description);
        }
        

        return null;
    }
}

package cn.nankai.tjxf1.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nankai.tjxf1.dao.ImageDao;
import cn.nankai.tjxf1.entity.Image;
import cn.nankai.tjxf1.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService {

		@Autowired
	    private ImageDao imageDao;

	    public void insertFile(String filename, String src, String description) {
	        Image image = new Image(filename, src, description);
	        imageDao.insert(image);
	    }
}


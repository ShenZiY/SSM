package cn.nankai.tjxf1.service;

import cn.nankai.tjxf1.dao.PeolpleInfoMapper;
import cn.nankai.tjxf1.entity.PeolpleInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PeopleInfoService {




    int insertSelective (List<PeolpleInfo> list);

}

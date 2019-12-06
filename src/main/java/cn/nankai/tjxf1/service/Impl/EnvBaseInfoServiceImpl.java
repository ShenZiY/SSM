package cn.nankai.tjxf1.service.Impl;


import cn.nankai.tjxf1.dao.EnvInfoMapper;
import cn.nankai.tjxf1.entity.EnvInfo;
import cn.nankai.tjxf1.service.EnvInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvBaseInfoServiceImpl implements EnvInfoService {
    @Autowired
    EnvInfoMapper envInfoMapper;

    @Override
    public Integer addEnvInfo(EnvInfo envInfo) {
        return envInfoMapper.insert(envInfo);
    }
}

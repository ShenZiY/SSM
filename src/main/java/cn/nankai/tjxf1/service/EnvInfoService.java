package cn.nankai.tjxf1.service;


import cn.nankai.tjxf1.entity.EnvInfo;
import org.springframework.stereotype.Service;

@Service
public interface EnvInfoService {

    Integer addEnvInfo(EnvInfo envInfo);

    EnvInfo findEnvInfoByAccId(Integer accId);

}

package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.EnvBurnInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvBurnInfoMapper {
    int insert(EnvBurnInfo record);

    int insertSelective(EnvBurnInfo record);

    EnvBurnInfo selectAll();
}
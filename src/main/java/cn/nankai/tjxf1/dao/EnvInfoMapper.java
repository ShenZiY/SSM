package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.EnvInfo;
import cn.nankai.tjxf1.entity.EnvInfoExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvInfoMapper {
    int countByExample(EnvInfoExample example);

    int insert(EnvInfo record);

    int insertSelective(EnvInfo record);

    List<EnvInfo> selectByExample(EnvInfoExample example);
}
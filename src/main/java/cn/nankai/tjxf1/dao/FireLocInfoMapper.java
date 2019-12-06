package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.FireLocInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface FireLocInfoMapper {
    int insert(FireLocInfo record);

    int insertSelective(FireLocInfo record);

    FireLocInfo selectA ();
}
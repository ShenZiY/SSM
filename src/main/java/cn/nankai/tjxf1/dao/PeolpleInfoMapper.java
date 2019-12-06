package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.PeolpleInfo;
import cn.nankai.tjxf1.entity.PeolpleInfoExample;
import org.apache.ibatis.annotations.Param;

public interface PeolpleInfoMapper {
    int deleteByExample(PeolpleInfoExample example);

    int insert(PeolpleInfo record);

    int insertSelective(PeolpleInfo record);

    int updateByExampleSelective(@Param("record") PeolpleInfo record, @Param("example") PeolpleInfoExample example);

    int updateByExample(@Param("record") PeolpleInfo record, @Param("example") PeolpleInfoExample example);
}
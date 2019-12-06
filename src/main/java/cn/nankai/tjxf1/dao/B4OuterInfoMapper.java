package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B4OuterInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface B4OuterInfoMapper {
    int insert(B4OuterInfo record);

    int insertSelective(B4OuterInfo record);

    B4OuterInfo selectA();
}
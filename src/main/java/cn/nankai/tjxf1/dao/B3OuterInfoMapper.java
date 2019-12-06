package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B3OuterInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface B3OuterInfoMapper {
    int insert(B3OuterInfo record);

    int insertSelective(B3OuterInfo record);

    B3OuterInfo selectA();
}
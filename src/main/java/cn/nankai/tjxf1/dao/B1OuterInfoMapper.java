package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B1OuterInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface B1OuterInfoMapper {
    int insert(B1OuterInfo record);

    int insertSelective(B1OuterInfo record);

    B1OuterInfo selectA();
}
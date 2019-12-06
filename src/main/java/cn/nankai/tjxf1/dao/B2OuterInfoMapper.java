package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B2OuterInfo;

public interface B2OuterInfoMapper {
    int insert(B2OuterInfo record);

    int insertSelective(B2OuterInfo record);

    B2OuterInfo selectA();
}
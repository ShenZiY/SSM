package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B2InnerInfo;

public interface B2InnerInfoMapper {
    int insert(B2InnerInfo record);

    int insertSelective(B2InnerInfo record);

    B2InnerInfo selectA ();
}
package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B2InnerInfo;
import org.apache.ibatis.annotations.Param;

public interface B2InnerInfoMapper {
    int insert(B2InnerInfo record);

    int insertSelective(B2InnerInfo record);

    B2InnerInfo selectA ();

    int updateSelective(@Param("accId") Integer accId);
}
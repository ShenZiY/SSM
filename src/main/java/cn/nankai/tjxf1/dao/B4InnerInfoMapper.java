package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B4InnerInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface B4InnerInfoMapper {
    int insert(B4InnerInfo record);

    int insertSelective(B4InnerInfo record);

    B4InnerInfo selectA();

    int updateSelective(@Param("accId") Integer accId);
}
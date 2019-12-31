package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B1InnerInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface B1InnerInfoMapper {
    int insert(B1InnerInfo record);

    int insertSelective(B1InnerInfo record);

    B1InnerInfo selectA(@Param("accId") Integer accId);

    int updateSelective(@Param("accId") Integer accId);

}
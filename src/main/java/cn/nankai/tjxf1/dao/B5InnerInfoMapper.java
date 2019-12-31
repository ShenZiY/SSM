package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B5InnerInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface B5InnerInfoMapper {
    int insert(B5InnerInfo record);

    int insertSelective(B5InnerInfo record);

    B5InnerInfo selectA();

    int updateSelective(@Param("accId") Integer accId);
}
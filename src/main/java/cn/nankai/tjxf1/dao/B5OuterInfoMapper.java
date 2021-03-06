package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B5OuterInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface B5OuterInfoMapper {
    int insert(B5OuterInfo record);

    int insertSelective(B5OuterInfo record);

    B5OuterInfo selectA();

    int updateSelective(@Param("accId") Integer accId);
}
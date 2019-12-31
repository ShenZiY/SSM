package cn.nankai.tjxf1.dao;


import cn.nankai.tjxf1.entity.CarInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarInfoMapper {
    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    CarInfo selectAll(@Param("accId") Integer accId);

    int updateSelective (@Param("accId") Integer accId);
}
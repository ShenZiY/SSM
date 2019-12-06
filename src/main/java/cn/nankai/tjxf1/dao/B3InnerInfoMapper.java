package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.B3InnerInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface B3InnerInfoMapper {
    int insert(B3InnerInfo record);

    int insertSelective(B3InnerInfo record);

    B3InnerInfo selectA();
}
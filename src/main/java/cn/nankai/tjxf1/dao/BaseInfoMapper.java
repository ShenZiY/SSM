package cn.nankai.tjxf1.dao;

import cn.nankai.tjxf1.entity.BaseInfo;
import cn.nankai.tjxf1.entity.BaseInfoExample;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseInfoMapper {
    int countByExample(BaseInfoExample example);

    int insert(BaseInfo record);

    int insertSelective(BaseInfo record);

    BaseInfo findByAccId(Integer accId);


    List<BaseInfo> selectByExample(BaseInfoExample example);

    int updateByExampleSelective(@Param("record") BaseInfo record, @Param("example") BaseInfoExample example);

    int updateByExample(@Param("record") BaseInfo record, @Param("example") BaseInfoExample example);

    int countToday();

    ArrayList<Integer> countStatusById(@Param("id") Integer id);

    ArrayList<Integer> countTodayStatusById(@Param("id") Integer id);

    ArrayList<Integer> countWeekStatusById(@Param("id") Integer id);

    ArrayList<Integer> countMonthStatusById(@Param("id") Integer id);

    ArrayList<Integer> countStatusByDay(@Param("id") Integer id, @Param("diff") Integer diff);

    Integer getTotalCount(@Param("id") Integer id);
    Integer getTotalCountExcel(@Param("id") Integer id);

    List<BaseInfo> getPageListInfo(@Param("id") Integer id,@Param("start") Integer start,@Param("size") Integer size);
    List<BaseInfo> getPageListInfoExcel(@Param("id") Integer id,@Param("start") Integer start,@Param("size") Integer size);

}
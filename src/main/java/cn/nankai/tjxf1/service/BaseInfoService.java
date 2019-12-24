package cn.nankai.tjxf1.service;

import cn.nankai.tjxf1.entity.BaseInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface BaseInfoService {
    Integer addBaseInfo (BaseInfo baseInfo);

    Integer insertAccId (Integer accId);

    Boolean findByAccId (Integer accId);

    BaseInfo findBaseInfoByAccId (Integer accId);

    Integer countAccNum ();

    int[] countStatusById(Integer id);

    int[] countTodayStatusById(Integer id);

    int[] countWeekStatusById(Integer id);

    int[] countMonthStatusById(Integer id);

    int[] countStatusByDay( Integer id, Integer diff);

    int updateSelective(BaseInfo baseInfo);

    Integer getPageTotalCount(Map<String,Object> paramMap);
    Integer getPageTotalCountExcel(Map<String,Object> paramMap);
    Integer getPageTotalCountSearch(Map<String,Object> paramMap);

    List<BaseInfo> getPageListInfo(Map<String,Object> paramMap);
    List<BaseInfo> getPageListInfoExcel(Map<String,Object> paramMap);
    List<BaseInfo> getPageListInfoSearch(Map<String,Object> paramMap);

    int updateStatus(Integer status, Integer accId);

}

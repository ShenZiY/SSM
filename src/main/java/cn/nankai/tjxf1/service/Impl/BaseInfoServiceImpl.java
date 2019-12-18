package cn.nankai.tjxf1.service.Impl;

import cn.nankai.tjxf1.dao.BaseInfoMapper;
import cn.nankai.tjxf1.entity.BaseInfo;
import cn.nankai.tjxf1.service.BaseInfoService;
import org.apache.ibatis.annotations.Param;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class BaseInfoServiceImpl implements BaseInfoService {
    @Autowired
    private BaseInfoMapper baseInfoMapper;

    @Override
    public Integer addBaseInfo(BaseInfo baseInfo) {
        if (baseInfoMapper.insertSelective(baseInfo) == 1) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public Integer insertAccId( Integer accId) {
        BaseInfo baseInfo = new BaseInfo();
        baseInfo.setAccId(accId);
        if(baseInfoMapper.insertSelective(baseInfo)==1){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public Boolean findByAccId(Integer accId) {
        if(baseInfoMapper.findByAccId(accId) != null){
            return true;
        }
        return false;
    }

    @Override
    public BaseInfo findBaseInfoByAccId(Integer accId) {
        return baseInfoMapper.findByAccId(accId);
    }

    @Override
    public Integer countAccNum() {
        System.out.println("记录数"+baseInfoMapper.countToday());
        return baseInfoMapper.countToday();
    }


    @Override
    public int[] countStatusById(Integer id) {
        ArrayList<Integer> res = baseInfoMapper.countStatusById(id);
        int[] list = new int[5];
        for (int i = 0; i < res.size() ; i++) {
            for (int j = 0; j <=res.get(i) ; j++) {
                list[j]++;
            }
        }
        return list;
    }

    @Override
    public int[] countTodayStatusById(Integer id) {
        ArrayList<Integer> res = baseInfoMapper.countTodayStatusById(id);
        int[] list = new int[5];
        for (int i = 0; i < res.size() ; i++) {
            for (int j = 0; j <=res.get(i) ; j++) {
                list[j]++;
            }
        }
        return list;
    }

    @Override
    public int[] countWeekStatusById(Integer id) {
        ArrayList<Integer> res = baseInfoMapper.countWeekStatusById(id);
        int[] list = new int[5];
        for (int i = 0; i < res.size() ; i++) {
            for (int j = 0; j <=res.get(i) ; j++) {
                list[j]++;
            }
        }
        return list;
    }

    @Override
    public int[] countMonthStatusById(Integer id) {
        ArrayList<Integer> res = baseInfoMapper.countMonthStatusById(id);
        int[] list = new int[5];
        for (int i = 0; i < res.size() ; i++) {
            for (int j = 0; j <=res.get(i) ; j++) {
                list[j]++;
            }
        }
        return list;
    }

    @Override
    public int[] countStatusByDay(Integer id, Integer diff) {
        ArrayList<Integer> res = baseInfoMapper.countStatusByDay(id,diff);
        int[] list = new int[5];
        for (int i = 0; i < res.size() ; i++) {
            for (int j = 0; j <=res.get(i) ; j++) {
                list[j]++;
            }
        }
        return new int[]{list[0]+list[1]+list[2]+list[3]+list[4],list[0]+list[1]+list[2]+list[3],list[4]};
    }

    @Override
    public Integer getPageTotalCount(Map<String, Object> paramMap) {
        return baseInfoMapper.getTotalCount((Integer) paramMap.get("id"));
    }

    @Override
    public Integer getPageTotalCountExcel(Map<String, Object> paramMap) {
        return baseInfoMapper.getTotalCountExcel((Integer) paramMap.get("id"));
    }

    @Override
    public List<BaseInfo> getPageListInfo(Map<String, Object> paramMap) {
        return baseInfoMapper.getPageListInfo((Integer) paramMap.get("id"),(Integer)paramMap.get("start"),(Integer)paramMap.get("size"));
    }

    @Override
    public List<BaseInfo> getPageListInfoExcel(Map<String, Object> paramMap) {
        return baseInfoMapper.getPageListInfoExcel((Integer) paramMap.get("id"),(Integer)paramMap.get("start"),(Integer)paramMap.get("size"));
    }

    @Override
    public int updateStatus(Integer status, Integer accId) {
        return baseInfoMapper.updateStatus(status,accId);
    }

}

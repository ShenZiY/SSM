package cn.nankai.tjxf1.service.Impl;

import cn.nankai.tjxf1.dao.PeolpleInfoMapper;
import cn.nankai.tjxf1.entity.PeolpleInfo;
import cn.nankai.tjxf1.service.PeopleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleInfoServiceImpl implements PeopleInfoService {
   @Autowired
   private PeolpleInfoMapper peolpleInfoMapper;



    @Override
    public int insertSelective(List<PeolpleInfo> list) {
        if(list!=null&&list.size()!=0){
            for (int i = 0; i < list.size(); i++) {
                PeolpleInfo peolpleInfo = list.get(i);
                peolpleInfoMapper.insertSelective(peolpleInfo);
            }
            System.out.println("成功从excel中导入数据到数据库");
            return 1;
        }
        return 0;
    }
}

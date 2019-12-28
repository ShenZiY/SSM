package cn.nankai.tjxf1.service.Impl;


import cn.nankai.tjxf1.dao.*;
import cn.nankai.tjxf1.entity.*;
import cn.nankai.tjxf1.service.pdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class pdfServiceImpl  implements pdfService {
    @Autowired
    private CarInfoMapper carInfoMapper;
    @Autowired
    private EnvBurnInfoMapper envBurnInfoMapper;
    @Autowired
    private FireLocInfoMapper fireLocInfoMapper;
    @Autowired
    private B1InnerInfoMapper b1InnerInfoMapper;
    @Autowired
    private B1OuterInfoMapper b1OuterInfoMapper;
    @Autowired
    private  PeolpleInfoMapper peolpleInfoMapper;

    @Override
    public CarInfo carInfoSelectAll(Integer accId) {
        return carInfoMapper.selectAll(accId);
    }

    @Override
    public EnvBurnInfo envBurnInfoSelectAll(Integer accId) {
        return envBurnInfoMapper.selectAll(accId);
    }

    @Override
    public FireLocInfo fireLocInfoSelectAll(Integer accId) {
        return fireLocInfoMapper.selectA(accId);
    }

    @Override
    public B1InnerInfo b1InnerInfoSelectAll(Integer accId) {
        return b1InnerInfoMapper.selectA(accId);
    }

    @Override
    public B1OuterInfo b1OuterInfoSelectAll(Integer accId) {
        return b1OuterInfoMapper.selectA(accId);
    }

    @Override
    public List<PeolpleInfo> peopleInfoSelectAll(Integer accId) {
        return peolpleInfoMapper.selectA(accId);
    }
}

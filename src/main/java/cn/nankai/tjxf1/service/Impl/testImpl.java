package cn.nankai.tjxf1.service.Impl;

import cn.nankai.tjxf1.dao.*;

import cn.nankai.tjxf1.entity.*;
import cn.nankai.tjxf1.service.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testImpl implements  test {
    @Autowired
    B4InnerInfoMapper b4InnerInfoMapper;
    @Autowired
    B3InnerInfoMapper b3InnerInfoMapper;
    @Autowired
    B3OuterInfoMapper b3OuterInfoMapper;
    @Autowired
    B4OuterInfoMapper b4OuterInfoMapper;
    @Autowired
    B5InnerInfoMapper b5InnerInfoMapper;
    @Autowired
    B5OuterInfoMapper b5OuterInfoMapper;

    @Override
    public B3InnerInfo selectB3I() {
        return b3InnerInfoMapper.selectA();
    }

    @Override
    public B3OuterInfo selectB3O() {
        return b3OuterInfoMapper.selectA();
    }

    @Override
    public B4InnerInfo selectB4I() {
        return b4InnerInfoMapper.selectA();
    }

    @Override
    public B4OuterInfo selectB4O() {
        return b4OuterInfoMapper.selectA();
    }

    @Override
    public B5InnerInfo selectB5I() {
        return b5InnerInfoMapper.selectA();
    }

    @Override
    public B5OuterInfo selectB5O() {
        return b5OuterInfoMapper.selectA();
    }
}

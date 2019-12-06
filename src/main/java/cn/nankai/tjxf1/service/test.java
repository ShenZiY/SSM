package cn.nankai.tjxf1.service;

import cn.nankai.tjxf1.entity.*;
import org.springframework.stereotype.Service;

@Service
public interface test {

    B3InnerInfo selectB3I();

    B3OuterInfo selectB3O();

    B4InnerInfo selectB4I();

    B4OuterInfo selectB4O();

    B5InnerInfo selectB5I();

    B5OuterInfo selectB5O();

}

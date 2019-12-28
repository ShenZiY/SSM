package cn.nankai.tjxf1.service;

import cn.nankai.tjxf1.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface pdfService {
    CarInfo carInfoSelectAll(Integer accId);

    EnvBurnInfo envBurnInfoSelectAll (Integer accId);

    FireLocInfo fireLocInfoSelectAll (Integer accId);

    B1InnerInfo b1InnerInfoSelectAll (Integer accId);

    B1OuterInfo b1OuterInfoSelectAll (Integer accId);

    List<PeolpleInfo> peopleInfoSelectAll(Integer accId);

}

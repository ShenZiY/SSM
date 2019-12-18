package cn.nankai.tjxf1.service;

import cn.nankai.tjxf1.entity.*;

import java.util.List;

public interface UploadService {
	

	
	    void insertFile(String filename, String src, String description);

	    void insertPeopleInfoSelective(List<PeolpleInfo> list);

	    void insertCarInfoSelective(List<CarInfo> list);

	    void insertB1InnerInfoSelective(List<B1InnerInfo> list);

	    void insertB1OuterInfoSelective(List<B1OuterInfo> list);

		void insertB2InnerInfoSelective(List<B2InnerInfo> list);

		void insertB2OuterInfoSelective(List<B2OuterInfo> list);

		void insertB3InnerInfoSelective(List<B3InnerInfo> list);

		void insertB3OuterInfoSelective(List<B3OuterInfo> list);

		void insertB4InnerInfoSelective(List<B4InnerInfo> list);

		void insertB4OuterInfoSelective(List<B4OuterInfo> list);

		void insertB5InnerInfoSelective(List<B5InnerInfo> list);

		void insertB5OuterInfoSelective(List<B5OuterInfo> list);

		void insertEnvBurnInfoSelective(List<EnvBurnInfo> list);

		void insertFireLocInfo(List<FireLocInfo> list);

		void insertBaseInfoSelective(List<BaseInfo> list);

		void insertEnvInfoSelective(List<EnvInfo> list);

		void insertExcel(List<PeolpleInfo> peolpleInfoList,List<CarInfo> carInfoList,List<B1InnerInfo> b1InnerInfoList,List<B1OuterInfo> b1OuterInfoList
				,List<B2InnerInfo> b2InnerInfoList,List<B2OuterInfo> b2OuterInfoList,List<B3InnerInfo> b3InnerInfoList,List<B3OuterInfo> b3OuterInfoList
				,List<B4InnerInfo> b4InnerInfoList,List<B4OuterInfo> b4OuterInfoList,List<B5InnerInfo> b5InnerInfoList,List<B5OuterInfo> b5OuterInfoList
				,List<EnvBurnInfo> envBurnInfoList,List<FireLocInfo> fireLocInfoList);

	
}

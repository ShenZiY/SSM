package cn.nankai.tjxf1.service.Impl;

import cn.nankai.tjxf1.dao.*;
import cn.nankai.tjxf1.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nankai.tjxf1.service.UploadService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UploadServiceImpl implements UploadService {

		@Autowired
	    private ImageDao imageDao;

		@Autowired
		private PeolpleInfoMapper peolpleInfoMapper;

		@Autowired
		private CarInfoMapper carInfoMapper;

		@Autowired
		private B1InnerInfoMapper b1InnerInfoMapper;

		@Autowired
		private B1OuterInfoMapper b1OuterInfoMapper;

		@Autowired
		private B2InnerInfoMapper b2InnerInfoMapper;

		@Autowired
		private B2OuterInfoMapper b2OuterInfoMapper;

		@Autowired
		private B3OuterInfoMapper b3OuterInfoMapper;

		@Autowired
		private
		B3InnerInfoMapper b3InnerInfoMapper;

		@Autowired
		B4OuterInfoMapper b4OuterInfoMapper;

		@Autowired
		B4InnerInfoMapper b4InnerInfoMapper;

		@Autowired
		B5OuterInfoMapper b5OuterInfoMapper;

		@Autowired
		B5InnerInfoMapper b5InnerInfoMapper;

		@Autowired
		EnvBurnInfoMapper envBurnInfoMapper;

		@Autowired
		FireLocInfoMapper fireLocInfoMapper;


	    public void insertFile(String filename, String src, String description) {
	        Image image = new Image(filename, src, description);
	        imageDao.insert(image);
	    }


		@Override
		public void insertPeopleInfoSelective(List<PeolpleInfo> list) {
			if(list != null && list.size()!=0){
				for (int i = 0; i < list.size(); i++) {
					PeolpleInfo peolpleInfo = list.get(i);
					peolpleInfoMapper.insertSelective(peolpleInfo);
				}
			}
		}


		@Override
		public void insertCarInfoSelective(List<CarInfo> list) {
			if(list != null && list.size()!=0){
				for (int i = 0; i < list.size(); i++) {
					CarInfo carInfo = list.get(i);
					carInfoMapper.insertSelective(carInfo);
				}
			}
		}

		@Override
		public void insertB1InnerInfoSelective(List<B1InnerInfo> list) {
			if(list != null && list.size()!=0){
				for (int i = 0; i < list.size(); i++) {
					B1InnerInfo b1InnerInfo = list.get(i);
					b1InnerInfoMapper.insertSelective(b1InnerInfo);
				}
			}
		}


	@Override
	public void insertB1OuterInfoSelective(List<B1OuterInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				B1OuterInfo b1OuterInfo = list.get(i);
				b1OuterInfoMapper.insertSelective(b1OuterInfo);
			}
		}
	}

	@Override
	public void insertB2InnerInfoSelective(List<B2InnerInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				B2InnerInfo b2InnerInfo = list.get(i);
				b2InnerInfoMapper.insertSelective(b2InnerInfo);
			}
		}
	}

	@Override
	public void insertB2OuterInfoSelective(List<B2OuterInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				B2OuterInfo b2OuterInfo = list.get(i);
				b2OuterInfoMapper.insertSelective(b2OuterInfo);
			}
		}
	}

	@Override
	public void insertB3InnerInfoSelective(List<B3InnerInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				B3InnerInfo b3InnerInfo = list.get(i);
				b3InnerInfoMapper.insertSelective(b3InnerInfo);
			}
		}
	}

	@Override
	public void insertB3OuterInfoSelective(List<B3OuterInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				B3OuterInfo b3OuterInfo = list.get(i);
				b3OuterInfoMapper.insertSelective(b3OuterInfo);
			}
		}
	}

	@Override
	public void insertB4InnerInfoSelective(List<B4InnerInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				B4InnerInfo b4InnerInfo = list.get(i);
				b4InnerInfoMapper.insertSelective(b4InnerInfo);
			}
		}
	}

	@Override
	public void insertB4OuterInfoSelective(List<B4OuterInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				B4OuterInfo b4OuterInfo = list.get(i);
				b4OuterInfoMapper.insertSelective(b4OuterInfo);
			}
		}
	}

	@Override
	public void insertB5InnerInfoSelective(List<B5InnerInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				B5InnerInfo b5InnerInfo = list.get(i);
				b5InnerInfoMapper.insertSelective(b5InnerInfo);
			}
		}
	}

	@Override
	public void insertB5OuterInfoSelective(List<B5OuterInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				B5OuterInfo b5OuterInfo = list.get(i);
				b5OuterInfoMapper.insertSelective(b5OuterInfo);
			}
		}
	}

	@Override
	public void insertEnvBurnInfoSelective(List<EnvBurnInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				EnvBurnInfo envBurnInfo = list.get(i);
				envBurnInfoMapper.insertSelective(envBurnInfo);
			}
		}
	}

	@Override
	public void insertFireLocInfo(List<FireLocInfo> list) {
		if(list != null && list.size()!=0){
			for (int i = 0; i < list.size(); i++) {
				FireLocInfo fireLocInfo = list.get(i);
				fireLocInfoMapper.insertSelective(fireLocInfo);
			}
		}
	}

	@Override
	public void insertExcel(List<PeolpleInfo> peolpleInfoList, List<CarInfo> carInfoList, List<B1InnerInfo> b1InnerInfoList, List<B1OuterInfo> b1OuterInfoList, List<B2InnerInfo> b2InnerInfoList, List<B2OuterInfo> b2OuterInfoList,
							List<B3InnerInfo> b3InnerInfoList, List<B3OuterInfo> b3OuterInfoList, List<B4InnerInfo> b4InnerInfoList, List<B4OuterInfo> b4OuterInfoList, List<B5InnerInfo> b5InnerInfoList, List<B5OuterInfo> b5OuterInfoList,List<EnvBurnInfo> envBurnInfoList,List<FireLocInfo> fireLocInfoList) {
		insertB1InnerInfoSelective(b1InnerInfoList);
		insertB1OuterInfoSelective(b1OuterInfoList);
		insertPeopleInfoSelective(peolpleInfoList);
		insertCarInfoSelective(carInfoList);
		insertB2InnerInfoSelective(b2InnerInfoList);
		insertB2OuterInfoSelective(b2OuterInfoList);
		insertB3InnerInfoSelective(b3InnerInfoList);
		insertB3OuterInfoSelective(b3OuterInfoList);
		insertB4InnerInfoSelective(b4InnerInfoList);
		insertB4OuterInfoSelective(b4OuterInfoList);
		insertB5InnerInfoSelective(b5InnerInfoList);
		insertB5OuterInfoSelective(b5OuterInfoList);
		insertEnvBurnInfoSelective(envBurnInfoList);
		insertFireLocInfo(fireLocInfoList);
	}
}


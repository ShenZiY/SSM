package cn.nankai.tjxf1.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nankai.tjxf1.dao.UserDao;
import cn.nankai.tjxf1.entity.User;
import cn.nankai.tjxf1.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean checkLogin(Integer id, String password) {
		
		User user = userDao.findById(id);
		if(user != null && user.getPassword().equals(password)){
			return true;
		}
		return false;
	}

	@Override
	public Integer addUser(User user) {
		// TODO Auto-generated method stub
		
		if(userDao.insertUser(user)==1){
			return 0;
		}
		else{
			return -1;
		}
		//System.out.println("插入的对象主键为："+user.getId());
	}

	@Override
	public User findUserById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public boolean updatePwd(Integer id, String pwd) {
		if(userDao.updatePwd(id,pwd)==1)
			return true;
		return false;
	}

	@Override
	//添加方法registerNameOnly传入表单中的用户名，用来判断数据库中是否已经存在该用户名
    public boolean registerIdOnly(Integer id){
		 User user =  userDao.findById(id);
        if(user != null && user.getUsername() != null ){
            return true; 
        }else{
            return false;
        }
    }

}

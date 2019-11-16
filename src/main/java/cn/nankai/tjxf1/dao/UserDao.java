package cn.nankai.tjxf1.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.nankai.tjxf1.entity.User;

@Repository
public interface UserDao {
	
	/*
	* 根据ID查找
	* */

	User findById(Integer id);

	
	int insertUser(User user);
	


}

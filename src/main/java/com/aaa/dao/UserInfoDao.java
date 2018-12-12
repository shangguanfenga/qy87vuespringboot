package com.aaa.dao;

import com.aaa.entity.MyCondition;
import com.aaa.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface UserInfoDao {
	List<UserInfo> findAllUser();
	List<UserInfo>findAllUserCondition(MyCondition condition);
	int addUser(UserInfo user);
	int editUser(UserInfo user);
	int delUserById(Integer id);
	List<UserInfo> findAllUserByPage(Map<String, Object> query);
	int getTotal();
}

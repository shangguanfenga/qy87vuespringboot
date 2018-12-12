package com.aaa.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author TeacherChen
 * @description 用户实体类页面展示用
 * @company AAA软件
 * @classname Qy87
 * 2018-11-21上午9:56:16
 */
@Data
public class UserInfoVo {
	private int id;
	private String username;
	private String password;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date createtime;
	private String[] imageUrls;

}

package com.aaa.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import com.aaa.entity.ResultModel;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author TeacherChen
 * @description 所有controller的基类
 * @company AAA软件
 * @classname Qy78
 * 2018-6-13上午9:57:20
 */
public class BaseContrllor {
	public ResultModel returnSuccessInfo(String meassage) {
		ResultModel rm= new ResultModel();
		rm.setRetStatus(0);
		rm.setMessage(meassage);
		return rm;

	}
	public ResultModel returnSuccessInfo(String meassage ,Object obj) {
		ResultModel rm= new ResultModel();
		rm.setRetStatus(0);
		rm.setMessage(meassage);
		rm.setObj(obj);
		return rm;
		
	}
	public ResultModel returnErrorInfo(String meassage) {
		ResultModel rm= new ResultModel();
		rm.setRetStatus(1);
		rm.setMessage(meassage);
		return rm;
		
	}
	/**
	 * 
	 *TODO 返回操作失败通用方法
	 *@param message 
	 *@param obj
	 *@return
	 *2018-6-14下午4:06:47
	 */
	public ResultModel returnErrorInfo(String message ,Object obj) {
		ResultModel rm= new ResultModel();
		rm.setRetStatus(1);
		rm.setMessage(message);
		rm.setObj(obj);
		return rm;
		
	}
	/**
	 *
	 *TODO 返回操作失败通用方法
	 *@param message
	 *@param obj
	 *@return
	 *2018-6-14下午4:06:47
	 */
	public Map upload(MultipartFile file,String filePath) {
		//上传至服务器的路径
		String fileName= file.getOriginalFilename();
		//修改文件名称
		//获取文件后缀名称,拼接uuid
		String[] split = fileName.split("\\.");
		UUID uuid = UUID.randomUUID();
		fileName=uuid+"."+split[split.length-1];
		File targetFile= new File(filePath,fileName);
		//String src=filePath+fileName;
		Map map = new HashMap();
		map.put("name", fileName);
		map.put("url", "/"+fileName);
		try {
			//将页面传入的文件拷贝至服务器对应目录
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}

}

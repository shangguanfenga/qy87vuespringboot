package com.aaa.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MyCondition {
	
	private Integer type;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:SS")
	private Date startTime;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:SS")
	private Date endTime;
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	
	

}

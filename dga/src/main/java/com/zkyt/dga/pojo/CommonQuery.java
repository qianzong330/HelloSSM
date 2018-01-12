package com.zkyt.dga.pojo;

import java.util.Date;


public class CommonQuery {
	/*-----案件查询Start-----*/
	//区域等级
	private String districtlevel;
	private String districtyear = "2016";
	// 区域区域
	private String districtcode;
	//开始时间
	private Date startTime;
	//结束时间
	private Date endTime;
	
	//对比指标（以字符串形式接收）
	private String codes;
	//类型一
	private Integer type;
	private Integer type1;
	//类型二
	private Integer type2;
	
	/*-----案件查询End-----*/
	public String getDistrictcode() {
		return districtcode;
	}
	public void setDistrictcode(String districtcode) {
		this.districtcode = districtcode;
	}
	
	public String getCodes() {
		return codes;
	}
	public void setCodes(String codes) {
		this.codes = codes;
	}
	public Integer getType1() {
		return type1;
	}
	public void setType1(Integer type1) {
		
		this.type1 = type1;
	}
	public Integer getType2() {
		return type2;
	}
	public void setType2(Integer type2) {
		
		this.type2 = type2;
	}
	public String getDistrictlevel() {
		return districtlevel;
	}
	public void setDistrictlevel(String districtlevel) {
		this.districtlevel = districtlevel;
	}
	public String getDistrictyear() {
		return districtyear;
	}
	public void setDistrictyear(String districtyear) {
		this.districtyear = districtyear;
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
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
}

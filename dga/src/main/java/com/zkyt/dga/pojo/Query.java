package com.zkyt.dga.pojo;

import java.io.Serializable;

/**
 * 
 * 作 者 ： 韩宗乾 描 述 ：查询对象 时 间 ：2017-11-27 上午10:03:53
 */
public class Query implements Serializable {
	private Integer page;
	private Integer rows;
	private Integer buildid;
	private Integer unitid;
	private Integer houseid;
	private static final long serialVersionUID = 1L;
	// 设置每页数的常量
	private static final Integer DEFAULT_PAGESIZE = 20;
	// 当前页 最小是1的整数
	private Integer pageNo = 1;
	// 每页数
	private Integer pageSize = DEFAULT_PAGESIZE;
	// limit 开始行,每页数
	// 开始行
	private Integer startRow;

	public Integer getPageNo() {
		pageNo = this.page;
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		// 计算一下开始行
		this.startRow = (pageNo - 1) * pageSize;
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		pageSize=this.rows;
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		// 计算一下开始行
		this.startRow = (pageNo - 1) * pageSize;
		this.pageSize = pageSize;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Integer getDefaultPagesize() {
		return DEFAULT_PAGESIZE;
	}

	public Integer getBuildid() {
		return buildid;
	}

	public void setBuildid(Integer buildid) {
		this.buildid = buildid;
	}

	public Integer getUnitid() {
		return unitid;
	}

	public void setUnitid(Integer unitid) {
		this.unitid = unitid;
	}

	public Integer getHouseid() {
		return houseid;
	}

	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	
}

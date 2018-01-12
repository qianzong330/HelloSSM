package com.zkyt.dga.service;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseUnit;

/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：单位操作业务层
 * 时 间 ：2017-11-28 上午8:42:58
 */
@Service
public interface UnitService {
	/**
	 * 添加单位
	 */
	public void addUnit(TbBaseUnit unit);
	/**
	 * 删除单位
	 */
	public void deleteUnit(String id);
	/**
	 * 修改单位
	 */
	public void updateUnit(TbBaseUnit unit);
	/**
	 * 查询单位列表（支持分页） 
	 */
	//public Pagination findUnitList(Query query);
	public PageInfo<TbBaseUnit> findUnitAll(Query query);
	
}

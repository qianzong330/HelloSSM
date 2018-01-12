package com.zkyt.dga.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zkyt.dga.mapper.TbBaseUnitMapper;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseUnit;
import com.zkyt.dga.service.UnitService;
/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：单位操作业务实现
 * 时 间 ：2017-11-28 上午8:47:35
 */
@Transactional
@Service
public class UnitServiceImpl implements UnitService {
	@Autowired
	private TbBaseUnitMapper unitMapper;
	//添加单位
	@Override
	public void addUnit(TbBaseUnit unit) {
		unitMapper.insert(unit);
	}
	//删除单位
	@Override
	public void deleteUnit(String id) {
		unitMapper.deleteByPrimaryKey(id);
	}
	//修改单位
	@Override
	public void updateUnit(TbBaseUnit unit) {
		unitMapper.updateByPrimaryKeySelective(unit);
	}
	/*@Override
	public Pagination findUnitList(Query query) {
		Pagination pagination = new Pagination(query.getPageNo(), query.getPageSize(), unitMapper.getTotalCount(query));
		query.setPageNo(pagination.getPageNo());
		List<TbBaseUnit> list = unitMapper.findUnitList(query);
		pagination.setList(list);
		return pagination;
	}
	*/
	@Override
	public PageInfo<TbBaseUnit> findUnitAll(Query query) {
		PageHelper.startPage(query.getPageNo(), query.getPageSize());
		List<TbBaseUnit> list = unitMapper.findUnitAll(query);
		PageInfo<TbBaseUnit> info = new PageInfo<>(list);
		return info;
	}
}

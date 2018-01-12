package com.zkyt.dga.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zkyt.dga.mapper.TbBaseHouseMapper;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseHouse;
import com.zkyt.dga.service.HouseService;
/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：房屋操作业务实现
 * 时 间 ：2017-11-27 上午8:51:36
 */
@Transactional
@Service
public class HouseServiceImpl implements HouseService {
	@Autowired
	private TbBaseHouseMapper houseMapper;
	@Override
	//保存房屋实现
	public void saveHouse(TbBaseHouse house) {
		houseMapper.insert(house);
	}
	
	//修改房屋操作
	@Override
	public void updateHouse(TbBaseHouse baseHouse) {
		houseMapper.updateByPrimaryKeySelective(baseHouse);
	}
	//删除房屋实现
	@Override
	public void deleteHouse(Integer id) {
		houseMapper.deleteByPrimaryKey(id);
	}
	//查询 房屋列表（支持分页）
	/*@Override
	public Pagination findHouseList(Query query) {
		Pagination pagination = new Pagination(query.getPageNo(), query.getPageSize(), houseMapper.getTotalCount(query));
		//分页对象中当前页数  设置给品牌条件对象BrandQuery 当前页
		query.setPageNo(pagination.getPageNo());
		List<TbBaseHouse> list = houseMapper.findHouseList(query);
		pagination.setList(list);
		return pagination;
	}*/

	@Override
	public PageInfo<TbBaseHouse> findHouseList(Query query) {
		PageHelper.startPage(query.getPageNo(), query.getPageSize());
		List<TbBaseHouse> list = houseMapper.findAll();
		System.out.println("结果集共："+list.size()+"个");
		PageInfo<TbBaseHouse> info = new PageInfo<>(list);
		long total = info.getTotal();
		System.out.println();
		return info;
	}

}

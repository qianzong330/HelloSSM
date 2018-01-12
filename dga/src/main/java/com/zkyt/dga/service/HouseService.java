package com.zkyt.dga.service;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseHouse;

/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：房屋操作业务层接口
 * 时 间 ：2017-11-27 上午8:49:50
 */
@Service
public interface HouseService {
	//保存房屋操作
	public void saveHouse(TbBaseHouse house);
	
	//修改房屋操作
	public void updateHouse(TbBaseHouse baseHouse);
	//删除房屋操作（根据Id）
	public void deleteHouse(Integer id);
	//public Pagination findHouseList(Query query);
	public PageInfo<TbBaseHouse> findHouseList(Query query);
}

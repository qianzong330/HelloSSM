package com.zkyt.dga.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zkyt.dga.mapper.TbBaseBuildingMapper;
import com.zkyt.dga.pojo.Pagination;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseBuilding;
import com.zkyt.dga.pojo.TbBaseBuildingExample;
import com.zkyt.dga.service.BuildService;
/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：Building相关业务接口实现
 * 时 间 ：2017-11-25 上午9:15:10
 */
@Transactional
@Service
public class BuildServiceImpl implements BuildService {
	@Autowired
	private TbBaseBuildingMapper buildingMapper;
	//增加建筑实现
	@Override
	public Integer saveBuild(TbBaseBuilding build) {
		//新增保存
		buildingMapper.saveBuild(build);
		//获取新增实体主键id
		int id = buildingMapper.getId();
		return id;
	}
	//根据id删除建筑
	@Override
	public void deleteBuildById(Integer id) {
		buildingMapper.deleteByPrimaryKey(id);
	}
	//修改建筑实现
	@Override
	public void updateBuild(TbBaseBuilding baseBuilding) {
		buildingMapper.updateByPrimaryKeySelective(baseBuilding);
		//buildingMapper.updateByPrimaryKey(baseBuilding);
	}
	//查询建筑列表（含分页）
	@Override
	public Pagination findBuildList(Query query) {
		Pagination pagination = new Pagination();
		PageHelper.startPage(1, 10);
		TbBaseBuildingExample example = new TbBaseBuildingExample();
		List<TbBaseBuilding> list = buildingMapper.selectByExample(example);
		PageInfo<TbBaseBuilding> info = new PageInfo<>(list);
		pagination.setTotal(info.getTotal());
		pagination.setRows(list);
		return pagination;
	}
	/*@Override
	public PageInfo<TbBaseBuilding> findBuildList(Query query) {
		PageHelper.startPage(1, 10);
		TbBaseBuildingExample example = new TbBaseBuildingExample();
		//List<TbBaseBuilding> list = buildingMapper.selectByExample(example);
		List<TbBaseBuilding> list = buildingMapper.findBuildAll(query);
		PageInfo<TbBaseBuilding> info = new PageInfo<>(list);
		return info;
	}*/
	
	
}

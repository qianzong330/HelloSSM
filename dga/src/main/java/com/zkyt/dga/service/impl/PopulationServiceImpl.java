package com.zkyt.dga.service.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zkyt.dga.mapper.TbBasePopulationMapper;
import com.zkyt.dga.pojo.Pagination;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBasePopulation;
import com.zkyt.dga.pojo.TbBasePopulationExample;
import com.zkyt.dga.service.PopulationService;
/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：人口操作业务实现类
 * 时 间 ：2017-11-25 下午2:15:34
 */
@Transactional
@Service
public class PopulationServiceImpl implements PopulationService {
	@Autowired
	private TbBasePopulationMapper populationMapper;
	//批量保存人员
	@Override
	public void saveBatchPopulation(String populations) {
		JSONArray jsonArray = JSONArray.fromObject(populations);
		System.out.println(jsonArray);
		Collection collection = JSONArray.toCollection(jsonArray, TbBasePopulation.class);
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			TbBasePopulation tbBasePopulation = (TbBasePopulation) iterator.next();
			populationMapper.insert(tbBasePopulation);
		}
	}
	//保存单个人员
	@Override
	public void savePopulation(TbBasePopulation population) {
		populationMapper.insert(population);
		
	}
	//删除用户
	@Override
	public void deletePopulationById(Integer id) {
		populationMapper.deleteByPrimaryKey(id);
	}
	//根据id修改人员
	@Override
	public void updatePopulationById(TbBasePopulation basePopulation) {
		populationMapper.updateByPrimaryKeySelective(basePopulation);
	}
	//查询人员列表（含分页）
	/*@Override
	public Pagination findPopulationList(Query query) {
		Pagination pagination = new Pagination(query.getPageNo(), query.getPageSize(),populationMapper.getTotalCount(query));
		query.setPageNo(pagination.getPageNo());
		List<TbBasePopulation> list = populationMapper.findPopulationList(query);
		
		pagination.setList(list);
		return pagination;
	}*/
	/*@Override
	public PageInfo<TbBasePopulation> findPopuAll(Query query) {
		PageHelper.startPage(1, 10);
		TbBasePopulationExample example = new TbBasePopulationExample();
		List<TbBasePopulation> list = populationMapper.selectByExample(example);
		System.out.println("pageSize"+list.size());
		PageInfo<TbBasePopulation> info = new PageInfo<>(list);
		System.out.println("Total: "+info.getTotal());
		System.out.println("List: "+list);
		return info;
	}*/
	@Override
	public Pagination findPopuAll2(Query query) {
		Pagination pagination = new Pagination();
		PageHelper.startPage(1, 10);
		TbBasePopulationExample example = new TbBasePopulationExample();
		List<TbBasePopulation> list = populationMapper.selectByExample(example);
		PageInfo<TbBasePopulation> info = new PageInfo<>(list);
		pagination.setTotal(info.getTotal());
		pagination.setRows(list);
		return pagination;
	} 
	
}

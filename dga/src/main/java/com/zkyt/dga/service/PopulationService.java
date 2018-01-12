package com.zkyt.dga.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.github.pagehelper.PageInfo;
import com.zkyt.dga.pojo.Pagination;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseHouse;
import com.zkyt.dga.pojo.TbBasePopulation;

/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：人员操作接口
 * 时 间 ：2017-11-25 下午2:03:43
 */
@Service
public interface PopulationService {
	//批量保存人员
	public void saveBatchPopulation(String populations);
	//保存单个人员
	public void savePopulation(TbBasePopulation population);
	//根据id删除人员
	public void deletePopulationById(Integer id);
	//根据id修改人员
	public void updatePopulationById(TbBasePopulation basePopulation);
	/*//查询人员列表（含分页）
	public Pagination findPopulationList(Query query); */
	//public PageInfo<TbBasePopulation> findPopuAll(Query query);
	public Pagination findPopuAll2(Query query);
	
}

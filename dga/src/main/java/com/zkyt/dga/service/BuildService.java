package com.zkyt.dga.service;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.zkyt.dga.pojo.Pagination;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseBuilding;

/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：Building相关业务接口
 * 时 间 ：2017-11-25 上午9:13:04
 */
@Service
public interface BuildService {
	//保存建筑
	public Integer saveBuild(TbBaseBuilding build);
	//根据id删除建筑
	public void deleteBuildById(Integer id);
	//修改建筑
	public void updateBuild(TbBaseBuilding baseBuilding);
	/*//查询建筑列表（含分页对象） 
	public Pagination findBuildList(Query query);*/
	//public PageInfo<TbBaseBuilding> findBuildList(Query query);
	public Pagination findBuildList(Query query);
}

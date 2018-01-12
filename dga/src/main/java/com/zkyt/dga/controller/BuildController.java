package com.zkyt.dga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zkyt.dga.pojo.Pagination;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseBuilding;
import com.zkyt.dga.service.BuildService;
import com.zkyt.dga.utils.SpringmvcControllerBase;

import net.sf.json.JSONObject;
/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：Build业务操作Controller
 * 时 间 ：2017-11-25 上午9:54:48
 */
@Controller
public class BuildController extends SpringmvcControllerBase {
	@Autowired
	private BuildService buildService;
	/**
	 * 保存建筑，返回主键id
	 */
	@RequestMapping("/saveBuild")
	
	public void saveBuild(TbBaseBuilding building){
		JSONObject json = new JSONObject();
		try {
			
			Integer id = buildService.saveBuild(building);
			if(id!=null){
				json.put("status", true);
				json.put("id", id);
				json.put("msg", "添加成功！");
				toClientOrigin(json.toString());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			json.put("status", false);
			json.put("msg", "添加失败！");
			toClientOrigin(json.toString());
		}
	}
	/**
	 * 根据id 删除建筑
	 */
	@RequestMapping("/deleteBuild")
	public void deleteBuildByID(Integer id){
		JSONObject json = new JSONObject();
		try {
			buildService.deleteBuildById(id);
			json.put("status", true);
			json.put("msg", "删除成功！");
			toClientOrigin(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "删除失败！");
			toClientOrigin(json.toString());
		}
	}
	/**
	 * 修改建筑
	 */
	@RequestMapping("/updateBuild")
	public void updateBuild(TbBaseBuilding baseBuilding){
		JSONObject json = new JSONObject();
		try {
			buildService.updateBuild(baseBuilding);
			json.put("status", true);
			json.put("msg", "删除成功！");
			toClientOrigin(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "删除失败！");
			toClientOrigin(json.toString());
		}
	}
	/**
	 * 查询建筑列表（含分页）
	 */
	
	@RequestMapping("/findBuildList")
	@ResponseBody
	public Pagination findBuildList(Query query){
		Pagination pagination = buildService.findBuildList(query);
		return pagination;
	}
	/**
	 * 根据建筑ID查询住房列表
	 */
	
	/**
	 * 根据建筑ID查询单位列表
	 */
}

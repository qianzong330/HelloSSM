package com.zkyt.dga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseUnit;
import com.zkyt.dga.service.UnitService;
import com.zkyt.dga.utils.SpringmvcControllerBase;

import net.sf.json.JSONObject;

/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：单位操作表现层
 * 时 间 ：2017-11-28 上午8:51:48
 */
@Controller
@Scope
public class UnitController extends SpringmvcControllerBase {
	@Autowired
	private UnitService unitService;
	/**
	 * 添加单位
	 */
	@RequestMapping("/addUnit")
	public void addUnit(TbBaseUnit unit){
		JSONObject json = new JSONObject();
		try {
			unitService.addUnit(unit);
			json.put("status", true);
			json.put("msg", "添加成功！");
			toClient(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "添加失败！");
			toClient(json.toString());
			e.printStackTrace();
		}
	}
	
	/**
	 * 删除单位
	 */
	@RequestMapping("/deleteUnit")
	public void deleteUnit(String id){
		JSONObject json = new JSONObject();
		try {
			unitService.deleteUnit(id);
			json.put("status", true);
			json.put("msg", "删除成功！");
			toClient(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "删除失败！");
			toClient(json.toString());
			e.printStackTrace();
		}
	}
	/**
	 * 修改单位
	 */
	@RequestMapping("/updateUnit")
	public void updateUnit(TbBaseUnit unit){
		JSONObject json = new JSONObject();
		try {
			unitService.updateUnit(unit);
			json.put("status", true);
			json.put("msg", "修改成功！");
			toClient(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "修改失败！");
			toClient(json.toString());
			e.printStackTrace();
		}
	}
	/**
	 * 查询单位列表（支持分页）
	 */
	/*@RequestMapping("/findUnitList")
	public void findUnitList(Query query){
		JSONObject json = new JSONObject();
		try {
			query.setPageNo(Pagination.cpn(query.getPageNo()));
			Pagination pagination = unitService.findUnitList(query);
			
			json.put("status", true);
			json.put("pagination", pagination);
			toClient(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "出错了！");
			toClient(json.toString());
			e.printStackTrace();
		}
		
	}*/
	@RequestMapping("/findUnitList")
	public void findUnitList(Query query){
		JSONObject json = new JSONObject();
		try {
			PageInfo<TbBaseUnit> pageInfo = unitService.findUnitAll(query);
			json.put("status", true);
			json.put("pagination", pageInfo);
			toClient(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "出错了！");
			toClient(json.toString());
			e.printStackTrace();
		}
		
	}
	
}

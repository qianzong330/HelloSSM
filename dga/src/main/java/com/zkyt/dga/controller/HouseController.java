package com.zkyt.dga.controller;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.github.pagehelper.PageInfo;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseHouse;
import com.zkyt.dga.service.HouseService;
import com.zkyt.dga.utils.SpringmvcControllerBase;
/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ： 住房操作Controller
 * 时 间 ：2017-11-27 上午8:45:31
 */
@Controller
public class HouseController extends SpringmvcControllerBase {
	@Autowired
	private HouseService houseService;
	/**
	 * 保存房屋（Single）
	 */
	@RequestMapping("/saveHouse")
	public void saveBuild(TbBaseHouse house){
		JSONObject json = new JSONObject();
		try {
			
			houseService.saveHouse(house);
			
			json.put("status", true);
			json.put("msg", "添加成功!");
			toClient(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "添加失败!");
			toClient(json.toString());
		}
	}
	/**
	 * 删除房屋
	 */
	@RequestMapping("/deleteHouse")
	public void deleteHouse(Integer id){
		JSONObject json = new JSONObject();
		try {
			houseService.deleteHouse(id);
			json.put("status", true);
			json.put("msg", "删除成功!");
			toClient(json.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json.put("status", false);
			json.put("msg", "删除失败!");
			toClient(json.toString());
		}
	}
	/**
	 * 修改房屋
	 */
	@RequestMapping("/updateHouse")
	public void updateHouse(TbBaseHouse baseHouse){
		JSONObject json = new JSONObject();
		try {
			houseService.updateHouse(baseHouse);
			json.put("status", true);
			json.put("msg", "修改成功!");
			toClient(json.toString());
		} catch (Exception e) {
			e.printStackTrace();
			json.put("status", false);
			json.put("msg", "修改失败!");
			toClient(json.toString());
		}
	}
	/**
	 * 查询所有房屋，返回分页对象
	 */
	/*@RequestMapping("/findHouseList")
	public void findHouseList(Query query){
		JSONObject json = new JSONObject();
		try {
			query.setPageNo(Pagination.cpn(query.getPageNo()));
			Pagination pagination = houseService.findHouseList(query);
			json.put("status", true);
			json.put("pagination", pagination);
			toClient(json.toString());
		} catch (Exception e) {
			e.printStackTrace();
			json.put("status", false);
			json.put("msg", "服务器异常！");
			toClient(json.toString());
		}
	}*/
	/*@RequestMapping("/findHouseList")
	public void findHouseList(Query query){
		JSONObject json = new JSONObject();
		try {
			Pagination pagination = houseService.findHouseList(query);
			json.put("status", true);
			json.put("pagination", pagination);
			toClient(json.toString());
		} catch (Exception e) {
			e.printStackTrace();
			json.put("status", false);
			json.put("msg", "服务器异常！");
			toClient(json.toString());
		}
	}*/
	@RequestMapping("/findHouseList")
	public void findHouseList(Query query){
		JSONObject json = new JSONObject();
		try {
			PageInfo<TbBaseHouse> pageInfo = houseService.findHouseList(query);
			json.put("status", true);
			json.put("pagination", pageInfo);
			toClient(json.toString());
		} catch (Exception e) {
			e.printStackTrace();
			json.put("status", false);
			json.put("msg", "服务器异常！");
			toClient(json.toString());
		}
	}
}

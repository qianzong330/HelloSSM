package com.zkyt.dga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zkyt.dga.pojo.Pagination;
import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBasePopulation;
import com.zkyt.dga.service.PopulationService;
import com.zkyt.dga.utils.SpringmvcControllerBase;

import net.sf.json.JSONObject;

/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：人员操作Controller
 * 时 间 ：2017-11-25 下午2:24:08
 */
@Controller
public class PopulationController extends SpringmvcControllerBase {
	@Autowired
	private PopulationService populationService;
	/**
	 * 批量保存人员
	 */
	@RequestMapping("/saveBatchPopulation")
	public void saveBatchPopulation(String populations){
		JSONObject json = new JSONObject();
		try {
			populationService.saveBatchPopulation(populations);
			json.put("status", true);
			json.put("msg", "批量保存成功!");
			toClient(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "保存失败!");
			toClient(json.toString());
			e.printStackTrace();
		}
	}
	/**
	 * 保存单个人员
	 */
	@RequestMapping("/savePopulation")
	public String savePopulation(TbBasePopulation population){
		populationService.savePopulation(population);
		return "base/population";
	}
	/**s
	 * 根据id删除人员
	 */
	@RequestMapping("/deletePopulation")
	public void deletePopulationById(Integer id){
		JSONObject json = new JSONObject();
		String str = null;
		try {
			populationService.deletePopulationById(id);
			json.put("status", true);
			json.put("msg", "删除成功!");
			toClient(json.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			json.put("status", false);
			json.put("msg", "删除失败!");
			toClient(json.toString());
			e.printStackTrace();
		}
		
	}
	/**
	 * 批量删除
	 * @param id
	 */
	@RequestMapping("/deletePopulationByBatch")
	public String deletePopulationByBatch(Integer[] ids){
		for (Integer id : ids) {
			populationService.deletePopulationById(id);
		}
		return "base/population";
	}
	/**
	 * 修改人员信息
	 */
	@RequestMapping("/updatePopulation")
	public String updatePopulation(TbBasePopulation basePopulation){
		
			populationService.updatePopulationById(basePopulation);
			return "base/population";
	}
	/**
	 * 查询人员列表（加分页）
	 */
	/*@RequestMapping("/findPopulation")
	public void findPopulationList(Query query){
		query.setPageNo(Pagination.cpn(query.getPageNo()));
		JSONObject json = new JSONObject();
		try {
			Pagination pagination = populationService.findPopulationList(query);
			json.put("status", true);
			json.put("pagination", pagination);
			toClient(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "出错了");
			toClient(json.toString());
			
		}
	}*/
	/*@RequestMapping("/findPopulation")
	public void findPopulationList(Query query){
		JSONObject json = new JSONObject();
		try {
			Pagination pagination = populationService.findPopuAll2(query);
			json.put("status", true);
			json.put("pagination", pagination);
			toClient(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "出错了");
			toClient(json.toString());
			
			
		}
	}*/
	@RequestMapping("/findPopulation1")
	@ResponseBody
	public Pagination findPopulationList(Query query){
		
		Pagination pagination = populationService.findPopuAll2(query);
		System.out.println("pagination.rows:------------"+pagination.getRows());
		return pagination;
	}
	@RequestMapping("/test")
	public String test(){
		return null;
	}
	
}

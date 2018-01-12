package com.zkyt.dga.controller;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zkyt.dga.pojo.CommonQuery;
import com.zkyt.dga.pojo.TbBaseCase;
import com.zkyt.dga.service.CaseService;
import com.zkyt.dga.utils.SpringmvcControllerBase;

/**
 * 
 * 作 者 ： 韩宗乾 
 * 描 述 ：案件操作表现 
 * 时 间 ：2017-12-2 下午3:17:12
 */
@Controller
public class CaseController extends SpringmvcControllerBase {
	@Autowired
	private CaseService caseService;

	@RequestMapping(value = "/getCaseInfo")
	public void getCaseInfo(CommonQuery query) {
		JSONObject json = new JSONObject();
		try {
			// 获取案件列表信息
			List<Map<String, Object>> list = caseService.getCaseList(query);
			// 获取总案件数（符合条件的）
			Integer totalCount = caseService.getCaseCount(query);
			// 获取增幅
			List<List<Map<String,Object>>> typeCount = caseService.getTypeCount(query);
			double incre = caseService.getIncre(query);
			String in = incre+"";
			String[] split = in.split("\\.");
			
			String increStr = split[0] +"%";
			//获取省份指定类型的案件数量
			json.put("status", true);
			json.put("总案件", totalCount);
			json.put("同比增长", increStr);
			json.put("案件列表", list);
			json.put("对比指标1", typeCount);
			toClient(json.toString());
		} catch (Exception e) {
			json.put("status", false);
			json.put("msg", "网络连接异常请稍后再试~");
			toClient(json.toString());
			e.printStackTrace();
		}

	}
}

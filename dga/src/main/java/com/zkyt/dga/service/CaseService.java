package com.zkyt.dga.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.zkyt.dga.pojo.CommonQuery;
import com.zkyt.dga.pojo.TbBaseCase;

/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：案件业务接口
 * 时 间 ：2017-12-2 下午1:12:13
 */
@Service
public interface CaseService {
	//符合条件的案件--总数
	public Integer getCaseCount(CommonQuery query);
	//增幅
	public double getIncre(CommonQuery query);
	//省份总案件数
	public List<Map<String, Object>> getCaseList(CommonQuery query);
	public List<List<Map<String, Object>>> getTypeCount(CommonQuery query);
}

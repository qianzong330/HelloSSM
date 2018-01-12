package com.zkyt.dga.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zkyt.dga.mapper.TbBaseCaseMapper;
import com.zkyt.dga.pojo.CommonQuery;
import com.zkyt.dga.service.CaseService;

/**
 * 
 * 作 者 ： 韩宗乾 
 * 描 述 ：案件业务实现类 
 * 时 间 ：2017-12-2 下午1:25:11
 */
@Transactional
@Service
public class CaseControllerImpl implements CaseService {
	@Autowired
	private TbBaseCaseMapper caseMapper;
	// 案件总数（符合条件）
	/*@Override
	public Integer getCaseCount(CommonQuery query) {
		Integer num = caseMapper.getTotalCase(query);
		return num;
	}*/
	@Override
	public Integer getCaseCount(CommonQuery query) {
		Integer num =null; /*caseMapper.getTotalCase(query);*/
		if(query.getDistrictlevel()!=null&&query.getDistrictlevel().equals("2")){
			num = caseMapper.getTotalCase2(query);
		}else if(query.getDistrictlevel()!=null&&query.getDistrictlevel().equals("3")){
			num = caseMapper.getTotalCase3(query);
		}else {
			num = caseMapper.getTotalCase(query);
		}
		return num;
	}
		
	//各省份案件总数列表
	/*@Override
	public List<Map<String, Object>> getCaseList(CommonQuery query) {
		String codes = query.getCodes();
		if (codes !=null && codes!="") {
			
			String[] strings = codes.split(",");
			String typt1 = strings[0];
			String typt2 = strings[1];
			Integer typt10 = Integer.parseInt(typt1);
			Integer typt11 = Integer.parseInt(typt2);
			query.setType1(typt10);
			query.setType2(typt11);
		}
		List<Map<String,Object>> list = caseMapper.getCaseRank(query);
		System.out.println("---------------"+list+"--------------");
		return list;
	}*/
	@Override
	public List<Map<String, Object>> getCaseList(CommonQuery query) {
		String codes = query.getCodes();
		if (codes !=null && codes!="") {
			
			String[] strings = codes.split(",");
			String typt1 = strings[0];
			String typt2 = strings[1];
			Integer typt10 = Integer.parseInt(typt1);
			Integer typt11 = Integer.parseInt(typt2);
			query.setType1(typt10);
			query.setType2(typt11);
		}
		if(query.getDistrictlevel()!=null&&query.getDistrictlevel().equals("2")){
			return caseMapper.getCityList(query);
		}else if(query.getDistrictlevel()!=null&&query.getDistrictlevel().equals("3")){
			return caseMapper.getAreaList(query);
		}else{
			return caseMapper.getCaseRank(query);
		}
	}
	//增幅
	@Override
	public double getIncre(CommonQuery query) {
		double incre = 0.0;
		//1.获取现阶段案件总量
		Integer now = null;
		now = this.getCaseCount(query);
		if(now ==null){
			now =0;
		}
		//2.1获取现阶段时间段
		Date startTime = query.getStartTime();
		Date endTime = query.getEndTime();
		Calendar lastStart =null;
		Calendar lastEnd =null;
		if(startTime !=null&&endTime !=null){
			lastStart = Calendar.getInstance();//转换后的开始日期
			lastStart.setTime(startTime);
			lastEnd = Calendar.getInstance();//转换后的结束日期
			lastEnd.setTime(endTime);
			lastStart.add(Calendar.YEAR, -1);
			lastEnd.add(Calendar.YEAR, -1);
			Date oldStart = lastStart.getTime();
			Date oldEnd = lastEnd.getTime();
			//2.4重新按指定时间段查新案件总数量
			query.setStartTime(oldStart);
			query.setEndTime(oldEnd);
		}
		Integer old = null;
		old = this.getCaseCount(query);
		if(old == null){
			old = 0;
		}
		//计算增幅
		if(now ==0){
        	//如果今天为0，增幅为 0
        	if(old == 0){
        		//如果过去为0
        		return 0;//增幅 0 
        	}else{
        	//过去不为0
        		//return incre=now-old;
        		incre = now - old;
        		return incre;
        		//return 100.0;
        	}
        }else{
        	//今天不为0
        	if(old == 0){
        		//过去为 0 
        		//return incre=now-old;
        		incre=now-old;
        		return incre;
        		//return 100.0;
        	}else{
        		//过去不为 0 
        		if(now==old){
        			return 0.0;
        		}else{
        			incre = ((float)now-(float)old)*100/(float)old;
        			double ceil = Math.ceil(incre);
        			return  ceil;
        		}
        	}
        }
	}
	//将日期转换为日期格式字符串
	public String formatDate(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String string = sdf.format(date);
		return string;
	}
	//获取指定类型的案件数量
	/*public List<List<Map<String, Object>>> getTypeCount(CommonQuery query) {
		List<List<Map<String, Object>>> list = new ArrayList<List<Map<String,Object>>>();
		String codes = query.getCodes();
		if (codes !=null && codes!="") {
			
			String[] strings = codes.split(",");
			for (String string : strings) {
				
				query.setType(Integer.parseInt(string));
				
				List<Map<String,Object>> count = caseMapper.getTypeCount(query);
				System.out.println("---------------"+count+"--------------");
				list.add(count);
			}
		}
		return list;
	}*/
	public List<List<Map<String, Object>>> getTypeCount(CommonQuery query) {
		List<List<Map<String, Object>>> list = new ArrayList<List<Map<String,Object>>>();
		String codes = query.getCodes();
		if (codes !=null && codes!="") {
			
			String[] strings = codes.split(",");
			for (String string : strings) {
				
				query.setType(Integer.parseInt(string));
				if(query.getDistrictlevel()!=null&&query.getDistrictlevel().equals("2")){
					List<Map<String,Object>> typeCity2 = caseMapper.getTypeCity2(query);
					System.out.println("---------------"+typeCity2+"--------------");
					list.add(typeCity2);
				}else if(query.getDistrictlevel()!=null&&query.getDistrictlevel().equals("3")){
					List<Map<String,Object>> typeArea3 = caseMapper.getTypeArea3(query);
					System.out.println("---------------"+typeArea3+"--------------");
					list.add(typeArea3);
				}else{
				List<Map<String,Object>> count = caseMapper.getTypeCount(query);
				System.out.println("---------------"+count+"--------------");
				list.add(count);
				}
			}
		}
		return list;
	}
	
}

package com.zkyt.dga.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zkyt.dga.pojo.CommonQuery;
import com.zkyt.dga.pojo.TbBaseCase;
import com.zkyt.dga.pojo.TbBaseCaseExample;
/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：案件操作持久层
 * 时 间 ：2017-12-2 下午3:16:10
 */
public interface TbBaseCaseMapper {
    int countByExample(TbBaseCaseExample example);

    int deleteByExample(TbBaseCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbBaseCase record);

    int insertSelective(TbBaseCase record);

    List<TbBaseCase> selectByExample(TbBaseCaseExample example);

    TbBaseCase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbBaseCase record, @Param("example") TbBaseCaseExample example);

    int updateByExample(@Param("record") TbBaseCase record, @Param("example") TbBaseCaseExample example);

    int updateByPrimaryKeySelective(TbBaseCase record);

    int updateByPrimaryKey(TbBaseCase record);
    //符合条件的总案件数
	Integer getTotalCase(CommonQuery query);
	Integer getTotalCase2(CommonQuery query);
	Integer getTotalCase3(CommonQuery query);
	//前十名数据从这里获取
	List<Map<String, Object>> getCaseRank(CommonQuery query);
	//获取各省份指定类型type的案件列表
	List<Map<String, Object>> getTypeCount(CommonQuery query);
	//List<Map<String, Object>> getTypeCount2(CommonQuery query);
	//List<Map<String, Object>> getTypeCount3(CommonQuery query);
	
	//获取指定省份案件类型列表
	List<Map<String, Object>> getTypeCity(CommonQuery query);
	/**
	 * 河南 --郑州
	 */
	List<Map<String, Object>> getCityList(CommonQuery query);
	/**
	 * 县区级别
	 */
	List<Map<String, Object>> getAreaList(CommonQuery query);
	
	 List<Map<String, Object>> getTypeCity2(CommonQuery query);
	 List<Map<String, Object>> getTypeArea3(CommonQuery query);
	
}
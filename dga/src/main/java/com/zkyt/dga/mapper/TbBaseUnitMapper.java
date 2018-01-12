package com.zkyt.dga.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseUnit;
import com.zkyt.dga.pojo.TbBaseUnitExample;
public interface TbBaseUnitMapper {
    int countByExample(TbBaseUnitExample example);

    int deleteByExample(TbBaseUnitExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbBaseUnit record);

    int insertSelective(TbBaseUnit record);

    List<TbBaseUnit> selectByExample(TbBaseUnitExample example);

    TbBaseUnit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbBaseUnit record, @Param("example") TbBaseUnitExample example);

    int updateByExample(@Param("record") TbBaseUnit record, @Param("example") TbBaseUnitExample example);

    int updateByPrimaryKeySelective(TbBaseUnit record);

    int updateByPrimaryKey(TbBaseUnit record);
    //查询单位总条数（符合条件）
	int getTotalCount(Query query);
	/*//查询单位列表
	List<TbBaseUnit> findUnitList(Query query);*/
	List<TbBaseUnit> findUnitAll(Query query);
	
}
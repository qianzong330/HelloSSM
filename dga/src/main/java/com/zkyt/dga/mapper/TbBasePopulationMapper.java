package com.zkyt.dga.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBasePopulation;
import com.zkyt.dga.pojo.TbBasePopulationExample;
public interface TbBasePopulationMapper {
    int countByExample(TbBasePopulationExample example);

    int deleteByExample(TbBasePopulationExample example);
    
    int deleteByPrimaryKey(Integer id);

    int insert(TbBasePopulation record);

    int insertSelective(TbBasePopulation record);

    List<TbBasePopulation> selectByExample(TbBasePopulationExample example);

    TbBasePopulation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbBasePopulation record, @Param("example") TbBasePopulationExample example);

    int updateByExample(@Param("record") TbBasePopulation record, @Param("example") TbBasePopulationExample example);

    int updateByPrimaryKeySelective(TbBasePopulation record);

    int updateByPrimaryKey(TbBasePopulation record);
    //查询人员总记录数
    public Integer getTotalCount(Query query);
    /*//查询人员列表（含分页）
	public List<TbBasePopulation> findPopulationList(Query query);*/
    public List<TbBasePopulation> findPopulationAll(Query query);
}
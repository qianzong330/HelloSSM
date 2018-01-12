package com.zkyt.dga.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseBuilding;
import com.zkyt.dga.pojo.TbBaseBuildingExample;
public interface TbBaseBuildingMapper {
    int countByExample(TbBaseBuildingExample example);

    int deleteByExample(TbBaseBuildingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBaseBuilding record);
    int saveBuild(TbBaseBuilding record);
    int getId();
    int insertSelective(TbBaseBuilding record);

    List<TbBaseBuilding> selectByExample(TbBaseBuildingExample example);

    TbBaseBuilding selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBaseBuilding record, @Param("example") TbBaseBuildingExample example);

    int updateByExample(@Param("record") TbBaseBuilding record, @Param("example") TbBaseBuildingExample example);

    int updateByPrimaryKeySelective(TbBaseBuilding record);

    int updateByPrimaryKey(TbBaseBuilding record);
    //查询建筑总条数
	int getTotalCount(Query query);
	//
	List<TbBaseBuilding> findBuildList(Query query);
	List<TbBaseBuilding> findBuildAll(Query query);
}
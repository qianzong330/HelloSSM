package com.zkyt.dga.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zkyt.dga.pojo.Query;
import com.zkyt.dga.pojo.TbBaseHouse;
import com.zkyt.dga.pojo.TbBaseHouseExample;
public interface TbBaseHouseMapper {
    int countByExample(TbBaseHouseExample example);

    int deleteByExample(TbBaseHouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBaseHouse record);

    int insertSelective(TbBaseHouse record);

    List<TbBaseHouse> selectByExample(TbBaseHouseExample example);

    TbBaseHouse selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbBaseHouse record, @Param("example") TbBaseHouseExample example);

    int updateByExample(@Param("record") TbBaseHouse record, @Param("example") TbBaseHouseExample example);

    int updateByPrimaryKeySelective(TbBaseHouse record);

    int updateByPrimaryKey(TbBaseHouse record);
    //查询房屋总数
    public int getTotalCount(Query query);
   /* //查询房屋列表
    public List<TbBaseHouse> findHouseList(Query query);
*/
    public List<TbBaseHouse> findAll();
	
}
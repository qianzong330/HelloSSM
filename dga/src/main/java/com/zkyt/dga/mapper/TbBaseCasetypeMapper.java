package com.zkyt.dga.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zkyt.dga.pojo.TbBaseCasetype;
import com.zkyt.dga.pojo.TbBaseCasetypeExample;
public interface TbBaseCasetypeMapper {
    int countByExample(TbBaseCasetypeExample example);

    int deleteByExample(TbBaseCasetypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBaseCasetype record);

    int insertSelective(TbBaseCasetype record);

    List<TbBaseCasetype> selectByExample(TbBaseCasetypeExample example);

    TbBaseCasetype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBaseCasetype record, @Param("example") TbBaseCasetypeExample example);

    int updateByExample(@Param("record") TbBaseCasetype record, @Param("example") TbBaseCasetypeExample example);

    int updateByPrimaryKeySelective(TbBaseCasetype record);

    int updateByPrimaryKey(TbBaseCasetype record);
}
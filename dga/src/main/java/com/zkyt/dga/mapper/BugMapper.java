package com.zkyt.dga.mapper;

import com.zkyt.dga.pojo.Bug;
import com.zkyt.dga.pojo.BugExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BugMapper {
    int countByExample(BugExample example);

    int deleteByExample(BugExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bug record);

    int insertSelective(Bug record);

    List<Bug> selectByExample(BugExample example);

    Bug selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bug record, @Param("example") BugExample example);

    int updateByExample(@Param("record") Bug record, @Param("example") BugExample example);

    int updateByPrimaryKeySelective(Bug record);

    int updateByPrimaryKey(Bug record);
}
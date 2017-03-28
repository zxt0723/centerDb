package com.haibei.dao.zichan;

import com.haibei.pojo.zichan.SS;
import com.haibei.pojo.zichan.SSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SSMapper {
    int countByExample(SSExample example);

    int deleteByExample(SSExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(SS record);

    int insertSelective(SS record);

    List<SS> selectByExample(SSExample example);

    SS selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") SS record, @Param("example") SSExample example);

    int updateByExample(@Param("record") SS record, @Param("example") SSExample example);

    int updateByPrimaryKeySelective(SS record);

    int updateByPrimaryKey(SS record);
}
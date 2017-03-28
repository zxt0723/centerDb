package com.haibei.dao.zichan;

import com.haibei.pojo.zichan.XQ;
import com.haibei.pojo.zichan.XQExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XQMapper {
    int countByExample(XQExample example);

    int deleteByExample(XQExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(XQ record);

    int insertSelective(XQ record);

    List<XQ> selectByExample(XQExample example);

    XQ selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") XQ record, @Param("example") XQExample example);

    int updateByExample(@Param("record") XQ record, @Param("example") XQExample example);

    int updateByPrimaryKeySelective(XQ record);

    int updateByPrimaryKey(XQ record);
}
package com.haibei.service.zichan;

import com.haibei.pojo.zichan.XQ;
import com.haibei.pojo.zichan.XQExample;
import java.util.List;

public interface XQService {
    int countByExample(XQExample example);

    XQ selectByPrimaryKey(Long wid);

    List<XQ> selectByExample(XQExample example);

    int deleteByPrimaryKey(Long wid);

    int updateByPrimaryKeySelective(XQ record);

    int updateByPrimaryKey(XQ record);

    int deleteByExample(XQExample example);

    int updateByExampleSelective(XQ record, XQExample example);

    int updateByExample(XQ record, XQExample example);

    int insert(XQ record);

    int insertSelective(XQ record);
}
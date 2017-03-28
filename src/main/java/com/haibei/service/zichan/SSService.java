package com.haibei.service.zichan;

import com.haibei.pojo.zichan.SS;
import com.haibei.pojo.zichan.SSExample;
import java.util.List;

public interface SSService {
    int countByExample(SSExample example);

    SS selectByPrimaryKey(Long wid);

    List<SS> selectByExample(SSExample example);

    int deleteByPrimaryKey(Long wid);

    int updateByPrimaryKeySelective(SS record);

    int updateByPrimaryKey(SS record);

    int deleteByExample(SSExample example);

    int updateByExampleSelective(SS record, SSExample example);

    int updateByExample(SS record, SSExample example);

    int insert(SS record);

    int insertSelective(SS record);
}
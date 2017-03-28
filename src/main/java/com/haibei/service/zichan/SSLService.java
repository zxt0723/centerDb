package com.haibei.service.zichan;

import com.haibei.pojo.zichan.SSL;
import com.haibei.pojo.zichan.SSLExample;
import java.util.List;

public interface SSLService {
    int countByExample(SSLExample example);

    SSL selectByPrimaryKey(Long wid);

    List<SSL> selectByExample(SSLExample example);

    int deleteByPrimaryKey(Long wid);

    int updateByPrimaryKeySelective(SSL record);

    int updateByPrimaryKey(SSL record);

    int deleteByExample(SSLExample example);

    int updateByExampleSelective(SSL record, SSLExample example);

    int updateByExample(SSL record, SSLExample example);

    int insert(SSL record);

    int insertSelective(SSL record);
}
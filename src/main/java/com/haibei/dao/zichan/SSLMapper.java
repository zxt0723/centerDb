package com.haibei.dao.zichan;

import com.haibei.pojo.zichan.SSL;
import com.haibei.pojo.zichan.SSLExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SSLMapper {
    int countByExample(SSLExample example);

    int deleteByExample(SSLExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(SSL record);

    int insertSelective(SSL record);

    List<SSL> selectByExample(SSLExample example);

    SSL selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") SSL record, @Param("example") SSLExample example);

    int updateByExample(@Param("record") SSL record, @Param("example") SSLExample example);

    int updateByPrimaryKeySelective(SSL record);

    int updateByPrimaryKey(SSL record);
}
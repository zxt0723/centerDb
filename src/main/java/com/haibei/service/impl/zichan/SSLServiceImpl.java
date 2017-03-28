package com.haibei.service.impl.zichan;

import com.haibei.dao.zichan.SSLMapper;
import com.haibei.pojo.zichan.SSL;
import com.haibei.pojo.zichan.SSLExample;
import com.haibei.service.sys.SequenceService;
import com.haibei.service.zichan.SSLService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSLServiceImpl implements SSLService {
    @Autowired
    private SSLMapper sSLMapper;
    @Autowired
    private SequenceService sequenceService;

    public int countByExample(SSLExample example) {
        int count = this.sSLMapper.countByExample(example);
        return count;
    }

    public SSL selectByPrimaryKey(Long wid) {
        return this.sSLMapper.selectByPrimaryKey(wid);
    }

    public List<SSL> selectByExample(SSLExample example) {
        return this.sSLMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long wid) {
        return this.sSLMapper.deleteByPrimaryKey(wid);
    }

    public int updateByPrimaryKeySelective(SSL record) {
        return this.sSLMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SSL record) {
        return this.sSLMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(SSLExample example) {
        return this.sSLMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SSL record, SSLExample example) {
        return this.sSLMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(SSL record, SSLExample example) {
        return this.sSLMapper.updateByExample(record, example);
    }

    public int insert(SSL record) {
    	record.setWid(this.sequenceService.getSequences("t_ssl").longValue());
        return this.sSLMapper.insert(record);
    }

    public int insertSelective(SSL record) {
    	record.setWid(this.sequenceService.getSequences("t_ssl").longValue());
        return this.sSLMapper.insertSelective(record);
    }
}
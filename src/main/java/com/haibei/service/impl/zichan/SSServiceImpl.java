package com.haibei.service.impl.zichan;

import com.haibei.dao.zichan.SSMapper;
import com.haibei.pojo.zichan.SS;
import com.haibei.pojo.zichan.SSExample;
import com.haibei.service.sys.SequenceService;
import com.haibei.service.zichan.SSService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSServiceImpl implements SSService {
    @Autowired
    private SSMapper sSMapper;
    @Autowired
    private SequenceService sequenceService;

    public int countByExample(SSExample example) {
        int count = this.sSMapper.countByExample(example);
        return count;
    }

    public SS selectByPrimaryKey(Long wid) {
        return this.sSMapper.selectByPrimaryKey(wid);
    }

    public List<SS> selectByExample(SSExample example) {
        return this.sSMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long wid) {
        return this.sSMapper.deleteByPrimaryKey(wid);
    }

    public int updateByPrimaryKeySelective(SS record) {
        return this.sSMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SS record) {
        return this.sSMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(SSExample example) {
        return this.sSMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SS record, SSExample example) {
        return this.sSMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(SS record, SSExample example) {
        return this.sSMapper.updateByExample(record, example);
    }

    public int insert(SS record) {
    	record.setWid(this.sequenceService.getSequences("t_ss").longValue());
        return this.sSMapper.insert(record);
    }

    public int insertSelective(SS record) {
    	record.setWid(this.sequenceService.getSequences("t_ss").longValue());
        return this.sSMapper.insertSelective(record);
    }
}
package com.haibei.service.impl.zichan;

import com.haibei.dao.zichan.XQMapper;
import com.haibei.pojo.zichan.XQ;
import com.haibei.pojo.zichan.XQExample;
import com.haibei.service.sys.SequenceService;
import com.haibei.service.zichan.XQService;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XQServiceImpl implements XQService {
    @Autowired
    private XQMapper xQMapper;
    @Autowired
    private SequenceService sequenceService;

    public int countByExample(XQExample example) {
        int count = this.xQMapper.countByExample(example);
        return count;
    }

    public XQ selectByPrimaryKey(Long wid) {
        return this.xQMapper.selectByPrimaryKey(wid);
    }

    public List<XQ> selectByExample(XQExample example) {
        return this.xQMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long wid) {
        return this.xQMapper.deleteByPrimaryKey(wid);
    }

    public int updateByPrimaryKeySelective(XQ record) {
        return this.xQMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(XQ record) {
        return this.xQMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(XQExample example) {
        return this.xQMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(XQ record, XQExample example) {
        return this.xQMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(XQ record, XQExample example) {
        return this.xQMapper.updateByExample(record, example);
    }

    public int insert(XQ record) {
    	record.setWid(this.sequenceService.getSequences("t_xq").longValue());
        return this.xQMapper.insert(record);
    }

    public int insertSelective(XQ record) {
    	record.setWid(this.sequenceService.getSequences("t_xq").longValue());
        return this.xQMapper.insertSelective(record);
    }
}
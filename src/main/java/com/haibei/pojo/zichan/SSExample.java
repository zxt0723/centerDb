package com.haibei.pojo.zichan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int rowsPerPage = -1;

    public SSExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage=rowsPerPage;
    }

    public int getRowsPerPage() {
        return rowsPerPage;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWidIsNull() {
            addCriterion("WID is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("WID is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Long value) {
            addCriterion("WID =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Long value) {
            addCriterion("WID <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Long value) {
            addCriterion("WID >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Long value) {
            addCriterion("WID >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Long value) {
            addCriterion("WID <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Long value) {
            addCriterion("WID <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Long> values) {
            addCriterion("WID in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Long> values) {
            addCriterion("WID not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Long value1, Long value2) {
            addCriterion("WID between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Long value1, Long value2) {
            addCriterion("WID not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andPwidIsNull() {
            addCriterion("PWID is null");
            return (Criteria) this;
        }

        public Criteria andPwidIsNotNull() {
            addCriterion("PWID is not null");
            return (Criteria) this;
        }

        public Criteria andPwidEqualTo(Long value) {
            addCriterion("PWID =", value, "pwid");
            return (Criteria) this;
        }

        public Criteria andPwidNotEqualTo(Long value) {
            addCriterion("PWID <>", value, "pwid");
            return (Criteria) this;
        }

        public Criteria andPwidGreaterThan(Long value) {
            addCriterion("PWID >", value, "pwid");
            return (Criteria) this;
        }

        public Criteria andPwidGreaterThanOrEqualTo(Long value) {
            addCriterion("PWID >=", value, "pwid");
            return (Criteria) this;
        }

        public Criteria andPwidLessThan(Long value) {
            addCriterion("PWID <", value, "pwid");
            return (Criteria) this;
        }

        public Criteria andPwidLessThanOrEqualTo(Long value) {
            addCriterion("PWID <=", value, "pwid");
            return (Criteria) this;
        }

        public Criteria andPwidIn(List<Long> values) {
            addCriterion("PWID in", values, "pwid");
            return (Criteria) this;
        }

        public Criteria andPwidNotIn(List<Long> values) {
            addCriterion("PWID not in", values, "pwid");
            return (Criteria) this;
        }

        public Criteria andPwidBetween(Long value1, Long value2) {
            addCriterion("PWID between", value1, value2, "pwid");
            return (Criteria) this;
        }

        public Criteria andPwidNotBetween(Long value1, Long value2) {
            addCriterion("PWID not between", value1, value2, "pwid");
            return (Criteria) this;
        }

        public Criteria andSsbhIsNull() {
            addCriterion("SSBH is null");
            return (Criteria) this;
        }

        public Criteria andSsbhIsNotNull() {
            addCriterion("SSBH is not null");
            return (Criteria) this;
        }

        public Criteria andSsbhEqualTo(String value) {
            addCriterion("SSBH =", value, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhNotEqualTo(String value) {
            addCriterion("SSBH <>", value, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhGreaterThan(String value) {
            addCriterion("SSBH >", value, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhGreaterThanOrEqualTo(String value) {
            addCriterion("SSBH >=", value, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhLessThan(String value) {
            addCriterion("SSBH <", value, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhLessThanOrEqualTo(String value) {
            addCriterion("SSBH <=", value, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhLike(String value) {
            addCriterion("SSBH like", value, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhNotLike(String value) {
            addCriterion("SSBH not like", value, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhIn(List<String> values) {
            addCriterion("SSBH in", values, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhNotIn(List<String> values) {
            addCriterion("SSBH not in", values, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhBetween(String value1, String value2) {
            addCriterion("SSBH between", value1, value2, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsbhNotBetween(String value1, String value2) {
            addCriterion("SSBH not between", value1, value2, "ssbh");
            return (Criteria) this;
        }

        public Criteria andSsldmIsNull() {
            addCriterion("SSLDM is null");
            return (Criteria) this;
        }

        public Criteria andSsldmIsNotNull() {
            addCriterion("SSLDM is not null");
            return (Criteria) this;
        }

        public Criteria andSsldmEqualTo(String value) {
            addCriterion("SSLDM =", value, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmNotEqualTo(String value) {
            addCriterion("SSLDM <>", value, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmGreaterThan(String value) {
            addCriterion("SSLDM >", value, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmGreaterThanOrEqualTo(String value) {
            addCriterion("SSLDM >=", value, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmLessThan(String value) {
            addCriterion("SSLDM <", value, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmLessThanOrEqualTo(String value) {
            addCriterion("SSLDM <=", value, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmLike(String value) {
            addCriterion("SSLDM like", value, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmNotLike(String value) {
            addCriterion("SSLDM not like", value, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmIn(List<String> values) {
            addCriterion("SSLDM in", values, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmNotIn(List<String> values) {
            addCriterion("SSLDM not in", values, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmBetween(String value1, String value2) {
            addCriterion("SSLDM between", value1, value2, "ssldm");
            return (Criteria) this;
        }

        public Criteria andSsldmNotBetween(String value1, String value2) {
            addCriterion("SSLDM not between", value1, value2, "ssldm");
            return (Criteria) this;
        }

        public Criteria andLcIsNull() {
            addCriterion("LC is null");
            return (Criteria) this;
        }

        public Criteria andLcIsNotNull() {
            addCriterion("LC is not null");
            return (Criteria) this;
        }

        public Criteria andLcEqualTo(Short value) {
            addCriterion("LC =", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcNotEqualTo(Short value) {
            addCriterion("LC <>", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcGreaterThan(Short value) {
            addCriterion("LC >", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcGreaterThanOrEqualTo(Short value) {
            addCriterion("LC >=", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcLessThan(Short value) {
            addCriterion("LC <", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcLessThanOrEqualTo(Short value) {
            addCriterion("LC <=", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcIn(List<Short> values) {
            addCriterion("LC in", values, "lc");
            return (Criteria) this;
        }

        public Criteria andLcNotIn(List<Short> values) {
            addCriterion("LC not in", values, "lc");
            return (Criteria) this;
        }

        public Criteria andLcBetween(Short value1, Short value2) {
            addCriterion("LC between", value1, value2, "lc");
            return (Criteria) this;
        }

        public Criteria andLcNotBetween(Short value1, Short value2) {
            addCriterion("LC not between", value1, value2, "lc");
            return (Criteria) this;
        }

        public Criteria andDyIsNull() {
            addCriterion("DY is null");
            return (Criteria) this;
        }

        public Criteria andDyIsNotNull() {
            addCriterion("DY is not null");
            return (Criteria) this;
        }

        public Criteria andDyEqualTo(String value) {
            addCriterion("DY =", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotEqualTo(String value) {
            addCriterion("DY <>", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyGreaterThan(String value) {
            addCriterion("DY >", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyGreaterThanOrEqualTo(String value) {
            addCriterion("DY >=", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyLessThan(String value) {
            addCriterion("DY <", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyLessThanOrEqualTo(String value) {
            addCriterion("DY <=", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyLike(String value) {
            addCriterion("DY like", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotLike(String value) {
            addCriterion("DY not like", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyIn(List<String> values) {
            addCriterion("DY in", values, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotIn(List<String> values) {
            addCriterion("DY not in", values, "dy");
            return (Criteria) this;
        }

        public Criteria andDyBetween(String value1, String value2) {
            addCriterion("DY between", value1, value2, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotBetween(String value1, String value2) {
            addCriterion("DY not between", value1, value2, "dy");
            return (Criteria) this;
        }

        public Criteria andFjhIsNull() {
            addCriterion("FJH is null");
            return (Criteria) this;
        }

        public Criteria andFjhIsNotNull() {
            addCriterion("FJH is not null");
            return (Criteria) this;
        }

        public Criteria andFjhEqualTo(String value) {
            addCriterion("FJH =", value, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhNotEqualTo(String value) {
            addCriterion("FJH <>", value, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhGreaterThan(String value) {
            addCriterion("FJH >", value, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhGreaterThanOrEqualTo(String value) {
            addCriterion("FJH >=", value, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhLessThan(String value) {
            addCriterion("FJH <", value, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhLessThanOrEqualTo(String value) {
            addCriterion("FJH <=", value, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhLike(String value) {
            addCriterion("FJH like", value, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhNotLike(String value) {
            addCriterion("FJH not like", value, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhIn(List<String> values) {
            addCriterion("FJH in", values, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhNotIn(List<String> values) {
            addCriterion("FJH not in", values, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhBetween(String value1, String value2) {
            addCriterion("FJH between", value1, value2, "fjh");
            return (Criteria) this;
        }

        public Criteria andFjhNotBetween(String value1, String value2) {
            addCriterion("FJH not between", value1, value2, "fjh");
            return (Criteria) this;
        }

        public Criteria andDhIsNull() {
            addCriterion("DH is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("DH is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(String value) {
            addCriterion("DH =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(String value) {
            addCriterion("DH <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(String value) {
            addCriterion("DH >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(String value) {
            addCriterion("DH >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(String value) {
            addCriterion("DH <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(String value) {
            addCriterion("DH <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLike(String value) {
            addCriterion("DH like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotLike(String value) {
            addCriterion("DH not like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<String> values) {
            addCriterion("DH in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<String> values) {
            addCriterion("DH not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(String value1, String value2) {
            addCriterion("DH between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(String value1, String value2) {
            addCriterion("DH not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andCwsIsNull() {
            addCriterion("CWS is null");
            return (Criteria) this;
        }

        public Criteria andCwsIsNotNull() {
            addCriterion("CWS is not null");
            return (Criteria) this;
        }

        public Criteria andCwsEqualTo(Short value) {
            addCriterion("CWS =", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsNotEqualTo(Short value) {
            addCriterion("CWS <>", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsGreaterThan(Short value) {
            addCriterion("CWS >", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsGreaterThanOrEqualTo(Short value) {
            addCriterion("CWS >=", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsLessThan(Short value) {
            addCriterion("CWS <", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsLessThanOrEqualTo(Short value) {
            addCriterion("CWS <=", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsIn(List<Short> values) {
            addCriterion("CWS in", values, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsNotIn(List<Short> values) {
            addCriterion("CWS not in", values, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsBetween(Short value1, Short value2) {
            addCriterion("CWS between", value1, value2, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsNotBetween(Short value1, Short value2) {
            addCriterion("CWS not between", value1, value2, "cws");
            return (Criteria) this;
        }

        public Criteria andZjIsNull() {
            addCriterion("ZJ is null");
            return (Criteria) this;
        }

        public Criteria andZjIsNotNull() {
            addCriterion("ZJ is not null");
            return (Criteria) this;
        }

        public Criteria andZjEqualTo(BigDecimal value) {
            addCriterion("ZJ =", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotEqualTo(BigDecimal value) {
            addCriterion("ZJ <>", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThan(BigDecimal value) {
            addCriterion("ZJ >", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZJ >=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThan(BigDecimal value) {
            addCriterion("ZJ <", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZJ <=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjIn(List<BigDecimal> values) {
            addCriterion("ZJ in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotIn(List<BigDecimal> values) {
            addCriterion("ZJ not in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZJ between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZJ not between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andFjlxdmIsNull() {
            addCriterion("FJLXDM is null");
            return (Criteria) this;
        }

        public Criteria andFjlxdmIsNotNull() {
            addCriterion("FJLXDM is not null");
            return (Criteria) this;
        }

        public Criteria andFjlxdmEqualTo(String value) {
            addCriterion("FJLXDM =", value, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmNotEqualTo(String value) {
            addCriterion("FJLXDM <>", value, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmGreaterThan(String value) {
            addCriterion("FJLXDM >", value, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("FJLXDM >=", value, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmLessThan(String value) {
            addCriterion("FJLXDM <", value, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmLessThanOrEqualTo(String value) {
            addCriterion("FJLXDM <=", value, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmLike(String value) {
            addCriterion("FJLXDM like", value, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmNotLike(String value) {
            addCriterion("FJLXDM not like", value, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmIn(List<String> values) {
            addCriterion("FJLXDM in", values, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmNotIn(List<String> values) {
            addCriterion("FJLXDM not in", values, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmBetween(String value1, String value2) {
            addCriterion("FJLXDM between", value1, value2, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andFjlxdmNotBetween(String value1, String value2) {
            addCriterion("FJLXDM not between", value1, value2, "fjlxdm");
            return (Criteria) this;
        }

        public Criteria andMxxsccIsNull() {
            addCriterion("MXXSCC is null");
            return (Criteria) this;
        }

        public Criteria andMxxsccIsNotNull() {
            addCriterion("MXXSCC is not null");
            return (Criteria) this;
        }

        public Criteria andMxxsccEqualTo(String value) {
            addCriterion("MXXSCC =", value, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccNotEqualTo(String value) {
            addCriterion("MXXSCC <>", value, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccGreaterThan(String value) {
            addCriterion("MXXSCC >", value, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccGreaterThanOrEqualTo(String value) {
            addCriterion("MXXSCC >=", value, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccLessThan(String value) {
            addCriterion("MXXSCC <", value, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccLessThanOrEqualTo(String value) {
            addCriterion("MXXSCC <=", value, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccLike(String value) {
            addCriterion("MXXSCC like", value, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccNotLike(String value) {
            addCriterion("MXXSCC not like", value, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccIn(List<String> values) {
            addCriterion("MXXSCC in", values, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccNotIn(List<String> values) {
            addCriterion("MXXSCC not in", values, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccBetween(String value1, String value2) {
            addCriterion("MXXSCC between", value1, value2, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsccNotBetween(String value1, String value2) {
            addCriterion("MXXSCC not between", value1, value2, "mxxscc");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmIsNull() {
            addCriterion("MXXSXBDM is null");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmIsNotNull() {
            addCriterion("MXXSXBDM is not null");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmEqualTo(String value) {
            addCriterion("MXXSXBDM =", value, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmNotEqualTo(String value) {
            addCriterion("MXXSXBDM <>", value, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmGreaterThan(String value) {
            addCriterion("MXXSXBDM >", value, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmGreaterThanOrEqualTo(String value) {
            addCriterion("MXXSXBDM >=", value, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmLessThan(String value) {
            addCriterion("MXXSXBDM <", value, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmLessThanOrEqualTo(String value) {
            addCriterion("MXXSXBDM <=", value, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmLike(String value) {
            addCriterion("MXXSXBDM like", value, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmNotLike(String value) {
            addCriterion("MXXSXBDM not like", value, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmIn(List<String> values) {
            addCriterion("MXXSXBDM in", values, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmNotIn(List<String> values) {
            addCriterion("MXXSXBDM not in", values, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmBetween(String value1, String value2) {
            addCriterion("MXXSXBDM between", value1, value2, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andMxxsxbdmNotBetween(String value1, String value2) {
            addCriterion("MXXSXBDM not between", value1, value2, "mxxsxbdm");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsIsNull() {
            addCriterion("SFKZAPZS is null");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsIsNotNull() {
            addCriterion("SFKZAPZS is not null");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsEqualTo(String value) {
            addCriterion("SFKZAPZS =", value, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsNotEqualTo(String value) {
            addCriterion("SFKZAPZS <>", value, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsGreaterThan(String value) {
            addCriterion("SFKZAPZS >", value, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsGreaterThanOrEqualTo(String value) {
            addCriterion("SFKZAPZS >=", value, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsLessThan(String value) {
            addCriterion("SFKZAPZS <", value, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsLessThanOrEqualTo(String value) {
            addCriterion("SFKZAPZS <=", value, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsLike(String value) {
            addCriterion("SFKZAPZS like", value, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsNotLike(String value) {
            addCriterion("SFKZAPZS not like", value, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsIn(List<String> values) {
            addCriterion("SFKZAPZS in", values, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsNotIn(List<String> values) {
            addCriterion("SFKZAPZS not in", values, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsBetween(String value1, String value2) {
            addCriterion("SFKZAPZS between", value1, value2, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andSfkzapzsNotBetween(String value1, String value2) {
            addCriterion("SFKZAPZS not between", value1, value2, "sfkzapzs");
            return (Criteria) this;
        }

        public Criteria andCxIsNull() {
            addCriterion("CX is null");
            return (Criteria) this;
        }

        public Criteria andCxIsNotNull() {
            addCriterion("CX is not null");
            return (Criteria) this;
        }

        public Criteria andCxEqualTo(String value) {
            addCriterion("CX =", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxNotEqualTo(String value) {
            addCriterion("CX <>", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxGreaterThan(String value) {
            addCriterion("CX >", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxGreaterThanOrEqualTo(String value) {
            addCriterion("CX >=", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxLessThan(String value) {
            addCriterion("CX <", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxLessThanOrEqualTo(String value) {
            addCriterion("CX <=", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxLike(String value) {
            addCriterion("CX like", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxNotLike(String value) {
            addCriterion("CX not like", value, "cx");
            return (Criteria) this;
        }

        public Criteria andCxIn(List<String> values) {
            addCriterion("CX in", values, "cx");
            return (Criteria) this;
        }

        public Criteria andCxNotIn(List<String> values) {
            addCriterion("CX not in", values, "cx");
            return (Criteria) this;
        }

        public Criteria andCxBetween(String value1, String value2) {
            addCriterion("CX between", value1, value2, "cx");
            return (Criteria) this;
        }

        public Criteria andCxNotBetween(String value1, String value2) {
            addCriterion("CX not between", value1, value2, "cx");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andClrqIsNull() {
            addCriterion("CLRQ is null");
            return (Criteria) this;
        }

        public Criteria andClrqIsNotNull() {
            addCriterion("CLRQ is not null");
            return (Criteria) this;
        }

        public Criteria andClrqEqualTo(Date value) {
            addCriterion("CLRQ =", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotEqualTo(Date value) {
            addCriterion("CLRQ <>", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqGreaterThan(Date value) {
            addCriterion("CLRQ >", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqGreaterThanOrEqualTo(Date value) {
            addCriterion("CLRQ >=", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqLessThan(Date value) {
            addCriterion("CLRQ <", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqLessThanOrEqualTo(Date value) {
            addCriterion("CLRQ <=", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqIn(List<Date> values) {
            addCriterion("CLRQ in", values, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotIn(List<Date> values) {
            addCriterion("CLRQ not in", values, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqBetween(Date value1, Date value2) {
            addCriterion("CLRQ between", value1, value2, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotBetween(Date value1, Date value2) {
            addCriterion("CLRQ not between", value1, value2, "clrq");
            return (Criteria) this;
        }

        public Criteria andCzlxIsNull() {
            addCriterion("CZLX is null");
            return (Criteria) this;
        }

        public Criteria andCzlxIsNotNull() {
            addCriterion("CZLX is not null");
            return (Criteria) this;
        }

        public Criteria andCzlxEqualTo(String value) {
            addCriterion("CZLX =", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotEqualTo(String value) {
            addCriterion("CZLX <>", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxGreaterThan(String value) {
            addCriterion("CZLX >", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxGreaterThanOrEqualTo(String value) {
            addCriterion("CZLX >=", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLessThan(String value) {
            addCriterion("CZLX <", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLessThanOrEqualTo(String value) {
            addCriterion("CZLX <=", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLike(String value) {
            addCriterion("CZLX like", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotLike(String value) {
            addCriterion("CZLX not like", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxIn(List<String> values) {
            addCriterion("CZLX in", values, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotIn(List<String> values) {
            addCriterion("CZLX not in", values, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxBetween(String value1, String value2) {
            addCriterion("CZLX between", value1, value2, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotBetween(String value1, String value2) {
            addCriterion("CZLX not between", value1, value2, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzzIsNull() {
            addCriterion("CZZ is null");
            return (Criteria) this;
        }

        public Criteria andCzzIsNotNull() {
            addCriterion("CZZ is not null");
            return (Criteria) this;
        }

        public Criteria andCzzEqualTo(String value) {
            addCriterion("CZZ =", value, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzNotEqualTo(String value) {
            addCriterion("CZZ <>", value, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzGreaterThan(String value) {
            addCriterion("CZZ >", value, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzGreaterThanOrEqualTo(String value) {
            addCriterion("CZZ >=", value, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzLessThan(String value) {
            addCriterion("CZZ <", value, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzLessThanOrEqualTo(String value) {
            addCriterion("CZZ <=", value, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzLike(String value) {
            addCriterion("CZZ like", value, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzNotLike(String value) {
            addCriterion("CZZ not like", value, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzIn(List<String> values) {
            addCriterion("CZZ in", values, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzNotIn(List<String> values) {
            addCriterion("CZZ not in", values, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzBetween(String value1, String value2) {
            addCriterion("CZZ between", value1, value2, "czz");
            return (Criteria) this;
        }

        public Criteria andCzzNotBetween(String value1, String value2) {
            addCriterion("CZZ not between", value1, value2, "czz");
            return (Criteria) this;
        }

        public Criteria andSjlyIsNull() {
            addCriterion("SJLY is null");
            return (Criteria) this;
        }

        public Criteria andSjlyIsNotNull() {
            addCriterion("SJLY is not null");
            return (Criteria) this;
        }

        public Criteria andSjlyEqualTo(String value) {
            addCriterion("SJLY =", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotEqualTo(String value) {
            addCriterion("SJLY <>", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyGreaterThan(String value) {
            addCriterion("SJLY >", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyGreaterThanOrEqualTo(String value) {
            addCriterion("SJLY >=", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLessThan(String value) {
            addCriterion("SJLY <", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLessThanOrEqualTo(String value) {
            addCriterion("SJLY <=", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLike(String value) {
            addCriterion("SJLY like", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotLike(String value) {
            addCriterion("SJLY not like", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyIn(List<String> values) {
            addCriterion("SJLY in", values, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotIn(List<String> values) {
            addCriterion("SJLY not in", values, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyBetween(String value1, String value2) {
            addCriterion("SJLY between", value1, value2, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotBetween(String value1, String value2) {
            addCriterion("SJLY not between", value1, value2, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjbbhIsNull() {
            addCriterion("SJBBH is null");
            return (Criteria) this;
        }

        public Criteria andSjbbhIsNotNull() {
            addCriterion("SJBBH is not null");
            return (Criteria) this;
        }

        public Criteria andSjbbhEqualTo(Long value) {
            addCriterion("SJBBH =", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhNotEqualTo(Long value) {
            addCriterion("SJBBH <>", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhGreaterThan(Long value) {
            addCriterion("SJBBH >", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhGreaterThanOrEqualTo(Long value) {
            addCriterion("SJBBH >=", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhLessThan(Long value) {
            addCriterion("SJBBH <", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhLessThanOrEqualTo(Long value) {
            addCriterion("SJBBH <=", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhIn(List<Long> values) {
            addCriterion("SJBBH in", values, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhNotIn(List<Long> values) {
            addCriterion("SJBBH not in", values, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhBetween(Long value1, Long value2) {
            addCriterion("SJBBH between", value1, value2, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhNotBetween(Long value1, Long value2) {
            addCriterion("SJBBH not between", value1, value2, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andScbzIsNull() {
            addCriterion("SCBZ is null");
            return (Criteria) this;
        }

        public Criteria andScbzIsNotNull() {
            addCriterion("SCBZ is not null");
            return (Criteria) this;
        }

        public Criteria andScbzEqualTo(String value) {
            addCriterion("SCBZ =", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzNotEqualTo(String value) {
            addCriterion("SCBZ <>", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzGreaterThan(String value) {
            addCriterion("SCBZ >", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzGreaterThanOrEqualTo(String value) {
            addCriterion("SCBZ >=", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzLessThan(String value) {
            addCriterion("SCBZ <", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzLessThanOrEqualTo(String value) {
            addCriterion("SCBZ <=", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzLike(String value) {
            addCriterion("SCBZ like", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzNotLike(String value) {
            addCriterion("SCBZ not like", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzIn(List<String> values) {
            addCriterion("SCBZ in", values, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzNotIn(List<String> values) {
            addCriterion("SCBZ not in", values, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzBetween(String value1, String value2) {
            addCriterion("SCBZ between", value1, value2, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzNotBetween(String value1, String value2) {
            addCriterion("SCBZ not between", value1, value2, "scbz");
            return (Criteria) this;
        }

        public Criteria andBy1IsNull() {
            addCriterion("BY1 is null");
            return (Criteria) this;
        }

        public Criteria andBy1IsNotNull() {
            addCriterion("BY1 is not null");
            return (Criteria) this;
        }

        public Criteria andBy1EqualTo(String value) {
            addCriterion("BY1 =", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotEqualTo(String value) {
            addCriterion("BY1 <>", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1GreaterThan(String value) {
            addCriterion("BY1 >", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1GreaterThanOrEqualTo(String value) {
            addCriterion("BY1 >=", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1LessThan(String value) {
            addCriterion("BY1 <", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1LessThanOrEqualTo(String value) {
            addCriterion("BY1 <=", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1Like(String value) {
            addCriterion("BY1 like", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotLike(String value) {
            addCriterion("BY1 not like", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1In(List<String> values) {
            addCriterion("BY1 in", values, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotIn(List<String> values) {
            addCriterion("BY1 not in", values, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1Between(String value1, String value2) {
            addCriterion("BY1 between", value1, value2, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotBetween(String value1, String value2) {
            addCriterion("BY1 not between", value1, value2, "by1");
            return (Criteria) this;
        }

        public Criteria andBy2IsNull() {
            addCriterion("BY2 is null");
            return (Criteria) this;
        }

        public Criteria andBy2IsNotNull() {
            addCriterion("BY2 is not null");
            return (Criteria) this;
        }

        public Criteria andBy2EqualTo(String value) {
            addCriterion("BY2 =", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotEqualTo(String value) {
            addCriterion("BY2 <>", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2GreaterThan(String value) {
            addCriterion("BY2 >", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2GreaterThanOrEqualTo(String value) {
            addCriterion("BY2 >=", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2LessThan(String value) {
            addCriterion("BY2 <", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2LessThanOrEqualTo(String value) {
            addCriterion("BY2 <=", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2Like(String value) {
            addCriterion("BY2 like", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotLike(String value) {
            addCriterion("BY2 not like", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2In(List<String> values) {
            addCriterion("BY2 in", values, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotIn(List<String> values) {
            addCriterion("BY2 not in", values, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2Between(String value1, String value2) {
            addCriterion("BY2 between", value1, value2, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotBetween(String value1, String value2) {
            addCriterion("BY2 not between", value1, value2, "by2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
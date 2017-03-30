package com.haibei.pojo.zichan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XQExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int rowsPerPage = 100;

    public XQExample() {
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

        public Criteria andXqhIsNull() {
            addCriterion("XQH is null");
            return (Criteria) this;
        }

        public Criteria andXqhIsNotNull() {
            addCriterion("XQH is not null");
            return (Criteria) this;
        }

        public Criteria andXqhEqualTo(String value) {
            addCriterion("XQH =", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhNotEqualTo(String value) {
            addCriterion("XQH <>", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhGreaterThan(String value) {
            addCriterion("XQH >", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhGreaterThanOrEqualTo(String value) {
            addCriterion("XQH >=", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhLessThan(String value) {
            addCriterion("XQH <", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhLessThanOrEqualTo(String value) {
            addCriterion("XQH <=", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhLike(String value) {
            addCriterion("XQH like", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhNotLike(String value) {
            addCriterion("XQH not like", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhIn(List<String> values) {
            addCriterion("XQH in", values, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhNotIn(List<String> values) {
            addCriterion("XQH not in", values, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhBetween(String value1, String value2) {
            addCriterion("XQH between", value1, value2, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhNotBetween(String value1, String value2) {
            addCriterion("XQH not between", value1, value2, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqdzIsNull() {
            addCriterion("XQDZ is null");
            return (Criteria) this;
        }

        public Criteria andXqdzIsNotNull() {
            addCriterion("XQDZ is not null");
            return (Criteria) this;
        }

        public Criteria andXqdzEqualTo(String value) {
            addCriterion("XQDZ =", value, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzNotEqualTo(String value) {
            addCriterion("XQDZ <>", value, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzGreaterThan(String value) {
            addCriterion("XQDZ >", value, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzGreaterThanOrEqualTo(String value) {
            addCriterion("XQDZ >=", value, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzLessThan(String value) {
            addCriterion("XQDZ <", value, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzLessThanOrEqualTo(String value) {
            addCriterion("XQDZ <=", value, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzLike(String value) {
            addCriterion("XQDZ like", value, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzNotLike(String value) {
            addCriterion("XQDZ not like", value, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzIn(List<String> values) {
            addCriterion("XQDZ in", values, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzNotIn(List<String> values) {
            addCriterion("XQDZ not in", values, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzBetween(String value1, String value2) {
            addCriterion("XQDZ between", value1, value2, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqdzNotBetween(String value1, String value2) {
            addCriterion("XQDZ not between", value1, value2, "xqdz");
            return (Criteria) this;
        }

        public Criteria andXqyzbmIsNull() {
            addCriterion("XQYZBM is null");
            return (Criteria) this;
        }

        public Criteria andXqyzbmIsNotNull() {
            addCriterion("XQYZBM is not null");
            return (Criteria) this;
        }

        public Criteria andXqyzbmEqualTo(String value) {
            addCriterion("XQYZBM =", value, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmNotEqualTo(String value) {
            addCriterion("XQYZBM <>", value, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmGreaterThan(String value) {
            addCriterion("XQYZBM >", value, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmGreaterThanOrEqualTo(String value) {
            addCriterion("XQYZBM >=", value, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmLessThan(String value) {
            addCriterion("XQYZBM <", value, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmLessThanOrEqualTo(String value) {
            addCriterion("XQYZBM <=", value, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmLike(String value) {
            addCriterion("XQYZBM like", value, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmNotLike(String value) {
            addCriterion("XQYZBM not like", value, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmIn(List<String> values) {
            addCriterion("XQYZBM in", values, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmNotIn(List<String> values) {
            addCriterion("XQYZBM not in", values, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmBetween(String value1, String value2) {
            addCriterion("XQYZBM between", value1, value2, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqyzbmNotBetween(String value1, String value2) {
            addCriterion("XQYZBM not between", value1, value2, "xqyzbm");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghIsNull() {
            addCriterion("XQFZRZGH is null");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghIsNotNull() {
            addCriterion("XQFZRZGH is not null");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghEqualTo(String value) {
            addCriterion("XQFZRZGH =", value, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghNotEqualTo(String value) {
            addCriterion("XQFZRZGH <>", value, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghGreaterThan(String value) {
            addCriterion("XQFZRZGH >", value, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghGreaterThanOrEqualTo(String value) {
            addCriterion("XQFZRZGH >=", value, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghLessThan(String value) {
            addCriterion("XQFZRZGH <", value, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghLessThanOrEqualTo(String value) {
            addCriterion("XQFZRZGH <=", value, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghLike(String value) {
            addCriterion("XQFZRZGH like", value, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghNotLike(String value) {
            addCriterion("XQFZRZGH not like", value, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghIn(List<String> values) {
            addCriterion("XQFZRZGH in", values, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghNotIn(List<String> values) {
            addCriterion("XQFZRZGH not in", values, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghBetween(String value1, String value2) {
            addCriterion("XQFZRZGH between", value1, value2, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqfzrzghNotBetween(String value1, String value2) {
            addCriterion("XQFZRZGH not between", value1, value2, "xqfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghIsNull() {
            addCriterion("XQDWFZRZGH is null");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghIsNotNull() {
            addCriterion("XQDWFZRZGH is not null");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghEqualTo(String value) {
            addCriterion("XQDWFZRZGH =", value, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghNotEqualTo(String value) {
            addCriterion("XQDWFZRZGH <>", value, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghGreaterThan(String value) {
            addCriterion("XQDWFZRZGH >", value, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghGreaterThanOrEqualTo(String value) {
            addCriterion("XQDWFZRZGH >=", value, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghLessThan(String value) {
            addCriterion("XQDWFZRZGH <", value, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghLessThanOrEqualTo(String value) {
            addCriterion("XQDWFZRZGH <=", value, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghLike(String value) {
            addCriterion("XQDWFZRZGH like", value, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghNotLike(String value) {
            addCriterion("XQDWFZRZGH not like", value, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghIn(List<String> values) {
            addCriterion("XQDWFZRZGH in", values, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghNotIn(List<String> values) {
            addCriterion("XQDWFZRZGH not in", values, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghBetween(String value1, String value2) {
            addCriterion("XQDWFZRZGH between", value1, value2, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqdwfzrzghNotBetween(String value1, String value2) {
            addCriterion("XQDWFZRZGH not between", value1, value2, "xqdwfzrzgh");
            return (Criteria) this;
        }

        public Criteria andXqmcIsNull() {
            addCriterion("XQMC is null");
            return (Criteria) this;
        }

        public Criteria andXqmcIsNotNull() {
            addCriterion("XQMC is not null");
            return (Criteria) this;
        }

        public Criteria andXqmcEqualTo(String value) {
            addCriterion("XQMC =", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcNotEqualTo(String value) {
            addCriterion("XQMC <>", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcGreaterThan(String value) {
            addCriterion("XQMC >", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcGreaterThanOrEqualTo(String value) {
            addCriterion("XQMC >=", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcLessThan(String value) {
            addCriterion("XQMC <", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcLessThanOrEqualTo(String value) {
            addCriterion("XQMC <=", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcLike(String value) {
            addCriterion("XQMC like", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcNotLike(String value) {
            addCriterion("XQMC not like", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcIn(List<String> values) {
            addCriterion("XQMC in", values, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcNotIn(List<String> values) {
            addCriterion("XQMC not in", values, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcBetween(String value1, String value2) {
            addCriterion("XQMC between", value1, value2, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcNotBetween(String value1, String value2) {
            addCriterion("XQMC not between", value1, value2, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqlxdhIsNull() {
            addCriterion("XQLXDH is null");
            return (Criteria) this;
        }

        public Criteria andXqlxdhIsNotNull() {
            addCriterion("XQLXDH is not null");
            return (Criteria) this;
        }

        public Criteria andXqlxdhEqualTo(String value) {
            addCriterion("XQLXDH =", value, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhNotEqualTo(String value) {
            addCriterion("XQLXDH <>", value, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhGreaterThan(String value) {
            addCriterion("XQLXDH >", value, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhGreaterThanOrEqualTo(String value) {
            addCriterion("XQLXDH >=", value, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhLessThan(String value) {
            addCriterion("XQLXDH <", value, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhLessThanOrEqualTo(String value) {
            addCriterion("XQLXDH <=", value, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhLike(String value) {
            addCriterion("XQLXDH like", value, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhNotLike(String value) {
            addCriterion("XQLXDH not like", value, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhIn(List<String> values) {
            addCriterion("XQLXDH in", values, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhNotIn(List<String> values) {
            addCriterion("XQLXDH not in", values, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhBetween(String value1, String value2) {
            addCriterion("XQLXDH between", value1, value2, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqlxdhNotBetween(String value1, String value2) {
            addCriterion("XQLXDH not between", value1, value2, "xqlxdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhIsNull() {
            addCriterion("XQCZDH is null");
            return (Criteria) this;
        }

        public Criteria andXqczdhIsNotNull() {
            addCriterion("XQCZDH is not null");
            return (Criteria) this;
        }

        public Criteria andXqczdhEqualTo(String value) {
            addCriterion("XQCZDH =", value, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhNotEqualTo(String value) {
            addCriterion("XQCZDH <>", value, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhGreaterThan(String value) {
            addCriterion("XQCZDH >", value, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhGreaterThanOrEqualTo(String value) {
            addCriterion("XQCZDH >=", value, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhLessThan(String value) {
            addCriterion("XQCZDH <", value, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhLessThanOrEqualTo(String value) {
            addCriterion("XQCZDH <=", value, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhLike(String value) {
            addCriterion("XQCZDH like", value, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhNotLike(String value) {
            addCriterion("XQCZDH not like", value, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhIn(List<String> values) {
            addCriterion("XQCZDH in", values, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhNotIn(List<String> values) {
            addCriterion("XQCZDH not in", values, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhBetween(String value1, String value2) {
            addCriterion("XQCZDH between", value1, value2, "xqczdh");
            return (Criteria) this;
        }

        public Criteria andXqczdhNotBetween(String value1, String value2) {
            addCriterion("XQCZDH not between", value1, value2, "xqczdh");
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
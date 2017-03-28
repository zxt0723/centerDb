package com.haibei.pojo.zichan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SSLExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int rowsPerPage = -1;

    public SSLExample() {
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

        public Criteria andSslhIsNull() {
            addCriterion("SSLH is null");
            return (Criteria) this;
        }

        public Criteria andSslhIsNotNull() {
            addCriterion("SSLH is not null");
            return (Criteria) this;
        }

        public Criteria andSslhEqualTo(String value) {
            addCriterion("SSLH =", value, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhNotEqualTo(String value) {
            addCriterion("SSLH <>", value, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhGreaterThan(String value) {
            addCriterion("SSLH >", value, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhGreaterThanOrEqualTo(String value) {
            addCriterion("SSLH >=", value, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhLessThan(String value) {
            addCriterion("SSLH <", value, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhLessThanOrEqualTo(String value) {
            addCriterion("SSLH <=", value, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhLike(String value) {
            addCriterion("SSLH like", value, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhNotLike(String value) {
            addCriterion("SSLH not like", value, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhIn(List<String> values) {
            addCriterion("SSLH in", values, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhNotIn(List<String> values) {
            addCriterion("SSLH not in", values, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhBetween(String value1, String value2) {
            addCriterion("SSLH between", value1, value2, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslhNotBetween(String value1, String value2) {
            addCriterion("SSLH not between", value1, value2, "sslh");
            return (Criteria) this;
        }

        public Criteria andSslmcIsNull() {
            addCriterion("SSLMC is null");
            return (Criteria) this;
        }

        public Criteria andSslmcIsNotNull() {
            addCriterion("SSLMC is not null");
            return (Criteria) this;
        }

        public Criteria andSslmcEqualTo(String value) {
            addCriterion("SSLMC =", value, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcNotEqualTo(String value) {
            addCriterion("SSLMC <>", value, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcGreaterThan(String value) {
            addCriterion("SSLMC >", value, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcGreaterThanOrEqualTo(String value) {
            addCriterion("SSLMC >=", value, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcLessThan(String value) {
            addCriterion("SSLMC <", value, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcLessThanOrEqualTo(String value) {
            addCriterion("SSLMC <=", value, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcLike(String value) {
            addCriterion("SSLMC like", value, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcNotLike(String value) {
            addCriterion("SSLMC not like", value, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcIn(List<String> values) {
            addCriterion("SSLMC in", values, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcNotIn(List<String> values) {
            addCriterion("SSLMC not in", values, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcBetween(String value1, String value2) {
            addCriterion("SSLMC between", value1, value2, "sslmc");
            return (Criteria) this;
        }

        public Criteria andSslmcNotBetween(String value1, String value2) {
            addCriterion("SSLMC not between", value1, value2, "sslmc");
            return (Criteria) this;
        }

        public Criteria andGlyIsNull() {
            addCriterion("GLY is null");
            return (Criteria) this;
        }

        public Criteria andGlyIsNotNull() {
            addCriterion("GLY is not null");
            return (Criteria) this;
        }

        public Criteria andGlyEqualTo(String value) {
            addCriterion("GLY =", value, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyNotEqualTo(String value) {
            addCriterion("GLY <>", value, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyGreaterThan(String value) {
            addCriterion("GLY >", value, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyGreaterThanOrEqualTo(String value) {
            addCriterion("GLY >=", value, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyLessThan(String value) {
            addCriterion("GLY <", value, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyLessThanOrEqualTo(String value) {
            addCriterion("GLY <=", value, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyLike(String value) {
            addCriterion("GLY like", value, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyNotLike(String value) {
            addCriterion("GLY not like", value, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyIn(List<String> values) {
            addCriterion("GLY in", values, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyNotIn(List<String> values) {
            addCriterion("GLY not in", values, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyBetween(String value1, String value2) {
            addCriterion("GLY between", value1, value2, "gly");
            return (Criteria) this;
        }

        public Criteria andGlyNotBetween(String value1, String value2) {
            addCriterion("GLY not between", value1, value2, "gly");
            return (Criteria) this;
        }

        public Criteria andLgdhIsNull() {
            addCriterion("LGDH is null");
            return (Criteria) this;
        }

        public Criteria andLgdhIsNotNull() {
            addCriterion("LGDH is not null");
            return (Criteria) this;
        }

        public Criteria andLgdhEqualTo(String value) {
            addCriterion("LGDH =", value, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhNotEqualTo(String value) {
            addCriterion("LGDH <>", value, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhGreaterThan(String value) {
            addCriterion("LGDH >", value, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhGreaterThanOrEqualTo(String value) {
            addCriterion("LGDH >=", value, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhLessThan(String value) {
            addCriterion("LGDH <", value, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhLessThanOrEqualTo(String value) {
            addCriterion("LGDH <=", value, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhLike(String value) {
            addCriterion("LGDH like", value, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhNotLike(String value) {
            addCriterion("LGDH not like", value, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhIn(List<String> values) {
            addCriterion("LGDH in", values, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhNotIn(List<String> values) {
            addCriterion("LGDH not in", values, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhBetween(String value1, String value2) {
            addCriterion("LGDH between", value1, value2, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLgdhNotBetween(String value1, String value2) {
            addCriterion("LGDH not between", value1, value2, "lgdh");
            return (Criteria) this;
        }

        public Criteria andLcsIsNull() {
            addCriterion("LCS is null");
            return (Criteria) this;
        }

        public Criteria andLcsIsNotNull() {
            addCriterion("LCS is not null");
            return (Criteria) this;
        }

        public Criteria andLcsEqualTo(Short value) {
            addCriterion("LCS =", value, "lcs");
            return (Criteria) this;
        }

        public Criteria andLcsNotEqualTo(Short value) {
            addCriterion("LCS <>", value, "lcs");
            return (Criteria) this;
        }

        public Criteria andLcsGreaterThan(Short value) {
            addCriterion("LCS >", value, "lcs");
            return (Criteria) this;
        }

        public Criteria andLcsGreaterThanOrEqualTo(Short value) {
            addCriterion("LCS >=", value, "lcs");
            return (Criteria) this;
        }

        public Criteria andLcsLessThan(Short value) {
            addCriterion("LCS <", value, "lcs");
            return (Criteria) this;
        }

        public Criteria andLcsLessThanOrEqualTo(Short value) {
            addCriterion("LCS <=", value, "lcs");
            return (Criteria) this;
        }

        public Criteria andLcsIn(List<Short> values) {
            addCriterion("LCS in", values, "lcs");
            return (Criteria) this;
        }

        public Criteria andLcsNotIn(List<Short> values) {
            addCriterion("LCS not in", values, "lcs");
            return (Criteria) this;
        }

        public Criteria andLcsBetween(Short value1, Short value2) {
            addCriterion("LCS between", value1, value2, "lcs");
            return (Criteria) this;
        }

        public Criteria andLcsNotBetween(Short value1, Short value2) {
            addCriterion("LCS not between", value1, value2, "lcs");
            return (Criteria) this;
        }

        public Criteria andGldwIsNull() {
            addCriterion("GLDW is null");
            return (Criteria) this;
        }

        public Criteria andGldwIsNotNull() {
            addCriterion("GLDW is not null");
            return (Criteria) this;
        }

        public Criteria andGldwEqualTo(String value) {
            addCriterion("GLDW =", value, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwNotEqualTo(String value) {
            addCriterion("GLDW <>", value, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwGreaterThan(String value) {
            addCriterion("GLDW >", value, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwGreaterThanOrEqualTo(String value) {
            addCriterion("GLDW >=", value, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwLessThan(String value) {
            addCriterion("GLDW <", value, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwLessThanOrEqualTo(String value) {
            addCriterion("GLDW <=", value, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwLike(String value) {
            addCriterion("GLDW like", value, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwNotLike(String value) {
            addCriterion("GLDW not like", value, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwIn(List<String> values) {
            addCriterion("GLDW in", values, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwNotIn(List<String> values) {
            addCriterion("GLDW not in", values, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwBetween(String value1, String value2) {
            addCriterion("GLDW between", value1, value2, "gldw");
            return (Criteria) this;
        }

        public Criteria andGldwNotBetween(String value1, String value2) {
            addCriterion("GLDW not between", value1, value2, "gldw");
            return (Criteria) this;
        }

        public Criteria andSsllbIsNull() {
            addCriterion("SSLLB is null");
            return (Criteria) this;
        }

        public Criteria andSsllbIsNotNull() {
            addCriterion("SSLLB is not null");
            return (Criteria) this;
        }

        public Criteria andSsllbEqualTo(String value) {
            addCriterion("SSLLB =", value, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbNotEqualTo(String value) {
            addCriterion("SSLLB <>", value, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbGreaterThan(String value) {
            addCriterion("SSLLB >", value, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbGreaterThanOrEqualTo(String value) {
            addCriterion("SSLLB >=", value, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbLessThan(String value) {
            addCriterion("SSLLB <", value, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbLessThanOrEqualTo(String value) {
            addCriterion("SSLLB <=", value, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbLike(String value) {
            addCriterion("SSLLB like", value, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbNotLike(String value) {
            addCriterion("SSLLB not like", value, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbIn(List<String> values) {
            addCriterion("SSLLB in", values, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbNotIn(List<String> values) {
            addCriterion("SSLLB not in", values, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbBetween(String value1, String value2) {
            addCriterion("SSLLB between", value1, value2, "ssllb");
            return (Criteria) this;
        }

        public Criteria andSsllbNotBetween(String value1, String value2) {
            addCriterion("SSLLB not between", value1, value2, "ssllb");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("ZT is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("ZT is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("ZT =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("ZT <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("ZT >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("ZT >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("ZT <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("ZT <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("ZT like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("ZT not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("ZT in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("ZT not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("ZT between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("ZT not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andJzwbhIsNull() {
            addCriterion("JZWBH is null");
            return (Criteria) this;
        }

        public Criteria andJzwbhIsNotNull() {
            addCriterion("JZWBH is not null");
            return (Criteria) this;
        }

        public Criteria andJzwbhEqualTo(String value) {
            addCriterion("JZWBH =", value, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhNotEqualTo(String value) {
            addCriterion("JZWBH <>", value, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhGreaterThan(String value) {
            addCriterion("JZWBH >", value, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhGreaterThanOrEqualTo(String value) {
            addCriterion("JZWBH >=", value, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhLessThan(String value) {
            addCriterion("JZWBH <", value, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhLessThanOrEqualTo(String value) {
            addCriterion("JZWBH <=", value, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhLike(String value) {
            addCriterion("JZWBH like", value, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhNotLike(String value) {
            addCriterion("JZWBH not like", value, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhIn(List<String> values) {
            addCriterion("JZWBH in", values, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhNotIn(List<String> values) {
            addCriterion("JZWBH not in", values, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhBetween(String value1, String value2) {
            addCriterion("JZWBH between", value1, value2, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andJzwbhNotBetween(String value1, String value2) {
            addCriterion("JZWBH not between", value1, value2, "jzwbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhIsNull() {
            addCriterion("SSQBH is null");
            return (Criteria) this;
        }

        public Criteria andSsqbhIsNotNull() {
            addCriterion("SSQBH is not null");
            return (Criteria) this;
        }

        public Criteria andSsqbhEqualTo(String value) {
            addCriterion("SSQBH =", value, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhNotEqualTo(String value) {
            addCriterion("SSQBH <>", value, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhGreaterThan(String value) {
            addCriterion("SSQBH >", value, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhGreaterThanOrEqualTo(String value) {
            addCriterion("SSQBH >=", value, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhLessThan(String value) {
            addCriterion("SSQBH <", value, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhLessThanOrEqualTo(String value) {
            addCriterion("SSQBH <=", value, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhLike(String value) {
            addCriterion("SSQBH like", value, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhNotLike(String value) {
            addCriterion("SSQBH not like", value, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhIn(List<String> values) {
            addCriterion("SSQBH in", values, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhNotIn(List<String> values) {
            addCriterion("SSQBH not in", values, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhBetween(String value1, String value2) {
            addCriterion("SSQBH between", value1, value2, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andSsqbhNotBetween(String value1, String value2) {
            addCriterion("SSQBH not between", value1, value2, "ssqbh");
            return (Criteria) this;
        }

        public Criteria andDdIsNull() {
            addCriterion("DD is null");
            return (Criteria) this;
        }

        public Criteria andDdIsNotNull() {
            addCriterion("DD is not null");
            return (Criteria) this;
        }

        public Criteria andDdEqualTo(String value) {
            addCriterion("DD =", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdNotEqualTo(String value) {
            addCriterion("DD <>", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdGreaterThan(String value) {
            addCriterion("DD >", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdGreaterThanOrEqualTo(String value) {
            addCriterion("DD >=", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdLessThan(String value) {
            addCriterion("DD <", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdLessThanOrEqualTo(String value) {
            addCriterion("DD <=", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdLike(String value) {
            addCriterion("DD like", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdNotLike(String value) {
            addCriterion("DD not like", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdIn(List<String> values) {
            addCriterion("DD in", values, "dd");
            return (Criteria) this;
        }

        public Criteria andDdNotIn(List<String> values) {
            addCriterion("DD not in", values, "dd");
            return (Criteria) this;
        }

        public Criteria andDdBetween(String value1, String value2) {
            addCriterion("DD between", value1, value2, "dd");
            return (Criteria) this;
        }

        public Criteria andDdNotBetween(String value1, String value2) {
            addCriterion("DD not between", value1, value2, "dd");
            return (Criteria) this;
        }

        public Criteria andJbqkIsNull() {
            addCriterion("JBQK is null");
            return (Criteria) this;
        }

        public Criteria andJbqkIsNotNull() {
            addCriterion("JBQK is not null");
            return (Criteria) this;
        }

        public Criteria andJbqkEqualTo(String value) {
            addCriterion("JBQK =", value, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkNotEqualTo(String value) {
            addCriterion("JBQK <>", value, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkGreaterThan(String value) {
            addCriterion("JBQK >", value, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkGreaterThanOrEqualTo(String value) {
            addCriterion("JBQK >=", value, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkLessThan(String value) {
            addCriterion("JBQK <", value, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkLessThanOrEqualTo(String value) {
            addCriterion("JBQK <=", value, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkLike(String value) {
            addCriterion("JBQK like", value, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkNotLike(String value) {
            addCriterion("JBQK not like", value, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkIn(List<String> values) {
            addCriterion("JBQK in", values, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkNotIn(List<String> values) {
            addCriterion("JBQK not in", values, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkBetween(String value1, String value2) {
            addCriterion("JBQK between", value1, value2, "jbqk");
            return (Criteria) this;
        }

        public Criteria andJbqkNotBetween(String value1, String value2) {
            addCriterion("JBQK not between", value1, value2, "jbqk");
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
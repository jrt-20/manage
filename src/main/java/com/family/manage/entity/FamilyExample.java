package com.family.manage.entity;

import java.util.ArrayList;
import java.util.List;

public class FamilyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FamilyExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHoidIsNull() {
            addCriterion("hoid is null");
            return (Criteria) this;
        }

        public Criteria andHoidIsNotNull() {
            addCriterion("hoid is not null");
            return (Criteria) this;
        }

        public Criteria andHoidEqualTo(Integer value) {
            addCriterion("hoid =", value, "hoid");
            return (Criteria) this;
        }

        public Criteria andHoidNotEqualTo(Integer value) {
            addCriterion("hoid <>", value, "hoid");
            return (Criteria) this;
        }

        public Criteria andHoidGreaterThan(Integer value) {
            addCriterion("hoid >", value, "hoid");
            return (Criteria) this;
        }

        public Criteria andHoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hoid >=", value, "hoid");
            return (Criteria) this;
        }

        public Criteria andHoidLessThan(Integer value) {
            addCriterion("hoid <", value, "hoid");
            return (Criteria) this;
        }

        public Criteria andHoidLessThanOrEqualTo(Integer value) {
            addCriterion("hoid <=", value, "hoid");
            return (Criteria) this;
        }

        public Criteria andHoidIn(List<Integer> values) {
            addCriterion("hoid in", values, "hoid");
            return (Criteria) this;
        }

        public Criteria andHoidNotIn(List<Integer> values) {
            addCriterion("hoid not in", values, "hoid");
            return (Criteria) this;
        }

        public Criteria andHoidBetween(Integer value1, Integer value2) {
            addCriterion("hoid between", value1, value2, "hoid");
            return (Criteria) this;
        }

        public Criteria andHoidNotBetween(Integer value1, Integer value2) {
            addCriterion("hoid not between", value1, value2, "hoid");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFgenderIsNull() {
            addCriterion("fgender is null");
            return (Criteria) this;
        }

        public Criteria andFgenderIsNotNull() {
            addCriterion("fgender is not null");
            return (Criteria) this;
        }

        public Criteria andFgenderEqualTo(String value) {
            addCriterion("fgender =", value, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderNotEqualTo(String value) {
            addCriterion("fgender <>", value, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderGreaterThan(String value) {
            addCriterion("fgender >", value, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderGreaterThanOrEqualTo(String value) {
            addCriterion("fgender >=", value, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderLessThan(String value) {
            addCriterion("fgender <", value, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderLessThanOrEqualTo(String value) {
            addCriterion("fgender <=", value, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderLike(String value) {
            addCriterion("fgender like", value, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderNotLike(String value) {
            addCriterion("fgender not like", value, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderIn(List<String> values) {
            addCriterion("fgender in", values, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderNotIn(List<String> values) {
            addCriterion("fgender not in", values, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderBetween(String value1, String value2) {
            addCriterion("fgender between", value1, value2, "fgender");
            return (Criteria) this;
        }

        public Criteria andFgenderNotBetween(String value1, String value2) {
            addCriterion("fgender not between", value1, value2, "fgender");
            return (Criteria) this;
        }

        public Criteria andFidentityIsNull() {
            addCriterion("fidentity is null");
            return (Criteria) this;
        }

        public Criteria andFidentityIsNotNull() {
            addCriterion("fidentity is not null");
            return (Criteria) this;
        }

        public Criteria andFidentityEqualTo(String value) {
            addCriterion("fidentity =", value, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityNotEqualTo(String value) {
            addCriterion("fidentity <>", value, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityGreaterThan(String value) {
            addCriterion("fidentity >", value, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityGreaterThanOrEqualTo(String value) {
            addCriterion("fidentity >=", value, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityLessThan(String value) {
            addCriterion("fidentity <", value, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityLessThanOrEqualTo(String value) {
            addCriterion("fidentity <=", value, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityLike(String value) {
            addCriterion("fidentity like", value, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityNotLike(String value) {
            addCriterion("fidentity not like", value, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityIn(List<String> values) {
            addCriterion("fidentity in", values, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityNotIn(List<String> values) {
            addCriterion("fidentity not in", values, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityBetween(String value1, String value2) {
            addCriterion("fidentity between", value1, value2, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFidentityNotBetween(String value1, String value2) {
            addCriterion("fidentity not between", value1, value2, "fidentity");
            return (Criteria) this;
        }

        public Criteria andFmobileIsNull() {
            addCriterion("fmobile is null");
            return (Criteria) this;
        }

        public Criteria andFmobileIsNotNull() {
            addCriterion("fmobile is not null");
            return (Criteria) this;
        }

        public Criteria andFmobileEqualTo(String value) {
            addCriterion("fmobile =", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileNotEqualTo(String value) {
            addCriterion("fmobile <>", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileGreaterThan(String value) {
            addCriterion("fmobile >", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileGreaterThanOrEqualTo(String value) {
            addCriterion("fmobile >=", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileLessThan(String value) {
            addCriterion("fmobile <", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileLessThanOrEqualTo(String value) {
            addCriterion("fmobile <=", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileLike(String value) {
            addCriterion("fmobile like", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileNotLike(String value) {
            addCriterion("fmobile not like", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileIn(List<String> values) {
            addCriterion("fmobile in", values, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileNotIn(List<String> values) {
            addCriterion("fmobile not in", values, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileBetween(String value1, String value2) {
            addCriterion("fmobile between", value1, value2, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileNotBetween(String value1, String value2) {
            addCriterion("fmobile not between", value1, value2, "fmobile");
            return (Criteria) this;
        }

        public Criteria andRelIsNull() {
            addCriterion("rel is null");
            return (Criteria) this;
        }

        public Criteria andRelIsNotNull() {
            addCriterion("rel is not null");
            return (Criteria) this;
        }

        public Criteria andRelEqualTo(String value) {
            addCriterion("rel =", value, "rel");
            return (Criteria) this;
        }

        public Criteria andRelNotEqualTo(String value) {
            addCriterion("rel <>", value, "rel");
            return (Criteria) this;
        }

        public Criteria andRelGreaterThan(String value) {
            addCriterion("rel >", value, "rel");
            return (Criteria) this;
        }

        public Criteria andRelGreaterThanOrEqualTo(String value) {
            addCriterion("rel >=", value, "rel");
            return (Criteria) this;
        }

        public Criteria andRelLessThan(String value) {
            addCriterion("rel <", value, "rel");
            return (Criteria) this;
        }

        public Criteria andRelLessThanOrEqualTo(String value) {
            addCriterion("rel <=", value, "rel");
            return (Criteria) this;
        }

        public Criteria andRelLike(String value) {
            addCriterion("rel like", value, "rel");
            return (Criteria) this;
        }

        public Criteria andRelNotLike(String value) {
            addCriterion("rel not like", value, "rel");
            return (Criteria) this;
        }

        public Criteria andRelIn(List<String> values) {
            addCriterion("rel in", values, "rel");
            return (Criteria) this;
        }

        public Criteria andRelNotIn(List<String> values) {
            addCriterion("rel not in", values, "rel");
            return (Criteria) this;
        }

        public Criteria andRelBetween(String value1, String value2) {
            addCriterion("rel between", value1, value2, "rel");
            return (Criteria) this;
        }

        public Criteria andRelNotBetween(String value1, String value2) {
            addCriterion("rel not between", value1, value2, "rel");
            return (Criteria) this;
        }

        public Criteria andWorkIsNull() {
            addCriterion("`work` is null");
            return (Criteria) this;
        }

        public Criteria andWorkIsNotNull() {
            addCriterion("`work` is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEqualTo(String value) {
            addCriterion("`work` =", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotEqualTo(String value) {
            addCriterion("`work` <>", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThan(String value) {
            addCriterion("`work` >", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThanOrEqualTo(String value) {
            addCriterion("`work` >=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThan(String value) {
            addCriterion("`work` <", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThanOrEqualTo(String value) {
            addCriterion("`work` <=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLike(String value) {
            addCriterion("`work` like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotLike(String value) {
            addCriterion("`work` not like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkIn(List<String> values) {
            addCriterion("`work` in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotIn(List<String> values) {
            addCriterion("`work` not in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkBetween(String value1, String value2) {
            addCriterion("`work` between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotBetween(String value1, String value2) {
            addCriterion("`work` not between", value1, value2, "work");
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
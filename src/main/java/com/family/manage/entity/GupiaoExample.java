package com.family.manage.entity;

import java.util.ArrayList;
import java.util.List;

public class GupiaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GupiaoExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("`uid` is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("`uid` is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("`uid` =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("`uid` <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("`uid` >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`uid` >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("`uid` <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("`uid` <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("`uid` in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("`uid` not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("`uid` between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("`uid` not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNull() {
            addCriterion("gtype is null");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNotNull() {
            addCriterion("gtype is not null");
            return (Criteria) this;
        }

        public Criteria andGtypeEqualTo(String value) {
            addCriterion("gtype =", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotEqualTo(String value) {
            addCriterion("gtype <>", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThan(String value) {
            addCriterion("gtype >", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThanOrEqualTo(String value) {
            addCriterion("gtype >=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThan(String value) {
            addCriterion("gtype <", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThanOrEqualTo(String value) {
            addCriterion("gtype <=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLike(String value) {
            addCriterion("gtype like", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotLike(String value) {
            addCriterion("gtype not like", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeIn(List<String> values) {
            addCriterion("gtype in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotIn(List<String> values) {
            addCriterion("gtype not in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeBetween(String value1, String value2) {
            addCriterion("gtype between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotBetween(String value1, String value2) {
            addCriterion("gtype not between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andGvalueIsNull() {
            addCriterion("gvalue is null");
            return (Criteria) this;
        }

        public Criteria andGvalueIsNotNull() {
            addCriterion("gvalue is not null");
            return (Criteria) this;
        }

        public Criteria andGvalueEqualTo(Double value) {
            addCriterion("gvalue =", value, "gvalue");
            return (Criteria) this;
        }

        public Criteria andGvalueNotEqualTo(Double value) {
            addCriterion("gvalue <>", value, "gvalue");
            return (Criteria) this;
        }

        public Criteria andGvalueGreaterThan(Double value) {
            addCriterion("gvalue >", value, "gvalue");
            return (Criteria) this;
        }

        public Criteria andGvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("gvalue >=", value, "gvalue");
            return (Criteria) this;
        }

        public Criteria andGvalueLessThan(Double value) {
            addCriterion("gvalue <", value, "gvalue");
            return (Criteria) this;
        }

        public Criteria andGvalueLessThanOrEqualTo(Double value) {
            addCriterion("gvalue <=", value, "gvalue");
            return (Criteria) this;
        }

        public Criteria andGvalueIn(List<Double> values) {
            addCriterion("gvalue in", values, "gvalue");
            return (Criteria) this;
        }

        public Criteria andGvalueNotIn(List<Double> values) {
            addCriterion("gvalue not in", values, "gvalue");
            return (Criteria) this;
        }

        public Criteria andGvalueBetween(Double value1, Double value2) {
            addCriterion("gvalue between", value1, value2, "gvalue");
            return (Criteria) this;
        }

        public Criteria andGvalueNotBetween(Double value1, Double value2) {
            addCriterion("gvalue not between", value1, value2, "gvalue");
            return (Criteria) this;
        }

        public Criteria andGupIsNull() {
            addCriterion("gup is null");
            return (Criteria) this;
        }

        public Criteria andGupIsNotNull() {
            addCriterion("gup is not null");
            return (Criteria) this;
        }

        public Criteria andGupEqualTo(Double value) {
            addCriterion("gup =", value, "gup");
            return (Criteria) this;
        }

        public Criteria andGupNotEqualTo(Double value) {
            addCriterion("gup <>", value, "gup");
            return (Criteria) this;
        }

        public Criteria andGupGreaterThan(Double value) {
            addCriterion("gup >", value, "gup");
            return (Criteria) this;
        }

        public Criteria andGupGreaterThanOrEqualTo(Double value) {
            addCriterion("gup >=", value, "gup");
            return (Criteria) this;
        }

        public Criteria andGupLessThan(Double value) {
            addCriterion("gup <", value, "gup");
            return (Criteria) this;
        }

        public Criteria andGupLessThanOrEqualTo(Double value) {
            addCriterion("gup <=", value, "gup");
            return (Criteria) this;
        }

        public Criteria andGupIn(List<Double> values) {
            addCriterion("gup in", values, "gup");
            return (Criteria) this;
        }

        public Criteria andGupNotIn(List<Double> values) {
            addCriterion("gup not in", values, "gup");
            return (Criteria) this;
        }

        public Criteria andGupBetween(Double value1, Double value2) {
            addCriterion("gup between", value1, value2, "gup");
            return (Criteria) this;
        }

        public Criteria andGupNotBetween(Double value1, Double value2) {
            addCriterion("gup not between", value1, value2, "gup");
            return (Criteria) this;
        }

        public Criteria andGupyearIsNull() {
            addCriterion("gupyear is null");
            return (Criteria) this;
        }

        public Criteria andGupyearIsNotNull() {
            addCriterion("gupyear is not null");
            return (Criteria) this;
        }

        public Criteria andGupyearEqualTo(Double value) {
            addCriterion("gupyear =", value, "gupyear");
            return (Criteria) this;
        }

        public Criteria andGupyearNotEqualTo(Double value) {
            addCriterion("gupyear <>", value, "gupyear");
            return (Criteria) this;
        }

        public Criteria andGupyearGreaterThan(Double value) {
            addCriterion("gupyear >", value, "gupyear");
            return (Criteria) this;
        }

        public Criteria andGupyearGreaterThanOrEqualTo(Double value) {
            addCriterion("gupyear >=", value, "gupyear");
            return (Criteria) this;
        }

        public Criteria andGupyearLessThan(Double value) {
            addCriterion("gupyear <", value, "gupyear");
            return (Criteria) this;
        }

        public Criteria andGupyearLessThanOrEqualTo(Double value) {
            addCriterion("gupyear <=", value, "gupyear");
            return (Criteria) this;
        }

        public Criteria andGupyearIn(List<Double> values) {
            addCriterion("gupyear in", values, "gupyear");
            return (Criteria) this;
        }

        public Criteria andGupyearNotIn(List<Double> values) {
            addCriterion("gupyear not in", values, "gupyear");
            return (Criteria) this;
        }

        public Criteria andGupyearBetween(Double value1, Double value2) {
            addCriterion("gupyear between", value1, value2, "gupyear");
            return (Criteria) this;
        }

        public Criteria andGupyearNotBetween(Double value1, Double value2) {
            addCriterion("gupyear not between", value1, value2, "gupyear");
            return (Criteria) this;
        }

        public Criteria andPvalueIsNull() {
            addCriterion("pvalue is null");
            return (Criteria) this;
        }

        public Criteria andPvalueIsNotNull() {
            addCriterion("pvalue is not null");
            return (Criteria) this;
        }

        public Criteria andPvalueEqualTo(Double value) {
            addCriterion("pvalue =", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueNotEqualTo(Double value) {
            addCriterion("pvalue <>", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueGreaterThan(Double value) {
            addCriterion("pvalue >", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("pvalue >=", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueLessThan(Double value) {
            addCriterion("pvalue <", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueLessThanOrEqualTo(Double value) {
            addCriterion("pvalue <=", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueIn(List<Double> values) {
            addCriterion("pvalue in", values, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueNotIn(List<Double> values) {
            addCriterion("pvalue not in", values, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueBetween(Double value1, Double value2) {
            addCriterion("pvalue between", value1, value2, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueNotBetween(Double value1, Double value2) {
            addCriterion("pvalue not between", value1, value2, "pvalue");
            return (Criteria) this;
        }

        public Criteria andRiskIsNull() {
            addCriterion("risk is null");
            return (Criteria) this;
        }

        public Criteria andRiskIsNotNull() {
            addCriterion("risk is not null");
            return (Criteria) this;
        }

        public Criteria andRiskEqualTo(String value) {
            addCriterion("risk =", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotEqualTo(String value) {
            addCriterion("risk <>", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThan(String value) {
            addCriterion("risk >", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThanOrEqualTo(String value) {
            addCriterion("risk >=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThan(String value) {
            addCriterion("risk <", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThanOrEqualTo(String value) {
            addCriterion("risk <=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLike(String value) {
            addCriterion("risk like", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotLike(String value) {
            addCriterion("risk not like", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskIn(List<String> values) {
            addCriterion("risk in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotIn(List<String> values) {
            addCriterion("risk not in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskBetween(String value1, String value2) {
            addCriterion("risk between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotBetween(String value1, String value2) {
            addCriterion("risk not between", value1, value2, "risk");
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
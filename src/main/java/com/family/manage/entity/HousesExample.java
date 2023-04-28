package com.family.manage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HousesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HousesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andHtypeIsNull() {
            addCriterion("htype is null");
            return (Criteria) this;
        }

        public Criteria andHtypeIsNotNull() {
            addCriterion("htype is not null");
            return (Criteria) this;
        }

        public Criteria andHtypeEqualTo(String value) {
            addCriterion("htype =", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeNotEqualTo(String value) {
            addCriterion("htype <>", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeGreaterThan(String value) {
            addCriterion("htype >", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeGreaterThanOrEqualTo(String value) {
            addCriterion("htype >=", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeLessThan(String value) {
            addCriterion("htype <", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeLessThanOrEqualTo(String value) {
            addCriterion("htype <=", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeLike(String value) {
            addCriterion("htype like", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeNotLike(String value) {
            addCriterion("htype not like", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeIn(List<String> values) {
            addCriterion("htype in", values, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeNotIn(List<String> values) {
            addCriterion("htype not in", values, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeBetween(String value1, String value2) {
            addCriterion("htype between", value1, value2, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeNotBetween(String value1, String value2) {
            addCriterion("htype not between", value1, value2, "htype");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andXiaoquIsNull() {
            addCriterion("xiaoqu is null");
            return (Criteria) this;
        }

        public Criteria andXiaoquIsNotNull() {
            addCriterion("xiaoqu is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoquEqualTo(String value) {
            addCriterion("xiaoqu =", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquNotEqualTo(String value) {
            addCriterion("xiaoqu <>", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquGreaterThan(String value) {
            addCriterion("xiaoqu >", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquGreaterThanOrEqualTo(String value) {
            addCriterion("xiaoqu >=", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquLessThan(String value) {
            addCriterion("xiaoqu <", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquLessThanOrEqualTo(String value) {
            addCriterion("xiaoqu <=", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquLike(String value) {
            addCriterion("xiaoqu like", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquNotLike(String value) {
            addCriterion("xiaoqu not like", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquIn(List<String> values) {
            addCriterion("xiaoqu in", values, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquNotIn(List<String> values) {
            addCriterion("xiaoqu not in", values, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquBetween(String value1, String value2) {
            addCriterion("xiaoqu between", value1, value2, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquNotBetween(String value1, String value2) {
            addCriterion("xiaoqu not between", value1, value2, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andHlouIsNull() {
            addCriterion("hlou is null");
            return (Criteria) this;
        }

        public Criteria andHlouIsNotNull() {
            addCriterion("hlou is not null");
            return (Criteria) this;
        }

        public Criteria andHlouEqualTo(String value) {
            addCriterion("hlou =", value, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouNotEqualTo(String value) {
            addCriterion("hlou <>", value, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouGreaterThan(String value) {
            addCriterion("hlou >", value, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouGreaterThanOrEqualTo(String value) {
            addCriterion("hlou >=", value, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouLessThan(String value) {
            addCriterion("hlou <", value, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouLessThanOrEqualTo(String value) {
            addCriterion("hlou <=", value, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouLike(String value) {
            addCriterion("hlou like", value, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouNotLike(String value) {
            addCriterion("hlou not like", value, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouIn(List<String> values) {
            addCriterion("hlou in", values, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouNotIn(List<String> values) {
            addCriterion("hlou not in", values, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouBetween(String value1, String value2) {
            addCriterion("hlou between", value1, value2, "hlou");
            return (Criteria) this;
        }

        public Criteria andHlouNotBetween(String value1, String value2) {
            addCriterion("hlou not between", value1, value2, "hlou");
            return (Criteria) this;
        }

        public Criteria andHfloorIsNull() {
            addCriterion("hfloor is null");
            return (Criteria) this;
        }

        public Criteria andHfloorIsNotNull() {
            addCriterion("hfloor is not null");
            return (Criteria) this;
        }

        public Criteria andHfloorEqualTo(String value) {
            addCriterion("hfloor =", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorNotEqualTo(String value) {
            addCriterion("hfloor <>", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorGreaterThan(String value) {
            addCriterion("hfloor >", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorGreaterThanOrEqualTo(String value) {
            addCriterion("hfloor >=", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorLessThan(String value) {
            addCriterion("hfloor <", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorLessThanOrEqualTo(String value) {
            addCriterion("hfloor <=", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorLike(String value) {
            addCriterion("hfloor like", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorNotLike(String value) {
            addCriterion("hfloor not like", value, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorIn(List<String> values) {
            addCriterion("hfloor in", values, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorNotIn(List<String> values) {
            addCriterion("hfloor not in", values, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorBetween(String value1, String value2) {
            addCriterion("hfloor between", value1, value2, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHfloorNotBetween(String value1, String value2) {
            addCriterion("hfloor not between", value1, value2, "hfloor");
            return (Criteria) this;
        }

        public Criteria andHsizeIsNull() {
            addCriterion("hsize is null");
            return (Criteria) this;
        }

        public Criteria andHsizeIsNotNull() {
            addCriterion("hsize is not null");
            return (Criteria) this;
        }

        public Criteria andHsizeEqualTo(Double value) {
            addCriterion("hsize =", value, "hsize");
            return (Criteria) this;
        }

        public Criteria andHsizeNotEqualTo(Double value) {
            addCriterion("hsize <>", value, "hsize");
            return (Criteria) this;
        }

        public Criteria andHsizeGreaterThan(Double value) {
            addCriterion("hsize >", value, "hsize");
            return (Criteria) this;
        }

        public Criteria andHsizeGreaterThanOrEqualTo(Double value) {
            addCriterion("hsize >=", value, "hsize");
            return (Criteria) this;
        }

        public Criteria andHsizeLessThan(Double value) {
            addCriterion("hsize <", value, "hsize");
            return (Criteria) this;
        }

        public Criteria andHsizeLessThanOrEqualTo(Double value) {
            addCriterion("hsize <=", value, "hsize");
            return (Criteria) this;
        }

        public Criteria andHsizeIn(List<Double> values) {
            addCriterion("hsize in", values, "hsize");
            return (Criteria) this;
        }

        public Criteria andHsizeNotIn(List<Double> values) {
            addCriterion("hsize not in", values, "hsize");
            return (Criteria) this;
        }

        public Criteria andHsizeBetween(Double value1, Double value2) {
            addCriterion("hsize between", value1, value2, "hsize");
            return (Criteria) this;
        }

        public Criteria andHsizeNotBetween(Double value1, Double value2) {
            addCriterion("hsize not between", value1, value2, "hsize");
            return (Criteria) this;
        }

        public Criteria andPublicsizeIsNull() {
            addCriterion("publicsize is null");
            return (Criteria) this;
        }

        public Criteria andPublicsizeIsNotNull() {
            addCriterion("publicsize is not null");
            return (Criteria) this;
        }

        public Criteria andPublicsizeEqualTo(Double value) {
            addCriterion("publicsize =", value, "publicsize");
            return (Criteria) this;
        }

        public Criteria andPublicsizeNotEqualTo(Double value) {
            addCriterion("publicsize <>", value, "publicsize");
            return (Criteria) this;
        }

        public Criteria andPublicsizeGreaterThan(Double value) {
            addCriterion("publicsize >", value, "publicsize");
            return (Criteria) this;
        }

        public Criteria andPublicsizeGreaterThanOrEqualTo(Double value) {
            addCriterion("publicsize >=", value, "publicsize");
            return (Criteria) this;
        }

        public Criteria andPublicsizeLessThan(Double value) {
            addCriterion("publicsize <", value, "publicsize");
            return (Criteria) this;
        }

        public Criteria andPublicsizeLessThanOrEqualTo(Double value) {
            addCriterion("publicsize <=", value, "publicsize");
            return (Criteria) this;
        }

        public Criteria andPublicsizeIn(List<Double> values) {
            addCriterion("publicsize in", values, "publicsize");
            return (Criteria) this;
        }

        public Criteria andPublicsizeNotIn(List<Double> values) {
            addCriterion("publicsize not in", values, "publicsize");
            return (Criteria) this;
        }

        public Criteria andPublicsizeBetween(Double value1, Double value2) {
            addCriterion("publicsize between", value1, value2, "publicsize");
            return (Criteria) this;
        }

        public Criteria andPublicsizeNotBetween(Double value1, Double value2) {
            addCriterion("publicsize not between", value1, value2, "publicsize");
            return (Criteria) this;
        }

        public Criteria andHetongIsNull() {
            addCriterion("hetong is null");
            return (Criteria) this;
        }

        public Criteria andHetongIsNotNull() {
            addCriterion("hetong is not null");
            return (Criteria) this;
        }

        public Criteria andHetongEqualTo(String value) {
            addCriterion("hetong =", value, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongNotEqualTo(String value) {
            addCriterion("hetong <>", value, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongGreaterThan(String value) {
            addCriterion("hetong >", value, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongGreaterThanOrEqualTo(String value) {
            addCriterion("hetong >=", value, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongLessThan(String value) {
            addCriterion("hetong <", value, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongLessThanOrEqualTo(String value) {
            addCriterion("hetong <=", value, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongLike(String value) {
            addCriterion("hetong like", value, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongNotLike(String value) {
            addCriterion("hetong not like", value, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongIn(List<String> values) {
            addCriterion("hetong in", values, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongNotIn(List<String> values) {
            addCriterion("hetong not in", values, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongBetween(String value1, String value2) {
            addCriterion("hetong between", value1, value2, "hetong");
            return (Criteria) this;
        }

        public Criteria andHetongNotBetween(String value1, String value2) {
            addCriterion("hetong not between", value1, value2, "hetong");
            return (Criteria) this;
        }

        public Criteria andZhengmingIsNull() {
            addCriterion("zhengming is null");
            return (Criteria) this;
        }

        public Criteria andZhengmingIsNotNull() {
            addCriterion("zhengming is not null");
            return (Criteria) this;
        }

        public Criteria andZhengmingEqualTo(String value) {
            addCriterion("zhengming =", value, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingNotEqualTo(String value) {
            addCriterion("zhengming <>", value, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingGreaterThan(String value) {
            addCriterion("zhengming >", value, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingGreaterThanOrEqualTo(String value) {
            addCriterion("zhengming >=", value, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingLessThan(String value) {
            addCriterion("zhengming <", value, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingLessThanOrEqualTo(String value) {
            addCriterion("zhengming <=", value, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingLike(String value) {
            addCriterion("zhengming like", value, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingNotLike(String value) {
            addCriterion("zhengming not like", value, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingIn(List<String> values) {
            addCriterion("zhengming in", values, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingNotIn(List<String> values) {
            addCriterion("zhengming not in", values, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingBetween(String value1, String value2) {
            addCriterion("zhengming between", value1, value2, "zhengming");
            return (Criteria) this;
        }

        public Criteria andZhengmingNotBetween(String value1, String value2) {
            addCriterion("zhengming not between", value1, value2, "zhengming");
            return (Criteria) this;
        }

        public Criteria andBugtimeIsNull() {
            addCriterion("bugtime is null");
            return (Criteria) this;
        }

        public Criteria andBugtimeIsNotNull() {
            addCriterion("bugtime is not null");
            return (Criteria) this;
        }

        public Criteria andBugtimeEqualTo(Date value) {
            addCriterionForJDBCDate("bugtime =", value, "bugtime");
            return (Criteria) this;
        }

        public Criteria andBugtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("bugtime <>", value, "bugtime");
            return (Criteria) this;
        }

        public Criteria andBugtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("bugtime >", value, "bugtime");
            return (Criteria) this;
        }

        public Criteria andBugtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bugtime >=", value, "bugtime");
            return (Criteria) this;
        }

        public Criteria andBugtimeLessThan(Date value) {
            addCriterionForJDBCDate("bugtime <", value, "bugtime");
            return (Criteria) this;
        }

        public Criteria andBugtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bugtime <=", value, "bugtime");
            return (Criteria) this;
        }

        public Criteria andBugtimeIn(List<Date> values) {
            addCriterionForJDBCDate("bugtime in", values, "bugtime");
            return (Criteria) this;
        }

        public Criteria andBugtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("bugtime not in", values, "bugtime");
            return (Criteria) this;
        }

        public Criteria andBugtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bugtime between", value1, value2, "bugtime");
            return (Criteria) this;
        }

        public Criteria andBugtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bugtime not between", value1, value2, "bugtime");
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
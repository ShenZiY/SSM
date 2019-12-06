package cn.nankai.tjxf1.entity;

import java.util.ArrayList;
import java.util.List;

public class EnvInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnvInfoExample() {
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

        public Criteria andAccIdIsNull() {
            addCriterion("Acc_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccIdIsNotNull() {
            addCriterion("Acc_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccIdEqualTo(Integer value) {
            addCriterion("Acc_ID =", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotEqualTo(Integer value) {
            addCriterion("Acc_ID <>", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdGreaterThan(Integer value) {
            addCriterion("Acc_ID >", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Acc_ID >=", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLessThan(Integer value) {
            addCriterion("Acc_ID <", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLessThanOrEqualTo(Integer value) {
            addCriterion("Acc_ID <=", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdIn(List<Integer> values) {
            addCriterion("Acc_ID in", values, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotIn(List<Integer> values) {
            addCriterion("Acc_ID not in", values, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdBetween(Integer value1, Integer value2) {
            addCriterion("Acc_ID between", value1, value2, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Acc_ID not between", value1, value2, "accId");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("Location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("Location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("Location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("Location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("Location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("Location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("Location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("Location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("Location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("Location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("Location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("Location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("Location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtIsNull() {
            addCriterion("RoadInfo_CT is null");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtIsNotNull() {
            addCriterion("RoadInfo_CT is not null");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtEqualTo(String value) {
            addCriterion("RoadInfo_CT =", value, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtNotEqualTo(String value) {
            addCriterion("RoadInfo_CT <>", value, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtGreaterThan(String value) {
            addCriterion("RoadInfo_CT >", value, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtGreaterThanOrEqualTo(String value) {
            addCriterion("RoadInfo_CT >=", value, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtLessThan(String value) {
            addCriterion("RoadInfo_CT <", value, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtLessThanOrEqualTo(String value) {
            addCriterion("RoadInfo_CT <=", value, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtLike(String value) {
            addCriterion("RoadInfo_CT like", value, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtNotLike(String value) {
            addCriterion("RoadInfo_CT not like", value, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtIn(List<String> values) {
            addCriterion("RoadInfo_CT in", values, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtNotIn(List<String> values) {
            addCriterion("RoadInfo_CT not in", values, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtBetween(String value1, String value2) {
            addCriterion("RoadInfo_CT between", value1, value2, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCtNotBetween(String value1, String value2) {
            addCriterion("RoadInfo_CT not between", value1, value2, "roadinfoCt");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdIsNull() {
            addCriterion("RoadInfo_PD is null");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdIsNotNull() {
            addCriterion("RoadInfo_PD is not null");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdEqualTo(Integer value) {
            addCriterion("RoadInfo_PD =", value, "roadinfoPd");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdNotEqualTo(Integer value) {
            addCriterion("RoadInfo_PD <>", value, "roadinfoPd");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdGreaterThan(Integer value) {
            addCriterion("RoadInfo_PD >", value, "roadinfoPd");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RoadInfo_PD >=", value, "roadinfoPd");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdLessThan(Integer value) {
            addCriterion("RoadInfo_PD <", value, "roadinfoPd");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdLessThanOrEqualTo(Integer value) {
            addCriterion("RoadInfo_PD <=", value, "roadinfoPd");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdIn(List<Integer> values) {
            addCriterion("RoadInfo_PD in", values, "roadinfoPd");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdNotIn(List<Integer> values) {
            addCriterion("RoadInfo_PD not in", values, "roadinfoPd");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdBetween(Integer value1, Integer value2) {
            addCriterion("RoadInfo_PD between", value1, value2, "roadinfoPd");
            return (Criteria) this;
        }

        public Criteria andRoadinfoPdNotBetween(Integer value1, Integer value2) {
            addCriterion("RoadInfo_PD not between", value1, value2, "roadinfoPd");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzIsNull() {
            addCriterion("RoadInfo_CZ is null");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzIsNotNull() {
            addCriterion("RoadInfo_CZ is not null");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzEqualTo(String value) {
            addCriterion("RoadInfo_CZ =", value, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzNotEqualTo(String value) {
            addCriterion("RoadInfo_CZ <>", value, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzGreaterThan(String value) {
            addCriterion("RoadInfo_CZ >", value, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzGreaterThanOrEqualTo(String value) {
            addCriterion("RoadInfo_CZ >=", value, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzLessThan(String value) {
            addCriterion("RoadInfo_CZ <", value, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzLessThanOrEqualTo(String value) {
            addCriterion("RoadInfo_CZ <=", value, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzLike(String value) {
            addCriterion("RoadInfo_CZ like", value, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzNotLike(String value) {
            addCriterion("RoadInfo_CZ not like", value, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzIn(List<String> values) {
            addCriterion("RoadInfo_CZ in", values, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzNotIn(List<String> values) {
            addCriterion("RoadInfo_CZ not in", values, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzBetween(String value1, String value2) {
            addCriterion("RoadInfo_CZ between", value1, value2, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoCzNotBetween(String value1, String value2) {
            addCriterion("RoadInfo_CZ not between", value1, value2, "roadinfoCz");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkIsNull() {
            addCriterion("RoadInfo_ZK is null");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkIsNotNull() {
            addCriterion("RoadInfo_ZK is not null");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkEqualTo(String value) {
            addCriterion("RoadInfo_ZK =", value, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkNotEqualTo(String value) {
            addCriterion("RoadInfo_ZK <>", value, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkGreaterThan(String value) {
            addCriterion("RoadInfo_ZK >", value, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkGreaterThanOrEqualTo(String value) {
            addCriterion("RoadInfo_ZK >=", value, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkLessThan(String value) {
            addCriterion("RoadInfo_ZK <", value, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkLessThanOrEqualTo(String value) {
            addCriterion("RoadInfo_ZK <=", value, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkLike(String value) {
            addCriterion("RoadInfo_ZK like", value, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkNotLike(String value) {
            addCriterion("RoadInfo_ZK not like", value, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkIn(List<String> values) {
            addCriterion("RoadInfo_ZK in", values, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkNotIn(List<String> values) {
            addCriterion("RoadInfo_ZK not in", values, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkBetween(String value1, String value2) {
            addCriterion("RoadInfo_ZK between", value1, value2, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoZkNotBetween(String value1, String value2) {
            addCriterion("RoadInfo_ZK not between", value1, value2, "roadinfoZk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkIsNull() {
            addCriterion("RoadInfo_JK is null");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkIsNotNull() {
            addCriterion("RoadInfo_JK is not null");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkEqualTo(String value) {
            addCriterion("RoadInfo_JK =", value, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkNotEqualTo(String value) {
            addCriterion("RoadInfo_JK <>", value, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkGreaterThan(String value) {
            addCriterion("RoadInfo_JK >", value, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkGreaterThanOrEqualTo(String value) {
            addCriterion("RoadInfo_JK >=", value, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkLessThan(String value) {
            addCriterion("RoadInfo_JK <", value, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkLessThanOrEqualTo(String value) {
            addCriterion("RoadInfo_JK <=", value, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkLike(String value) {
            addCriterion("RoadInfo_JK like", value, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkNotLike(String value) {
            addCriterion("RoadInfo_JK not like", value, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkIn(List<String> values) {
            addCriterion("RoadInfo_JK in", values, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkNotIn(List<String> values) {
            addCriterion("RoadInfo_JK not in", values, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkBetween(String value1, String value2) {
            addCriterion("RoadInfo_JK between", value1, value2, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andRoadinfoJkNotBetween(String value1, String value2) {
            addCriterion("RoadInfo_JK not between", value1, value2, "roadinfoJk");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqIsNull() {
            addCriterion("WeaInfo_TQ is null");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqIsNotNull() {
            addCriterion("WeaInfo_TQ is not null");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqEqualTo(String value) {
            addCriterion("WeaInfo_TQ =", value, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqNotEqualTo(String value) {
            addCriterion("WeaInfo_TQ <>", value, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqGreaterThan(String value) {
            addCriterion("WeaInfo_TQ >", value, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqGreaterThanOrEqualTo(String value) {
            addCriterion("WeaInfo_TQ >=", value, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqLessThan(String value) {
            addCriterion("WeaInfo_TQ <", value, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqLessThanOrEqualTo(String value) {
            addCriterion("WeaInfo_TQ <=", value, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqLike(String value) {
            addCriterion("WeaInfo_TQ like", value, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqNotLike(String value) {
            addCriterion("WeaInfo_TQ not like", value, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqIn(List<String> values) {
            addCriterion("WeaInfo_TQ in", values, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqNotIn(List<String> values) {
            addCriterion("WeaInfo_TQ not in", values, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqBetween(String value1, String value2) {
            addCriterion("WeaInfo_TQ between", value1, value2, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoTqNotBetween(String value1, String value2) {
            addCriterion("WeaInfo_TQ not between", value1, value2, "weainfoTq");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxIsNull() {
            addCriterion("WeaInfo_FX is null");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxIsNotNull() {
            addCriterion("WeaInfo_FX is not null");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxEqualTo(String value) {
            addCriterion("WeaInfo_FX =", value, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxNotEqualTo(String value) {
            addCriterion("WeaInfo_FX <>", value, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxGreaterThan(String value) {
            addCriterion("WeaInfo_FX >", value, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxGreaterThanOrEqualTo(String value) {
            addCriterion("WeaInfo_FX >=", value, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxLessThan(String value) {
            addCriterion("WeaInfo_FX <", value, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxLessThanOrEqualTo(String value) {
            addCriterion("WeaInfo_FX <=", value, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxLike(String value) {
            addCriterion("WeaInfo_FX like", value, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxNotLike(String value) {
            addCriterion("WeaInfo_FX not like", value, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxIn(List<String> values) {
            addCriterion("WeaInfo_FX in", values, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxNotIn(List<String> values) {
            addCriterion("WeaInfo_FX not in", values, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxBetween(String value1, String value2) {
            addCriterion("WeaInfo_FX between", value1, value2, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFxNotBetween(String value1, String value2) {
            addCriterion("WeaInfo_FX not between", value1, value2, "weainfoFx");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlIsNull() {
            addCriterion("WeaInfo_FL is null");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlIsNotNull() {
            addCriterion("WeaInfo_FL is not null");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlEqualTo(String value) {
            addCriterion("WeaInfo_FL =", value, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlNotEqualTo(String value) {
            addCriterion("WeaInfo_FL <>", value, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlGreaterThan(String value) {
            addCriterion("WeaInfo_FL >", value, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlGreaterThanOrEqualTo(String value) {
            addCriterion("WeaInfo_FL >=", value, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlLessThan(String value) {
            addCriterion("WeaInfo_FL <", value, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlLessThanOrEqualTo(String value) {
            addCriterion("WeaInfo_FL <=", value, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlLike(String value) {
            addCriterion("WeaInfo_FL like", value, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlNotLike(String value) {
            addCriterion("WeaInfo_FL not like", value, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlIn(List<String> values) {
            addCriterion("WeaInfo_FL in", values, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlNotIn(List<String> values) {
            addCriterion("WeaInfo_FL not in", values, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlBetween(String value1, String value2) {
            addCriterion("WeaInfo_FL between", value1, value2, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFlNotBetween(String value1, String value2) {
            addCriterion("WeaInfo_FL not between", value1, value2, "weainfoFl");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdIsNull() {
            addCriterion("WeaInfo_WD is null");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdIsNotNull() {
            addCriterion("WeaInfo_WD is not null");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdEqualTo(Integer value) {
            addCriterion("WeaInfo_WD =", value, "weainfoWd");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdNotEqualTo(Integer value) {
            addCriterion("WeaInfo_WD <>", value, "weainfoWd");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdGreaterThan(Integer value) {
            addCriterion("WeaInfo_WD >", value, "weainfoWd");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WeaInfo_WD >=", value, "weainfoWd");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdLessThan(Integer value) {
            addCriterion("WeaInfo_WD <", value, "weainfoWd");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdLessThanOrEqualTo(Integer value) {
            addCriterion("WeaInfo_WD <=", value, "weainfoWd");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdIn(List<Integer> values) {
            addCriterion("WeaInfo_WD in", values, "weainfoWd");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdNotIn(List<Integer> values) {
            addCriterion("WeaInfo_WD not in", values, "weainfoWd");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdBetween(Integer value1, Integer value2) {
            addCriterion("WeaInfo_WD between", value1, value2, "weainfoWd");
            return (Criteria) this;
        }

        public Criteria andWeainfoWdNotBetween(Integer value1, Integer value2) {
            addCriterion("WeaInfo_WD not between", value1, value2, "weainfoWd");
            return (Criteria) this;
        }

        public Criteria andProtectXcIsNull() {
            addCriterion("Protect_XC is null");
            return (Criteria) this;
        }

        public Criteria andProtectXcIsNotNull() {
            addCriterion("Protect_XC is not null");
            return (Criteria) this;
        }

        public Criteria andProtectXcEqualTo(String value) {
            addCriterion("Protect_XC =", value, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcNotEqualTo(String value) {
            addCriterion("Protect_XC <>", value, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcGreaterThan(String value) {
            addCriterion("Protect_XC >", value, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcGreaterThanOrEqualTo(String value) {
            addCriterion("Protect_XC >=", value, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcLessThan(String value) {
            addCriterion("Protect_XC <", value, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcLessThanOrEqualTo(String value) {
            addCriterion("Protect_XC <=", value, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcLike(String value) {
            addCriterion("Protect_XC like", value, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcNotLike(String value) {
            addCriterion("Protect_XC not like", value, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcIn(List<String> values) {
            addCriterion("Protect_XC in", values, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcNotIn(List<String> values) {
            addCriterion("Protect_XC not in", values, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcBetween(String value1, String value2) {
            addCriterion("Protect_XC between", value1, value2, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectXcNotBetween(String value1, String value2) {
            addCriterion("Protect_XC not between", value1, value2, "protectXc");
            return (Criteria) this;
        }

        public Criteria andProtectClIsNull() {
            addCriterion("Protect_CL is null");
            return (Criteria) this;
        }

        public Criteria andProtectClIsNotNull() {
            addCriterion("Protect_CL is not null");
            return (Criteria) this;
        }

        public Criteria andProtectClEqualTo(String value) {
            addCriterion("Protect_CL =", value, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClNotEqualTo(String value) {
            addCriterion("Protect_CL <>", value, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClGreaterThan(String value) {
            addCriterion("Protect_CL >", value, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClGreaterThanOrEqualTo(String value) {
            addCriterion("Protect_CL >=", value, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClLessThan(String value) {
            addCriterion("Protect_CL <", value, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClLessThanOrEqualTo(String value) {
            addCriterion("Protect_CL <=", value, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClLike(String value) {
            addCriterion("Protect_CL like", value, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClNotLike(String value) {
            addCriterion("Protect_CL not like", value, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClIn(List<String> values) {
            addCriterion("Protect_CL in", values, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClNotIn(List<String> values) {
            addCriterion("Protect_CL not in", values, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClBetween(String value1, String value2) {
            addCriterion("Protect_CL between", value1, value2, "protectCl");
            return (Criteria) this;
        }

        public Criteria andProtectClNotBetween(String value1, String value2) {
            addCriterion("Protect_CL not between", value1, value2, "protectCl");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsIsNull() {
            addCriterion("WeaInfo_FS is null");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsIsNotNull() {
            addCriterion("WeaInfo_FS is not null");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsEqualTo(Integer value) {
            addCriterion("WeaInfo_FS =", value, "weainfoFs");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsNotEqualTo(Integer value) {
            addCriterion("WeaInfo_FS <>", value, "weainfoFs");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsGreaterThan(Integer value) {
            addCriterion("WeaInfo_FS >", value, "weainfoFs");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsGreaterThanOrEqualTo(Integer value) {
            addCriterion("WeaInfo_FS >=", value, "weainfoFs");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsLessThan(Integer value) {
            addCriterion("WeaInfo_FS <", value, "weainfoFs");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsLessThanOrEqualTo(Integer value) {
            addCriterion("WeaInfo_FS <=", value, "weainfoFs");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsIn(List<Integer> values) {
            addCriterion("WeaInfo_FS in", values, "weainfoFs");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsNotIn(List<Integer> values) {
            addCriterion("WeaInfo_FS not in", values, "weainfoFs");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsBetween(Integer value1, Integer value2) {
            addCriterion("WeaInfo_FS between", value1, value2, "weainfoFs");
            return (Criteria) this;
        }

        public Criteria andWeainfoFsNotBetween(Integer value1, Integer value2) {
            addCriterion("WeaInfo_FS not between", value1, value2, "weainfoFs");
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
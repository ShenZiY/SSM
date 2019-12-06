package cn.nankai.tjxf1.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseInfoExample() {
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

        public Criteria andTimeFindIsNull() {
            addCriterion("Time_Find is null");
            return (Criteria) this;
        }

        public Criteria andTimeFindIsNotNull() {
            addCriterion("Time_Find is not null");
            return (Criteria) this;
        }

        public Criteria andTimeFindEqualTo(Date value) {
            addCriterion("Time_Find =", value, "timeFind");
            return (Criteria) this;
        }

        public Criteria andTimeFindNotEqualTo(Date value) {
            addCriterion("Time_Find <>", value, "timeFind");
            return (Criteria) this;
        }

        public Criteria andTimeFindGreaterThan(Date value) {
            addCriterion("Time_Find >", value, "timeFind");
            return (Criteria) this;
        }

        public Criteria andTimeFindGreaterThanOrEqualTo(Date value) {
            addCriterion("Time_Find >=", value, "timeFind");
            return (Criteria) this;
        }

        public Criteria andTimeFindLessThan(Date value) {
            addCriterion("Time_Find <", value, "timeFind");
            return (Criteria) this;
        }

        public Criteria andTimeFindLessThanOrEqualTo(Date value) {
            addCriterion("Time_Find <=", value, "timeFind");
            return (Criteria) this;
        }

        public Criteria andTimeFindIn(List<Date> values) {
            addCriterion("Time_Find in", values, "timeFind");
            return (Criteria) this;
        }

        public Criteria andTimeFindNotIn(List<Date> values) {
            addCriterion("Time_Find not in", values, "timeFind");
            return (Criteria) this;
        }

        public Criteria andTimeFindBetween(Date value1, Date value2) {
            addCriterion("Time_Find between", value1, value2, "timeFind");
            return (Criteria) this;
        }

        public Criteria andTimeFindNotBetween(Date value1, Date value2) {
            addCriterion("Time_Find not between", value1, value2, "timeFind");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("Car_Num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("Car_Num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(Integer value) {
            addCriterion("Car_Num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(Integer value) {
            addCriterion("Car_Num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(Integer value) {
            addCriterion("Car_Num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Car_Num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(Integer value) {
            addCriterion("Car_Num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(Integer value) {
            addCriterion("Car_Num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<Integer> values) {
            addCriterion("Car_Num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<Integer> values) {
            addCriterion("Car_Num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(Integer value1, Integer value2) {
            addCriterion("Car_Num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Car_Num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumIsNull() {
            addCriterion("Hurt_Num is null");
            return (Criteria) this;
        }

        public Criteria andHurtNumIsNotNull() {
            addCriterion("Hurt_Num is not null");
            return (Criteria) this;
        }

        public Criteria andHurtNumEqualTo(Integer value) {
            addCriterion("Hurt_Num =", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumNotEqualTo(Integer value) {
            addCriterion("Hurt_Num <>", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumGreaterThan(Integer value) {
            addCriterion("Hurt_Num >", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Hurt_Num >=", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumLessThan(Integer value) {
            addCriterion("Hurt_Num <", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumLessThanOrEqualTo(Integer value) {
            addCriterion("Hurt_Num <=", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumIn(List<Integer> values) {
            addCriterion("Hurt_Num in", values, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumNotIn(List<Integer> values) {
            addCriterion("Hurt_Num not in", values, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumBetween(Integer value1, Integer value2) {
            addCriterion("Hurt_Num between", value1, value2, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Hurt_Num not between", value1, value2, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andLocShengIsNull() {
            addCriterion("Loc_Sheng is null");
            return (Criteria) this;
        }

        public Criteria andLocShengIsNotNull() {
            addCriterion("Loc_Sheng is not null");
            return (Criteria) this;
        }

        public Criteria andLocShengEqualTo(String value) {
            addCriterion("Loc_Sheng =", value, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengNotEqualTo(String value) {
            addCriterion("Loc_Sheng <>", value, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengGreaterThan(String value) {
            addCriterion("Loc_Sheng >", value, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengGreaterThanOrEqualTo(String value) {
            addCriterion("Loc_Sheng >=", value, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengLessThan(String value) {
            addCriterion("Loc_Sheng <", value, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengLessThanOrEqualTo(String value) {
            addCriterion("Loc_Sheng <=", value, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengLike(String value) {
            addCriterion("Loc_Sheng like", value, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengNotLike(String value) {
            addCriterion("Loc_Sheng not like", value, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengIn(List<String> values) {
            addCriterion("Loc_Sheng in", values, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengNotIn(List<String> values) {
            addCriterion("Loc_Sheng not in", values, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengBetween(String value1, String value2) {
            addCriterion("Loc_Sheng between", value1, value2, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShengNotBetween(String value1, String value2) {
            addCriterion("Loc_Sheng not between", value1, value2, "locSheng");
            return (Criteria) this;
        }

        public Criteria andLocShiIsNull() {
            addCriterion("Loc_Shi is null");
            return (Criteria) this;
        }

        public Criteria andLocShiIsNotNull() {
            addCriterion("Loc_Shi is not null");
            return (Criteria) this;
        }

        public Criteria andLocShiEqualTo(String value) {
            addCriterion("Loc_Shi =", value, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiNotEqualTo(String value) {
            addCriterion("Loc_Shi <>", value, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiGreaterThan(String value) {
            addCriterion("Loc_Shi >", value, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiGreaterThanOrEqualTo(String value) {
            addCriterion("Loc_Shi >=", value, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiLessThan(String value) {
            addCriterion("Loc_Shi <", value, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiLessThanOrEqualTo(String value) {
            addCriterion("Loc_Shi <=", value, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiLike(String value) {
            addCriterion("Loc_Shi like", value, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiNotLike(String value) {
            addCriterion("Loc_Shi not like", value, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiIn(List<String> values) {
            addCriterion("Loc_Shi in", values, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiNotIn(List<String> values) {
            addCriterion("Loc_Shi not in", values, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiBetween(String value1, String value2) {
            addCriterion("Loc_Shi between", value1, value2, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocShiNotBetween(String value1, String value2) {
            addCriterion("Loc_Shi not between", value1, value2, "locShi");
            return (Criteria) this;
        }

        public Criteria andLocXianIsNull() {
            addCriterion("Loc_Xian is null");
            return (Criteria) this;
        }

        public Criteria andLocXianIsNotNull() {
            addCriterion("Loc_Xian is not null");
            return (Criteria) this;
        }

        public Criteria andLocXianEqualTo(String value) {
            addCriterion("Loc_Xian =", value, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianNotEqualTo(String value) {
            addCriterion("Loc_Xian <>", value, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianGreaterThan(String value) {
            addCriterion("Loc_Xian >", value, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianGreaterThanOrEqualTo(String value) {
            addCriterion("Loc_Xian >=", value, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianLessThan(String value) {
            addCriterion("Loc_Xian <", value, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianLessThanOrEqualTo(String value) {
            addCriterion("Loc_Xian <=", value, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianLike(String value) {
            addCriterion("Loc_Xian like", value, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianNotLike(String value) {
            addCriterion("Loc_Xian not like", value, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianIn(List<String> values) {
            addCriterion("Loc_Xian in", values, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianNotIn(List<String> values) {
            addCriterion("Loc_Xian not in", values, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianBetween(String value1, String value2) {
            addCriterion("Loc_Xian between", value1, value2, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocXianNotBetween(String value1, String value2) {
            addCriterion("Loc_Xian not between", value1, value2, "locXian");
            return (Criteria) this;
        }

        public Criteria andLocDetailIsNull() {
            addCriterion("Loc_Detail is null");
            return (Criteria) this;
        }

        public Criteria andLocDetailIsNotNull() {
            addCriterion("Loc_Detail is not null");
            return (Criteria) this;
        }

        public Criteria andLocDetailEqualTo(String value) {
            addCriterion("Loc_Detail =", value, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailNotEqualTo(String value) {
            addCriterion("Loc_Detail <>", value, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailGreaterThan(String value) {
            addCriterion("Loc_Detail >", value, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailGreaterThanOrEqualTo(String value) {
            addCriterion("Loc_Detail >=", value, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailLessThan(String value) {
            addCriterion("Loc_Detail <", value, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailLessThanOrEqualTo(String value) {
            addCriterion("Loc_Detail <=", value, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailLike(String value) {
            addCriterion("Loc_Detail like", value, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailNotLike(String value) {
            addCriterion("Loc_Detail not like", value, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailIn(List<String> values) {
            addCriterion("Loc_Detail in", values, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailNotIn(List<String> values) {
            addCriterion("Loc_Detail not in", values, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailBetween(String value1, String value2) {
            addCriterion("Loc_Detail between", value1, value2, "locDetail");
            return (Criteria) this;
        }

        public Criteria andLocDetailNotBetween(String value1, String value2) {
            addCriterion("Loc_Detail not between", value1, value2, "locDetail");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNull() {
            addCriterion("People_Num is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNotNull() {
            addCriterion("People_Num is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumEqualTo(Integer value) {
            addCriterion("People_Num =", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotEqualTo(Integer value) {
            addCriterion("People_Num <>", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThan(Integer value) {
            addCriterion("People_Num >", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("People_Num >=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThan(Integer value) {
            addCriterion("People_Num <", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThanOrEqualTo(Integer value) {
            addCriterion("People_Num <=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIn(List<Integer> values) {
            addCriterion("People_Num in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotIn(List<Integer> values) {
            addCriterion("People_Num not in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumBetween(Integer value1, Integer value2) {
            addCriterion("People_Num between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("People_Num not between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andGovCjIsNull() {
            addCriterion("Gov_CJ is null");
            return (Criteria) this;
        }

        public Criteria andGovCjIsNotNull() {
            addCriterion("Gov_CJ is not null");
            return (Criteria) this;
        }

        public Criteria andGovCjEqualTo(String value) {
            addCriterion("Gov_CJ =", value, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjNotEqualTo(String value) {
            addCriterion("Gov_CJ <>", value, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjGreaterThan(String value) {
            addCriterion("Gov_CJ >", value, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjGreaterThanOrEqualTo(String value) {
            addCriterion("Gov_CJ >=", value, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjLessThan(String value) {
            addCriterion("Gov_CJ <", value, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjLessThanOrEqualTo(String value) {
            addCriterion("Gov_CJ <=", value, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjLike(String value) {
            addCriterion("Gov_CJ like", value, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjNotLike(String value) {
            addCriterion("Gov_CJ not like", value, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjIn(List<String> values) {
            addCriterion("Gov_CJ in", values, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjNotIn(List<String> values) {
            addCriterion("Gov_CJ not in", values, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjBetween(String value1, String value2) {
            addCriterion("Gov_CJ between", value1, value2, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovCjNotBetween(String value1, String value2) {
            addCriterion("Gov_CJ not between", value1, value2, "govCj");
            return (Criteria) this;
        }

        public Criteria andGovLrIsNull() {
            addCriterion("Gov_LR is null");
            return (Criteria) this;
        }

        public Criteria andGovLrIsNotNull() {
            addCriterion("Gov_LR is not null");
            return (Criteria) this;
        }

        public Criteria andGovLrEqualTo(String value) {
            addCriterion("Gov_LR =", value, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrNotEqualTo(String value) {
            addCriterion("Gov_LR <>", value, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrGreaterThan(String value) {
            addCriterion("Gov_LR >", value, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrGreaterThanOrEqualTo(String value) {
            addCriterion("Gov_LR >=", value, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrLessThan(String value) {
            addCriterion("Gov_LR <", value, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrLessThanOrEqualTo(String value) {
            addCriterion("Gov_LR <=", value, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrLike(String value) {
            addCriterion("Gov_LR like", value, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrNotLike(String value) {
            addCriterion("Gov_LR not like", value, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrIn(List<String> values) {
            addCriterion("Gov_LR in", values, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrNotIn(List<String> values) {
            addCriterion("Gov_LR not in", values, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrBetween(String value1, String value2) {
            addCriterion("Gov_LR between", value1, value2, "govLr");
            return (Criteria) this;
        }

        public Criteria andGovLrNotBetween(String value1, String value2) {
            addCriterion("Gov_LR not between", value1, value2, "govLr");
            return (Criteria) this;
        }

        public Criteria andTimePoliceIsNull() {
            addCriterion("Time_Police is null");
            return (Criteria) this;
        }

        public Criteria andTimePoliceIsNotNull() {
            addCriterion("Time_Police is not null");
            return (Criteria) this;
        }

        public Criteria andTimePoliceEqualTo(Date value) {
            addCriterion("Time_Police =", value, "timePolice");
            return (Criteria) this;
        }

        public Criteria andTimePoliceNotEqualTo(Date value) {
            addCriterion("Time_Police <>", value, "timePolice");
            return (Criteria) this;
        }

        public Criteria andTimePoliceGreaterThan(Date value) {
            addCriterion("Time_Police >", value, "timePolice");
            return (Criteria) this;
        }

        public Criteria andTimePoliceGreaterThanOrEqualTo(Date value) {
            addCriterion("Time_Police >=", value, "timePolice");
            return (Criteria) this;
        }

        public Criteria andTimePoliceLessThan(Date value) {
            addCriterion("Time_Police <", value, "timePolice");
            return (Criteria) this;
        }

        public Criteria andTimePoliceLessThanOrEqualTo(Date value) {
            addCriterion("Time_Police <=", value, "timePolice");
            return (Criteria) this;
        }

        public Criteria andTimePoliceIn(List<Date> values) {
            addCriterion("Time_Police in", values, "timePolice");
            return (Criteria) this;
        }

        public Criteria andTimePoliceNotIn(List<Date> values) {
            addCriterion("Time_Police not in", values, "timePolice");
            return (Criteria) this;
        }

        public Criteria andTimePoliceBetween(Date value1, Date value2) {
            addCriterion("Time_Police between", value1, value2, "timePolice");
            return (Criteria) this;
        }

        public Criteria andTimePoliceNotBetween(Date value1, Date value2) {
            addCriterion("Time_Police not between", value1, value2, "timePolice");
            return (Criteria) this;
        }

        public Criteria andTimeInvestIsNull() {
            addCriterion("Time_Invest is null");
            return (Criteria) this;
        }

        public Criteria andTimeInvestIsNotNull() {
            addCriterion("Time_Invest is not null");
            return (Criteria) this;
        }

        public Criteria andTimeInvestEqualTo(Date value) {
            addCriterion("Time_Invest =", value, "timeInvest");
            return (Criteria) this;
        }

        public Criteria andTimeInvestNotEqualTo(Date value) {
            addCriterion("Time_Invest <>", value, "timeInvest");
            return (Criteria) this;
        }

        public Criteria andTimeInvestGreaterThan(Date value) {
            addCriterion("Time_Invest >", value, "timeInvest");
            return (Criteria) this;
        }

        public Criteria andTimeInvestGreaterThanOrEqualTo(Date value) {
            addCriterion("Time_Invest >=", value, "timeInvest");
            return (Criteria) this;
        }

        public Criteria andTimeInvestLessThan(Date value) {
            addCriterion("Time_Invest <", value, "timeInvest");
            return (Criteria) this;
        }

        public Criteria andTimeInvestLessThanOrEqualTo(Date value) {
            addCriterion("Time_Invest <=", value, "timeInvest");
            return (Criteria) this;
        }

        public Criteria andTimeInvestIn(List<Date> values) {
            addCriterion("Time_Invest in", values, "timeInvest");
            return (Criteria) this;
        }

        public Criteria andTimeInvestNotIn(List<Date> values) {
            addCriterion("Time_Invest not in", values, "timeInvest");
            return (Criteria) this;
        }

        public Criteria andTimeInvestBetween(Date value1, Date value2) {
            addCriterion("Time_Invest between", value1, value2, "timeInvest");
            return (Criteria) this;
        }

        public Criteria andTimeInvestNotBetween(Date value1, Date value2) {
            addCriterion("Time_Invest not between", value1, value2, "timeInvest");
            return (Criteria) this;
        }

        public Criteria andFireTruIsNull() {
            addCriterion("Fire_Tru is null");
            return (Criteria) this;
        }

        public Criteria andFireTruIsNotNull() {
            addCriterion("Fire_Tru is not null");
            return (Criteria) this;
        }

        public Criteria andFireTruEqualTo(String value) {
            addCriterion("Fire_Tru =", value, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruNotEqualTo(String value) {
            addCriterion("Fire_Tru <>", value, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruGreaterThan(String value) {
            addCriterion("Fire_Tru >", value, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruGreaterThanOrEqualTo(String value) {
            addCriterion("Fire_Tru >=", value, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruLessThan(String value) {
            addCriterion("Fire_Tru <", value, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruLessThanOrEqualTo(String value) {
            addCriterion("Fire_Tru <=", value, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruLike(String value) {
            addCriterion("Fire_Tru like", value, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruNotLike(String value) {
            addCriterion("Fire_Tru not like", value, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruIn(List<String> values) {
            addCriterion("Fire_Tru in", values, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruNotIn(List<String> values) {
            addCriterion("Fire_Tru not in", values, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruBetween(String value1, String value2) {
            addCriterion("Fire_Tru between", value1, value2, "fireTru");
            return (Criteria) this;
        }

        public Criteria andFireTruNotBetween(String value1, String value2) {
            addCriterion("Fire_Tru not between", value1, value2, "fireTru");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruIsNull() {
            addCriterion("Time_FireTru is null");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruIsNotNull() {
            addCriterion("Time_FireTru is not null");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruEqualTo(Date value) {
            addCriterion("Time_FireTru =", value, "timeFiretru");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruNotEqualTo(Date value) {
            addCriterion("Time_FireTru <>", value, "timeFiretru");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruGreaterThan(Date value) {
            addCriterion("Time_FireTru >", value, "timeFiretru");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruGreaterThanOrEqualTo(Date value) {
            addCriterion("Time_FireTru >=", value, "timeFiretru");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruLessThan(Date value) {
            addCriterion("Time_FireTru <", value, "timeFiretru");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruLessThanOrEqualTo(Date value) {
            addCriterion("Time_FireTru <=", value, "timeFiretru");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruIn(List<Date> values) {
            addCriterion("Time_FireTru in", values, "timeFiretru");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruNotIn(List<Date> values) {
            addCriterion("Time_FireTru not in", values, "timeFiretru");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruBetween(Date value1, Date value2) {
            addCriterion("Time_FireTru between", value1, value2, "timeFiretru");
            return (Criteria) this;
        }

        public Criteria andTimeFiretruNotBetween(Date value1, Date value2) {
            addCriterion("Time_FireTru not between", value1, value2, "timeFiretru");
            return (Criteria) this;
        }

        public Criteria andAmbulanceIsNull() {
            addCriterion("Ambulance is null");
            return (Criteria) this;
        }

        public Criteria andAmbulanceIsNotNull() {
            addCriterion("Ambulance is not null");
            return (Criteria) this;
        }

        public Criteria andAmbulanceEqualTo(String value) {
            addCriterion("Ambulance =", value, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceNotEqualTo(String value) {
            addCriterion("Ambulance <>", value, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceGreaterThan(String value) {
            addCriterion("Ambulance >", value, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceGreaterThanOrEqualTo(String value) {
            addCriterion("Ambulance >=", value, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceLessThan(String value) {
            addCriterion("Ambulance <", value, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceLessThanOrEqualTo(String value) {
            addCriterion("Ambulance <=", value, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceLike(String value) {
            addCriterion("Ambulance like", value, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceNotLike(String value) {
            addCriterion("Ambulance not like", value, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceIn(List<String> values) {
            addCriterion("Ambulance in", values, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceNotIn(List<String> values) {
            addCriterion("Ambulance not in", values, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceBetween(String value1, String value2) {
            addCriterion("Ambulance between", value1, value2, "ambulance");
            return (Criteria) this;
        }

        public Criteria andAmbulanceNotBetween(String value1, String value2) {
            addCriterion("Ambulance not between", value1, value2, "ambulance");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuIsNull() {
            addCriterion("Time_Ambu is null");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuIsNotNull() {
            addCriterion("Time_Ambu is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuEqualTo(Date value) {
            addCriterion("Time_Ambu =", value, "timeAmbu");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuNotEqualTo(Date value) {
            addCriterion("Time_Ambu <>", value, "timeAmbu");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuGreaterThan(Date value) {
            addCriterion("Time_Ambu >", value, "timeAmbu");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuGreaterThanOrEqualTo(Date value) {
            addCriterion("Time_Ambu >=", value, "timeAmbu");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuLessThan(Date value) {
            addCriterion("Time_Ambu <", value, "timeAmbu");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuLessThanOrEqualTo(Date value) {
            addCriterion("Time_Ambu <=", value, "timeAmbu");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuIn(List<Date> values) {
            addCriterion("Time_Ambu in", values, "timeAmbu");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuNotIn(List<Date> values) {
            addCriterion("Time_Ambu not in", values, "timeAmbu");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuBetween(Date value1, Date value2) {
            addCriterion("Time_Ambu between", value1, value2, "timeAmbu");
            return (Criteria) this;
        }

        public Criteria andTimeAmbuNotBetween(Date value1, Date value2) {
            addCriterion("Time_Ambu not between", value1, value2, "timeAmbu");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("State like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("State not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
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
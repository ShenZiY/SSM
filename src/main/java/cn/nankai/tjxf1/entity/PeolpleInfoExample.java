package cn.nankai.tjxf1.entity;

import java.util.ArrayList;
import java.util.List;

public class PeolpleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeolpleInfoExample() {
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

        public Criteria andPeopleIdIsNull() {
            addCriterion("People_ID is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIdIsNotNull() {
            addCriterion("People_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleIdEqualTo(Integer value) {
            addCriterion("People_ID =", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdNotEqualTo(Integer value) {
            addCriterion("People_ID <>", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdGreaterThan(Integer value) {
            addCriterion("People_ID >", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("People_ID >=", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdLessThan(Integer value) {
            addCriterion("People_ID <", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdLessThanOrEqualTo(Integer value) {
            addCriterion("People_ID <=", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdIn(List<Integer> values) {
            addCriterion("People_ID in", values, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdNotIn(List<Integer> values) {
            addCriterion("People_ID not in", values, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdBetween(Integer value1, Integer value2) {
            addCriterion("People_ID between", value1, value2, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("People_ID not between", value1, value2, "peopleId");
            return (Criteria) this;
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

        public Criteria andPeopleTypeIsNull() {
            addCriterion("People_Type is null");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeIsNotNull() {
            addCriterion("People_Type is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeEqualTo(String value) {
            addCriterion("People_Type =", value, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeNotEqualTo(String value) {
            addCriterion("People_Type <>", value, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeGreaterThan(String value) {
            addCriterion("People_Type >", value, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("People_Type >=", value, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeLessThan(String value) {
            addCriterion("People_Type <", value, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeLessThanOrEqualTo(String value) {
            addCriterion("People_Type <=", value, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeLike(String value) {
            addCriterion("People_Type like", value, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeNotLike(String value) {
            addCriterion("People_Type not like", value, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeIn(List<String> values) {
            addCriterion("People_Type in", values, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeNotIn(List<String> values) {
            addCriterion("People_Type not in", values, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeBetween(String value1, String value2) {
            addCriterion("People_Type between", value1, value2, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleTypeNotBetween(String value1, String value2) {
            addCriterion("People_Type not between", value1, value2, "peopleType");
            return (Criteria) this;
        }

        public Criteria andPeopleSexIsNull() {
            addCriterion("People_Sex is null");
            return (Criteria) this;
        }

        public Criteria andPeopleSexIsNotNull() {
            addCriterion("People_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleSexEqualTo(String value) {
            addCriterion("People_Sex =", value, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexNotEqualTo(String value) {
            addCriterion("People_Sex <>", value, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexGreaterThan(String value) {
            addCriterion("People_Sex >", value, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexGreaterThanOrEqualTo(String value) {
            addCriterion("People_Sex >=", value, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexLessThan(String value) {
            addCriterion("People_Sex <", value, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexLessThanOrEqualTo(String value) {
            addCriterion("People_Sex <=", value, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexLike(String value) {
            addCriterion("People_Sex like", value, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexNotLike(String value) {
            addCriterion("People_Sex not like", value, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexIn(List<String> values) {
            addCriterion("People_Sex in", values, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexNotIn(List<String> values) {
            addCriterion("People_Sex not in", values, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexBetween(String value1, String value2) {
            addCriterion("People_Sex between", value1, value2, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleSexNotBetween(String value1, String value2) {
            addCriterion("People_Sex not between", value1, value2, "peopleSex");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeIsNull() {
            addCriterion("People_Age is null");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeIsNotNull() {
            addCriterion("People_Age is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeEqualTo(Integer value) {
            addCriterion("People_Age =", value, "peopleAge");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeNotEqualTo(Integer value) {
            addCriterion("People_Age <>", value, "peopleAge");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeGreaterThan(Integer value) {
            addCriterion("People_Age >", value, "peopleAge");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("People_Age >=", value, "peopleAge");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeLessThan(Integer value) {
            addCriterion("People_Age <", value, "peopleAge");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeLessThanOrEqualTo(Integer value) {
            addCriterion("People_Age <=", value, "peopleAge");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeIn(List<Integer> values) {
            addCriterion("People_Age in", values, "peopleAge");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeNotIn(List<Integer> values) {
            addCriterion("People_Age not in", values, "peopleAge");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeBetween(Integer value1, Integer value2) {
            addCriterion("People_Age between", value1, value2, "peopleAge");
            return (Criteria) this;
        }

        public Criteria andPeopleAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("People_Age not between", value1, value2, "peopleAge");
            return (Criteria) this;
        }

        public Criteria andInvestLocIsNull() {
            addCriterion("Invest_Loc is null");
            return (Criteria) this;
        }

        public Criteria andInvestLocIsNotNull() {
            addCriterion("Invest_Loc is not null");
            return (Criteria) this;
        }

        public Criteria andInvestLocEqualTo(String value) {
            addCriterion("Invest_Loc =", value, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocNotEqualTo(String value) {
            addCriterion("Invest_Loc <>", value, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocGreaterThan(String value) {
            addCriterion("Invest_Loc >", value, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocGreaterThanOrEqualTo(String value) {
            addCriterion("Invest_Loc >=", value, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocLessThan(String value) {
            addCriterion("Invest_Loc <", value, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocLessThanOrEqualTo(String value) {
            addCriterion("Invest_Loc <=", value, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocLike(String value) {
            addCriterion("Invest_Loc like", value, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocNotLike(String value) {
            addCriterion("Invest_Loc not like", value, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocIn(List<String> values) {
            addCriterion("Invest_Loc in", values, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocNotIn(List<String> values) {
            addCriterion("Invest_Loc not in", values, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocBetween(String value1, String value2) {
            addCriterion("Invest_Loc between", value1, value2, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestLocNotBetween(String value1, String value2) {
            addCriterion("Invest_Loc not between", value1, value2, "investLoc");
            return (Criteria) this;
        }

        public Criteria andInvestMethodIsNull() {
            addCriterion("Invest_Method is null");
            return (Criteria) this;
        }

        public Criteria andInvestMethodIsNotNull() {
            addCriterion("Invest_Method is not null");
            return (Criteria) this;
        }

        public Criteria andInvestMethodEqualTo(String value) {
            addCriterion("Invest_Method =", value, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodNotEqualTo(String value) {
            addCriterion("Invest_Method <>", value, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodGreaterThan(String value) {
            addCriterion("Invest_Method >", value, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodGreaterThanOrEqualTo(String value) {
            addCriterion("Invest_Method >=", value, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodLessThan(String value) {
            addCriterion("Invest_Method <", value, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodLessThanOrEqualTo(String value) {
            addCriterion("Invest_Method <=", value, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodLike(String value) {
            addCriterion("Invest_Method like", value, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodNotLike(String value) {
            addCriterion("Invest_Method not like", value, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodIn(List<String> values) {
            addCriterion("Invest_Method in", values, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodNotIn(List<String> values) {
            addCriterion("Invest_Method not in", values, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodBetween(String value1, String value2) {
            addCriterion("Invest_Method between", value1, value2, "investMethod");
            return (Criteria) this;
        }

        public Criteria andInvestMethodNotBetween(String value1, String value2) {
            addCriterion("Invest_Method not between", value1, value2, "investMethod");
            return (Criteria) this;
        }

        public Criteria andIfSmokeIsNull() {
            addCriterion("If_Smoke is null");
            return (Criteria) this;
        }

        public Criteria andIfSmokeIsNotNull() {
            addCriterion("If_Smoke is not null");
            return (Criteria) this;
        }

        public Criteria andIfSmokeEqualTo(String value) {
            addCriterion("If_Smoke =", value, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeNotEqualTo(String value) {
            addCriterion("If_Smoke <>", value, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeGreaterThan(String value) {
            addCriterion("If_Smoke >", value, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeGreaterThanOrEqualTo(String value) {
            addCriterion("If_Smoke >=", value, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeLessThan(String value) {
            addCriterion("If_Smoke <", value, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeLessThanOrEqualTo(String value) {
            addCriterion("If_Smoke <=", value, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeLike(String value) {
            addCriterion("If_Smoke like", value, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeNotLike(String value) {
            addCriterion("If_Smoke not like", value, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeIn(List<String> values) {
            addCriterion("If_Smoke in", values, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeNotIn(List<String> values) {
            addCriterion("If_Smoke not in", values, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeBetween(String value1, String value2) {
            addCriterion("If_Smoke between", value1, value2, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfSmokeNotBetween(String value1, String value2) {
            addCriterion("If_Smoke not between", value1, value2, "ifSmoke");
            return (Criteria) this;
        }

        public Criteria andIfDrinkIsNull() {
            addCriterion("If_Drink is null");
            return (Criteria) this;
        }

        public Criteria andIfDrinkIsNotNull() {
            addCriterion("If_Drink is not null");
            return (Criteria) this;
        }

        public Criteria andIfDrinkEqualTo(String value) {
            addCriterion("If_Drink =", value, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkNotEqualTo(String value) {
            addCriterion("If_Drink <>", value, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkGreaterThan(String value) {
            addCriterion("If_Drink >", value, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkGreaterThanOrEqualTo(String value) {
            addCriterion("If_Drink >=", value, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkLessThan(String value) {
            addCriterion("If_Drink <", value, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkLessThanOrEqualTo(String value) {
            addCriterion("If_Drink <=", value, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkLike(String value) {
            addCriterion("If_Drink like", value, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkNotLike(String value) {
            addCriterion("If_Drink not like", value, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkIn(List<String> values) {
            addCriterion("If_Drink in", values, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkNotIn(List<String> values) {
            addCriterion("If_Drink not in", values, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkBetween(String value1, String value2) {
            addCriterion("If_Drink between", value1, value2, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfDrinkNotBetween(String value1, String value2) {
            addCriterion("If_Drink not between", value1, value2, "ifDrink");
            return (Criteria) this;
        }

        public Criteria andIfInjuryIsNull() {
            addCriterion("If_Injury is null");
            return (Criteria) this;
        }

        public Criteria andIfInjuryIsNotNull() {
            addCriterion("If_Injury is not null");
            return (Criteria) this;
        }

        public Criteria andIfInjuryEqualTo(String value) {
            addCriterion("If_Injury =", value, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryNotEqualTo(String value) {
            addCriterion("If_Injury <>", value, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryGreaterThan(String value) {
            addCriterion("If_Injury >", value, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryGreaterThanOrEqualTo(String value) {
            addCriterion("If_Injury >=", value, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryLessThan(String value) {
            addCriterion("If_Injury <", value, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryLessThanOrEqualTo(String value) {
            addCriterion("If_Injury <=", value, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryLike(String value) {
            addCriterion("If_Injury like", value, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryNotLike(String value) {
            addCriterion("If_Injury not like", value, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryIn(List<String> values) {
            addCriterion("If_Injury in", values, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryNotIn(List<String> values) {
            addCriterion("If_Injury not in", values, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryBetween(String value1, String value2) {
            addCriterion("If_Injury between", value1, value2, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andIfInjuryNotBetween(String value1, String value2) {
            addCriterion("If_Injury not between", value1, value2, "ifInjury");
            return (Criteria) this;
        }

        public Criteria andInjuryLocIsNull() {
            addCriterion("Injury_Loc is null");
            return (Criteria) this;
        }

        public Criteria andInjuryLocIsNotNull() {
            addCriterion("Injury_Loc is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryLocEqualTo(String value) {
            addCriterion("Injury_Loc =", value, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocNotEqualTo(String value) {
            addCriterion("Injury_Loc <>", value, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocGreaterThan(String value) {
            addCriterion("Injury_Loc >", value, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocGreaterThanOrEqualTo(String value) {
            addCriterion("Injury_Loc >=", value, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocLessThan(String value) {
            addCriterion("Injury_Loc <", value, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocLessThanOrEqualTo(String value) {
            addCriterion("Injury_Loc <=", value, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocLike(String value) {
            addCriterion("Injury_Loc like", value, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocNotLike(String value) {
            addCriterion("Injury_Loc not like", value, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocIn(List<String> values) {
            addCriterion("Injury_Loc in", values, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocNotIn(List<String> values) {
            addCriterion("Injury_Loc not in", values, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocBetween(String value1, String value2) {
            addCriterion("Injury_Loc between", value1, value2, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andInjuryLocNotBetween(String value1, String value2) {
            addCriterion("Injury_Loc not between", value1, value2, "injuryLoc");
            return (Criteria) this;
        }

        public Criteria andCarPerformIsNull() {
            addCriterion("Car_Perform is null");
            return (Criteria) this;
        }

        public Criteria andCarPerformIsNotNull() {
            addCriterion("Car_Perform is not null");
            return (Criteria) this;
        }

        public Criteria andCarPerformEqualTo(String value) {
            addCriterion("Car_Perform =", value, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformNotEqualTo(String value) {
            addCriterion("Car_Perform <>", value, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformGreaterThan(String value) {
            addCriterion("Car_Perform >", value, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformGreaterThanOrEqualTo(String value) {
            addCriterion("Car_Perform >=", value, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformLessThan(String value) {
            addCriterion("Car_Perform <", value, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformLessThanOrEqualTo(String value) {
            addCriterion("Car_Perform <=", value, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformLike(String value) {
            addCriterion("Car_Perform like", value, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformNotLike(String value) {
            addCriterion("Car_Perform not like", value, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformIn(List<String> values) {
            addCriterion("Car_Perform in", values, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformNotIn(List<String> values) {
            addCriterion("Car_Perform not in", values, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformBetween(String value1, String value2) {
            addCriterion("Car_Perform between", value1, value2, "carPerform");
            return (Criteria) this;
        }

        public Criteria andCarPerformNotBetween(String value1, String value2) {
            addCriterion("Car_Perform not between", value1, value2, "carPerform");
            return (Criteria) this;
        }

        public Criteria andMeasure1IsNull() {
            addCriterion("Measure1 is null");
            return (Criteria) this;
        }

        public Criteria andMeasure1IsNotNull() {
            addCriterion("Measure1 is not null");
            return (Criteria) this;
        }

        public Criteria andMeasure1EqualTo(String value) {
            addCriterion("Measure1 =", value, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1NotEqualTo(String value) {
            addCriterion("Measure1 <>", value, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1GreaterThan(String value) {
            addCriterion("Measure1 >", value, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1GreaterThanOrEqualTo(String value) {
            addCriterion("Measure1 >=", value, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1LessThan(String value) {
            addCriterion("Measure1 <", value, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1LessThanOrEqualTo(String value) {
            addCriterion("Measure1 <=", value, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1Like(String value) {
            addCriterion("Measure1 like", value, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1NotLike(String value) {
            addCriterion("Measure1 not like", value, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1In(List<String> values) {
            addCriterion("Measure1 in", values, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1NotIn(List<String> values) {
            addCriterion("Measure1 not in", values, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1Between(String value1, String value2) {
            addCriterion("Measure1 between", value1, value2, "measure1");
            return (Criteria) this;
        }

        public Criteria andMeasure1NotBetween(String value1, String value2) {
            addCriterion("Measure1 not between", value1, value2, "measure1");
            return (Criteria) this;
        }

        public Criteria andFireFindLocIsNull() {
            addCriterion("Fire_Find_Loc is null");
            return (Criteria) this;
        }

        public Criteria andFireFindLocIsNotNull() {
            addCriterion("Fire_Find_Loc is not null");
            return (Criteria) this;
        }

        public Criteria andFireFindLocEqualTo(String value) {
            addCriterion("Fire_Find_Loc =", value, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocNotEqualTo(String value) {
            addCriterion("Fire_Find_Loc <>", value, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocGreaterThan(String value) {
            addCriterion("Fire_Find_Loc >", value, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocGreaterThanOrEqualTo(String value) {
            addCriterion("Fire_Find_Loc >=", value, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocLessThan(String value) {
            addCriterion("Fire_Find_Loc <", value, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocLessThanOrEqualTo(String value) {
            addCriterion("Fire_Find_Loc <=", value, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocLike(String value) {
            addCriterion("Fire_Find_Loc like", value, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocNotLike(String value) {
            addCriterion("Fire_Find_Loc not like", value, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocIn(List<String> values) {
            addCriterion("Fire_Find_Loc in", values, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocNotIn(List<String> values) {
            addCriterion("Fire_Find_Loc not in", values, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocBetween(String value1, String value2) {
            addCriterion("Fire_Find_Loc between", value1, value2, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andFireFindLocNotBetween(String value1, String value2) {
            addCriterion("Fire_Find_Loc not between", value1, value2, "fireFindLoc");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("Distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("Distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Double value) {
            addCriterion("Distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Double value) {
            addCriterion("Distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Double value) {
            addCriterion("Distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("Distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Double value) {
            addCriterion("Distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Double value) {
            addCriterion("Distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Double> values) {
            addCriterion("Distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Double> values) {
            addCriterion("Distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Double value1, Double value2) {
            addCriterion("Distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Double value1, Double value2) {
            addCriterion("Distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andPhenomenonIsNull() {
            addCriterion("Phenomenon is null");
            return (Criteria) this;
        }

        public Criteria andPhenomenonIsNotNull() {
            addCriterion("Phenomenon is not null");
            return (Criteria) this;
        }

        public Criteria andPhenomenonEqualTo(String value) {
            addCriterion("Phenomenon =", value, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonNotEqualTo(String value) {
            addCriterion("Phenomenon <>", value, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonGreaterThan(String value) {
            addCriterion("Phenomenon >", value, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonGreaterThanOrEqualTo(String value) {
            addCriterion("Phenomenon >=", value, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonLessThan(String value) {
            addCriterion("Phenomenon <", value, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonLessThanOrEqualTo(String value) {
            addCriterion("Phenomenon <=", value, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonLike(String value) {
            addCriterion("Phenomenon like", value, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonNotLike(String value) {
            addCriterion("Phenomenon not like", value, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonIn(List<String> values) {
            addCriterion("Phenomenon in", values, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonNotIn(List<String> values) {
            addCriterion("Phenomenon not in", values, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonBetween(String value1, String value2) {
            addCriterion("Phenomenon between", value1, value2, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andPhenomenonNotBetween(String value1, String value2) {
            addCriterion("Phenomenon not between", value1, value2, "phenomenon");
            return (Criteria) this;
        }

        public Criteria andMeasure2IsNull() {
            addCriterion("Measure2 is null");
            return (Criteria) this;
        }

        public Criteria andMeasure2IsNotNull() {
            addCriterion("Measure2 is not null");
            return (Criteria) this;
        }

        public Criteria andMeasure2EqualTo(String value) {
            addCriterion("Measure2 =", value, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2NotEqualTo(String value) {
            addCriterion("Measure2 <>", value, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2GreaterThan(String value) {
            addCriterion("Measure2 >", value, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2GreaterThanOrEqualTo(String value) {
            addCriterion("Measure2 >=", value, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2LessThan(String value) {
            addCriterion("Measure2 <", value, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2LessThanOrEqualTo(String value) {
            addCriterion("Measure2 <=", value, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2Like(String value) {
            addCriterion("Measure2 like", value, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2NotLike(String value) {
            addCriterion("Measure2 not like", value, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2In(List<String> values) {
            addCriterion("Measure2 in", values, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2NotIn(List<String> values) {
            addCriterion("Measure2 not in", values, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2Between(String value1, String value2) {
            addCriterion("Measure2 between", value1, value2, "measure2");
            return (Criteria) this;
        }

        public Criteria andMeasure2NotBetween(String value1, String value2) {
            addCriterion("Measure2 not between", value1, value2, "measure2");
            return (Criteria) this;
        }

        public Criteria andFireLocIsNull() {
            addCriterion("Fire_Loc is null");
            return (Criteria) this;
        }

        public Criteria andFireLocIsNotNull() {
            addCriterion("Fire_Loc is not null");
            return (Criteria) this;
        }

        public Criteria andFireLocEqualTo(String value) {
            addCriterion("Fire_Loc =", value, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocNotEqualTo(String value) {
            addCriterion("Fire_Loc <>", value, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocGreaterThan(String value) {
            addCriterion("Fire_Loc >", value, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocGreaterThanOrEqualTo(String value) {
            addCriterion("Fire_Loc >=", value, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocLessThan(String value) {
            addCriterion("Fire_Loc <", value, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocLessThanOrEqualTo(String value) {
            addCriterion("Fire_Loc <=", value, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocLike(String value) {
            addCriterion("Fire_Loc like", value, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocNotLike(String value) {
            addCriterion("Fire_Loc not like", value, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocIn(List<String> values) {
            addCriterion("Fire_Loc in", values, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocNotIn(List<String> values) {
            addCriterion("Fire_Loc not in", values, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocBetween(String value1, String value2) {
            addCriterion("Fire_Loc between", value1, value2, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireLocNotBetween(String value1, String value2) {
            addCriterion("Fire_Loc not between", value1, value2, "fireLoc");
            return (Criteria) this;
        }

        public Criteria andFireHeightIsNull() {
            addCriterion("Fire_Height is null");
            return (Criteria) this;
        }

        public Criteria andFireHeightIsNotNull() {
            addCriterion("Fire_Height is not null");
            return (Criteria) this;
        }

        public Criteria andFireHeightEqualTo(String value) {
            addCriterion("Fire_Height =", value, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightNotEqualTo(String value) {
            addCriterion("Fire_Height <>", value, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightGreaterThan(String value) {
            addCriterion("Fire_Height >", value, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightGreaterThanOrEqualTo(String value) {
            addCriterion("Fire_Height >=", value, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightLessThan(String value) {
            addCriterion("Fire_Height <", value, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightLessThanOrEqualTo(String value) {
            addCriterion("Fire_Height <=", value, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightLike(String value) {
            addCriterion("Fire_Height like", value, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightNotLike(String value) {
            addCriterion("Fire_Height not like", value, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightIn(List<String> values) {
            addCriterion("Fire_Height in", values, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightNotIn(List<String> values) {
            addCriterion("Fire_Height not in", values, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightBetween(String value1, String value2) {
            addCriterion("Fire_Height between", value1, value2, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightNotBetween(String value1, String value2) {
            addCriterion("Fire_Height not between", value1, value2, "fireHeight");
            return (Criteria) this;
        }

        public Criteria andFireHeightallIsNull() {
            addCriterion("Fire_HeightAll is null");
            return (Criteria) this;
        }

        public Criteria andFireHeightallIsNotNull() {
            addCriterion("Fire_HeightAll is not null");
            return (Criteria) this;
        }

        public Criteria andFireHeightallEqualTo(Double value) {
            addCriterion("Fire_HeightAll =", value, "fireHeightall");
            return (Criteria) this;
        }

        public Criteria andFireHeightallNotEqualTo(Double value) {
            addCriterion("Fire_HeightAll <>", value, "fireHeightall");
            return (Criteria) this;
        }

        public Criteria andFireHeightallGreaterThan(Double value) {
            addCriterion("Fire_HeightAll >", value, "fireHeightall");
            return (Criteria) this;
        }

        public Criteria andFireHeightallGreaterThanOrEqualTo(Double value) {
            addCriterion("Fire_HeightAll >=", value, "fireHeightall");
            return (Criteria) this;
        }

        public Criteria andFireHeightallLessThan(Double value) {
            addCriterion("Fire_HeightAll <", value, "fireHeightall");
            return (Criteria) this;
        }

        public Criteria andFireHeightallLessThanOrEqualTo(Double value) {
            addCriterion("Fire_HeightAll <=", value, "fireHeightall");
            return (Criteria) this;
        }

        public Criteria andFireHeightallIn(List<Double> values) {
            addCriterion("Fire_HeightAll in", values, "fireHeightall");
            return (Criteria) this;
        }

        public Criteria andFireHeightallNotIn(List<Double> values) {
            addCriterion("Fire_HeightAll not in", values, "fireHeightall");
            return (Criteria) this;
        }

        public Criteria andFireHeightallBetween(Double value1, Double value2) {
            addCriterion("Fire_HeightAll between", value1, value2, "fireHeightall");
            return (Criteria) this;
        }

        public Criteria andFireHeightallNotBetween(Double value1, Double value2) {
            addCriterion("Fire_HeightAll not between", value1, value2, "fireHeightall");
            return (Criteria) this;
        }

        public Criteria andFogLocIsNull() {
            addCriterion("Fog_Loc is null");
            return (Criteria) this;
        }

        public Criteria andFogLocIsNotNull() {
            addCriterion("Fog_Loc is not null");
            return (Criteria) this;
        }

        public Criteria andFogLocEqualTo(String value) {
            addCriterion("Fog_Loc =", value, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocNotEqualTo(String value) {
            addCriterion("Fog_Loc <>", value, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocGreaterThan(String value) {
            addCriterion("Fog_Loc >", value, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocGreaterThanOrEqualTo(String value) {
            addCriterion("Fog_Loc >=", value, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocLessThan(String value) {
            addCriterion("Fog_Loc <", value, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocLessThanOrEqualTo(String value) {
            addCriterion("Fog_Loc <=", value, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocLike(String value) {
            addCriterion("Fog_Loc like", value, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocNotLike(String value) {
            addCriterion("Fog_Loc not like", value, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocIn(List<String> values) {
            addCriterion("Fog_Loc in", values, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocNotIn(List<String> values) {
            addCriterion("Fog_Loc not in", values, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocBetween(String value1, String value2) {
            addCriterion("Fog_Loc between", value1, value2, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogLocNotBetween(String value1, String value2) {
            addCriterion("Fog_Loc not between", value1, value2, "fogLoc");
            return (Criteria) this;
        }

        public Criteria andFogColorIsNull() {
            addCriterion("Fog_Color is null");
            return (Criteria) this;
        }

        public Criteria andFogColorIsNotNull() {
            addCriterion("Fog_Color is not null");
            return (Criteria) this;
        }

        public Criteria andFogColorEqualTo(String value) {
            addCriterion("Fog_Color =", value, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorNotEqualTo(String value) {
            addCriterion("Fog_Color <>", value, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorGreaterThan(String value) {
            addCriterion("Fog_Color >", value, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorGreaterThanOrEqualTo(String value) {
            addCriterion("Fog_Color >=", value, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorLessThan(String value) {
            addCriterion("Fog_Color <", value, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorLessThanOrEqualTo(String value) {
            addCriterion("Fog_Color <=", value, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorLike(String value) {
            addCriterion("Fog_Color like", value, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorNotLike(String value) {
            addCriterion("Fog_Color not like", value, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorIn(List<String> values) {
            addCriterion("Fog_Color in", values, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorNotIn(List<String> values) {
            addCriterion("Fog_Color not in", values, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorBetween(String value1, String value2) {
            addCriterion("Fog_Color between", value1, value2, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogColorNotBetween(String value1, String value2) {
            addCriterion("Fog_Color not between", value1, value2, "fogColor");
            return (Criteria) this;
        }

        public Criteria andFogHeightIsNull() {
            addCriterion("Fog_Height is null");
            return (Criteria) this;
        }

        public Criteria andFogHeightIsNotNull() {
            addCriterion("Fog_Height is not null");
            return (Criteria) this;
        }

        public Criteria andFogHeightEqualTo(String value) {
            addCriterion("Fog_Height =", value, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightNotEqualTo(String value) {
            addCriterion("Fog_Height <>", value, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightGreaterThan(String value) {
            addCriterion("Fog_Height >", value, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightGreaterThanOrEqualTo(String value) {
            addCriterion("Fog_Height >=", value, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightLessThan(String value) {
            addCriterion("Fog_Height <", value, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightLessThanOrEqualTo(String value) {
            addCriterion("Fog_Height <=", value, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightLike(String value) {
            addCriterion("Fog_Height like", value, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightNotLike(String value) {
            addCriterion("Fog_Height not like", value, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightIn(List<String> values) {
            addCriterion("Fog_Height in", values, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightNotIn(List<String> values) {
            addCriterion("Fog_Height not in", values, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightBetween(String value1, String value2) {
            addCriterion("Fog_Height between", value1, value2, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightNotBetween(String value1, String value2) {
            addCriterion("Fog_Height not between", value1, value2, "fogHeight");
            return (Criteria) this;
        }

        public Criteria andFogHeightallIsNull() {
            addCriterion("Fog_HeightAll is null");
            return (Criteria) this;
        }

        public Criteria andFogHeightallIsNotNull() {
            addCriterion("Fog_HeightAll is not null");
            return (Criteria) this;
        }

        public Criteria andFogHeightallEqualTo(Double value) {
            addCriterion("Fog_HeightAll =", value, "fogHeightall");
            return (Criteria) this;
        }

        public Criteria andFogHeightallNotEqualTo(Double value) {
            addCriterion("Fog_HeightAll <>", value, "fogHeightall");
            return (Criteria) this;
        }

        public Criteria andFogHeightallGreaterThan(Double value) {
            addCriterion("Fog_HeightAll >", value, "fogHeightall");
            return (Criteria) this;
        }

        public Criteria andFogHeightallGreaterThanOrEqualTo(Double value) {
            addCriterion("Fog_HeightAll >=", value, "fogHeightall");
            return (Criteria) this;
        }

        public Criteria andFogHeightallLessThan(Double value) {
            addCriterion("Fog_HeightAll <", value, "fogHeightall");
            return (Criteria) this;
        }

        public Criteria andFogHeightallLessThanOrEqualTo(Double value) {
            addCriterion("Fog_HeightAll <=", value, "fogHeightall");
            return (Criteria) this;
        }

        public Criteria andFogHeightallIn(List<Double> values) {
            addCriterion("Fog_HeightAll in", values, "fogHeightall");
            return (Criteria) this;
        }

        public Criteria andFogHeightallNotIn(List<Double> values) {
            addCriterion("Fog_HeightAll not in", values, "fogHeightall");
            return (Criteria) this;
        }

        public Criteria andFogHeightallBetween(Double value1, Double value2) {
            addCriterion("Fog_HeightAll between", value1, value2, "fogHeightall");
            return (Criteria) this;
        }

        public Criteria andFogHeightallNotBetween(Double value1, Double value2) {
            addCriterion("Fog_HeightAll not between", value1, value2, "fogHeightall");
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
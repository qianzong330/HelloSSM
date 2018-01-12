package com.zkyt.dga.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbBasePopulationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBasePopulationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andDetailaddressIsNull() {
            addCriterion("detailAddress is null");
            return (Criteria) this;
        }

        public Criteria andDetailaddressIsNotNull() {
            addCriterion("detailAddress is not null");
            return (Criteria) this;
        }

        public Criteria andDetailaddressEqualTo(String value) {
            addCriterion("detailAddress =", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotEqualTo(String value) {
            addCriterion("detailAddress <>", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressGreaterThan(String value) {
            addCriterion("detailAddress >", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("detailAddress >=", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressLessThan(String value) {
            addCriterion("detailAddress <", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressLessThanOrEqualTo(String value) {
            addCriterion("detailAddress <=", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressLike(String value) {
            addCriterion("detailAddress like", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotLike(String value) {
            addCriterion("detailAddress not like", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressIn(List<String> values) {
            addCriterion("detailAddress in", values, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotIn(List<String> values) {
            addCriterion("detailAddress not in", values, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressBetween(String value1, String value2) {
            addCriterion("detailAddress between", value1, value2, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotBetween(String value1, String value2) {
            addCriterion("detailAddress not between", value1, value2, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andMaritastatusIsNull() {
            addCriterion("maritaStatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritastatusIsNotNull() {
            addCriterion("maritaStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritastatusEqualTo(String value) {
            addCriterion("maritaStatus =", value, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusNotEqualTo(String value) {
            addCriterion("maritaStatus <>", value, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusGreaterThan(String value) {
            addCriterion("maritaStatus >", value, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusGreaterThanOrEqualTo(String value) {
            addCriterion("maritaStatus >=", value, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusLessThan(String value) {
            addCriterion("maritaStatus <", value, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusLessThanOrEqualTo(String value) {
            addCriterion("maritaStatus <=", value, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusLike(String value) {
            addCriterion("maritaStatus like", value, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusNotLike(String value) {
            addCriterion("maritaStatus not like", value, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusIn(List<String> values) {
            addCriterion("maritaStatus in", values, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusNotIn(List<String> values) {
            addCriterion("maritaStatus not in", values, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusBetween(String value1, String value2) {
            addCriterion("maritaStatus between", value1, value2, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andMaritastatusNotBetween(String value1, String value2) {
            addCriterion("maritaStatus not between", value1, value2, "maritastatus");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNull() {
            addCriterion("professional is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNotNull() {
            addCriterion("professional is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalEqualTo(String value) {
            addCriterion("professional =", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotEqualTo(String value) {
            addCriterion("professional <>", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThan(String value) {
            addCriterion("professional >", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("professional >=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThan(String value) {
            addCriterion("professional <", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThanOrEqualTo(String value) {
            addCriterion("professional <=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLike(String value) {
            addCriterion("professional like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotLike(String value) {
            addCriterion("professional not like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalIn(List<String> values) {
            addCriterion("professional in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotIn(List<String> values) {
            addCriterion("professional not in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalBetween(String value1, String value2) {
            addCriterion("professional between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotBetween(String value1, String value2) {
            addCriterion("professional not between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andIssettleIsNull() {
            addCriterion("isSettle is null");
            return (Criteria) this;
        }

        public Criteria andIssettleIsNotNull() {
            addCriterion("isSettle is not null");
            return (Criteria) this;
        }

        public Criteria andIssettleEqualTo(String value) {
            addCriterion("isSettle =", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleNotEqualTo(String value) {
            addCriterion("isSettle <>", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleGreaterThan(String value) {
            addCriterion("isSettle >", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleGreaterThanOrEqualTo(String value) {
            addCriterion("isSettle >=", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleLessThan(String value) {
            addCriterion("isSettle <", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleLessThanOrEqualTo(String value) {
            addCriterion("isSettle <=", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleLike(String value) {
            addCriterion("isSettle like", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleNotLike(String value) {
            addCriterion("isSettle not like", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleIn(List<String> values) {
            addCriterion("isSettle in", values, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleNotIn(List<String> values) {
            addCriterion("isSettle not in", values, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleBetween(String value1, String value2) {
            addCriterion("isSettle between", value1, value2, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleNotBetween(String value1, String value2) {
            addCriterion("isSettle not between", value1, value2, "issettle");
            return (Criteria) this;
        }

        public Criteria andRegistdateIsNull() {
            addCriterion("registDate is null");
            return (Criteria) this;
        }

        public Criteria andRegistdateIsNotNull() {
            addCriterion("registDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistdateEqualTo(String value) {
            addCriterion("registDate =", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotEqualTo(String value) {
            addCriterion("registDate <>", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateGreaterThan(String value) {
            addCriterion("registDate >", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateGreaterThanOrEqualTo(String value) {
            addCriterion("registDate >=", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLessThan(String value) {
            addCriterion("registDate <", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLessThanOrEqualTo(String value) {
            addCriterion("registDate <=", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLike(String value) {
            addCriterion("registDate like", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotLike(String value) {
            addCriterion("registDate not like", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateIn(List<String> values) {
            addCriterion("registDate in", values, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotIn(List<String> values) {
            addCriterion("registDate not in", values, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateBetween(String value1, String value2) {
            addCriterion("registDate between", value1, value2, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotBetween(String value1, String value2) {
            addCriterion("registDate not between", value1, value2, "registdate");
            return (Criteria) this;
        }

        public Criteria andTempaddressIsNull() {
            addCriterion("tempAddress is null");
            return (Criteria) this;
        }

        public Criteria andTempaddressIsNotNull() {
            addCriterion("tempAddress is not null");
            return (Criteria) this;
        }

        public Criteria andTempaddressEqualTo(String value) {
            addCriterion("tempAddress =", value, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressNotEqualTo(String value) {
            addCriterion("tempAddress <>", value, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressGreaterThan(String value) {
            addCriterion("tempAddress >", value, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressGreaterThanOrEqualTo(String value) {
            addCriterion("tempAddress >=", value, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressLessThan(String value) {
            addCriterion("tempAddress <", value, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressLessThanOrEqualTo(String value) {
            addCriterion("tempAddress <=", value, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressLike(String value) {
            addCriterion("tempAddress like", value, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressNotLike(String value) {
            addCriterion("tempAddress not like", value, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressIn(List<String> values) {
            addCriterion("tempAddress in", values, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressNotIn(List<String> values) {
            addCriterion("tempAddress not in", values, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressBetween(String value1, String value2) {
            addCriterion("tempAddress between", value1, value2, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andTempaddressNotBetween(String value1, String value2) {
            addCriterion("tempAddress not between", value1, value2, "tempaddress");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonIsNull() {
            addCriterion("isOverseaPerson is null");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonIsNotNull() {
            addCriterion("isOverseaPerson is not null");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonEqualTo(String value) {
            addCriterion("isOverseaPerson =", value, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonNotEqualTo(String value) {
            addCriterion("isOverseaPerson <>", value, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonGreaterThan(String value) {
            addCriterion("isOverseaPerson >", value, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonGreaterThanOrEqualTo(String value) {
            addCriterion("isOverseaPerson >=", value, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonLessThan(String value) {
            addCriterion("isOverseaPerson <", value, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonLessThanOrEqualTo(String value) {
            addCriterion("isOverseaPerson <=", value, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonLike(String value) {
            addCriterion("isOverseaPerson like", value, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonNotLike(String value) {
            addCriterion("isOverseaPerson not like", value, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonIn(List<String> values) {
            addCriterion("isOverseaPerson in", values, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonNotIn(List<String> values) {
            addCriterion("isOverseaPerson not in", values, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonBetween(String value1, String value2) {
            addCriterion("isOverseaPerson between", value1, value2, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andIsoverseapersonNotBetween(String value1, String value2) {
            addCriterion("isOverseaPerson not between", value1, value2, "isoverseaperson");
            return (Criteria) this;
        }

        public Criteria andEntrydateIsNull() {
            addCriterion("entryDate is null");
            return (Criteria) this;
        }

        public Criteria andEntrydateIsNotNull() {
            addCriterion("entryDate is not null");
            return (Criteria) this;
        }

        public Criteria andEntrydateEqualTo(String value) {
            addCriterion("entryDate =", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotEqualTo(String value) {
            addCriterion("entryDate <>", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateGreaterThan(String value) {
            addCriterion("entryDate >", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateGreaterThanOrEqualTo(String value) {
            addCriterion("entryDate >=", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLessThan(String value) {
            addCriterion("entryDate <", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLessThanOrEqualTo(String value) {
            addCriterion("entryDate <=", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLike(String value) {
            addCriterion("entryDate like", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotLike(String value) {
            addCriterion("entryDate not like", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateIn(List<String> values) {
            addCriterion("entryDate in", values, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotIn(List<String> values) {
            addCriterion("entryDate not in", values, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateBetween(String value1, String value2) {
            addCriterion("entryDate between", value1, value2, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotBetween(String value1, String value2) {
            addCriterion("entryDate not between", value1, value2, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntryportIsNull() {
            addCriterion("entryPort is null");
            return (Criteria) this;
        }

        public Criteria andEntryportIsNotNull() {
            addCriterion("entryPort is not null");
            return (Criteria) this;
        }

        public Criteria andEntryportEqualTo(String value) {
            addCriterion("entryPort =", value, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportNotEqualTo(String value) {
            addCriterion("entryPort <>", value, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportGreaterThan(String value) {
            addCriterion("entryPort >", value, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportGreaterThanOrEqualTo(String value) {
            addCriterion("entryPort >=", value, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportLessThan(String value) {
            addCriterion("entryPort <", value, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportLessThanOrEqualTo(String value) {
            addCriterion("entryPort <=", value, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportLike(String value) {
            addCriterion("entryPort like", value, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportNotLike(String value) {
            addCriterion("entryPort not like", value, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportIn(List<String> values) {
            addCriterion("entryPort in", values, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportNotIn(List<String> values) {
            addCriterion("entryPort not in", values, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportBetween(String value1, String value2) {
            addCriterion("entryPort between", value1, value2, "entryport");
            return (Criteria) this;
        }

        public Criteria andEntryportNotBetween(String value1, String value2) {
            addCriterion("entryPort not between", value1, value2, "entryport");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNull() {
            addCriterion("houseId is null");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNotNull() {
            addCriterion("houseId is not null");
            return (Criteria) this;
        }

        public Criteria andHouseidEqualTo(String value) {
            addCriterion("houseId =", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotEqualTo(String value) {
            addCriterion("houseId <>", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThan(String value) {
            addCriterion("houseId >", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThanOrEqualTo(String value) {
            addCriterion("houseId >=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThan(String value) {
            addCriterion("houseId <", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThanOrEqualTo(String value) {
            addCriterion("houseId <=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLike(String value) {
            addCriterion("houseId like", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotLike(String value) {
            addCriterion("houseId not like", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidIn(List<String> values) {
            addCriterion("houseId in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotIn(List<String> values) {
            addCriterion("houseId not in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidBetween(String value1, String value2) {
            addCriterion("houseId between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotBetween(String value1, String value2) {
            addCriterion("houseId not between", value1, value2, "houseid");
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
package com.zkyt.dga.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbBaseUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBaseUnitExample() {
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

        public Criteria andUnitnameIsNull() {
            addCriterion("unitName is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("unitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("unitName =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("unitName <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("unitName >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("unitName >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("unitName <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("unitName <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("unitName like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("unitName not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("unitName in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("unitName not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("unitName between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("unitName not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneIsNull() {
            addCriterion("unitTelephone is null");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneIsNotNull() {
            addCriterion("unitTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneEqualTo(String value) {
            addCriterion("unitTelephone =", value, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneNotEqualTo(String value) {
            addCriterion("unitTelephone <>", value, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneGreaterThan(String value) {
            addCriterion("unitTelephone >", value, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("unitTelephone >=", value, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneLessThan(String value) {
            addCriterion("unitTelephone <", value, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneLessThanOrEqualTo(String value) {
            addCriterion("unitTelephone <=", value, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneLike(String value) {
            addCriterion("unitTelephone like", value, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneNotLike(String value) {
            addCriterion("unitTelephone not like", value, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneIn(List<String> values) {
            addCriterion("unitTelephone in", values, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneNotIn(List<String> values) {
            addCriterion("unitTelephone not in", values, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneBetween(String value1, String value2) {
            addCriterion("unitTelephone between", value1, value2, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnittelephoneNotBetween(String value1, String value2) {
            addCriterion("unitTelephone not between", value1, value2, "unittelephone");
            return (Criteria) this;
        }

        public Criteria andUnitadddressIsNull() {
            addCriterion("unitAdddress is null");
            return (Criteria) this;
        }

        public Criteria andUnitadddressIsNotNull() {
            addCriterion("unitAdddress is not null");
            return (Criteria) this;
        }

        public Criteria andUnitadddressEqualTo(String value) {
            addCriterion("unitAdddress =", value, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressNotEqualTo(String value) {
            addCriterion("unitAdddress <>", value, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressGreaterThan(String value) {
            addCriterion("unitAdddress >", value, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressGreaterThanOrEqualTo(String value) {
            addCriterion("unitAdddress >=", value, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressLessThan(String value) {
            addCriterion("unitAdddress <", value, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressLessThanOrEqualTo(String value) {
            addCriterion("unitAdddress <=", value, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressLike(String value) {
            addCriterion("unitAdddress like", value, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressNotLike(String value) {
            addCriterion("unitAdddress not like", value, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressIn(List<String> values) {
            addCriterion("unitAdddress in", values, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressNotIn(List<String> values) {
            addCriterion("unitAdddress not in", values, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressBetween(String value1, String value2) {
            addCriterion("unitAdddress between", value1, value2, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andUnitadddressNotBetween(String value1, String value2) {
            addCriterion("unitAdddress not between", value1, value2, "unitadddress");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoIsNull() {
            addCriterion("businessLicenseNo is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoIsNotNull() {
            addCriterion("businessLicenseNo is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoEqualTo(String value) {
            addCriterion("businessLicenseNo =", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoNotEqualTo(String value) {
            addCriterion("businessLicenseNo <>", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoGreaterThan(String value) {
            addCriterion("businessLicenseNo >", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoGreaterThanOrEqualTo(String value) {
            addCriterion("businessLicenseNo >=", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoLessThan(String value) {
            addCriterion("businessLicenseNo <", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoLessThanOrEqualTo(String value) {
            addCriterion("businessLicenseNo <=", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoLike(String value) {
            addCriterion("businessLicenseNo like", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoNotLike(String value) {
            addCriterion("businessLicenseNo not like", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoIn(List<String> values) {
            addCriterion("businessLicenseNo in", values, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoNotIn(List<String> values) {
            addCriterion("businessLicenseNo not in", values, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoBetween(String value1, String value2) {
            addCriterion("businessLicenseNo between", value1, value2, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoNotBetween(String value1, String value2) {
            addCriterion("businessLicenseNo not between", value1, value2, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andLegalnameIsNull() {
            addCriterion("legalName is null");
            return (Criteria) this;
        }

        public Criteria andLegalnameIsNotNull() {
            addCriterion("legalName is not null");
            return (Criteria) this;
        }

        public Criteria andLegalnameEqualTo(String value) {
            addCriterion("legalName =", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameNotEqualTo(String value) {
            addCriterion("legalName <>", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameGreaterThan(String value) {
            addCriterion("legalName >", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameGreaterThanOrEqualTo(String value) {
            addCriterion("legalName >=", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameLessThan(String value) {
            addCriterion("legalName <", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameLessThanOrEqualTo(String value) {
            addCriterion("legalName <=", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameLike(String value) {
            addCriterion("legalName like", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameNotLike(String value) {
            addCriterion("legalName not like", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameIn(List<String> values) {
            addCriterion("legalName in", values, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameNotIn(List<String> values) {
            addCriterion("legalName not in", values, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameBetween(String value1, String value2) {
            addCriterion("legalName between", value1, value2, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameNotBetween(String value1, String value2) {
            addCriterion("legalName not between", value1, value2, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneIsNull() {
            addCriterion("legalTelephone is null");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneIsNotNull() {
            addCriterion("legalTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneEqualTo(String value) {
            addCriterion("legalTelephone =", value, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneNotEqualTo(String value) {
            addCriterion("legalTelephone <>", value, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneGreaterThan(String value) {
            addCriterion("legalTelephone >", value, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("legalTelephone >=", value, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneLessThan(String value) {
            addCriterion("legalTelephone <", value, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneLessThanOrEqualTo(String value) {
            addCriterion("legalTelephone <=", value, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneLike(String value) {
            addCriterion("legalTelephone like", value, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneNotLike(String value) {
            addCriterion("legalTelephone not like", value, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneIn(List<String> values) {
            addCriterion("legalTelephone in", values, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneNotIn(List<String> values) {
            addCriterion("legalTelephone not in", values, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneBetween(String value1, String value2) {
            addCriterion("legalTelephone between", value1, value2, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegaltelephoneNotBetween(String value1, String value2) {
            addCriterion("legalTelephone not between", value1, value2, "legaltelephone");
            return (Criteria) this;
        }

        public Criteria andLegalidcardIsNull() {
            addCriterion("legalIdCard is null");
            return (Criteria) this;
        }

        public Criteria andLegalidcardIsNotNull() {
            addCriterion("legalIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andLegalidcardEqualTo(String value) {
            addCriterion("legalIdCard =", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardNotEqualTo(String value) {
            addCriterion("legalIdCard <>", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardGreaterThan(String value) {
            addCriterion("legalIdCard >", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardGreaterThanOrEqualTo(String value) {
            addCriterion("legalIdCard >=", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardLessThan(String value) {
            addCriterion("legalIdCard <", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardLessThanOrEqualTo(String value) {
            addCriterion("legalIdCard <=", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardLike(String value) {
            addCriterion("legalIdCard like", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardNotLike(String value) {
            addCriterion("legalIdCard not like", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardIn(List<String> values) {
            addCriterion("legalIdCard in", values, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardNotIn(List<String> values) {
            addCriterion("legalIdCard not in", values, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardBetween(String value1, String value2) {
            addCriterion("legalIdCard between", value1, value2, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardNotBetween(String value1, String value2) {
            addCriterion("legalIdCard not between", value1, value2, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andActualoperatorIsNull() {
            addCriterion("ActualOperator is null");
            return (Criteria) this;
        }

        public Criteria andActualoperatorIsNotNull() {
            addCriterion("ActualOperator is not null");
            return (Criteria) this;
        }

        public Criteria andActualoperatorEqualTo(String value) {
            addCriterion("ActualOperator =", value, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorNotEqualTo(String value) {
            addCriterion("ActualOperator <>", value, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorGreaterThan(String value) {
            addCriterion("ActualOperator >", value, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorGreaterThanOrEqualTo(String value) {
            addCriterion("ActualOperator >=", value, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorLessThan(String value) {
            addCriterion("ActualOperator <", value, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorLessThanOrEqualTo(String value) {
            addCriterion("ActualOperator <=", value, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorLike(String value) {
            addCriterion("ActualOperator like", value, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorNotLike(String value) {
            addCriterion("ActualOperator not like", value, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorIn(List<String> values) {
            addCriterion("ActualOperator in", values, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorNotIn(List<String> values) {
            addCriterion("ActualOperator not in", values, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorBetween(String value1, String value2) {
            addCriterion("ActualOperator between", value1, value2, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andActualoperatorNotBetween(String value1, String value2) {
            addCriterion("ActualOperator not between", value1, value2, "actualoperator");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryIsNull() {
            addCriterion("industryCategory is null");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryIsNotNull() {
            addCriterion("industryCategory is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryEqualTo(String value) {
            addCriterion("industryCategory =", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryNotEqualTo(String value) {
            addCriterion("industryCategory <>", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryGreaterThan(String value) {
            addCriterion("industryCategory >", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryGreaterThanOrEqualTo(String value) {
            addCriterion("industryCategory >=", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryLessThan(String value) {
            addCriterion("industryCategory <", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryLessThanOrEqualTo(String value) {
            addCriterion("industryCategory <=", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryLike(String value) {
            addCriterion("industryCategory like", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryNotLike(String value) {
            addCriterion("industryCategory not like", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryIn(List<String> values) {
            addCriterion("industryCategory in", values, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryNotIn(List<String> values) {
            addCriterion("industryCategory not in", values, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryBetween(String value1, String value2) {
            addCriterion("industryCategory between", value1, value2, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryNotBetween(String value1, String value2) {
            addCriterion("industryCategory not between", value1, value2, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIsNull() {
            addCriterion("businessScope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIsNotNull() {
            addCriterion("businessScope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeEqualTo(String value) {
            addCriterion("businessScope =", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotEqualTo(String value) {
            addCriterion("businessScope <>", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeGreaterThan(String value) {
            addCriterion("businessScope >", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeGreaterThanOrEqualTo(String value) {
            addCriterion("businessScope >=", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLessThan(String value) {
            addCriterion("businessScope <", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLessThanOrEqualTo(String value) {
            addCriterion("businessScope <=", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLike(String value) {
            addCriterion("businessScope like", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotLike(String value) {
            addCriterion("businessScope not like", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIn(List<String> values) {
            addCriterion("businessScope in", values, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotIn(List<String> values) {
            addCriterion("businessScope not in", values, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeBetween(String value1, String value2) {
            addCriterion("businessScope between", value1, value2, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotBetween(String value1, String value2) {
            addCriterion("businessScope not between", value1, value2, "businessscope");
            return (Criteria) this;
        }

        public Criteria andStartlicenseIsNull() {
            addCriterion("startLicense is null");
            return (Criteria) this;
        }

        public Criteria andStartlicenseIsNotNull() {
            addCriterion("startLicense is not null");
            return (Criteria) this;
        }

        public Criteria andStartlicenseEqualTo(String value) {
            addCriterion("startLicense =", value, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseNotEqualTo(String value) {
            addCriterion("startLicense <>", value, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseGreaterThan(String value) {
            addCriterion("startLicense >", value, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseGreaterThanOrEqualTo(String value) {
            addCriterion("startLicense >=", value, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseLessThan(String value) {
            addCriterion("startLicense <", value, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseLessThanOrEqualTo(String value) {
            addCriterion("startLicense <=", value, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseLike(String value) {
            addCriterion("startLicense like", value, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseNotLike(String value) {
            addCriterion("startLicense not like", value, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseIn(List<String> values) {
            addCriterion("startLicense in", values, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseNotIn(List<String> values) {
            addCriterion("startLicense not in", values, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseBetween(String value1, String value2) {
            addCriterion("startLicense between", value1, value2, "startlicense");
            return (Criteria) this;
        }

        public Criteria andStartlicenseNotBetween(String value1, String value2) {
            addCriterion("startLicense not between", value1, value2, "startlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseIsNull() {
            addCriterion("endLicense is null");
            return (Criteria) this;
        }

        public Criteria andEndlicenseIsNotNull() {
            addCriterion("endLicense is not null");
            return (Criteria) this;
        }

        public Criteria andEndlicenseEqualTo(String value) {
            addCriterion("endLicense =", value, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseNotEqualTo(String value) {
            addCriterion("endLicense <>", value, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseGreaterThan(String value) {
            addCriterion("endLicense >", value, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseGreaterThanOrEqualTo(String value) {
            addCriterion("endLicense >=", value, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseLessThan(String value) {
            addCriterion("endLicense <", value, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseLessThanOrEqualTo(String value) {
            addCriterion("endLicense <=", value, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseLike(String value) {
            addCriterion("endLicense like", value, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseNotLike(String value) {
            addCriterion("endLicense not like", value, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseIn(List<String> values) {
            addCriterion("endLicense in", values, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseNotIn(List<String> values) {
            addCriterion("endLicense not in", values, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseBetween(String value1, String value2) {
            addCriterion("endLicense between", value1, value2, "endlicense");
            return (Criteria) this;
        }

        public Criteria andEndlicenseNotBetween(String value1, String value2) {
            addCriterion("endLicense not between", value1, value2, "endlicense");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNull() {
            addCriterion("taxNo is null");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNotNull() {
            addCriterion("taxNo is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnoEqualTo(String value) {
            addCriterion("taxNo =", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotEqualTo(String value) {
            addCriterion("taxNo <>", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThan(String value) {
            addCriterion("taxNo >", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("taxNo >=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThan(String value) {
            addCriterion("taxNo <", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThanOrEqualTo(String value) {
            addCriterion("taxNo <=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLike(String value) {
            addCriterion("taxNo like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotLike(String value) {
            addCriterion("taxNo not like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoIn(List<String> values) {
            addCriterion("taxNo in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotIn(List<String> values) {
            addCriterion("taxNo not in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoBetween(String value1, String value2) {
            addCriterion("taxNo between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotBetween(String value1, String value2) {
            addCriterion("taxNo not between", value1, value2, "taxno");
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
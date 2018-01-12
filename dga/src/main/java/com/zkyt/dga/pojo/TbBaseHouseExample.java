package com.zkyt.dga.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbBaseHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBaseHouseExample() {
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

        public Criteria andIstowncountryIsNull() {
            addCriterion("isTownCountry is null");
            return (Criteria) this;
        }

        public Criteria andIstowncountryIsNotNull() {
            addCriterion("isTownCountry is not null");
            return (Criteria) this;
        }

        public Criteria andIstowncountryEqualTo(String value) {
            addCriterion("isTownCountry =", value, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryNotEqualTo(String value) {
            addCriterion("isTownCountry <>", value, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryGreaterThan(String value) {
            addCriterion("isTownCountry >", value, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryGreaterThanOrEqualTo(String value) {
            addCriterion("isTownCountry >=", value, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryLessThan(String value) {
            addCriterion("isTownCountry <", value, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryLessThanOrEqualTo(String value) {
            addCriterion("isTownCountry <=", value, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryLike(String value) {
            addCriterion("isTownCountry like", value, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryNotLike(String value) {
            addCriterion("isTownCountry not like", value, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryIn(List<String> values) {
            addCriterion("isTownCountry in", values, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryNotIn(List<String> values) {
            addCriterion("isTownCountry not in", values, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryBetween(String value1, String value2) {
            addCriterion("isTownCountry between", value1, value2, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andIstowncountryNotBetween(String value1, String value2) {
            addCriterion("isTownCountry not between", value1, value2, "istowncountry");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieIsNull() {
            addCriterion("buildPropertie is null");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieIsNotNull() {
            addCriterion("buildPropertie is not null");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieEqualTo(String value) {
            addCriterion("buildPropertie =", value, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieNotEqualTo(String value) {
            addCriterion("buildPropertie <>", value, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieGreaterThan(String value) {
            addCriterion("buildPropertie >", value, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieGreaterThanOrEqualTo(String value) {
            addCriterion("buildPropertie >=", value, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieLessThan(String value) {
            addCriterion("buildPropertie <", value, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieLessThanOrEqualTo(String value) {
            addCriterion("buildPropertie <=", value, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieLike(String value) {
            addCriterion("buildPropertie like", value, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieNotLike(String value) {
            addCriterion("buildPropertie not like", value, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieIn(List<String> values) {
            addCriterion("buildPropertie in", values, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieNotIn(List<String> values) {
            addCriterion("buildPropertie not in", values, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieBetween(String value1, String value2) {
            addCriterion("buildPropertie between", value1, value2, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andBuildpropertieNotBetween(String value1, String value2) {
            addCriterion("buildPropertie not between", value1, value2, "buildpropertie");
            return (Criteria) this;
        }

        public Criteria andUnitnoIsNull() {
            addCriterion("unitNo is null");
            return (Criteria) this;
        }

        public Criteria andUnitnoIsNotNull() {
            addCriterion("unitNo is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnoEqualTo(String value) {
            addCriterion("unitNo =", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoNotEqualTo(String value) {
            addCriterion("unitNo <>", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoGreaterThan(String value) {
            addCriterion("unitNo >", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoGreaterThanOrEqualTo(String value) {
            addCriterion("unitNo >=", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoLessThan(String value) {
            addCriterion("unitNo <", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoLessThanOrEqualTo(String value) {
            addCriterion("unitNo <=", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoLike(String value) {
            addCriterion("unitNo like", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoNotLike(String value) {
            addCriterion("unitNo not like", value, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoIn(List<String> values) {
            addCriterion("unitNo in", values, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoNotIn(List<String> values) {
            addCriterion("unitNo not in", values, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoBetween(String value1, String value2) {
            addCriterion("unitNo between", value1, value2, "unitno");
            return (Criteria) this;
        }

        public Criteria andUnitnoNotBetween(String value1, String value2) {
            addCriterion("unitNo not between", value1, value2, "unitno");
            return (Criteria) this;
        }

        public Criteria andMaxfloorIsNull() {
            addCriterion("maxFloor is null");
            return (Criteria) this;
        }

        public Criteria andMaxfloorIsNotNull() {
            addCriterion("maxFloor is not null");
            return (Criteria) this;
        }

        public Criteria andMaxfloorEqualTo(String value) {
            addCriterion("maxFloor =", value, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorNotEqualTo(String value) {
            addCriterion("maxFloor <>", value, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorGreaterThan(String value) {
            addCriterion("maxFloor >", value, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorGreaterThanOrEqualTo(String value) {
            addCriterion("maxFloor >=", value, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorLessThan(String value) {
            addCriterion("maxFloor <", value, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorLessThanOrEqualTo(String value) {
            addCriterion("maxFloor <=", value, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorLike(String value) {
            addCriterion("maxFloor like", value, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorNotLike(String value) {
            addCriterion("maxFloor not like", value, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorIn(List<String> values) {
            addCriterion("maxFloor in", values, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorNotIn(List<String> values) {
            addCriterion("maxFloor not in", values, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorBetween(String value1, String value2) {
            addCriterion("maxFloor between", value1, value2, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andMaxfloorNotBetween(String value1, String value2) {
            addCriterion("maxFloor not between", value1, value2, "maxfloor");
            return (Criteria) this;
        }

        public Criteria andUnitcountIsNull() {
            addCriterion("unitCount is null");
            return (Criteria) this;
        }

        public Criteria andUnitcountIsNotNull() {
            addCriterion("unitCount is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcountEqualTo(String value) {
            addCriterion("unitCount =", value, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountNotEqualTo(String value) {
            addCriterion("unitCount <>", value, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountGreaterThan(String value) {
            addCriterion("unitCount >", value, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountGreaterThanOrEqualTo(String value) {
            addCriterion("unitCount >=", value, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountLessThan(String value) {
            addCriterion("unitCount <", value, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountLessThanOrEqualTo(String value) {
            addCriterion("unitCount <=", value, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountLike(String value) {
            addCriterion("unitCount like", value, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountNotLike(String value) {
            addCriterion("unitCount not like", value, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountIn(List<String> values) {
            addCriterion("unitCount in", values, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountNotIn(List<String> values) {
            addCriterion("unitCount not in", values, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountBetween(String value1, String value2) {
            addCriterion("unitCount between", value1, value2, "unitcount");
            return (Criteria) this;
        }

        public Criteria andUnitcountNotBetween(String value1, String value2) {
            addCriterion("unitCount not between", value1, value2, "unitcount");
            return (Criteria) this;
        }

        public Criteria andFloornoIsNull() {
            addCriterion("floorNo is null");
            return (Criteria) this;
        }

        public Criteria andFloornoIsNotNull() {
            addCriterion("floorNo is not null");
            return (Criteria) this;
        }

        public Criteria andFloornoEqualTo(String value) {
            addCriterion("floorNo =", value, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoNotEqualTo(String value) {
            addCriterion("floorNo <>", value, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoGreaterThan(String value) {
            addCriterion("floorNo >", value, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoGreaterThanOrEqualTo(String value) {
            addCriterion("floorNo >=", value, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoLessThan(String value) {
            addCriterion("floorNo <", value, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoLessThanOrEqualTo(String value) {
            addCriterion("floorNo <=", value, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoLike(String value) {
            addCriterion("floorNo like", value, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoNotLike(String value) {
            addCriterion("floorNo not like", value, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoIn(List<String> values) {
            addCriterion("floorNo in", values, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoNotIn(List<String> values) {
            addCriterion("floorNo not in", values, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoBetween(String value1, String value2) {
            addCriterion("floorNo between", value1, value2, "floorno");
            return (Criteria) this;
        }

        public Criteria andFloornoNotBetween(String value1, String value2) {
            addCriterion("floorNo not between", value1, value2, "floorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoIsNull() {
            addCriterion("mallFloorNo is null");
            return (Criteria) this;
        }

        public Criteria andMallfloornoIsNotNull() {
            addCriterion("mallFloorNo is not null");
            return (Criteria) this;
        }

        public Criteria andMallfloornoEqualTo(String value) {
            addCriterion("mallFloorNo =", value, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoNotEqualTo(String value) {
            addCriterion("mallFloorNo <>", value, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoGreaterThan(String value) {
            addCriterion("mallFloorNo >", value, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoGreaterThanOrEqualTo(String value) {
            addCriterion("mallFloorNo >=", value, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoLessThan(String value) {
            addCriterion("mallFloorNo <", value, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoLessThanOrEqualTo(String value) {
            addCriterion("mallFloorNo <=", value, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoLike(String value) {
            addCriterion("mallFloorNo like", value, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoNotLike(String value) {
            addCriterion("mallFloorNo not like", value, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoIn(List<String> values) {
            addCriterion("mallFloorNo in", values, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoNotIn(List<String> values) {
            addCriterion("mallFloorNo not in", values, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoBetween(String value1, String value2) {
            addCriterion("mallFloorNo between", value1, value2, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andMallfloornoNotBetween(String value1, String value2) {
            addCriterion("mallFloorNo not between", value1, value2, "mallfloorno");
            return (Criteria) this;
        }

        public Criteria andShopperfloorIsNull() {
            addCriterion("shopPerFloor is null");
            return (Criteria) this;
        }

        public Criteria andShopperfloorIsNotNull() {
            addCriterion("shopPerFloor is not null");
            return (Criteria) this;
        }

        public Criteria andShopperfloorEqualTo(String value) {
            addCriterion("shopPerFloor =", value, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorNotEqualTo(String value) {
            addCriterion("shopPerFloor <>", value, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorGreaterThan(String value) {
            addCriterion("shopPerFloor >", value, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorGreaterThanOrEqualTo(String value) {
            addCriterion("shopPerFloor >=", value, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorLessThan(String value) {
            addCriterion("shopPerFloor <", value, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorLessThanOrEqualTo(String value) {
            addCriterion("shopPerFloor <=", value, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorLike(String value) {
            addCriterion("shopPerFloor like", value, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorNotLike(String value) {
            addCriterion("shopPerFloor not like", value, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorIn(List<String> values) {
            addCriterion("shopPerFloor in", values, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorNotIn(List<String> values) {
            addCriterion("shopPerFloor not in", values, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorBetween(String value1, String value2) {
            addCriterion("shopPerFloor between", value1, value2, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andShopperfloorNotBetween(String value1, String value2) {
            addCriterion("shopPerFloor not between", value1, value2, "shopperfloor");
            return (Criteria) this;
        }

        public Criteria andMallnoIsNull() {
            addCriterion("mallNo is null");
            return (Criteria) this;
        }

        public Criteria andMallnoIsNotNull() {
            addCriterion("mallNo is not null");
            return (Criteria) this;
        }

        public Criteria andMallnoEqualTo(String value) {
            addCriterion("mallNo =", value, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoNotEqualTo(String value) {
            addCriterion("mallNo <>", value, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoGreaterThan(String value) {
            addCriterion("mallNo >", value, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoGreaterThanOrEqualTo(String value) {
            addCriterion("mallNo >=", value, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoLessThan(String value) {
            addCriterion("mallNo <", value, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoLessThanOrEqualTo(String value) {
            addCriterion("mallNo <=", value, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoLike(String value) {
            addCriterion("mallNo like", value, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoNotLike(String value) {
            addCriterion("mallNo not like", value, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoIn(List<String> values) {
            addCriterion("mallNo in", values, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoNotIn(List<String> values) {
            addCriterion("mallNo not in", values, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoBetween(String value1, String value2) {
            addCriterion("mallNo between", value1, value2, "mallno");
            return (Criteria) this;
        }

        public Criteria andMallnoNotBetween(String value1, String value2) {
            addCriterion("mallNo not between", value1, value2, "mallno");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorIsNull() {
            addCriterion("numOfBaseFloor is null");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorIsNotNull() {
            addCriterion("numOfBaseFloor is not null");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorEqualTo(String value) {
            addCriterion("numOfBaseFloor =", value, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorNotEqualTo(String value) {
            addCriterion("numOfBaseFloor <>", value, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorGreaterThan(String value) {
            addCriterion("numOfBaseFloor >", value, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorGreaterThanOrEqualTo(String value) {
            addCriterion("numOfBaseFloor >=", value, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorLessThan(String value) {
            addCriterion("numOfBaseFloor <", value, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorLessThanOrEqualTo(String value) {
            addCriterion("numOfBaseFloor <=", value, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorLike(String value) {
            addCriterion("numOfBaseFloor like", value, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorNotLike(String value) {
            addCriterion("numOfBaseFloor not like", value, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorIn(List<String> values) {
            addCriterion("numOfBaseFloor in", values, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorNotIn(List<String> values) {
            addCriterion("numOfBaseFloor not in", values, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorBetween(String value1, String value2) {
            addCriterion("numOfBaseFloor between", value1, value2, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andNumofbasefloorNotBetween(String value1, String value2) {
            addCriterion("numOfBaseFloor not between", value1, value2, "numofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorIsNull() {
            addCriterion("countOfBaseFloor is null");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorIsNotNull() {
            addCriterion("countOfBaseFloor is not null");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorEqualTo(String value) {
            addCriterion("countOfBaseFloor =", value, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorNotEqualTo(String value) {
            addCriterion("countOfBaseFloor <>", value, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorGreaterThan(String value) {
            addCriterion("countOfBaseFloor >", value, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorGreaterThanOrEqualTo(String value) {
            addCriterion("countOfBaseFloor >=", value, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorLessThan(String value) {
            addCriterion("countOfBaseFloor <", value, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorLessThanOrEqualTo(String value) {
            addCriterion("countOfBaseFloor <=", value, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorLike(String value) {
            addCriterion("countOfBaseFloor like", value, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorNotLike(String value) {
            addCriterion("countOfBaseFloor not like", value, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorIn(List<String> values) {
            addCriterion("countOfBaseFloor in", values, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorNotIn(List<String> values) {
            addCriterion("countOfBaseFloor not in", values, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorBetween(String value1, String value2) {
            addCriterion("countOfBaseFloor between", value1, value2, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andCountofbasefloorNotBetween(String value1, String value2) {
            addCriterion("countOfBaseFloor not between", value1, value2, "countofbasefloor");
            return (Criteria) this;
        }

        public Criteria andMonitorcountIsNull() {
            addCriterion("monitorCount is null");
            return (Criteria) this;
        }

        public Criteria andMonitorcountIsNotNull() {
            addCriterion("monitorCount is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorcountEqualTo(String value) {
            addCriterion("monitorCount =", value, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountNotEqualTo(String value) {
            addCriterion("monitorCount <>", value, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountGreaterThan(String value) {
            addCriterion("monitorCount >", value, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountGreaterThanOrEqualTo(String value) {
            addCriterion("monitorCount >=", value, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountLessThan(String value) {
            addCriterion("monitorCount <", value, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountLessThanOrEqualTo(String value) {
            addCriterion("monitorCount <=", value, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountLike(String value) {
            addCriterion("monitorCount like", value, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountNotLike(String value) {
            addCriterion("monitorCount not like", value, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountIn(List<String> values) {
            addCriterion("monitorCount in", values, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountNotIn(List<String> values) {
            addCriterion("monitorCount not in", values, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountBetween(String value1, String value2) {
            addCriterion("monitorCount between", value1, value2, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitorcountNotBetween(String value1, String value2) {
            addCriterion("monitorCount not between", value1, value2, "monitorcount");
            return (Criteria) this;
        }

        public Criteria andMonitornatureIsNull() {
            addCriterion("monitorNature is null");
            return (Criteria) this;
        }

        public Criteria andMonitornatureIsNotNull() {
            addCriterion("monitorNature is not null");
            return (Criteria) this;
        }

        public Criteria andMonitornatureEqualTo(String value) {
            addCriterion("monitorNature =", value, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureNotEqualTo(String value) {
            addCriterion("monitorNature <>", value, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureGreaterThan(String value) {
            addCriterion("monitorNature >", value, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureGreaterThanOrEqualTo(String value) {
            addCriterion("monitorNature >=", value, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureLessThan(String value) {
            addCriterion("monitorNature <", value, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureLessThanOrEqualTo(String value) {
            addCriterion("monitorNature <=", value, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureLike(String value) {
            addCriterion("monitorNature like", value, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureNotLike(String value) {
            addCriterion("monitorNature not like", value, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureIn(List<String> values) {
            addCriterion("monitorNature in", values, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureNotIn(List<String> values) {
            addCriterion("monitorNature not in", values, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureBetween(String value1, String value2) {
            addCriterion("monitorNature between", value1, value2, "monitornature");
            return (Criteria) this;
        }

        public Criteria andMonitornatureNotBetween(String value1, String value2) {
            addCriterion("monitorNature not between", value1, value2, "monitornature");
            return (Criteria) this;
        }

        public Criteria andIsnetIsNull() {
            addCriterion("isNet is null");
            return (Criteria) this;
        }

        public Criteria andIsnetIsNotNull() {
            addCriterion("isNet is not null");
            return (Criteria) this;
        }

        public Criteria andIsnetEqualTo(String value) {
            addCriterion("isNet =", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetNotEqualTo(String value) {
            addCriterion("isNet <>", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetGreaterThan(String value) {
            addCriterion("isNet >", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetGreaterThanOrEqualTo(String value) {
            addCriterion("isNet >=", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetLessThan(String value) {
            addCriterion("isNet <", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetLessThanOrEqualTo(String value) {
            addCriterion("isNet <=", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetLike(String value) {
            addCriterion("isNet like", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetNotLike(String value) {
            addCriterion("isNet not like", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetIn(List<String> values) {
            addCriterion("isNet in", values, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetNotIn(List<String> values) {
            addCriterion("isNet not in", values, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetBetween(String value1, String value2) {
            addCriterion("isNet between", value1, value2, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetNotBetween(String value1, String value2) {
            addCriterion("isNet not between", value1, value2, "isnet");
            return (Criteria) this;
        }

        public Criteria andBuildIdIsNull() {
            addCriterion("build_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildIdIsNotNull() {
            addCriterion("build_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildIdEqualTo(String value) {
            addCriterion("build_id =", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotEqualTo(String value) {
            addCriterion("build_id <>", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdGreaterThan(String value) {
            addCriterion("build_id >", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdGreaterThanOrEqualTo(String value) {
            addCriterion("build_id >=", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLessThan(String value) {
            addCriterion("build_id <", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLessThanOrEqualTo(String value) {
            addCriterion("build_id <=", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLike(String value) {
            addCriterion("build_id like", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotLike(String value) {
            addCriterion("build_id not like", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdIn(List<String> values) {
            addCriterion("build_id in", values, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotIn(List<String> values) {
            addCriterion("build_id not in", values, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdBetween(String value1, String value2) {
            addCriterion("build_id between", value1, value2, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotBetween(String value1, String value2) {
            addCriterion("build_id not between", value1, value2, "buildId");
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
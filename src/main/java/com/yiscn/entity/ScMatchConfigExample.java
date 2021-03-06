package com.yiscn.entity;

import java.util.ArrayList;
import java.util.List;

public class ScMatchConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScMatchConfigExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMinGradeIsNull() {
            addCriterion("min_grade is null");
            return (Criteria) this;
        }

        public Criteria andMinGradeIsNotNull() {
            addCriterion("min_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMinGradeEqualTo(Integer value) {
            addCriterion("min_grade =", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeNotEqualTo(Integer value) {
            addCriterion("min_grade <>", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeGreaterThan(Integer value) {
            addCriterion("min_grade >", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_grade >=", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeLessThan(Integer value) {
            addCriterion("min_grade <", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeLessThanOrEqualTo(Integer value) {
            addCriterion("min_grade <=", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeIn(List<Integer> values) {
            addCriterion("min_grade in", values, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeNotIn(List<Integer> values) {
            addCriterion("min_grade not in", values, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeBetween(Integer value1, Integer value2) {
            addCriterion("min_grade between", value1, value2, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("min_grade not between", value1, value2, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeIsNull() {
            addCriterion("max_grade is null");
            return (Criteria) this;
        }

        public Criteria andMaxGradeIsNotNull() {
            addCriterion("max_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMaxGradeEqualTo(Integer value) {
            addCriterion("max_grade =", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeNotEqualTo(Integer value) {
            addCriterion("max_grade <>", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeGreaterThan(Integer value) {
            addCriterion("max_grade >", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_grade >=", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeLessThan(Integer value) {
            addCriterion("max_grade <", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeLessThanOrEqualTo(Integer value) {
            addCriterion("max_grade <=", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeIn(List<Integer> values) {
            addCriterion("max_grade in", values, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeNotIn(List<Integer> values) {
            addCriterion("max_grade not in", values, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeBetween(Integer value1, Integer value2) {
            addCriterion("max_grade between", value1, value2, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_grade not between", value1, value2, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceIsNull() {
            addCriterion("reward_experience is null");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceIsNotNull() {
            addCriterion("reward_experience is not null");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceEqualTo(Integer value) {
            addCriterion("reward_experience =", value, "rewardExperience");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceNotEqualTo(Integer value) {
            addCriterion("reward_experience <>", value, "rewardExperience");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceGreaterThan(Integer value) {
            addCriterion("reward_experience >", value, "rewardExperience");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_experience >=", value, "rewardExperience");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceLessThan(Integer value) {
            addCriterion("reward_experience <", value, "rewardExperience");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceLessThanOrEqualTo(Integer value) {
            addCriterion("reward_experience <=", value, "rewardExperience");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceIn(List<Integer> values) {
            addCriterion("reward_experience in", values, "rewardExperience");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceNotIn(List<Integer> values) {
            addCriterion("reward_experience not in", values, "rewardExperience");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceBetween(Integer value1, Integer value2) {
            addCriterion("reward_experience between", value1, value2, "rewardExperience");
            return (Criteria) this;
        }

        public Criteria andRewardExperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_experience not between", value1, value2, "rewardExperience");
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
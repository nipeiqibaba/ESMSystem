package com.neu.entity;

import java.util.ArrayList;
import java.util.List;

public class JobExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    public JobExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table job
     *
     * @mbg.generated
     */
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

        public Criteria andJnoIsNull() {
            addCriterion("jno is null");
            return (Criteria) this;
        }

        public Criteria andJnoIsNotNull() {
            addCriterion("jno is not null");
            return (Criteria) this;
        }

        public Criteria andJnoEqualTo(Integer value) {
            addCriterion("jno =", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotEqualTo(Integer value) {
            addCriterion("jno <>", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoGreaterThan(Integer value) {
            addCriterion("jno >", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("jno >=", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoLessThan(Integer value) {
            addCriterion("jno <", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoLessThanOrEqualTo(Integer value) {
            addCriterion("jno <=", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoIn(List<Integer> values) {
            addCriterion("jno in", values, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotIn(List<Integer> values) {
            addCriterion("jno not in", values, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoBetween(Integer value1, Integer value2) {
            addCriterion("jno between", value1, value2, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotBetween(Integer value1, Integer value2) {
            addCriterion("jno not between", value1, value2, "jno");
            return (Criteria) this;
        }

        public Criteria andJnameIsNull() {
            addCriterion("jname is null");
            return (Criteria) this;
        }

        public Criteria andJnameIsNotNull() {
            addCriterion("jname is not null");
            return (Criteria) this;
        }

        public Criteria andJnameEqualTo(String value) {
            addCriterion("jname =", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotEqualTo(String value) {
            addCriterion("jname <>", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameGreaterThan(String value) {
            addCriterion("jname >", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameGreaterThanOrEqualTo(String value) {
            addCriterion("jname >=", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLessThan(String value) {
            addCriterion("jname <", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLessThanOrEqualTo(String value) {
            addCriterion("jname <=", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLike(String value) {
            addCriterion("jname like", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotLike(String value) {
            addCriterion("jname not like", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameIn(List<String> values) {
            addCriterion("jname in", values, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotIn(List<String> values) {
            addCriterion("jname not in", values, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameBetween(String value1, String value2) {
            addCriterion("jname between", value1, value2, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotBetween(String value1, String value2) {
            addCriterion("jname not between", value1, value2, "jname");
            return (Criteria) this;
        }

        public Criteria andJsaleIsNull() {
            addCriterion("jsale is null");
            return (Criteria) this;
        }

        public Criteria andJsaleIsNotNull() {
            addCriterion("jsale is not null");
            return (Criteria) this;
        }

        public Criteria andJsaleEqualTo(Integer value) {
            addCriterion("jsale =", value, "jsale");
            return (Criteria) this;
        }

        public Criteria andJsaleNotEqualTo(Integer value) {
            addCriterion("jsale <>", value, "jsale");
            return (Criteria) this;
        }

        public Criteria andJsaleGreaterThan(Integer value) {
            addCriterion("jsale >", value, "jsale");
            return (Criteria) this;
        }

        public Criteria andJsaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("jsale >=", value, "jsale");
            return (Criteria) this;
        }

        public Criteria andJsaleLessThan(Integer value) {
            addCriterion("jsale <", value, "jsale");
            return (Criteria) this;
        }

        public Criteria andJsaleLessThanOrEqualTo(Integer value) {
            addCriterion("jsale <=", value, "jsale");
            return (Criteria) this;
        }

        public Criteria andJsaleIn(List<Integer> values) {
            addCriterion("jsale in", values, "jsale");
            return (Criteria) this;
        }

        public Criteria andJsaleNotIn(List<Integer> values) {
            addCriterion("jsale not in", values, "jsale");
            return (Criteria) this;
        }

        public Criteria andJsaleBetween(Integer value1, Integer value2) {
            addCriterion("jsale between", value1, value2, "jsale");
            return (Criteria) this;
        }

        public Criteria andJsaleNotBetween(Integer value1, Integer value2) {
            addCriterion("jsale not between", value1, value2, "jsale");
            return (Criteria) this;
        }

        public Criteria andDelmarkIsNull() {
            addCriterion("delmark is null");
            return (Criteria) this;
        }

        public Criteria andDelmarkIsNotNull() {
            addCriterion("delmark is not null");
            return (Criteria) this;
        }

        public Criteria andDelmarkEqualTo(Integer value) {
            addCriterion("delmark =", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkNotEqualTo(Integer value) {
            addCriterion("delmark <>", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkGreaterThan(Integer value) {
            addCriterion("delmark >", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("delmark >=", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkLessThan(Integer value) {
            addCriterion("delmark <", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkLessThanOrEqualTo(Integer value) {
            addCriterion("delmark <=", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkIn(List<Integer> values) {
            addCriterion("delmark in", values, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkNotIn(List<Integer> values) {
            addCriterion("delmark not in", values, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkBetween(Integer value1, Integer value2) {
            addCriterion("delmark between", value1, value2, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("delmark not between", value1, value2, "delmark");
            return (Criteria) this;
        }

        public Criteria andTnoIsNull() {
            addCriterion("tno is null");
            return (Criteria) this;
        }

        public Criteria andTnoIsNotNull() {
            addCriterion("tno is not null");
            return (Criteria) this;
        }

        public Criteria andTnoEqualTo(Integer value) {
            addCriterion("tno =", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotEqualTo(Integer value) {
            addCriterion("tno <>", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThan(Integer value) {
            addCriterion("tno >", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tno >=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThan(Integer value) {
            addCriterion("tno <", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThanOrEqualTo(Integer value) {
            addCriterion("tno <=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoIn(List<Integer> values) {
            addCriterion("tno in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotIn(List<Integer> values) {
            addCriterion("tno not in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoBetween(Integer value1, Integer value2) {
            addCriterion("tno between", value1, value2, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotBetween(Integer value1, Integer value2) {
            addCriterion("tno not between", value1, value2, "tno");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table job
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table job
     *
     * @mbg.generated
     */
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
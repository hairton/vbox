package com.probridge.vbox.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public CourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
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
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionIsNull() {
            addCriterion("course_description is null");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionIsNotNull() {
            addCriterion("course_description is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionEqualTo(String value) {
            addCriterion("course_description =", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionNotEqualTo(String value) {
            addCriterion("course_description <>", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionGreaterThan(String value) {
            addCriterion("course_description >", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("course_description >=", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionLessThan(String value) {
            addCriterion("course_description <", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionLessThanOrEqualTo(String value) {
            addCriterion("course_description <=", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionLike(String value) {
            addCriterion("course_description like", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionNotLike(String value) {
            addCriterion("course_description not like", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionIn(List<String> values) {
            addCriterion("course_description in", values, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionNotIn(List<String> values) {
            addCriterion("course_description not in", values, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionBetween(String value1, String value2) {
            addCriterion("course_description between", value1, value2, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionNotBetween(String value1, String value2) {
            addCriterion("course_description not between", value1, value2, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationIsNull() {
            addCriterion("course_expiration is null");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationIsNotNull() {
            addCriterion("course_expiration is not null");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationEqualTo(Date value) {
            addCriterion("course_expiration =", value, "courseExpiration");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationNotEqualTo(Date value) {
            addCriterion("course_expiration <>", value, "courseExpiration");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationGreaterThan(Date value) {
            addCriterion("course_expiration >", value, "courseExpiration");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationGreaterThanOrEqualTo(Date value) {
            addCriterion("course_expiration >=", value, "courseExpiration");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationLessThan(Date value) {
            addCriterion("course_expiration <", value, "courseExpiration");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationLessThanOrEqualTo(Date value) {
            addCriterion("course_expiration <=", value, "courseExpiration");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationIn(List<Date> values) {
            addCriterion("course_expiration in", values, "courseExpiration");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationNotIn(List<Date> values) {
            addCriterion("course_expiration not in", values, "courseExpiration");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationBetween(Date value1, Date value2) {
            addCriterion("course_expiration between", value1, value2, "courseExpiration");
            return (Criteria) this;
        }

        public Criteria andCourseExpirationNotBetween(Date value1, Date value2) {
            addCriterion("course_expiration not between", value1, value2, "courseExpiration");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListIsNull() {
            addCriterion("course_preapprove_list is null");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListIsNotNull() {
            addCriterion("course_preapprove_list is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListEqualTo(String value) {
            addCriterion("course_preapprove_list =", value, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListNotEqualTo(String value) {
            addCriterion("course_preapprove_list <>", value, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListGreaterThan(String value) {
            addCriterion("course_preapprove_list >", value, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListGreaterThanOrEqualTo(String value) {
            addCriterion("course_preapprove_list >=", value, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListLessThan(String value) {
            addCriterion("course_preapprove_list <", value, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListLessThanOrEqualTo(String value) {
            addCriterion("course_preapprove_list <=", value, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListLike(String value) {
            addCriterion("course_preapprove_list like", value, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListNotLike(String value) {
            addCriterion("course_preapprove_list not like", value, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListIn(List<String> values) {
            addCriterion("course_preapprove_list in", values, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListNotIn(List<String> values) {
            addCriterion("course_preapprove_list not in", values, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListBetween(String value1, String value2) {
            addCriterion("course_preapprove_list between", value1, value2, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveListNotBetween(String value1, String value2) {
            addCriterion("course_preapprove_list not between", value1, value2, "coursePreapproveList");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaIsNull() {
            addCriterion("course_preapprove_quota is null");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaIsNotNull() {
            addCriterion("course_preapprove_quota is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaEqualTo(Integer value) {
            addCriterion("course_preapprove_quota =", value, "coursePreapproveQuota");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaNotEqualTo(Integer value) {
            addCriterion("course_preapprove_quota <>", value, "coursePreapproveQuota");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaGreaterThan(Integer value) {
            addCriterion("course_preapprove_quota >", value, "coursePreapproveQuota");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_preapprove_quota >=", value, "coursePreapproveQuota");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaLessThan(Integer value) {
            addCriterion("course_preapprove_quota <", value, "coursePreapproveQuota");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("course_preapprove_quota <=", value, "coursePreapproveQuota");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaIn(List<Integer> values) {
            addCriterion("course_preapprove_quota in", values, "coursePreapproveQuota");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaNotIn(List<Integer> values) {
            addCriterion("course_preapprove_quota not in", values, "coursePreapproveQuota");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaBetween(Integer value1, Integer value2) {
            addCriterion("course_preapprove_quota between", value1, value2, "coursePreapproveQuota");
            return (Criteria) this;
        }

        public Criteria andCoursePreapproveQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("course_preapprove_quota not between", value1, value2, "coursePreapproveQuota");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterIsNull() {
            addCriterion("course_vm_golden_master is null");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterIsNotNull() {
            addCriterion("course_vm_golden_master is not null");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterEqualTo(String value) {
            addCriterion("course_vm_golden_master =", value, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterNotEqualTo(String value) {
            addCriterion("course_vm_golden_master <>", value, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterGreaterThan(String value) {
            addCriterion("course_vm_golden_master >", value, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterGreaterThanOrEqualTo(String value) {
            addCriterion("course_vm_golden_master >=", value, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterLessThan(String value) {
            addCriterion("course_vm_golden_master <", value, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterLessThanOrEqualTo(String value) {
            addCriterion("course_vm_golden_master <=", value, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterLike(String value) {
            addCriterion("course_vm_golden_master like", value, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterNotLike(String value) {
            addCriterion("course_vm_golden_master not like", value, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterIn(List<String> values) {
            addCriterion("course_vm_golden_master in", values, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterNotIn(List<String> values) {
            addCriterion("course_vm_golden_master not in", values, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterBetween(String value1, String value2) {
            addCriterion("course_vm_golden_master between", value1, value2, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmGoldenMasterNotBetween(String value1, String value2) {
            addCriterion("course_vm_golden_master not between", value1, value2, "courseVmGoldenMaster");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkIsNull() {
            addCriterion("course_vm_network is null");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkIsNotNull() {
            addCriterion("course_vm_network is not null");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkEqualTo(String value) {
            addCriterion("course_vm_network =", value, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkNotEqualTo(String value) {
            addCriterion("course_vm_network <>", value, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkGreaterThan(String value) {
            addCriterion("course_vm_network >", value, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkGreaterThanOrEqualTo(String value) {
            addCriterion("course_vm_network >=", value, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkLessThan(String value) {
            addCriterion("course_vm_network <", value, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkLessThanOrEqualTo(String value) {
            addCriterion("course_vm_network <=", value, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkLike(String value) {
            addCriterion("course_vm_network like", value, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkNotLike(String value) {
            addCriterion("course_vm_network not like", value, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkIn(List<String> values) {
            addCriterion("course_vm_network in", values, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkNotIn(List<String> values) {
            addCriterion("course_vm_network not in", values, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkBetween(String value1, String value2) {
            addCriterion("course_vm_network between", value1, value2, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmNetworkNotBetween(String value1, String value2) {
            addCriterion("course_vm_network not between", value1, value2, "courseVmNetwork");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresIsNull() {
            addCriterion("course_vm_cores is null");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresIsNotNull() {
            addCriterion("course_vm_cores is not null");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresEqualTo(Integer value) {
            addCriterion("course_vm_cores =", value, "courseVmCores");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresNotEqualTo(Integer value) {
            addCriterion("course_vm_cores <>", value, "courseVmCores");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresGreaterThan(Integer value) {
            addCriterion("course_vm_cores >", value, "courseVmCores");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_vm_cores >=", value, "courseVmCores");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresLessThan(Integer value) {
            addCriterion("course_vm_cores <", value, "courseVmCores");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresLessThanOrEqualTo(Integer value) {
            addCriterion("course_vm_cores <=", value, "courseVmCores");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresIn(List<Integer> values) {
            addCriterion("course_vm_cores in", values, "courseVmCores");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresNotIn(List<Integer> values) {
            addCriterion("course_vm_cores not in", values, "courseVmCores");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresBetween(Integer value1, Integer value2) {
            addCriterion("course_vm_cores between", value1, value2, "courseVmCores");
            return (Criteria) this;
        }

        public Criteria andCourseVmCoresNotBetween(Integer value1, Integer value2) {
            addCriterion("course_vm_cores not between", value1, value2, "courseVmCores");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryIsNull() {
            addCriterion("course_vm_memory is null");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryIsNotNull() {
            addCriterion("course_vm_memory is not null");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryEqualTo(Integer value) {
            addCriterion("course_vm_memory =", value, "courseVmMemory");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryNotEqualTo(Integer value) {
            addCriterion("course_vm_memory <>", value, "courseVmMemory");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryGreaterThan(Integer value) {
            addCriterion("course_vm_memory >", value, "courseVmMemory");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_vm_memory >=", value, "courseVmMemory");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryLessThan(Integer value) {
            addCriterion("course_vm_memory <", value, "courseVmMemory");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryLessThanOrEqualTo(Integer value) {
            addCriterion("course_vm_memory <=", value, "courseVmMemory");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryIn(List<Integer> values) {
            addCriterion("course_vm_memory in", values, "courseVmMemory");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryNotIn(List<Integer> values) {
            addCriterion("course_vm_memory not in", values, "courseVmMemory");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryBetween(Integer value1, Integer value2) {
            addCriterion("course_vm_memory between", value1, value2, "courseVmMemory");
            return (Criteria) this;
        }

        public Criteria andCourseVmMemoryNotBetween(Integer value1, Integer value2) {
            addCriterion("course_vm_memory not between", value1, value2, "courseVmMemory");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course_list
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 19 09:59:57 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course_list
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
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
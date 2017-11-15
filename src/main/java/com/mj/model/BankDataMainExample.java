package com.mj.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankDataMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankDataMainExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSavepointIdIsNull() {
            addCriterion("savepoint_id is null");
            return (Criteria) this;
        }

        public Criteria andSavepointIdIsNotNull() {
            addCriterion("savepoint_id is not null");
            return (Criteria) this;
        }

        public Criteria andSavepointIdEqualTo(Integer value) {
            addCriterion("savepoint_id =", value, "savepointId");
            return (Criteria) this;
        }

        public Criteria andSavepointIdNotEqualTo(Integer value) {
            addCriterion("savepoint_id <>", value, "savepointId");
            return (Criteria) this;
        }

        public Criteria andSavepointIdGreaterThan(Integer value) {
            addCriterion("savepoint_id >", value, "savepointId");
            return (Criteria) this;
        }

        public Criteria andSavepointIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("savepoint_id >=", value, "savepointId");
            return (Criteria) this;
        }

        public Criteria andSavepointIdLessThan(Integer value) {
            addCriterion("savepoint_id <", value, "savepointId");
            return (Criteria) this;
        }

        public Criteria andSavepointIdLessThanOrEqualTo(Integer value) {
            addCriterion("savepoint_id <=", value, "savepointId");
            return (Criteria) this;
        }

        public Criteria andSavepointIdIn(List<Integer> values) {
            addCriterion("savepoint_id in", values, "savepointId");
            return (Criteria) this;
        }

        public Criteria andSavepointIdNotIn(List<Integer> values) {
            addCriterion("savepoint_id not in", values, "savepointId");
            return (Criteria) this;
        }

        public Criteria andSavepointIdBetween(Integer value1, Integer value2) {
            addCriterion("savepoint_id between", value1, value2, "savepointId");
            return (Criteria) this;
        }

        public Criteria andSavepointIdNotBetween(Integer value1, Integer value2) {
            addCriterion("savepoint_id not between", value1, value2, "savepointId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNull() {
            addCriterion("partner_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNotNull() {
            addCriterion("partner_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdEqualTo(Integer value) {
            addCriterion("partner_id =", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotEqualTo(Integer value) {
            addCriterion("partner_id <>", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThan(Integer value) {
            addCriterion("partner_id >", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_id >=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThan(Integer value) {
            addCriterion("partner_id <", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("partner_id <=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIn(List<Integer> values) {
            addCriterion("partner_id in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotIn(List<Integer> values) {
            addCriterion("partner_id not in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdBetween(Integer value1, Integer value2) {
            addCriterion("partner_id between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_id not between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIsNull() {
            addCriterion("save_time is null");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIsNotNull() {
            addCriterion("save_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaveTimeEqualTo(Date value) {
            addCriterion("save_time =", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotEqualTo(Date value) {
            addCriterion("save_time <>", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeGreaterThan(Date value) {
            addCriterion("save_time >", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("save_time >=", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeLessThan(Date value) {
            addCriterion("save_time <", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("save_time <=", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIn(List<Date> values) {
            addCriterion("save_time in", values, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotIn(List<Date> values) {
            addCriterion("save_time not in", values, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeBetween(Date value1, Date value2) {
            addCriterion("save_time between", value1, value2, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("save_time not between", value1, value2, "saveTime");
            return (Criteria) this;
        }

        public Criteria andMd5IsNull() {
            addCriterion("md5 is null");
            return (Criteria) this;
        }

        public Criteria andMd5IsNotNull() {
            addCriterion("md5 is not null");
            return (Criteria) this;
        }

        public Criteria andMd5EqualTo(String value) {
            addCriterion("md5 =", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotEqualTo(String value) {
            addCriterion("md5 <>", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThan(String value) {
            addCriterion("md5 >", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThanOrEqualTo(String value) {
            addCriterion("md5 >=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThan(String value) {
            addCriterion("md5 <", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThanOrEqualTo(String value) {
            addCriterion("md5 <=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Like(String value) {
            addCriterion("md5 like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotLike(String value) {
            addCriterion("md5 not like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5In(List<String> values) {
            addCriterion("md5 in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotIn(List<String> values) {
            addCriterion("md5 not in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Between(String value1, String value2) {
            addCriterion("md5 between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotBetween(String value1, String value2) {
            addCriterion("md5 not between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andRecordNoIsNull() {
            addCriterion("record_no is null");
            return (Criteria) this;
        }

        public Criteria andRecordNoIsNotNull() {
            addCriterion("record_no is not null");
            return (Criteria) this;
        }

        public Criteria andRecordNoEqualTo(String value) {
            addCriterion("record_no =", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotEqualTo(String value) {
            addCriterion("record_no <>", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoGreaterThan(String value) {
            addCriterion("record_no >", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoGreaterThanOrEqualTo(String value) {
            addCriterion("record_no >=", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoLessThan(String value) {
            addCriterion("record_no <", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoLessThanOrEqualTo(String value) {
            addCriterion("record_no <=", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoLike(String value) {
            addCriterion("record_no like", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotLike(String value) {
            addCriterion("record_no not like", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoIn(List<String> values) {
            addCriterion("record_no in", values, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotIn(List<String> values) {
            addCriterion("record_no not in", values, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoBetween(String value1, String value2) {
            addCriterion("record_no between", value1, value2, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotBetween(String value1, String value2) {
            addCriterion("record_no not between", value1, value2, "recordNo");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlIsNull() {
            addCriterion("water_pdf_url is null");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlIsNotNull() {
            addCriterion("water_pdf_url is not null");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlEqualTo(String value) {
            addCriterion("water_pdf_url =", value, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlNotEqualTo(String value) {
            addCriterion("water_pdf_url <>", value, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlGreaterThan(String value) {
            addCriterion("water_pdf_url >", value, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlGreaterThanOrEqualTo(String value) {
            addCriterion("water_pdf_url >=", value, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlLessThan(String value) {
            addCriterion("water_pdf_url <", value, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlLessThanOrEqualTo(String value) {
            addCriterion("water_pdf_url <=", value, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlLike(String value) {
            addCriterion("water_pdf_url like", value, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlNotLike(String value) {
            addCriterion("water_pdf_url not like", value, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlIn(List<String> values) {
            addCriterion("water_pdf_url in", values, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlNotIn(List<String> values) {
            addCriterion("water_pdf_url not in", values, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlBetween(String value1, String value2) {
            addCriterion("water_pdf_url between", value1, value2, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andWaterPdfUrlNotBetween(String value1, String value2) {
            addCriterion("water_pdf_url not between", value1, value2, "waterPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlIsNull() {
            addCriterion("notarial_pdf_url is null");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlIsNotNull() {
            addCriterion("notarial_pdf_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlEqualTo(String value) {
            addCriterion("notarial_pdf_url =", value, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlNotEqualTo(String value) {
            addCriterion("notarial_pdf_url <>", value, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlGreaterThan(String value) {
            addCriterion("notarial_pdf_url >", value, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notarial_pdf_url >=", value, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlLessThan(String value) {
            addCriterion("notarial_pdf_url <", value, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlLessThanOrEqualTo(String value) {
            addCriterion("notarial_pdf_url <=", value, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlLike(String value) {
            addCriterion("notarial_pdf_url like", value, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlNotLike(String value) {
            addCriterion("notarial_pdf_url not like", value, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlIn(List<String> values) {
            addCriterion("notarial_pdf_url in", values, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlNotIn(List<String> values) {
            addCriterion("notarial_pdf_url not in", values, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlBetween(String value1, String value2) {
            addCriterion("notarial_pdf_url between", value1, value2, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andNotarialPdfUrlNotBetween(String value1, String value2) {
            addCriterion("notarial_pdf_url not between", value1, value2, "notarialPdfUrl");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("gmt_modify <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNull() {
            addCriterion("bank_no is null");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNotNull() {
            addCriterion("bank_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankNoEqualTo(String value) {
            addCriterion("bank_no =", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("bank_no <>", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("bank_no >", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_no >=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThan(String value) {
            addCriterion("bank_no <", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("bank_no <=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLike(String value) {
            addCriterion("bank_no like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotLike(String value) {
            addCriterion("bank_no not like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoIn(List<String> values) {
            addCriterion("bank_no in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("bank_no not in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("bank_no between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("bank_no not between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIsNull() {
            addCriterion("company_no is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIsNotNull() {
            addCriterion("company_no is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNoEqualTo(String value) {
            addCriterion("company_no =", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotEqualTo(String value) {
            addCriterion("company_no <>", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoGreaterThan(String value) {
            addCriterion("company_no >", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoGreaterThanOrEqualTo(String value) {
            addCriterion("company_no >=", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLessThan(String value) {
            addCriterion("company_no <", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLessThanOrEqualTo(String value) {
            addCriterion("company_no <=", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLike(String value) {
            addCriterion("company_no like", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotLike(String value) {
            addCriterion("company_no not like", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIn(List<String> values) {
            addCriterion("company_no in", values, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotIn(List<String> values) {
            addCriterion("company_no not in", values, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoBetween(String value1, String value2) {
            addCriterion("company_no between", value1, value2, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotBetween(String value1, String value2) {
            addCriterion("company_no not between", value1, value2, "companyNo");
            return (Criteria) this;
        }

        public Criteria andIsRepaceIsNull() {
            addCriterion("is_repace is null");
            return (Criteria) this;
        }

        public Criteria andIsRepaceIsNotNull() {
            addCriterion("is_repace is not null");
            return (Criteria) this;
        }

        public Criteria andIsRepaceEqualTo(Integer value) {
            addCriterion("is_repace =", value, "isRepace");
            return (Criteria) this;
        }

        public Criteria andIsRepaceNotEqualTo(Integer value) {
            addCriterion("is_repace <>", value, "isRepace");
            return (Criteria) this;
        }

        public Criteria andIsRepaceGreaterThan(Integer value) {
            addCriterion("is_repace >", value, "isRepace");
            return (Criteria) this;
        }

        public Criteria andIsRepaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_repace >=", value, "isRepace");
            return (Criteria) this;
        }

        public Criteria andIsRepaceLessThan(Integer value) {
            addCriterion("is_repace <", value, "isRepace");
            return (Criteria) this;
        }

        public Criteria andIsRepaceLessThanOrEqualTo(Integer value) {
            addCriterion("is_repace <=", value, "isRepace");
            return (Criteria) this;
        }

        public Criteria andIsRepaceIn(List<Integer> values) {
            addCriterion("is_repace in", values, "isRepace");
            return (Criteria) this;
        }

        public Criteria andIsRepaceNotIn(List<Integer> values) {
            addCriterion("is_repace not in", values, "isRepace");
            return (Criteria) this;
        }

        public Criteria andIsRepaceBetween(Integer value1, Integer value2) {
            addCriterion("is_repace between", value1, value2, "isRepace");
            return (Criteria) this;
        }

        public Criteria andIsRepaceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_repace not between", value1, value2, "isRepace");
            return (Criteria) this;
        }

        public Criteria andContractVerIsNull() {
            addCriterion("CONTRACT_VER is null");
            return (Criteria) this;
        }

        public Criteria andContractVerIsNotNull() {
            addCriterion("CONTRACT_VER is not null");
            return (Criteria) this;
        }

        public Criteria andContractVerEqualTo(String value) {
            addCriterion("CONTRACT_VER =", value, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerNotEqualTo(String value) {
            addCriterion("CONTRACT_VER <>", value, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerGreaterThan(String value) {
            addCriterion("CONTRACT_VER >", value, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_VER >=", value, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerLessThan(String value) {
            addCriterion("CONTRACT_VER <", value, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_VER <=", value, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerLike(String value) {
            addCriterion("CONTRACT_VER like", value, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerNotLike(String value) {
            addCriterion("CONTRACT_VER not like", value, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerIn(List<String> values) {
            addCriterion("CONTRACT_VER in", values, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerNotIn(List<String> values) {
            addCriterion("CONTRACT_VER not in", values, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerBetween(String value1, String value2) {
            addCriterion("CONTRACT_VER between", value1, value2, "contractVer");
            return (Criteria) this;
        }

        public Criteria andContractVerNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_VER not between", value1, value2, "contractVer");
            return (Criteria) this;
        }

        public Criteria andHasFileIsNull() {
            addCriterion("has_file is null");
            return (Criteria) this;
        }

        public Criteria andHasFileIsNotNull() {
            addCriterion("has_file is not null");
            return (Criteria) this;
        }

        public Criteria andHasFileEqualTo(Integer value) {
            addCriterion("has_file =", value, "hasFile");
            return (Criteria) this;
        }

        public Criteria andHasFileNotEqualTo(Integer value) {
            addCriterion("has_file <>", value, "hasFile");
            return (Criteria) this;
        }

        public Criteria andHasFileGreaterThan(Integer value) {
            addCriterion("has_file >", value, "hasFile");
            return (Criteria) this;
        }

        public Criteria andHasFileGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_file >=", value, "hasFile");
            return (Criteria) this;
        }

        public Criteria andHasFileLessThan(Integer value) {
            addCriterion("has_file <", value, "hasFile");
            return (Criteria) this;
        }

        public Criteria andHasFileLessThanOrEqualTo(Integer value) {
            addCriterion("has_file <=", value, "hasFile");
            return (Criteria) this;
        }

        public Criteria andHasFileIn(List<Integer> values) {
            addCriterion("has_file in", values, "hasFile");
            return (Criteria) this;
        }

        public Criteria andHasFileNotIn(List<Integer> values) {
            addCriterion("has_file not in", values, "hasFile");
            return (Criteria) this;
        }

        public Criteria andHasFileBetween(Integer value1, Integer value2) {
            addCriterion("has_file between", value1, value2, "hasFile");
            return (Criteria) this;
        }

        public Criteria andHasFileNotBetween(Integer value1, Integer value2) {
            addCriterion("has_file not between", value1, value2, "hasFile");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoIsNull() {
            addCriterion("parent_record_no is null");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoIsNotNull() {
            addCriterion("parent_record_no is not null");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoEqualTo(String value) {
            addCriterion("parent_record_no =", value, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoNotEqualTo(String value) {
            addCriterion("parent_record_no <>", value, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoGreaterThan(String value) {
            addCriterion("parent_record_no >", value, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoGreaterThanOrEqualTo(String value) {
            addCriterion("parent_record_no >=", value, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoLessThan(String value) {
            addCriterion("parent_record_no <", value, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoLessThanOrEqualTo(String value) {
            addCriterion("parent_record_no <=", value, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoLike(String value) {
            addCriterion("parent_record_no like", value, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoNotLike(String value) {
            addCriterion("parent_record_no not like", value, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoIn(List<String> values) {
            addCriterion("parent_record_no in", values, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoNotIn(List<String> values) {
            addCriterion("parent_record_no not in", values, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoBetween(String value1, String value2) {
            addCriterion("parent_record_no between", value1, value2, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentRecordNoNotBetween(String value1, String value2) {
            addCriterion("parent_record_no not between", value1, value2, "parentRecordNo");
            return (Criteria) this;
        }

        public Criteria andParentDealIdIsNull() {
            addCriterion("parent_deal_id is null");
            return (Criteria) this;
        }

        public Criteria andParentDealIdIsNotNull() {
            addCriterion("parent_deal_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentDealIdEqualTo(String value) {
            addCriterion("parent_deal_id =", value, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdNotEqualTo(String value) {
            addCriterion("parent_deal_id <>", value, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdGreaterThan(String value) {
            addCriterion("parent_deal_id >", value, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_deal_id >=", value, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdLessThan(String value) {
            addCriterion("parent_deal_id <", value, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdLessThanOrEqualTo(String value) {
            addCriterion("parent_deal_id <=", value, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdLike(String value) {
            addCriterion("parent_deal_id like", value, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdNotLike(String value) {
            addCriterion("parent_deal_id not like", value, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdIn(List<String> values) {
            addCriterion("parent_deal_id in", values, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdNotIn(List<String> values) {
            addCriterion("parent_deal_id not in", values, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdBetween(String value1, String value2) {
            addCriterion("parent_deal_id between", value1, value2, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andParentDealIdNotBetween(String value1, String value2) {
            addCriterion("parent_deal_id not between", value1, value2, "parentDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdIsNull() {
            addCriterion("partner_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdIsNotNull() {
            addCriterion("partner_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdEqualTo(String value) {
            addCriterion("partner_user_id =", value, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdNotEqualTo(String value) {
            addCriterion("partner_user_id <>", value, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdGreaterThan(String value) {
            addCriterion("partner_user_id >", value, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("partner_user_id >=", value, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdLessThan(String value) {
            addCriterion("partner_user_id <", value, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdLessThanOrEqualTo(String value) {
            addCriterion("partner_user_id <=", value, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdLike(String value) {
            addCriterion("partner_user_id like", value, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdNotLike(String value) {
            addCriterion("partner_user_id not like", value, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdIn(List<String> values) {
            addCriterion("partner_user_id in", values, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdNotIn(List<String> values) {
            addCriterion("partner_user_id not in", values, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdBetween(String value1, String value2) {
            addCriterion("partner_user_id between", value1, value2, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerUserIdNotBetween(String value1, String value2) {
            addCriterion("partner_user_id not between", value1, value2, "partnerUserId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdIsNull() {
            addCriterion("partner_deal_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdIsNotNull() {
            addCriterion("partner_deal_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdEqualTo(String value) {
            addCriterion("partner_deal_id =", value, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdNotEqualTo(String value) {
            addCriterion("partner_deal_id <>", value, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdGreaterThan(String value) {
            addCriterion("partner_deal_id >", value, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdGreaterThanOrEqualTo(String value) {
            addCriterion("partner_deal_id >=", value, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdLessThan(String value) {
            addCriterion("partner_deal_id <", value, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdLessThanOrEqualTo(String value) {
            addCriterion("partner_deal_id <=", value, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdLike(String value) {
            addCriterion("partner_deal_id like", value, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdNotLike(String value) {
            addCriterion("partner_deal_id not like", value, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdIn(List<String> values) {
            addCriterion("partner_deal_id in", values, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdNotIn(List<String> values) {
            addCriterion("partner_deal_id not in", values, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdBetween(String value1, String value2) {
            addCriterion("partner_deal_id between", value1, value2, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andPartnerDealIdNotBetween(String value1, String value2) {
            addCriterion("partner_deal_id not between", value1, value2, "partnerDealId");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(Integer value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(Integer value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(Integer value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(Integer value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(Integer value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<Integer> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<Integer> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(Integer value1, Integer value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andZipUrlIsNull() {
            addCriterion("zip_url is null");
            return (Criteria) this;
        }

        public Criteria andZipUrlIsNotNull() {
            addCriterion("zip_url is not null");
            return (Criteria) this;
        }

        public Criteria andZipUrlEqualTo(String value) {
            addCriterion("zip_url =", value, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlNotEqualTo(String value) {
            addCriterion("zip_url <>", value, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlGreaterThan(String value) {
            addCriterion("zip_url >", value, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlGreaterThanOrEqualTo(String value) {
            addCriterion("zip_url >=", value, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlLessThan(String value) {
            addCriterion("zip_url <", value, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlLessThanOrEqualTo(String value) {
            addCriterion("zip_url <=", value, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlLike(String value) {
            addCriterion("zip_url like", value, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlNotLike(String value) {
            addCriterion("zip_url not like", value, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlIn(List<String> values) {
            addCriterion("zip_url in", values, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlNotIn(List<String> values) {
            addCriterion("zip_url not in", values, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlBetween(String value1, String value2) {
            addCriterion("zip_url between", value1, value2, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andZipUrlNotBetween(String value1, String value2) {
            addCriterion("zip_url not between", value1, value2, "zipUrl");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlIsNull() {
            addCriterion("notary_zip_url is null");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlIsNotNull() {
            addCriterion("notary_zip_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlEqualTo(String value) {
            addCriterion("notary_zip_url =", value, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlNotEqualTo(String value) {
            addCriterion("notary_zip_url <>", value, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlGreaterThan(String value) {
            addCriterion("notary_zip_url >", value, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notary_zip_url >=", value, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlLessThan(String value) {
            addCriterion("notary_zip_url <", value, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlLessThanOrEqualTo(String value) {
            addCriterion("notary_zip_url <=", value, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlLike(String value) {
            addCriterion("notary_zip_url like", value, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlNotLike(String value) {
            addCriterion("notary_zip_url not like", value, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlIn(List<String> values) {
            addCriterion("notary_zip_url in", values, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlNotIn(List<String> values) {
            addCriterion("notary_zip_url not in", values, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlBetween(String value1, String value2) {
            addCriterion("notary_zip_url between", value1, value2, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andNotaryZipUrlNotBetween(String value1, String value2) {
            addCriterion("notary_zip_url not between", value1, value2, "notaryZipUrl");
            return (Criteria) this;
        }

        public Criteria andIsAppendIsNull() {
            addCriterion("is_append is null");
            return (Criteria) this;
        }

        public Criteria andIsAppendIsNotNull() {
            addCriterion("is_append is not null");
            return (Criteria) this;
        }

        public Criteria andIsAppendEqualTo(Integer value) {
            addCriterion("is_append =", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotEqualTo(Integer value) {
            addCriterion("is_append <>", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendGreaterThan(Integer value) {
            addCriterion("is_append >", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_append >=", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendLessThan(Integer value) {
            addCriterion("is_append <", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendLessThanOrEqualTo(Integer value) {
            addCriterion("is_append <=", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendIn(List<Integer> values) {
            addCriterion("is_append in", values, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotIn(List<Integer> values) {
            addCriterion("is_append not in", values, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendBetween(Integer value1, Integer value2) {
            addCriterion("is_append between", value1, value2, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_append not between", value1, value2, "isAppend");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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
package com.neu.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table salary_settle_ment
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SalarySettleMent {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.dname
     *
     * @mbg.generated
     */
    private String dname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.empno
     *
     * @mbg.generated
     */
    private Integer empno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.ename
     *
     * @mbg.generated
     */
    private String ename;

    /**
     * Database Column Remarks:
     *   实发工资
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.real_salary
     *
     * @mbg.generated
     */
    private Double realSalary;

    /**
     * Database Column Remarks:
     *   基本工资
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.basic_salary
     *
     * @mbg.generated
     */
    private Double basicSalary;

    /**
     * Database Column Remarks:
     *   采暖补贴
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.subsidies
     *
     * @mbg.generated
     */
    private Double subsidies;

    /**
     * Database Column Remarks:
     *   病假天数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.sick_num
     *
     * @mbg.generated
     */
    private Integer sickNum;

    /**
     * Database Column Remarks:
     *   病假扣款
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.sick_deductions
     *
     * @mbg.generated
     */
    private Double sickDeductions;

    /**
     * Database Column Remarks:
     *   事假天数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.per_num
     *
     * @mbg.generated
     */
    private Integer perNum;

    /**
     * Database Column Remarks:
     *   事假扣款
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.per_deductions
     *
     * @mbg.generated
     */
    private Double perDeductions;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.work_num
     *
     * @mbg.generated
     */
    private Integer workNum;

    /**
     * Database Column Remarks:
     *   加班工资
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.work_salary
     *
     * @mbg.generated
     */
    private Double workSalary;

    /**
     * Database Column Remarks:
     *   迟到天数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.late_num
     *
     * @mbg.generated
     */
    private Integer lateNum;

    /**
     * Database Column Remarks:
     *   迟到扣款
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.late_deductions
     *
     * @mbg.generated
     */
    private Double lateDeductions;

    /**
     * Database Column Remarks:
     *   个人支付养老保险
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.per_old_insurance
     *
     * @mbg.generated
     */
    private Double perOldInsurance;

    /**
     * Database Column Remarks:
     *   公司支付养老保险
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.com_old_insurance
     *
     * @mbg.generated
     */
    private Double comOldInsurance;

    /**
     * Database Column Remarks:
     *   个人支付医疗保险
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.per_med_insurance
     *
     * @mbg.generated
     */
    private Double perMedInsurance;

    /**
     * Database Column Remarks:
     *   公司支付医疗保险
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.com_med_insurance
     *
     * @mbg.generated
     */
    private Double comMedInsurance;

    /**
     * Database Column Remarks:
     *   个人支付公积金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.per_fund
     *
     * @mbg.generated
     */
    private Double perFund;

    /**
     * Database Column Remarks:
     *   公司支付公积金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.com_fund
     *
     * @mbg.generated
     */
    private Double comFund;

    /**
     * Database Column Remarks:
     *   个人所得税
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.ind_income_tax
     *
     * @mbg.generated
     */
    private Double indIncomeTax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salary_settle_ment.note
     *
     * @mbg.generated
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.id
     *
     * @return the value of salary_settle_ment.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.id
     *
     * @param id the value for salary_settle_ment.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.dname
     *
     * @return the value of salary_settle_ment.dname
     *
     * @mbg.generated
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.dname
     *
     * @param dname the value for salary_settle_ment.dname
     *
     * @mbg.generated
     */
    public void setDname(String dname) {
        this.dname = dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.time
     *
     * @return the value of salary_settle_ment.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.time
     *
     * @param time the value for salary_settle_ment.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.empno
     *
     * @return the value of salary_settle_ment.empno
     *
     * @mbg.generated
     */
    public Integer getEmpno() {
        return empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.empno
     *
     * @param empno the value for salary_settle_ment.empno
     *
     * @mbg.generated
     */
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.ename
     *
     * @return the value of salary_settle_ment.ename
     *
     * @mbg.generated
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.ename
     *
     * @param ename the value for salary_settle_ment.ename
     *
     * @mbg.generated
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.real_salary
     *
     * @return the value of salary_settle_ment.real_salary
     *
     * @mbg.generated
     */
    public Double getRealSalary() {
        return realSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.real_salary
     *
     * @param realSalary the value for salary_settle_ment.real_salary
     *
     * @mbg.generated
     */
    public void setRealSalary(Double realSalary) {
        this.realSalary = realSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.basic_salary
     *
     * @return the value of salary_settle_ment.basic_salary
     *
     * @mbg.generated
     */
    public Double getBasicSalary() {
        return basicSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.basic_salary
     *
     * @param basicSalary the value for salary_settle_ment.basic_salary
     *
     * @mbg.generated
     */
    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.subsidies
     *
     * @return the value of salary_settle_ment.subsidies
     *
     * @mbg.generated
     */
    public Double getSubsidies() {
        return subsidies;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.subsidies
     *
     * @param subsidies the value for salary_settle_ment.subsidies
     *
     * @mbg.generated
     */
    public void setSubsidies(Double subsidies) {
        this.subsidies = subsidies;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.sick_num
     *
     * @return the value of salary_settle_ment.sick_num
     *
     * @mbg.generated
     */
    public Integer getSickNum() {
        return sickNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.sick_num
     *
     * @param sickNum the value for salary_settle_ment.sick_num
     *
     * @mbg.generated
     */
    public void setSickNum(Integer sickNum) {
        this.sickNum = sickNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.sick_deductions
     *
     * @return the value of salary_settle_ment.sick_deductions
     *
     * @mbg.generated
     */
    public Double getSickDeductions() {
        return sickDeductions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.sick_deductions
     *
     * @param sickDeductions the value for salary_settle_ment.sick_deductions
     *
     * @mbg.generated
     */
    public void setSickDeductions(Double sickDeductions) {
        this.sickDeductions = sickDeductions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.per_num
     *
     * @return the value of salary_settle_ment.per_num
     *
     * @mbg.generated
     */
    public Integer getPerNum() {
        return perNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.per_num
     *
     * @param perNum the value for salary_settle_ment.per_num
     *
     * @mbg.generated
     */
    public void setPerNum(Integer perNum) {
        this.perNum = perNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.per_deductions
     *
     * @return the value of salary_settle_ment.per_deductions
     *
     * @mbg.generated
     */
    public Double getPerDeductions() {
        return perDeductions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.per_deductions
     *
     * @param perDeductions the value for salary_settle_ment.per_deductions
     *
     * @mbg.generated
     */
    public void setPerDeductions(Double perDeductions) {
        this.perDeductions = perDeductions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.work_num
     *
     * @return the value of salary_settle_ment.work_num
     *
     * @mbg.generated
     */
    public Integer getWorkNum() {
        return workNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.work_num
     *
     * @param workNum the value for salary_settle_ment.work_num
     *
     * @mbg.generated
     */
    public void setWorkNum(Integer workNum) {
        this.workNum = workNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.work_salary
     *
     * @return the value of salary_settle_ment.work_salary
     *
     * @mbg.generated
     */
    public Double getWorkSalary() {
        return workSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.work_salary
     *
     * @param workSalary the value for salary_settle_ment.work_salary
     *
     * @mbg.generated
     */
    public void setWorkSalary(Double workSalary) {
        this.workSalary = workSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.late_num
     *
     * @return the value of salary_settle_ment.late_num
     *
     * @mbg.generated
     */
    public Integer getLateNum() {
        return lateNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.late_num
     *
     * @param lateNum the value for salary_settle_ment.late_num
     *
     * @mbg.generated
     */
    public void setLateNum(Integer lateNum) {
        this.lateNum = lateNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.late_deductions
     *
     * @return the value of salary_settle_ment.late_deductions
     *
     * @mbg.generated
     */
    public Double getLateDeductions() {
        return lateDeductions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.late_deductions
     *
     * @param lateDeductions the value for salary_settle_ment.late_deductions
     *
     * @mbg.generated
     */
    public void setLateDeductions(Double lateDeductions) {
        this.lateDeductions = lateDeductions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.per_old_insurance
     *
     * @return the value of salary_settle_ment.per_old_insurance
     *
     * @mbg.generated
     */
    public Double getPerOldInsurance() {
        return perOldInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.per_old_insurance
     *
     * @param perOldInsurance the value for salary_settle_ment.per_old_insurance
     *
     * @mbg.generated
     */
    public void setPerOldInsurance(Double perOldInsurance) {
        this.perOldInsurance = perOldInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.com_old_insurance
     *
     * @return the value of salary_settle_ment.com_old_insurance
     *
     * @mbg.generated
     */
    public Double getComOldInsurance() {
        return comOldInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.com_old_insurance
     *
     * @param comOldInsurance the value for salary_settle_ment.com_old_insurance
     *
     * @mbg.generated
     */
    public void setComOldInsurance(Double comOldInsurance) {
        this.comOldInsurance = comOldInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.per_med_insurance
     *
     * @return the value of salary_settle_ment.per_med_insurance
     *
     * @mbg.generated
     */
    public Double getPerMedInsurance() {
        return perMedInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.per_med_insurance
     *
     * @param perMedInsurance the value for salary_settle_ment.per_med_insurance
     *
     * @mbg.generated
     */
    public void setPerMedInsurance(Double perMedInsurance) {
        this.perMedInsurance = perMedInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.com_med_insurance
     *
     * @return the value of salary_settle_ment.com_med_insurance
     *
     * @mbg.generated
     */
    public Double getComMedInsurance() {
        return comMedInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.com_med_insurance
     *
     * @param comMedInsurance the value for salary_settle_ment.com_med_insurance
     *
     * @mbg.generated
     */
    public void setComMedInsurance(Double comMedInsurance) {
        this.comMedInsurance = comMedInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.per_fund
     *
     * @return the value of salary_settle_ment.per_fund
     *
     * @mbg.generated
     */
    public Double getPerFund() {
        return perFund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.per_fund
     *
     * @param perFund the value for salary_settle_ment.per_fund
     *
     * @mbg.generated
     */
    public void setPerFund(Double perFund) {
        this.perFund = perFund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.com_fund
     *
     * @return the value of salary_settle_ment.com_fund
     *
     * @mbg.generated
     */
    public Double getComFund() {
        return comFund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.com_fund
     *
     * @param comFund the value for salary_settle_ment.com_fund
     *
     * @mbg.generated
     */
    public void setComFund(Double comFund) {
        this.comFund = comFund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.ind_income_tax
     *
     * @return the value of salary_settle_ment.ind_income_tax
     *
     * @mbg.generated
     */
    public Double getIndIncomeTax() {
        return indIncomeTax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.ind_income_tax
     *
     * @param indIncomeTax the value for salary_settle_ment.ind_income_tax
     *
     * @mbg.generated
     */
    public void setIndIncomeTax(Double indIncomeTax) {
        this.indIncomeTax = indIncomeTax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salary_settle_ment.note
     *
     * @return the value of salary_settle_ment.note
     *
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salary_settle_ment.note
     *
     * @param note the value for salary_settle_ment.note
     *
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note;
    }
}
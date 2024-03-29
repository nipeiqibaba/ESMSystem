package com.neu.mapper;

import com.neu.entity.SalarySettleMent;
import com.neu.entity.SalarySettleMentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalarySettleMentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    long countByExample(SalarySettleMentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    int deleteByExample(SalarySettleMentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    int insert(SalarySettleMent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    int insertSelective(SalarySettleMent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    List<SalarySettleMent> selectByExample(SalarySettleMentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    SalarySettleMent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SalarySettleMent record, @Param("example") SalarySettleMentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SalarySettleMent record, @Param("example") SalarySettleMentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SalarySettleMent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary_settle_ment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SalarySettleMent record);
}
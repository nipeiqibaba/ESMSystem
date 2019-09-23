package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.neu.entity.SalarySettleMent;
import com.neu.entity.SalarySettleMentExample;
import com.neu.mapper.SalarySettleMentMapper;
@Service
public class SalarySettleMentServiceImpl implements SalarySettleMentService{
	
	@Autowired
	private SalarySettleMentMapper SalarySettleMentmapper;
	@Override
	public int insert(SalarySettleMent entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(SalarySettleMent entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SalarySettleMent getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<SalarySettleMent> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		PageHelper.startPage(pageNum,pageSize);
		SalarySettleMentExample example = new SalarySettleMentExample();
		example.or()
		.andEnameLike("%"+params.get("ename")+"%");
			
	List<SalarySettleMent> list = SalarySettleMentmapper.selectByExample(example);
	
	PageInfo<SalarySettleMent> pageInfo = new PageInfo<>(list);
	
	return pageInfo;
	}
	@Override
	public List<SalarySettleMent> getAll() {
		SalarySettleMentExample example = new SalarySettleMentExample();
		
		return SalarySettleMentmapper.selectByExample(example);
	}

}

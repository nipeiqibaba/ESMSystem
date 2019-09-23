package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.neu.entity.Dept;
import com.neu.entity.Emp;
import com.neu.entity.EmpExample;
import com.neu.entity.EmpExample.Criteria;
import com.neu.mapper.EmpMapper;
@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpMapper empMapper;

	@Override
	public int insert(Emp entity) {
		// TODO Auto-generated method stub
		return empMapper.insert(entity);
	}

	@Override
	public int update(Emp entity) {
		// TODO Auto-generated method stub
		return empMapper.updateByPrimaryKey(entity);
	}

	@Override
	public int delete(int empno) {
		// TODO Auto-generated method stub
		return empMapper.deleteByPrimaryKey(empno);
	}

	@Override
	public Emp getById(int empno) {
		EmpExample example = new EmpExample();
		example.or().andEmpnoEqualTo(empno)
		.andDelmarkEqualTo(1);
		List<Emp> list = empMapper.selectByExample(example);
		if(list !=null && list.size()==1) {
			 return list.get(0);
		 }
		 return null;
	}

	@Override
	public PageInfo<Emp> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		PageHelper.startPage(pageNum, pageSize);
		EmpExample example = new EmpExample();
		Criteria criteria = example.or()
				.andEnameLike("%"+params.get("ename"));		
		criteria.andDelmarkEqualTo(1);
		List<Emp> list = empMapper.selectByExample(example);
		PageInfo<Emp> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
	
	@Override
	public List<Emp> getAll() {
		EmpExample example = new EmpExample();
		example.or().andDelmarkEqualTo(1);	
		return empMapper.selectByExample(example);
	}

}

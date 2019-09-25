package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.entity.Dept;
import com.neu.entity.DeptExample;
import com.neu.entity.Emp;
import com.neu.entity.EmpExample;
import com.neu.entity.EmpExample.Criteria;
import com.neu.mapper.DeptMapper;
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public int insert(Dept entity) {
		// TODO Auto-generated method stub
		return deptMapper.insertSelective(entity);
	}

	@Override
	public int update(Dept entity) {
		// TODO Auto-generated method stub
		return deptMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int delete(int deptno) {
		// TODO Auto-generated method stub
		return deptMapper.deleteByPrimaryKey(deptno);
	}

	@Override
	public Dept getById(int deptno) {
		DeptExample example = new DeptExample();
		example.or().andDeptnoEqualTo(deptno)
		.andDelmarkEqualTo(1);
		List<Dept> list = deptMapper.selectByExample(example);
		if(list !=null && list.size()==1) {
			 return list.get(0);
		 }
		 return null;
	}

	@Override
	public PageInfo<Dept> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		PageHelper.startPage(pageNum, pageSize);
		DeptExample example = new DeptExample();
		com.neu.entity.DeptExample.Criteria criteria = example.or().andDelmarkEqualTo(1);
		if(!params.get("dname").toString().equals("")) {
			
			String a = params.get("dname").toString();
			criteria.andDnameLike("%"+a+"%");
		}
		if(!params.get("deptno").toString().equals("")) {
			int deptno = Integer.parseInt((String)params.get("deptno"));
			criteria.andDeptnoEqualTo(deptno);
		}
		List<Dept> list = deptMapper.selectByExample(example);
		PageInfo<Dept> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
	
	@Override
	public List<Dept> getAll() {
		DeptExample example = new DeptExample();
		example.or().andDelmarkEqualTo(1);
		return deptMapper.selectByExample(example);
	}

}

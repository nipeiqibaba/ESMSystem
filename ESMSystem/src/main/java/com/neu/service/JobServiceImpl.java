package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.neu.entity.Job;
import com.neu.entity.JobExample;
import com.neu.mapper.JobMapper;
@Service
public class JobServiceImpl implements JobService{
	@Autowired
	private JobMapper jobMapper;

	@Override
	public int insert(Job entity) {
		// TODO Auto-generated method stub
		return jobMapper.insert(entity);
	}

	@Override
	public int update(Job entity) {
		// TODO Auto-generated method stub
		return jobMapper.updateByPrimaryKey(entity);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jobMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Job getById(int id) {
		JobExample example =new JobExample();
		example.or().andJnoEqualTo(id).andDelmarkEqualTo(1);
		List<Job> list = jobMapper.selectByExample(example);
		if(list !=null && list.size()==1) {
			 return list.get(0);
		 }
		 return null;
	}

	@Override
	public PageInfo<Job> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Job> getAll() {
		JobExample example =new JobExample();
		example.or().andDelmarkEqualTo(1);
		return jobMapper.selectByExample(example);
	}

}

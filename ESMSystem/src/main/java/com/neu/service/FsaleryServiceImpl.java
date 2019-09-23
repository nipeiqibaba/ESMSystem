package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.neu.entity.Fsalery;
import com.neu.entity.FsaleryExample;
import com.neu.mapper.FsaleryMapper;

@Service
public class FsaleryServiceImpl implements FsaleryService {
	
	@Autowired
	private FsaleryMapper fsaleryMapper;
	@Override
	public int insert(Fsalery entity) {
		// TODO Auto-generated method stub
		return fsaleryMapper.insert(entity);
	}

	@Override
	public int update(Fsalery entity) {
		// TODO Auto-generated method stub
		return fsaleryMapper.updateByPrimaryKey(entity);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return fsaleryMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Fsalery getById(int id) {
		FsaleryExample example = new FsaleryExample();
		example.or().andIdEqualTo(id)
		.andDelmarkEqualTo(1);
		List<Fsalery> list = fsaleryMapper.selectByExample(example);
		if(list !=null && list.size()==1) {
			 return list.get(0);
		 }
		 return null;
	}

	@Override
	public PageInfo<Fsalery> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Fsalery> getAll() {
		FsaleryExample example = new FsaleryExample();
		example.or().andDelmarkEqualTo(1);
		return fsaleryMapper.selectByExample(example);
	}

}

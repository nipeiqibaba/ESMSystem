package com.neu.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.neu.entity.Emp;

public interface IService<T> {
	int insert(T entity);
	int update(T entity);
	int delete(int id);
	
	T getById(int id);
	PageInfo<T> getPaged(int pageNum,int pageSize,Map<String, Object> params);
	
	default List<T> getAll(){
		return null;
	}
	
}

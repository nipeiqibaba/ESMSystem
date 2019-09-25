package com.neu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.neu.entity.Dept;
import com.neu.entity.Emp;
import com.neu.service.DeptService;

@RestController
@RequestMapping("dept")
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("getAll")
	public List<Dept> getAll(){
		return deptService.getAll();
	}
	
	@RequestMapping("getPaged")
	public PageInfo<Dept> getPaged(
			@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="10") int pageSize,
			@RequestBody Map<String, Object> params
	){
		//System.out.println(empService.getPaged(pageNum, pageSize, params));
		return deptService.getPaged(pageNum, pageSize, params);
	}
	@RequestMapping("update")
	public int update(Dept dept) {
		return deptService.update(dept);
	}
	@RequestMapping("delete")
	public int delete(int deptno) {
		return deptService.delete(deptno);
	}
	@RequestMapping("insert")
	public int insert(Dept dept) {
		return deptService.insert(dept);
	}
}

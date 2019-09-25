package com.neu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import com.neu.entity.Emp;
import com.neu.service.EmpService;

@RestController
@RequestMapping("emp")
public class EmpManageController {
		
	@Autowired
	private EmpService empService;
	
	@RequestMapping("getPaged")
	public PageInfo<Emp> getPaged(
			@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="10") int pageSize,
			@RequestBody Map<String, Object> params
	){
		//System.out.println(empService.getPaged(pageNum, pageSize, params));
		return empService.getPaged(pageNum, pageSize, params);
	}
	@RequestMapping("update")
	public int update(Emp entity) {
		return empService.update(entity);
	}
	@RequestMapping("delete")
	public int delete(int empno) {
		return empService.delete(empno);
	}
	@RequestMapping("insert")
	public int insert(Emp emp) {
		return empService.insert(emp);
	}
	
}

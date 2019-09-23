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

import com.neu.entity.SalarySettleMent;
import com.neu.service.SalarySettleMentService;

@RestController
@RequestMapping("salary")
public class SalarySettleMentController {
		@Autowired
		private SalarySettleMentService salarySettleMentService;
		
		@RequestMapping("getAll")
		public List<SalarySettleMent>getAll(){						
			return salarySettleMentService.getAll();
		}
		
		@RequestMapping("getPaged")
		public PageInfo<SalarySettleMent> getPaged(
				@RequestParam(defaultValue="1") int pageNum,
				@RequestParam(defaultValue="10")int pageSize,
				@RequestBody Map<String, Object> params){
			System.out.println(salarySettleMentService.getPaged(pageNum, pageSize, params));
			return salarySettleMentService.getPaged(pageNum, pageSize, params);
		}
}

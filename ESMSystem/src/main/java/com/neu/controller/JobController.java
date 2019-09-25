package com.neu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.neu.entity.Job;
import com.neu.service.JobService;

@RestController
@RequestMapping("job")
public class JobController {
	@Autowired
	private JobService jobService;
	@RequestMapping("getAll")
	public List<Job> getAll(){
		return jobService.getAll();
	}
	@RequestMapping("getPaged")
	public PageInfo<Job> getPaged(@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="10") int pageSize,
			@RequestBody Map<String, Object> params){
		return jobService.getPaged(pageNum, pageSize, params);
	}
	
	@RequestMapping("delete")
	public int delete(int jno) {
		return jobService.delete(jno);
	}
	
	@RequestMapping("update")
	public int update(Job job) {
		return jobService.update(job);
	}
	
	@RequestMapping("insert")
	public int insert(Job job) {
		return jobService.insert(job);
	}
	
	
	
	
}

package com.neu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.entity.Admin;
import com.neu.entity.AdminExample;
import com.neu.mapper.AdminMapper;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public Admin login(String username, String password) {
		AdminExample example = new AdminExample();
		example.or().andUsernameEqualTo(username).andPasswordEqualTo(password);
		List<Admin> list = adminMapper.selectByExample(example);
		
		if(list.size() == 1) {
			return list.get(0);
		}
		
		return null;
	}
	}



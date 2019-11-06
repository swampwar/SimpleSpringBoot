package com.yang.wind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.wind.dto.Simple;
import com.yang.wind.mapper.SimpleMapper;

@Service
public class SimpleService {
	
	@Autowired
	SimpleMapper sMapper;
	
	public List<Simple> selectAll(){
		return sMapper.selectAll();
	}
}

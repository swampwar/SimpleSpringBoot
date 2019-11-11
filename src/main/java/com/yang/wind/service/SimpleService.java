package com.yang.wind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.wind.dto.Simple;
import com.yang.wind.mapper.SimpleMapper;

@Service
public class SimpleService {
	
	@Autowired
	SimpleMapper simpleMapper;
	
	public List<Simple> selectAll(){
		return simpleMapper.selectAll();
	}

	public Simple selectByName(String name){
		return simpleMapper.selectByKey(name);
	}

	public Simple selectByCols(String col1, int col2, String col3){
	    return simpleMapper.selectByCols(col1, col2, col3);
    }

    public void updateOne(Simple object){
		simpleMapper.updateOne(object);
	}

	public void insertOne(Simple object){
		simpleMapper.insertOne(object);
	}

	public void deleteOne(String name){
		simpleMapper.deleteOne(name);
	}
}

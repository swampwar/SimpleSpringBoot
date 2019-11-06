package com.yang.wind.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yang.wind.dto.Simple;

@Mapper
public interface SimpleMapper {
	List<Simple> selectAll(); 
}

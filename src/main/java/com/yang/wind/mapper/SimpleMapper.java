package com.yang.wind.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yang.wind.dto.Simple;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SimpleMapper {
	List<Simple> selectAll();
	Simple selectByKey(String key);
	Simple selectByCols(@Param("name") String param1, @Param("age") int param2, @Param("gender") String param3);
	void updateOne(Simple object);
	void insertOne(Simple object);
	void deleteOne(String key);
}

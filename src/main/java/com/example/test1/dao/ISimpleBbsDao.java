package com.example.test1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test1.domain.SimpleBbsDto;

@Mapper
public interface ISimpleBbsDao {
	
	public List<SimpleBbsDto> getList();
}

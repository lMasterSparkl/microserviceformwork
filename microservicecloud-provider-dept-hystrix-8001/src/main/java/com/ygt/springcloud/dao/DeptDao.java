package com.ygt.springcloud.dao;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ygt.springcloud.entities.Dept;


@Mapper
public interface DeptDao {
	  public boolean addDept(Dept dept);
	  
	  public Dept findById(Long id);
	 
	  public List<Dept> findAll();
}

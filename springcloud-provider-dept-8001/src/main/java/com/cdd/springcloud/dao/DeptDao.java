package com.cdd.springcloud.dao;

import com.cdd.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    public int addDept(Dept dept);

    public Dept queryById(Long deptno);

    public List<Dept> queryAll();



}

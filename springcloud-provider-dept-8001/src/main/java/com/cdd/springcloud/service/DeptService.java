package com.cdd.springcloud.service;

import com.cdd.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public int addDept(Dept dept);

    public Dept queryById(Long deptno);

    public List<Dept> queryAll();
}

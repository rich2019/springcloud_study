package com.cdd.springcloud.service;

import com.cdd.springcloud.dao.DeptDao;
import com.cdd.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImp implements DeptService {
    @Autowired
    private DeptDao deptDao;


    @Override
    public int addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long deptno) {
        return deptDao.queryById(deptno);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}

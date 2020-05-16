package com.cdd.springcloud.controller;

import com.cdd.springcloud.pojo.Dept;
import com.cdd.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public int addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/queryById/{deptno}")
    public Dept queryById(@PathVariable("deptno") Long deptno) {
        return deptService.queryById(deptno);
    }

    @GetMapping("/queryAll")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }
}

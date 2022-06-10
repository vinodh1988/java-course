package com.micro.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.app.entity.Dept;

public interface DeptRepository extends JpaRepository<Dept,Long> {
      public Dept findByDeptno(int deptno);
}

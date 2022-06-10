package com.micro.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.app.entity.Dept;
import com.micro.app.repositories.DeptRepository;
import com.micro.app.utils.RecordAlreadyExistsException;



@Service
public class DeptService {
	
	@Autowired
	  DeptRepository repo;

	public List<Dept> getDepts(){
		 return repo.findAll();
	}
	
	 public void addDept(Dept dept)  throws RecordAlreadyExistsException{
		    Dept d  = repo.findByDeptno(dept.getDeptno());
		 if(d==null)
		  repo.save(dept);
		 else
			throw new RecordAlreadyExistsException();
	  }
}

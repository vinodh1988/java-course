package com.micro.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.app.entity.Project;

public interface ProjectRepository extends JpaRepository<Project,Long>{
   public Project findByProjectno(int projectno);
}

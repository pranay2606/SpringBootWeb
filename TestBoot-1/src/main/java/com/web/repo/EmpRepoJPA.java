package com.web.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.EmpModel;

@Repository
public interface EmpRepoJPA extends JpaRepository<EmpModel, Integer>{

	List<EmpModel> findByJob(String keyword);
	List<EmpModel> findByJobAndDeptno(String keyword,int deptno);
	List<EmpModel> findBySalGreaterThan(int sal);

}

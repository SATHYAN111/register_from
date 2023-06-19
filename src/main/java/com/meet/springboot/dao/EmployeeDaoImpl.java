package com.meet.springboot.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meet.springboot.vo.EmployeeVo;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
@Autowired
	private SessionFactory sessionfactory;
	
	
	@Override
	public EmployeeVo addEmployee(EmployeeVo employeevo) {
		try {
			Session session=sessionfactory.getCurrentSession();
		int check=	(int) session.save(employeevo);
			if(check!=0) {
				employeevo.setEmpId(check);
				return employeevo;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public List<EmployeeVo> getAllEmployees() {
		
		try {
			List<EmployeeVo> employeesList=new ArrayList<EmployeeVo>();
			Session session=sessionfactory.getCurrentSession();
			CriteriaBuilder criteriabuilder=session.getCriteriaBuilder();
			CriteriaQuery<EmployeeVo> criteriaQuery=criteriabuilder.createQuery(EmployeeVo.class);
			Root<EmployeeVo> root=criteriaQuery.from(EmployeeVo.class);
		    criteriaQuery.select(root);
		    employeesList=session.createQuery(criteriaQuery).getResultList();
		    if(null!=employeesList&&employeesList.size()>0&&!employeesList.isEmpty()) {
		    	return employeesList;
		    }
		    }catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public EmployeeVo getEmployeeById(int id) {
		EmployeeVo employeevo=new EmployeeVo();
		try {
		Session session=sessionfactory.getCurrentSession();
		CriteriaBuilder criteriabuilder=session.getCriteriaBuilder();
		CriteriaQuery<EmployeeVo> criteriaQuery=criteriabuilder.createQuery(EmployeeVo.class);
		Root<EmployeeVo> root=criteriaQuery.from(EmployeeVo.class);
	    criteriaQuery.select(root);
	    criteriaQuery.where(criteriabuilder.equal(root.get("empId"), id));
	    employeevo=session.createQuery(criteriaQuery).uniqueResult();
	    if(null!=employeevo) {
	    	return employeevo;
	    }
		
	}catch (Exception e) {
		e.printStackTrace();
	}
		return null;
	}


	@Override
	public EmployeeVo updateEmployee(EmployeeVo employeevo) {
		try {
			Session session=sessionfactory.getCurrentSession();
		 session.update(employeevo);
			if(null!=employeevo) {
				
				return employeevo;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public int deleteEmployeeById(int id) {
		try {
			EmployeeVo employeevo=new EmployeeVo();
			employeevo.setEmpId(id);
		Session session=sessionfactory.getCurrentSession();
	 session.delete(employeevo);
		if(id>0) {
			
			return id;
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
		return 0;
	}

}

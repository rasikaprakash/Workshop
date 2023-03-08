package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Entity.Family;
import com.example.demo.Repository.FamilyRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;



@Service
public class FamilyService {

	@Autowired
	private FamilyRepo repo;
	
//	@Autowired
//	EntityManager entityManager;
//	
	public List<Family> getFamily() {
		return repo.findAll();	
	}
		
	
	
	public String addFamily(Family e) {
		 repo.save(e);
		 return "added";
	}
	public void delFamily(int id) {
		repo.deleteById(id);
		
	}
	public void updateFam(Family e) {
		repo.saveAndFlush(e);
	}
//	
//	public Family readEM(int age) {
//		
//		Query q=this.entityManager.createQuery("SELECT e FROM  Family e WHERE e.age=:age");
//		q.setParameter("age",age);
//		return (Family)q.getSingleResult();
//	}
}

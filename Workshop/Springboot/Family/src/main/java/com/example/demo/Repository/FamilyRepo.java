package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Family;

public interface FamilyRepo extends JpaRepository<Family, Integer> {
   
}

package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "family")
public class Family {
	
	@Id
	 @Column(name = "AGE")
	 private int age;
	
		@Column(name = "NAME")
		private String name;
		
		@Column(name = "RELATION")
		private String relation;
		
		@Column(name="PROFESSION")
		private String profession;
		
        @Column(name="PLACE")
        private String place;
		

		




		




		public Family(int age, String name, String relation, String profession, String place) {
			super();
			this.age = age;
			this.name = name;
			this.relation = relation;
			this.profession = profession;
			this.place = place;
		}












		public int getAge() {
			return age;
		}












		public void setAge(int age) {
			this.age = age;
		}












		public String getName() {
			return name;
		}












		public void setName(String name) {
			this.name = name;
		}












		public String getRelation() {
			return relation;
		}












		public void setRelation(String relation) {
			this.relation = relation;
		}












		public String getProfession() {
			return profession;
		}












		public void setProfession(String profession) {
			this.profession = profession;
		}












		public String getPlace() {
			return place;
		}












		public void setPlace(String place) {
			this.place = place;
		}












		public Family() {
			
		}

		
	}



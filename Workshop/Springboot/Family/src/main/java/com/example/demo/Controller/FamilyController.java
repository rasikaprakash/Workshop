package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.Family;
import com.example.demo.Service.FamilyService;

@CrossOrigin("http://localhost:3000")
@RestController

public class FamilyController {
	@Autowired
	FamilyService serv;
	
	@GetMapping("/displayFam")
   public List<Family> Display(){
  		return serv.getFamily();
	}
	@PostMapping("/addEmp")
	public String addEmployee(@RequestBody Family e) {
		return serv.addFamily(e);
	}
	@DeleteMapping("/delEmp/{id}")
	public String delEmployeebyid(@PathVariable("id") int id) {
		 serv.delFamily(id);
		 return "deleted succesfully";

	}
	@PutMapping("/insert")
	public List<Family> updateEmpb(@RequestBody Family e) {
		serv.updateFam(e);
		return Display();
	}
//	@GetMapping("/getEman/{age}")
//	public Family getThrEman(@PathVariable("age") int age){
//		return serv.readEM(age);
//	}
}

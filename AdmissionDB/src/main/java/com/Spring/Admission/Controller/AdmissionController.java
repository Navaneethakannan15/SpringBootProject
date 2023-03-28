package com.Spring.Admission.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Admission.Model.Admission;
import com.Spring.Admission.Repository.AdmissionRepository;

@RestController
@RequestMapping("/api")
public class AdmissionController {
	@Autowired
	private AdmissionRepository adminRepo;
	
	@GetMapping("/display")
	public List<Admission> getDetails(){
		
		return adminRepo.findAll();
	}
	
	

}

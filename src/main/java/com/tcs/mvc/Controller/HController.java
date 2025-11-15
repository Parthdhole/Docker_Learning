package com.tcs.mvc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.mvc.Entity.Enitiy;
import com.tcs.mvc.sevice.HService;

@RestController
public class HController {
	
	@Autowired
	HService hService;
	
	@GetMapping("/result")
	public List<Enitiy> getAlluser(){
		
		return hService.getAlluser();
	}
	@GetMapping("/result/{id}")
	public List<Enitiy> getAlluserbyid(@PathVariable Long id ){
		
		return hService.getAlluserByid(id);
	}
	@PostMapping("/saveHospital")
    public Enitiy SaveHospitals(@RequestBody Enitiy enitiy){
		
		return hService.saveHospital(enitiy);
	}
	
	@PutMapping
	
	

}

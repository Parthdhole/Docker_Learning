package com.tcs.mvc.sevice;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.mvc.Entity.Enitiy;
import com.tcs.mvc.repository.HRespoistory;

@Service
public class HService {
	
	@Autowired
	HRespoistory hRespoistory;

	public List<Enitiy> getAlluser() {
		// TODO Auto-generated method stub
		return  hRespoistory.findAll();
	}

	public List<Enitiy> getAlluserByid(Long id) {
		// TODO Auto-generated method stub
		
//	   return Enitiy result=  hRespoistory.findById(id).orElse(null); // but it give single entity
	    return hRespoistory.findAllById(Arrays.asList(id));
	   
			
	}

	public Enitiy saveHospital(Enitiy enitiy) {
		// TODO Auto-generated method stub
		return hRespoistory.save(enitiy);
	}
//	public void saveHospitall(List<Enitiy> enitiy) {
//		// TODO Auto-generated method stub
//		return hRespoistory.addAll(enitiy); 
//	}

}

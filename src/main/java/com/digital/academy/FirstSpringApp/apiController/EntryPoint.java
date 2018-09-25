package com.digital.academy.FirstSpringApp.apiController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digital.academy.FirstSpringApp.Entity.Person;
import com.digital.academy.FirstSpringApp.PersonImple.PersonImple;
import com.digital.academy.FirstSpringApp.Service.PersonRepo;


@RestController
@RequestMapping("/info")

public class EntryPoint {
	
	@Autowired
	PersonRepo pRepo;
	@Autowired
	PersonImple personIm;
	
	@PostMapping("/save")
	public Person saves(@RequestParam String name,@RequestParam String surname,@RequestParam String gender) {
				
		return pRepo.save(personIm.saved(name,surname,gender));
	}
	
	
//	@PostMapping("/delete")
//	public boolean deletes(@RequestParam String name) {
//				
//		//return pRepo.delete(personIm.saved(name));
//		return personIm.delete(name);
//	}
	
	@GetMapping("/list")
	public ArrayList<Person> list() {
		
		return personIm.listOfPpl();
	}
	
	@GetMapping("/search")
	public String search(@RequestParam String name)
	{
		return personIm.search(name);
	}
	
	@GetMapping("/delete")
	public void delete(@RequestParam int id) 
	{
	      personIm.delete(id);
	    	 
	     
	}


}

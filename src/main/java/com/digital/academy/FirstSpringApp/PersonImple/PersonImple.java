package com.digital.academy.FirstSpringApp.PersonImple;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digital.academy.FirstSpringApp.Entity.Person;
import com.digital.academy.FirstSpringApp.PersonInter.PersonInter;
import com.digital.academy.FirstSpringApp.Service.PersonRepo;


@Component
public class PersonImple implements PersonInter {
	@Autowired
	PersonRepo pRepo;
	@Autowired
	Person person;
	
	@Override
	public Person saved(String name,String surname,String gender) {
		
		person.setName(name);
		person.setSurname(surname);
		person.setGender(gender);
		
		return person;
	}

	@Override
	public ArrayList<Person> listOfPpl() {
		
		return (ArrayList<Person>) pRepo.findAll();
	}

	
	@Override
	public String search(String name) {
		
		List<Person> arr = new ArrayList<Person>();
		
		arr.addAll((Collection<? extends Person>) pRepo.findAll());
		
		for(Person per : arr)
		{
			if(per.getName().equalsIgnoreCase(name))
			{
				return per.toString();
			}
		}
		return "Person not found!";
	}
	
	
	
	@Override
	public void delete(int id) 
	{
		pRepo.deleteById(id);
	}



}

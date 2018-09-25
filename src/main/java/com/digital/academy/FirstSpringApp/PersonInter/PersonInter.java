package com.digital.academy.FirstSpringApp.PersonInter;



import java.util.ArrayList;

import com.digital.academy.FirstSpringApp.Entity.Person;



public interface PersonInter {
	
	public Person saved(String name,String surname,String gender);
	public ArrayList<Person>  listOfPpl();
	public String search(String name);
	public void delete(int id); 

}

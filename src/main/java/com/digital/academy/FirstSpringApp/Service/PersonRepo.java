package com.digital.academy.FirstSpringApp.Service;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.digital.academy.FirstSpringApp.Entity.Person;
@Service
@Component
@Transactional
public interface PersonRepo extends CrudRepository<Person,Integer>{
	

}

package com.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.model.Person;

public interface PersonRepository extends JpaRepository<Person,String>{

}

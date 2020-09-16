package com.healthcare.DAO;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.healthcare.model.DiagnosticCenter;
import com.healthcare.model.Person;
import com.healthcare.model.Test;
import com.healthcare.repository.PersonRepository;



@Repository
public class HealthCareDAOImpl implements HealthCareDAO{

	@Autowired PersonRepository personRepo;
	
	@Override
	public boolean login() {
		return false;
	}

	@Override
	public boolean logout() {
		return false;
	}

	@Override
	public String addCenter(DiagnosticCenter center) {
		return null;
	}

	@Override
	public boolean removeCenter(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String addTest(Test test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeTest(Test test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean approveAppointment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigInteger makeAppointment(Person user, DiagnosticCenter center, Test test, java.sql.Date dateTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean register(Person person) {
		try{
			personRepo.save(person);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
}

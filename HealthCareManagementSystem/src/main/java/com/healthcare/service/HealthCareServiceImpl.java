package com.healthcare.service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.DAO.HealthCareDAO;
import com.healthcare.DAO.HealthCareDAOImpl;
import com.healthcare.model.DiagnosticCenter;
import com.healthcare.model.Person;
import com.healthcare.model.Test;

@Service
public class HealthCareServiceImpl implements HealthCareService{

	@Autowired HealthCareDAO dao;
	
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
		// TODO Auto-generated method stub
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
	public BigInteger makeAppointment(Person user, DiagnosticCenter center, Test test, Date dateTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean register(Person person) {
		return dao.register(person);
	}
	
	

}

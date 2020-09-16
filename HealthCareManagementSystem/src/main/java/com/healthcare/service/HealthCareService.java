package com.healthcare.service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

import com.healthcare.model.DiagnosticCenter;
import com.healthcare.model.Person;
import com.healthcare.model.Test;

public interface HealthCareService {
	
	public boolean login();
	public boolean logout();
	
	public String addCenter(DiagnosticCenter center);
	
	public boolean removeCenter(DiagnosticCenter center);
	
	public String addTest(Test test);
	
	public Boolean removeTest(Test test);
	
	public Boolean approveAppointment();
	
	public BigInteger makeAppointment(Person user,DiagnosticCenter center, Test test,Date dateTime );
	
	public boolean register(Person user);
}

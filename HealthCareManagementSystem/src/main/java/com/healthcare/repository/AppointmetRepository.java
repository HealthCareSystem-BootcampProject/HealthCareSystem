package com.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.model.Appointment;

public interface AppointmetRepository extends JpaRepository<Appointment, String>{

}

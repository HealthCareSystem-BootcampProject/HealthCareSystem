package com.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.model.Test;

public interface TestRepository extends JpaRepository<Test,String>{

}

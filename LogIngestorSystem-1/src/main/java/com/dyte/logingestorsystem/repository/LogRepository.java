package com.dyte.logingestorsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dyte.logingestorsystem.model.Log;

public interface LogRepository extends JpaRepository<Log, Integer> {

}

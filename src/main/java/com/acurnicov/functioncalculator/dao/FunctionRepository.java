package com.acurnicov.functioncalculator.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acurnicov.functioncalculator.domain.Function;

@Repository
public interface FunctionRepository extends JpaRepository<Function, Long> {

}

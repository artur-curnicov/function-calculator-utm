package com.acurnicov.functioncalculator.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acurnicov.functioncalculator.domain.model.Function;

@Repository
public interface FunctionRepository extends JpaRepository<Function, Long> {
    Optional<Function> findByParam1AndParam2AndParam3(Integer param1, Integer param2, Integer param3);
}

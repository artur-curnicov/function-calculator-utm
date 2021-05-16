package com.acurnicov.functioncalculator.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acurnicov.functioncalculator.dao.FunctionRepository;
import com.acurnicov.functioncalculator.domain.dto.FunctionResult;
import com.acurnicov.functioncalculator.domain.model.Function;
import com.acurnicov.functioncalculator.service.FunctionService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class FunctionServiceImpl implements FunctionService {
    
    private final FunctionRepository functionRepository;

    @Override
    public FunctionResult calculateFunction(int param1, int param2, int param3) {
        Optional<Function> functionEntity = functionRepository.findByParam1AndParam2AndParam3(param1, param2, param3);

        if (functionEntity.isPresent()) {
            Function function = functionEntity.get();
            return new FunctionResult(function.getDelta(), function.getX1(), function.getX2());
        }

        FunctionResult functionResult = calculate(param1, param2, param3);
        Function newFunction = Function.builder()
                .param1(param1)
                .param2(param2)
                .param3(param3)
                .delta(functionResult.getDelta())
                .x1(functionResult.getX1())
                .x2(functionResult.getX2())
                .build();

        functionRepository.save(newFunction);

        return functionResult;
    }
    
    private FunctionResult calculate(int param1, int param2, int param3) {
        double delta = calculateDelta(param1, param2, param3);

        if (delta < 0) {
            return new FunctionResult(delta, null, null);
        } else if (delta == 0) {
            double x = -(param2 / (2 * param1));
            return new FunctionResult(delta, x, x);
        }

        double x1 = calculateX1(delta, param1, param2);
        double x2 = calculateX2(delta, param1, param2);

        return new FunctionResult(delta, x1, x2);
    }

    private double calculateDelta(int param1, int param2, int param3) {
        return Math.pow(param2, 2) - 4 * param1 * param3;
    }

    private double calculateX1(double delta, int param1, int param2) {
        return (-param2 + Math.sqrt(delta)) / (2 * param1);
    }

    private double calculateX2(double delta, int param1, int param2) {
        return (-param2 - Math.sqrt(delta)) / (2 * param1);
    }
}

package com.acurnicov.functioncalculator.service;

import com.acurnicov.functioncalculator.domain.dto.FunctionResult;

public interface FunctionService {
    FunctionResult calculateFunction(int param1, int param2, int param3);
}

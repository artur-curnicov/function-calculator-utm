package com.acurnicov.functioncalculator.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FunctionResult {
    private Double delta;
    private Double x1;
    private Double x2;
}

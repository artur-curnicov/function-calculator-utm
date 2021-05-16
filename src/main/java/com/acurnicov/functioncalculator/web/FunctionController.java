package com.acurnicov.functioncalculator.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acurnicov.functioncalculator.domain.dto.FunctionResult;
import com.acurnicov.functioncalculator.service.FunctionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/function")
@RequiredArgsConstructor
public class FunctionController {

    private final FunctionService functionService;

    @GetMapping
    public ResponseEntity<FunctionResult> calculateFunction(@RequestParam Integer param1, @RequestParam Integer param2, @RequestParam Integer param3) {
        FunctionResult functionResult = functionService.calculateFunction(param1, param2, param3);
        return ResponseEntity.ok(functionResult);
    }
}

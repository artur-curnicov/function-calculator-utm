package com.acurnicov.functioncalculator.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acurnicov.functioncalculator.domain.dto.FunctionResult;

@RestController
@RequestMapping("/function")
public class FunctionController {

    @GetMapping
    public ResponseEntity<FunctionResult> calculateFunction(@RequestParam Integer param1, @RequestParam Integer param2, @RequestParam Integer param3) {
        return null;
    }
}

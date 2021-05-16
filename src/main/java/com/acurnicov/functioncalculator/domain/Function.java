package com.acurnicov.functioncalculator.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table("t_function")
public class Function {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "param_1")
    private String param1;

    @Column(name = "param_2")
    private String param2;

    @Column(name = "param_3")
    private String param3;

    @Column(name = "x_1")
    private String x1;

    @Column(name = "x_2")
    private String x2;

    @Column(name = "delta")
    private String delta;
}

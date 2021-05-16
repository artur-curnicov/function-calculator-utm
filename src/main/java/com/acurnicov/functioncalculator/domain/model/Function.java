package com.acurnicov.functioncalculator.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_function")
public class Function {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "param_1")
    private Integer param1;

    @Column(name = "param_2")
    private Integer param2;

    @Column(name = "param_3")
    private Integer param3;

    @Column(name = "x_1")
    private Double x1;

    @Column(name = "x_2")
    private Double x2;

    @Column(name = "delta")
    private Double delta;
}

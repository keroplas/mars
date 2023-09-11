package com.example.mars.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin("*")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "result_id", referencedColumnName = "id")
    private Result result;

    private double op1;
    private double op2;
    private String operations []= {"add", "deduct", "multiply", "divide"};



}

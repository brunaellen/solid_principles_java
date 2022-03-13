package br.com.alura.rh.service;

import br.com.alura.rh.model.Employee;

import java.math.BigDecimal;

public interface ValidationSalaryAdjustment {
    void validate(Employee employee, BigDecimal amount);
}

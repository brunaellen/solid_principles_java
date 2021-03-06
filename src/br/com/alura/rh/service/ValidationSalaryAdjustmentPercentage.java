package br.com.alura.rh.service;

import br.com.alura.rh.ValidationException;
import br.com.alura.rh.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidationSalaryAdjustmentPercentage implements ValidationSalaryAdjustment{
    public void validate(Employee employee, BigDecimal amount) {
        BigDecimal currentSalary = employee.getSalary();
        BigDecimal adjustmentPercentage = amount.divide(currentSalary, RoundingMode.HALF_UP);
        if (adjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidationException("Salary adjustment cannot be higher than 40% of the salary amount!");
        }
    }
}

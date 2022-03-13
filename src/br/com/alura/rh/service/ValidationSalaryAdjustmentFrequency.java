package br.com.alura.rh.service;

import br.com.alura.rh.ValidationException;
import br.com.alura.rh.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidationSalaryAdjustmentFrequency implements ValidationSalaryAdjustment{
    public void validate(Employee employee, BigDecimal amount) {
        LocalDate dateOfLastSalaryAdjustment = employee.getDateOfLastSalaryAdjustment();
        LocalDate currentDate = LocalDate.now();
        long MonthsSumOfLastSalaryAdjustment = ChronoUnit.MONTHS.between(dateOfLastSalaryAdjustment, currentDate);
        if (MonthsSumOfLastSalaryAdjustment < 6) {
            throw new ValidationException("Interval between salary adjustment must be a minimum of 6 months!");
        }
    }
}

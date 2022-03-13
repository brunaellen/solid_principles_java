package br.com.alura.rh.service;

import br.com.alura.rh.ValidationException;
import br.com.alura.rh.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

public class SalaryAdjustmentService {
    private List<ValidationSalaryAdjustment> validations;

    public SalaryAdjustmentService(List<ValidationSalaryAdjustment> validations) {
        this.validations = validations;
    }

    public void updateSalary(Employee employee, BigDecimal amount) {
        this.validations.forEach(validation -> validation.validate(employee, amount));

        BigDecimal salaryReadjusted = employee.getSalary().add(amount);
        employee.setSalary(salaryReadjusted);
        employee.setDateOfLastSalaryAdjustment(LocalDate.now());
    }
}

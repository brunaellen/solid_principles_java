package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidationException;

public class Employee {

	private String name;
	private String cpf;
	private Role role;
	private BigDecimal salary;
	private LocalDate dateOfLastSalaryAdjustment;

	public Employee(String name, String cpf, Role role, BigDecimal salary) {
		this.name = name;
		this.cpf = cpf;
		this.role = role;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {this.role = role;}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfLastSalaryAdjustment() {
		return dateOfLastSalaryAdjustment;
	}

	public void setDateOfLastSalaryAdjustment(LocalDate dateOfLastSalaryAdjustment) {
		this.dateOfLastSalaryAdjustment = dateOfLastSalaryAdjustment;
	}

    public void promote(Role newRole) {
		this.role = newRole;
    }
}

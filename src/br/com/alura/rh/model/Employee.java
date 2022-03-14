package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
	private PersonalDetails personalDetails;
	private LocalDate dateOfLastSalaryAdjustment;

	public Employee(String name, String cpf, Role role, BigDecimal salary) {
		this.personalDetails = new PersonalDetails(name, cpf, role, salary);
	}

	public String getName() {
		return personalDetails.getName();
	}

	public String getCpf() {
		return personalDetails.getCpf();
	}

	public Role getRole() {
		return personalDetails.getRole();
	}

	public BigDecimal getSalary() {
		return personalDetails.getSalary();
	}

	public LocalDate getDateOfLastSalaryAdjustment() {
		return dateOfLastSalaryAdjustment;
	}

	public void setDateOfLastSalaryAdjustment(LocalDate dateOfLastSalaryAdjustment) {
		this.dateOfLastSalaryAdjustment = dateOfLastSalaryAdjustment;
	}

    public void promote(Role newRole) {
		personalDetails.updateRole(newRole);
    }
}

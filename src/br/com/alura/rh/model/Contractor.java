package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Contractor{
    private String company;
    private PersonalDetails personalDetails;

    public Contractor(String name, String cpf, Role role, BigDecimal salary) {
        this.personalDetails = new PersonalDetails(name, cpf, role, salary);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
}

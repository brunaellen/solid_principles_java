package br.com.alura.rh.model;

import java.math.BigDecimal;

public class PersonalDetails {
    private String name;
    private String cpf;
    private Role role;
    private BigDecimal salary;

    public PersonalDetails(String name, String cpf, Role role, BigDecimal salary) {
        this.name = name;
        this.cpf = cpf;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Role getRole() {
        return role;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void updateRole(Role role) {
        this.role = role;
    }
}

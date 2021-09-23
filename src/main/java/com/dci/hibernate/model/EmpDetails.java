package com.dci.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name="EMP_DETAILS")
public class EmpDetails {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ED_ID", unique = true, nullable = false)
    private Long edId;
 
    private String address;
 
    private String gender;
 
    @Column(name="YEARS_OF_SERVICE")
    private Long yearsOfService;
 
    @Column(name="BANK_ACCOUNT")
    private String bankAccount;
 
    @OneToOne
    @JoinColumn(name="EMP_ID")
    private Employee employee;
 
    public Long getEdId() {
        return edId;
    }
 
    public void setEdId(Long edId) {
        this.edId = edId;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public String getGender() {
        return gender;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public Long getYearsOfService() {
        return yearsOfService;
    }
 
    public void setYearsOfService(Long yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
 
    public String getBankAccount() {
        return bankAccount;
    }
 
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
 
    public Employee getEmployee() {
        return employee;
    }
 
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
 
    @Override
    public String toString() {
 
        return this.gender+" | "+this.address+" | "+this.yearsOfService+" | "+this.bankAccount;
    }
}

package com.github.gn5r.web.employee.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeeDto {

  private Integer id;
  private String name;
  private String departmentName;
  private LocalDate hireDate;
  private LocalDate retirementDate;
  private LocalDateTime updateDate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  public LocalDate getRetirementDate() {
    return retirementDate;
  }

  public void setRetirementDate(LocalDate retirementDate) {
    this.retirementDate = retirementDate;
  }

  public LocalDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDateTime updateDate) {
    this.updateDate = updateDate;
  }
}

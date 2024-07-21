package com.github.gn5r.web.employee.form;

import com.github.gn5r.web.common.dto.BaseForm;

import java.io.Serializable;

public class EmployeeForm implements BaseForm, Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private String department;
  private String startHireDate;
  private String endHireDate;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getStartHireDate() {
    return startHireDate;
  }

  public void setStartHireDate(String startHireDate) {
    this.startHireDate = startHireDate;
  }

  public String getEndHireDate() {
    return endHireDate;
  }

  public void setEndHireDate(String endHireDate) {
    this.endHireDate = endHireDate;
  }
}

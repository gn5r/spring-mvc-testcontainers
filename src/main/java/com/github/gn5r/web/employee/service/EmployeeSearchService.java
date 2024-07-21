package com.github.gn5r.web.employee.service;

import com.github.gn5r.web.common.dto.SelectBoxDto;
import com.github.gn5r.web.employee.dto.EmployeeDto;
import com.github.gn5r.web.employee.form.EmployeeForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeSearchService {
  List<SelectBoxDto> getDepartments();

  Page<EmployeeDto> searchEmployee(EmployeeForm form, Pageable pageable);
}

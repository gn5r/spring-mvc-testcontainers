package com.github.gn5r.web.employee.service.impl;

import com.github.gn5r.web.common.dto.SelectBoxDto;
import com.github.gn5r.web.employee.dto.EmployeeDto;
import com.github.gn5r.web.employee.form.EmployeeForm;
import com.github.gn5r.web.employee.mapper.EmployeeSearchMapper;
import com.github.gn5r.web.employee.service.EmployeeSearchService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeSearchServiceImpl implements EmployeeSearchService {

  private final EmployeeSearchMapper employeeSearchMapper;

  public EmployeeSearchServiceImpl(EmployeeSearchMapper employeeSearchMapper) {
    this.employeeSearchMapper = employeeSearchMapper;
  }

  /**
   * @see EmployeeSearchService#getDepartments()
   */
  @Override
  public List<SelectBoxDto> getDepartments() {
    return employeeSearchMapper.selectDepartments();
  }

  /**
   * @see EmployeeSearchService#searchEmployee(EmployeeForm, org.springframework.data.domain.Pageable)
   */
  @Override
  public Page<EmployeeDto> searchEmployee(EmployeeForm form, Pageable pageable) {
    RowBounds rowBounds = new RowBounds((int) pageable.getOffset(), pageable.getPageSize());
    List<EmployeeDto> list = employeeSearchMapper.searchEmployee(form.toMap(), rowBounds);
    int count = employeeSearchMapper.countSearchEmployee(form.toMap());
    return new PageImpl<>(list, pageable, count);
  }
}

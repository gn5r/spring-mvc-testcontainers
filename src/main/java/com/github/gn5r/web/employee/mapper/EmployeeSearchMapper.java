package com.github.gn5r.web.employee.mapper;

import com.github.gn5r.web.common.dto.SelectBoxDto;
import com.github.gn5r.web.employee.dto.EmployeeDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeSearchMapper {

  List<EmployeeDto> searchEmployee(Map<String, Object> condition, RowBounds rowBounds);

  int countSearchEmployee(Map<String, Object> condition);

  List<SelectBoxDto> selectDepartments();
}

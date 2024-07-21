package com.github.gn5r.web.employee.mapper;

import com.github.gn5r.web.AbstractMapperTest;
import com.github.gn5r.web.common.dto.SelectBoxDto;
import com.github.gn5r.web.employee.dto.EmployeeDto;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Sql("/META-INF/sql/com/github/gn5r/web/employee/mapper/insert_data_employee.sql")
public class EmployeeSearchMapperTest extends AbstractMapperTest {

  @Autowired
  private EmployeeSearchMapper employeeSearchMapper;

  @Test
  public void searchEmployee() {
    Map<String, Object> condition = new HashMap<String, Object>();
    RowBounds rowBounds = new RowBounds(0, 20);
    List<EmployeeDto> list = employeeSearchMapper.searchEmployee(condition, rowBounds);
    list.forEach(e -> getLog(EmployeeSearchMapper.class).info("employee: {}", ToStringBuilder.reflectionToString(e, ToStringStyle.SHORT_PREFIX_STYLE)));
    assertNotNull(list);
    assertEquals(13, list.size());

    condition.clear();
    condition.put("name", "テスト");
    list = employeeSearchMapper.searchEmployee(condition, rowBounds);
    assertNotNull(list);
    assertEquals(13, list.size());

    condition.clear();
    condition.put("name", "太郎10");
    list = employeeSearchMapper.searchEmployee(condition, rowBounds);
    assertNotNull(list);
    assertEquals(1, list.size());

    condition.clear();
    condition.put("department", "1");
    list = employeeSearchMapper.searchEmployee(condition, rowBounds);
    assertNotNull(list);
    assertEquals(1, list.size());

    condition.clear();
    condition.put("startHireDate", "2000-01-01");
    condition.put("endHireDate", "2000-01-31");
    list = employeeSearchMapper.searchEmployee(condition, rowBounds);
    assertNotNull(list);
    assertEquals(3, list.size());

    condition.clear();
    condition.put("startHireDate", "2001-01-01");
    list = employeeSearchMapper.searchEmployee(condition, rowBounds);
    assertNotNull(list);
    assertEquals(10, list.size());

    condition.clear();
    condition.put("endHireDate", "2001-12-31");
    list = employeeSearchMapper.searchEmployee(condition, rowBounds);
    assertNotNull(list);
    assertEquals(6, list.size());
  }

  @Test
  public void countSearchEmployee() {
    Map<String, Object> condition = new HashMap<String, Object>();
    int count = employeeSearchMapper.countSearchEmployee(condition);
    assertEquals(13, count);

    condition.clear();
    condition.put("name", "テスト");
    count = employeeSearchMapper.countSearchEmployee(condition);
    assertEquals(13, count);

    condition.clear();
    condition.put("name", "太郎10");
    count = employeeSearchMapper.countSearchEmployee(condition);
    assertEquals(1, count);

    condition.clear();
    condition.put("department", "1");
    count = employeeSearchMapper.countSearchEmployee(condition);
    assertEquals(1, count);

    condition.clear();
    condition.put("startHireDate", "2000-01-01");
    condition.put("endHireDate", "2000-01-31");
    count = employeeSearchMapper.countSearchEmployee(condition);
    assertEquals(3, count);

    condition.clear();
    condition.put("startHireDate", "2001-01-01");
    count = employeeSearchMapper.countSearchEmployee(condition);
    assertEquals(10, count);

    condition.clear();
    condition.put("endHireDate", "2001-12-31");
    count = employeeSearchMapper.countSearchEmployee(condition);
    assertEquals(6, count);
  }

  @Test
  public void selectDepartments() {
    List<SelectBoxDto> list = employeeSearchMapper.selectDepartments();
    list.forEach(e -> getLog(EmployeeSearchMapper.class).info("department select box: {}", ToStringBuilder.reflectionToString(e, ToStringStyle.SHORT_PREFIX_STYLE)));
    assertNotNull(list);
    assertEquals(13, list.size());
  }
}

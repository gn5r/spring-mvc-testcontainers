package com.github.gn5r.web.mybatis.mapper;

import com.github.gn5r.web.AbstractMapperTest;
import com.github.gn5r.web.mybatis.entity.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class EmployeeMapperTest extends AbstractMapperTest {

  @Autowired
  private EmployeeMapper employeeMapper;

  @Test
  public void selectAllIsEmpty() {
    List<Employee> list = employeeMapper.selectAll();
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }
}

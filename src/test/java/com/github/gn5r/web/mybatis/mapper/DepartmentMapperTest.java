package com.github.gn5r.web.mybatis.mapper;

import com.github.gn5r.web.AbstractMapperTest;
import com.github.gn5r.web.mybatis.entity.Department;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class DepartmentMapperTest extends AbstractMapperTest {

  @Autowired
  private DepartmentMapper departmentMapper;

  @Test
  public void selectAll() {
    List<Department> list = departmentMapper.selectAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(13, list.size());
  }
}

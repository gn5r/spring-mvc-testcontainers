package com.github.gn5r.web.index.mapper;

import com.github.gn5r.web.AbstractMapperTest;
import com.github.gn5r.web.index.dto.EmployeeDto;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class IndexMapperTest extends AbstractMapperTest {

  @Autowired
  private IndexMapper indexMapper;

  @Test
  @Sql("/META-INF/sql/com/github/gn5r/web/index/mapper/insert_data_employee.sql")
  public void selectAll() {
    List<EmployeeDto> list = indexMapper.selectAll();
    assertNotNull(list);
    assertEquals(13, list.size());
    list.forEach(e -> getLog(IndexMapper.class).info("employee: {}", ToStringBuilder.reflectionToString(e, ToStringStyle.SHORT_PREFIX_STYLE)));
  }
}

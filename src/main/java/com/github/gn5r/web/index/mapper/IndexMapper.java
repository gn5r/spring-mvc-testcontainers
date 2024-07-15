package com.github.gn5r.web.index.mapper;

import com.github.gn5r.web.index.dto.EmployeeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexMapper {

  List<EmployeeDto> selectAll();
}

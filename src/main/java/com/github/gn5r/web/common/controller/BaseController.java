package com.github.gn5r.web.common.controller;

import com.github.gn5r.web.common.dto.SelectBoxDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BaseController {

  private static final Logger log = LoggerFactory.getLogger(BaseController.class);

  @Value("${spring.data.pageable.rows-per-pages}")
  private String[] rowsPerPages;

  @ModelAttribute
  public void setModelAttributes(Model model, HttpServletRequest request) {
    String servletPath = request.getServletPath();
    log.info("request.getServletPath(): {} ", servletPath);
    model.addAttribute("servletPath", servletPath);
    model.addAttribute("rowsPerPages", Arrays.stream(rowsPerPages).map(s -> {
      SelectBoxDto select = new SelectBoxDto();
      select.setValue(s);
      select.setTitle(s);
      return select;
    }).collect(Collectors.toList()));
  }
}

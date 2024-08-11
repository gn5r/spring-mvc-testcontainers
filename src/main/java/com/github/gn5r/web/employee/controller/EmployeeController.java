package com.github.gn5r.web.employee.controller;

import com.github.gn5r.web.common.controller.BaseController;
import com.github.gn5r.web.common.dto.SelectBoxDto;
import com.github.gn5r.web.employee.dto.EmployeeDto;
import com.github.gn5r.web.employee.form.EmployeeForm;
import com.github.gn5r.web.employee.service.EmployeeSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("employee")
@RequiredArgsConstructor
public class EmployeeController extends BaseController {

  private final EmployeeSearchService employeeSearchService;

  @ModelAttribute("departments")
  public List<SelectBoxDto> getDepartments() {
    return employeeSearchService.getDepartments();
  }

  @RequestMapping(value = "/search.html", method = RequestMethod.GET)
  public String index(@ModelAttribute EmployeeForm employeeForm) {
    return "employee/search";
  }

  @RequestMapping(value = "/search.html", method = RequestMethod.POST)
  public String search(EmployeeForm employeeForm, Model model, @PageableDefault(page = 0, size = 5) Pageable pageable) {
    pageable = pageable.withPage(pageable.getPageNumber() == 0 ? 0 : pageable.getPageNumber() - 1);
    Page<EmployeeDto> page = employeeSearchService.searchEmployee(employeeForm, pageable);
    model.addAttribute("list", page.getContent());
    model.addAttribute("page", page);
    return "employee/search";
  }
}

package com.github.gn5r.web.index.controller;

import com.github.gn5r.web.common.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController extends BaseController {

  private static final Logger log = LoggerFactory.getLogger(IndexController.class);

  @Value("${spring.application.name}")
  private String applicationName;

  @GetMapping({"", "/", "index.html"})
  public String index(Model model) {
    log.debug(applicationName);
    model.addAttribute("applicationName", applicationName);
    return "index";
  }
}

package com.karan.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class GreetingController {  // Handles GET requests for /greeting by returning the name of a View

  @RequestMapping("/greeting")
  public String greeting(@RequestParam(value = "name",
                                       required = false,
                                       defaultValue = "My Default world")
                               String name, Model model){

    model.addAttribute("name", name);  // ???
    return "greeting";
  }
}

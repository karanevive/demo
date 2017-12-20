package com.karan.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Contoller Combines - Controller and Response body - Read more about it!!!   -   15/12/2017
 * two annotations that results in web requests returning data, rather than a view.
 */
@Controller
@RestController
public class HelloController {

  @RequestMapping("/")
  public String index() {
    return "Greetings!! Karan Arora, push it";
  }

}

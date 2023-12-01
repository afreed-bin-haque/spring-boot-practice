package com.abhapi.preview.http.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pageController {

  @GetMapping("/")
  public String welcomeRes(){
    return "Welcome to abh api platform";
  }
}

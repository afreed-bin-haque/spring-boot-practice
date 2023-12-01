package com.abhapi.preview.http.Controllers;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pageController {

  @GetMapping("/")
  @ResponseBody
  public Map<String, String>  welcomeRes(){
    Map<String, String> response = new HashMap<>();
    response.put("msg", "Welcome to abh api platform");
    response.put("version", Float.toString(1.0f));
    response.put("platform", "Java Spring Boot");
    response.put("status", Boolean.toString(true));
    return response;
  }
}

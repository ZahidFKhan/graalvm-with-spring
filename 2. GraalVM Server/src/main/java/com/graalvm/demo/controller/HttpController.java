package com.graalvm.demo.controller;

import com.graalvm.demo.service.ValuationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class HttpController {
  private final ValuationService valuationService;

  @GetMapping("pvc")
  String getHomepage() {
    log.info("Controller called");
    valuationService.valuate();
    return "Hello world";
  }
}

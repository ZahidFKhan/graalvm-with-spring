package com.graalvm.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ValuationService {
  public long valuate() {
    log.info("Valuation process started");
    log.info("Valuation process ended");
    return 0;
  }
}

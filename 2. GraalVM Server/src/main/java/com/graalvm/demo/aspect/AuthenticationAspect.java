package com.graalvm.demo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Slf4j
@Service
public class AuthenticationAspect {
  @Before("execution(* com.graalvm.demo.service.ValuationService.valuate(..))") // the pointcut expression
  public void publicMethodAuthentication() {
    log.info("Authentication check");
  }

  @After("execution(* com.graalvm.demo.service.ValuationService.valuate(..))") // the pointcut expression
  public void commitTransaction() {
    log.info("Transaction committed.");
  }

}

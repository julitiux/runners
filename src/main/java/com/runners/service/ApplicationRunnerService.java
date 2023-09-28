package com.runners.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApplicationRunnerService implements ApplicationRunner {
  @Override
  public void run(ApplicationArguments args) throws Exception {
    log.info("== Sending Message from ApplicationRunner ==");
  }
}

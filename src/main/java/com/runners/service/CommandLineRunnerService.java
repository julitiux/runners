package com.runners.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CommandLineRunnerService implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    log.info("++ Sending message from CommandLineRunner ++");
  }

}

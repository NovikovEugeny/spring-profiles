package com.example.profiles.db.manager;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("int")
public class IntManager implements Manager {

  @Override
  public String getName() {
    return "IntManager";
  }
}

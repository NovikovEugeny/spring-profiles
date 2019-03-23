package com.example.profiles.db.manager;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevManager implements Manager {

  @Override
  public String getName() {
    return "DevManager";
  }
}

package com.example.profiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.profiles.db.Db;
import com.example.profiles.db.manager.Manager;

@RestController
public class MainController {

  @Autowired
  private Db db;

  @Autowired
  private Manager manager;

  @GetMapping("/profile")
  public String getProfile() {
    return db.getEnv();
  }

  @GetMapping("/profile-manager")
  public String getProfileManager() {
    return manager.getName();
  }
}

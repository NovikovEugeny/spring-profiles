package com.example.profiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.profiles.db.Db;

@Configuration
@Profile("int")
public class IntConfig {

  @Bean
  public Db getDb() {
    return new Db("INT");
  }
}

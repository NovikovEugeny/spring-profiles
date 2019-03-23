package com.example.profiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.profiles.db.Db;

@Configuration
@Profile("dev")
public class DevConfig {

  @Bean
  public Db getDb() {
    return new Db("DEV");
  }

  @Bean
  @Primary
  public Db getDb2() {
    return new Db("DEV1");
  }
}

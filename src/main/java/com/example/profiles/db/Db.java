package com.example.profiles.db;

public class Db {

  private String env;

  public Db() {
  }

  public Db(String env) {
    this.env = env;
  }

  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }
}

package io.bsy.javasnippets.singleton;

public class EarlyInitialization {
  private final static EarlyInitialization INSTANCE = new EarlyInitialization();

  private EarlyInitialization(){
  };

  public static EarlyInitialization getInstance() {
    return INSTANCE;
  }
}

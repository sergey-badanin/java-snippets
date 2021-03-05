package io.bsy.javasnippets.singleton;

public class LazyEarlyInitialization {
  private static class InstanceHolder {
    private final static LazyEarlyInitialization INSTANCE = new LazyEarlyInitialization();
  }

  private LazyEarlyInitialization(){
  };

  public LazyEarlyInitialization getInstance() {
    return InstanceHolder.INSTANCE;
  }
}

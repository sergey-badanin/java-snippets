package io.bsy.javasnippets.singleton;

public class DoubleCheckedLocking {
  private static volatile DoubleCheckedLocking INSTANCE;

  private DoubleCheckedLocking() {
  }

  public static DoubleCheckedLocking getInstance() {
    if (INSTANCE == null) {
      synchronized (DoubleCheckedLocking.class) {
        if (INSTANCE == null) {
          INSTANCE = new DoubleCheckedLocking();
        }
      }
    }
    return INSTANCE;
  }
}

package io.bsy.javasnippets.accessmodifiers.sub;

import io.bsy.javasnippets.accessmodifiers.Parent;

public class SubChild extends Parent {

  public SubChild() {
    super.protectedProperty = "protectedProperty";
    super.publicProperty = "publicProperty";
  }
}

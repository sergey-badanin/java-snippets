package io.bsy.javasnippets.accessmodifiers;

public class Child extends Parent {

  public Child() {
    super.defaultProperty = "defaultProperty";
    super.protectedProperty = "protectedProperty";
    super.publicProperty = "publicProperty";
  }
}

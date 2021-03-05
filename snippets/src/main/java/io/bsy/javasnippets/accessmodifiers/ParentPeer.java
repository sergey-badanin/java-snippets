package io.bsy.javasnippets.accessmodifiers;

public class ParentPeer {

  public ParentPeer() {
    Parent p = new Parent();
    p.defaultProperty = "defaultProperty";
    p.protectedProperty = "protectedProperty";
    p.publicProperty = "publicProperty";
  }
}

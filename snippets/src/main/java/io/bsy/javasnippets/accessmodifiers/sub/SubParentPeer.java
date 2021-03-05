package io.bsy.javasnippets.accessmodifiers.sub;

import io.bsy.javasnippets.accessmodifiers.Parent;

public class SubParentPeer {

  public SubParentPeer() {
    Parent p = new Parent();
    p.publicProperty = "publicProperty";
  }
}

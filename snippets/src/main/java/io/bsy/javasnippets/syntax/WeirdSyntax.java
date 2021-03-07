package io.bsy.javasnippets.syntax;

public class WeirdSyntax {

  public static void main(String ...args) {
    var intClass = int.class;
    var integerClass = Integer.class;
    var voidClass = void.class;

    System.out.println(intClass);
    System.out.println(integerClass);
    System.out.println(voidClass);
  }
}

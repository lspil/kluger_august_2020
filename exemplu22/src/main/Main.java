package main;


import model.Foo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

  public static void main(String[] args) {
    try {

      Class c = Class.forName("model.Foo");

      Constructor cons = c.getDeclaredConstructor();
      cons.setAccessible(true);

      Foo foo = (Foo) cons.newInstance();

      Field f = c.getDeclaredField("name");
      f.setAccessible(true);
      f.set(foo, "John");

      Method m = c.getDeclaredMethod("showName");
      m.setAccessible(true);
      m.invoke(foo);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package main;

import annotations.Seteaza;
import service.ProductService;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {

  public static void main(String[] args) {
    try {
      ProductService service = new ProductService();

      Class c = Class.forName("service.ProductService");
      Field[] fields = c.getDeclaredFields();

      for (Field f : fields) {
        f.setAccessible(true);
        if (f.isAnnotationPresent(Seteaza.class)) {  // Dependency Injection
          Class fieldClass = f.getType();
          Constructor constructor = fieldClass.getDeclaredConstructor();
          f.set(service, constructor.newInstance());
        }
      }


      service.addProduct();



    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

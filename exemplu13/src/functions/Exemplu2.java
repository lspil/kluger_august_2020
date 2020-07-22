package functions;

import main.Predicat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class Exemplu2 {

  public static void main(String[] args) {
    // java.util.function
    /**
     * Consumer<T> - primeste o valoare dar nu returneaza nimic
     * BiConsumer<T,G> - primeste doua valori dar nu returneaza nimic
     * Supplier<T> - nu primeste nicio valoare dar returneaza una
     * Function<T,R> - primeste o valoarea si returneaza o alta
     *      f(x) = y
     * BiFunction<T,G,R> - primeste doua valori si returneaza una
     *      f(x,y) = x^2 + y^2
     * Predicate<T> - primeste o valoare si returneaza true/false
     * BiPredicate<T,G> - primeste doua valori si returneaza true/false
     * UnaryOperator<T> - primeste o valoare si returneaza alta de acelasi tip
     *      f(x) = y   x,y au acelasi tip de data
     * BinaryOperator<T>  - primeste doua valori de acelasi tip si retureneaza alta tot de acelasi tip
     *      f(a,b) = c   a,b,c au acelsi tip de data
     */

    Consumer<Integer> c1 = x -> System.out.println(x);
    BiConsumer<Integer, Integer> c2 = (x,y) -> System.out.println(x + y);

    Supplier<Integer> s1 = () -> 10;

    Function<Integer, Integer> f1 = x -> 2*x;  // UnaryOperator
    BiFunction<Integer, Integer, Integer> f2 = (a,b) -> a * b; // BinaryOperator
    Function<String, Integer> f3 = s -> s.length();

    Predicate<Integer> p1 = x -> x % 2 == 0;
    BiPredicate<Integer, String> p2 = (x, s) -> x == s.length();


    UnaryOperator<Integer> f4 = x -> 2*x;
    BinaryOperator<Integer> f5 = (a,b) -> a * b;

    List<Integer> list1 = new ArrayList<>();
    list1.add(10);
    list1.add(40);
    list1.add(20);

    for (Integer x : list1) {
      System.out.println(x);
    }

    list1.forEach(x -> System.out.println(x));

    // ===================

    Map<Integer, String> map = new HashMap<>();

    map.put(3, "A");
    map.put(6, "B");

    map.forEach((x,y) -> System.out.println(x + " " + y));
  }
}

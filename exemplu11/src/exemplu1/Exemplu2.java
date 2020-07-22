package exemplu1;

public class Exemplu2 {

  public static void main(String[] args) {

    Foo<CardDeCredit> f1; // impunem o constrangere pentru variabila f1
    // wildcards
    Foo<?> f2;
    Foo<? extends Card> f3;
    Foo<? super CardDeCredit> f4;

    f1 = new Foo<>(); // aici inlocuim defapt pe T

    f2 = new Foo<String>();
    f2 = new Foo<Integer>();
    f2 = new Foo<Card>();
    f2 = new Foo<CardDeCredit>();

    f3 = new Foo<Card>();
    f3 = new Foo<CardDeCredit>();
    //f3 = new Foo<String>();  eroare de compilare

    f4 = new Foo<CardDeCredit>();
    f4 = new Foo<Card>();

  }
}

package philosophy.example.seven;

class Simple {
    String s;

    protected Simple(String ss) {
        this.s = ss;
    }

    public String toString() {
        return s;
    }

    public void setString(String sn) {
        this.s = sn;
    }
}

class Cleanser1 {
    private String s = "Cleanser";

    public void append(String а) {
        s += а;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" applyQ");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }

}

class Detergent1 extends Cleanser1 {
    // Изменяем метод:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Вызываем метод базового класса
    }

    // Добавляем новые методы к интерфейсу:
    public void foam() {
        append("foamQ");
    }

    // Проверяем новый класс:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("проверяем базовый класс");
        Cleanser.main(args);
    }
}

class CartoonWithDefCtor extends Drawing {
//! CartoonWithDefCtor() {
//! System.out.println("CartoonWithDefCtor constructor");
//! }
}

class NewDetergent extends Detergent {
    public void scrub() {
        append(" NewDetergent.scrub()");
        super.scrub(); // Doesn't have to be first
    }

    public void sterilize() {
        append(" sterilize()");
    }
}

class Base1 {
    public Base1() {
        System.out.println("Base1");
    }
}

class Derived1 extends Base1 {
    public Derived1() {
        System.out.println("Derived1");
    }
}

class Derived2 extends Derived1 {
    public Derived2() {
        System.out.println("Derived2");
    }
}

class A {
    public A() {
        System.out.println("A()");
    }

    public A(String s) {
        System.out.println("A2(): " + s);
    }
}

class B {
    public B() {
        System.out.println("B()");
    }

    public B(String s) {
        System.out.println("2B(): " + s);
    }

}

class C extends A {
    B b = new B();

    public C(String s) {
        super(s);
        b = new B(s);
    }
}

class Game1 {
    Game1(int i) {
        System.out.println("KoHCTpyKTop Game");
    }
}

class BoardGame1 extends Game1 {
    BoardGame1(int i) {
        super(i);
        System.out.println("KoHCTpyKTop BoardGame");
    }
}

class Chess1 extends BoardGame1 {
    Chess1() {
        super(11);
        System.out.println("KoHCTpyKTop Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

class BaseNonDefault {
    public BaseNonDefault(int i) {
    }
}

class DerivedTwoConstructors extends BaseNonDefault {
    public DerivedTwoConstructors() {
        super(47);
    }

    public DerivedTwoConstructors(int i) {
        super(i);
    }
}

class Component1 {
    //    public Component1() {
//        System.out.println("Component1");
//    }
    public Component1(int i) {
        System.out.println("Component1b " + i);
    }
}

class Component2 {
    //    public Component2() {
//        System.out.println("Component2");
//    }
    public Component2(int i) {
        System.out.println("Component2b " + i);
    }
}

class Component3 {
    //    public Component3() {
//        System.out.println("Component3");
//    }
    public Component3(int i) {
        System.out.println("Component3b " + i);
    }
}

class Root {
    //    Component1 c1 = new Component1();
//    Component2 c2 = new Component2();
//    Component3 c3 = new Component3();
//
//    public Root() {
//        System.out.println("Root");
//    }
    Component1 c1 = new Component1(1);
    Component2 c2 = new Component2(2);
    Component3 c3 = new Component3(3);

    public Root(int i) {
        System.out.println("Rootb");
    }
}

class Stem extends Root {
    //    Component1 c1 = new Component1();
//    Component2 c2 = new Component2();
//    Component3 c3 = new Component3();
//
//    public Stem() {
//        System.out.println("Stem");
//    }
    Component1 c1 = new Component1(4);
    Component2 c2 = new Component2(5);
    Component3 c3 = new Component3(6);

    public Stem(int i) {
        super(i);
        System.out.println("Stemb");
    }
}

public class Exercises extends Detergent {
    /**
     * 1) Create a simple class. In the second class,
     * define a reference to an object of the first class.
     * Use deferred initialization to create instances of this class.
     */
    Simple simple;
    String s;

    public Exercises() {
    }

    public Exercises(String ss) {
        this.s = ss;
    }

    private Simple lazy() {
        if (simple == null) {
            System.out.println("Creating Simple");
            simple = new Simple(s);
        }
        return simple;
    }

    public static void main(String[] args) {
        /**
         * 1)
         */
        Exercises exercises = new Exercises("In");
        exercises.lazy();

        /**
         * 2) Declare a new class derived from Detergent.
         * Redefine the scrub() method
         * and add a new method named sterilize().
         */
        Exercises ex = new Exercises();
        ex.scrub();
        System.out.println(ex);

        /**
         * 3) Prove the previous statement
         */
        new CartoonWithDefCtor();

        /**
         * 4) Prove that the constructors of the base class are:
         * (a) always called and (b) always called before
         * executing the constructors of the derived class.
         */
        new Derived2();

        /**
         * 5) Create two classes A and b that have default constructors
         * (with an empty argument list) that output a call message.
         * Create a new class c derived from A; create a field of type b in c.
         * Do not create a constructor with. Create
         * an object of class C and follow what is happening.
         */
        //new C();

        /**
         * 6) Using the Chess example.java, prove the statements in the previous paragraph.
         */
        new Chess1();

        /**
         * 7) Change Exercise 5 so that classes A and b have constructors
         * with arguments instead of default constructors. Write a constructor for class C
         * and perform all the necessary initialization inside it.
         */
        new C("Init string");

        /**
         * 8) Create a base class with a single constructor that
         * is not the default constructor, and a derived class with
         * both a default constructor (without arguments) and arguments.
         * In the constructor of the derived class
         * call the base class constructor
         */
        new DerivedTwoConstructors();
        new DerivedTwoConstructors(47);

        /**
         * 9) Create a Root class containing instances of each of the classes
         * (also created by you) Component, Component2 and Component3.
         * Declare the Stem class derived from the Root class, so that it
         * also contains instances of each of the Component classes mentioned.
         * Each class must contain a default constructor that outputs a message about its call.
         */
        //new Stem();

        /**
         * 10) Change the previous exercise so that
         * only constructors with arguments are present in all classes
         * (not by default).
         */
        new Stem(47);

        /**
         * 11) Change the Detergent example.
         * java so that delegation is used in it.
         */
        
    }
}

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
    public Base1() { System.out.println("Base1"); }
}
class Derived1 extends Base1 {
    public Derived1() { System.out.println("Derived1"); }
}
class Derived2 extends Derived1 {
    public Derived2() { System.out.println("Derived2"); }
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
    }
}

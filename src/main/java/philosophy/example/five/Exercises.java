package philosophy.example.five;

class Something {
    int m = 123;
}

class Dog {
    public void bark() {
        System.out.println("Default bark!");
    }
    public void bark(int i) {
        System.out.println("int bark = howl");
    }
    public void bark(double d) {
        System.out.println("double bark = yip");
    }
    public void bark(int i, double d) {
        System.out.println("int, double bark");
    }
    public void bark(double d, int i) {
        System.out.println("double, int bark");
    }
}


public class Exercises {
    String s;
    String str1 = "Initialized at definition";
    String str2;

    Exercises(String s1) {
        str2 = s1;
        System.out.println("String arg constructor");
        System.out.println(s1);
    }
    Exercises() {
        System.out.println("Default constructor");
    }
    Exercises(int i) {
        this("i = " + i);
    }

    public void b() {
        System.out.println("b() called");
    }
    public void a() {
        b();
        this.b();
    }


    /** 1) Create a class with an uninitialized reference to String.
     * Show 4ToJava initializes the link with a null value.
     */
    public static void main(String[] args) {
        Exercises str = new Exercises();
        System.out.println(str.s);


        /** 2) Create a class with a String field initialized
         * at the definition point and another field initialized
         * by the constructor. What is the difference between these two approaches?
         */
        Exercises si = new Exercises("Initialized at construction");
        System.out.println("si.s1 = " + si.str1);
        System.out.println("si.s2 = " + si.str2);


        /** 3) Create a class with a default constructor
         * (without parameters) that displays a message.
         * Create an object of this class.
         */
        new Exercises();


        /** 4) Add an overloaded constructor to the class
         * from Exercise 3, which takes a String as a parameter
         * and prints it along with the message.
         */
        new Exercises();
        new Exercises("Overloaded");


        /** 5) Create a Dog class with an overloaded bark()
         * (bark) method. The method must be overloaded for different
         * primitive data types in order to output a message about barking,
         * howling, whining, etc., depending on the version of the overloaded
         * method. Write the main() method that calls all versions.
         */
        Dog dog = new Dog();
        dog.bark();
        dog.bark(7);
        dog.bark(5.3);


        /** 6) Change the previous exercise so that two overloaded
         * methods accept two arguments (of different types) and differ
         * only in the order of their sequence in the argument list. Check if it works.
         */
        dog.bark(7, 3.5);
        dog.bark(5.5, 2);


        /** 7) Create a class without a constructor.
         * Create an object of this class in the main() method
         * to make sure that the default constructor is synthesized automatically.
         */
        new Something();


        /** 8) Create a class with two methods. In the first method, call the second
         * method twice: once without the keyword this, and in the second with this —
         * just to make sure that this syntax is working; do not use this method
         * of calling in practice.
         */
        new Exercises().a();


        /** 9) Prepare a class with two (overloaded) constructors. Using
         * the this keyword, call the second constructor from the first one.
         */
        new Exercises("String call");
        new Exercises(47);


        /** 10) 
         *
         */
    }
}

package philosophy.example.five;

enum Money {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}

/**
 * 20) Write a main() method that uses a variable-length argument list
 * instead of the usual syntax. Output all the elements of the resulting args array.
 * Test the program with a different number of command line arguments
 */
class Main extends Exercises {
    public static void main(String... args) {
        Main.printString(args);
    }
}

class Cupps {
    static Cup cupl;
    static Cup cup2;

    static {
        cupl = new Cup(1);
        cup2 = new Cup(2);
    }

    Cupps() {
        System.out.println("Cups()");
    }
}

class Tank {
    boolean full;

    Tank() {
        full = true;
        System.out.println(full + " created");
    }

    public void empty() {
        full = false;
        System.out.println(full + "deleted");
    }

    protected void finalize() {
        if (full) {
            System.out.println("Error, must be empty");
        } else {
            System.out.println("Tank cleaned up OK");
        }
    }
}

class Finalize {
    protected void finalize() {
        System.out.println("finalize() called");
    }
}

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

    static String st1;
    static String st2;

    static {
        st2 = "dsfs";
    }

    String s1;

    {
        s1 = "'instance initialization'";
    }

    Exercises[] ex1 = new Exercises[2];

    static void printString(String... sr) {
        for (String sp : sr) {
            System.out.println(sp);
        }
    }

    static void describe(Money mm) {
        switch (mm) {
            case ONE:
                System.out.println("George Washington");
                break;
            case TWO:
                System.out.println("Thomas Jefferson");
                break;
            case FIVE:
                System.out.println("Abraham Lincoln");
                break;
            case TEN:
                System.out.println("Alexander Hamilton");
                break;
            case TWENTY:
                System.out.println("Andrew Jackson");
                break;
            case FIFTY:
                System.out.println("U.S. Grant");
                break;
        }
    }

    /**
     * 1) Create a class with an uninitialized reference to String.
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


        /** 10) Erstellen Sie eine Klasse mit der finalize() -Methode,
         * die eine Nachricht ausgibt. In der Methode main() Erstellen
         * Sie ein Objekt Ihrer Klasse. Erklären Sie das Verhalten des Programms
         */
        new Finalize();


        /** 11) Modify the previous exercise so that the finalize() method
         * is executed.
         */
        new Finalize();
        System.gc();
        System.runFinalization();


        /** 12) Include it in a class named Tank, which can be filled and emptied.
         * The "ready" condition requires it to be empty before cleaning. Write a method
         * finalize(), which checks this condition. In the main() method, test possible
         * use cases of your class.
         */
        new Tank().empty();
        new Tank();
        System.gc();
        new Tank().finalize();
        new Tank().empty();
        new Tank().finalize();


        /** 13) Check the truth of the statements from the previous paragraph.
         */
        System.out.println("Inside main()");
        Cupps.cupl.f(99);


        /** 14) Create a class with a static String field initialized at the definition point
         * and another field initialized in the static block. Add a static method
         * that outputs the values of the fields and demonstrates that both fields
         * are initialized before use
         */
        st1 = "dfsdfsdf";
        System.out.println(st1);
        System.out.println(st2);

        /** 15) Create a class derived from String, initialized
         * in the instance initialization section.
         */
        new Exercises();
        new Exercises(1);

        /** 16) Create an array of String objects.
         * Assign a String object to each element.
         * Output the contents of the array in the for loop.
         */
        String[] sal = new String[4];
        sal[0] = "Mamam";
        sal[1] = "M";
        sal[2] = "Fdfdfd";
        sal[3] = "Ulklkl";
        for (int i = 0; i < 4; i++) {
            System.out.println(sal[i]);
        }

        /** 17) Create a class with a constructor that receives the String argument.
         * Output the value of the argument during construction.
         * Create an array of references to this class,
         * but do not create objects that fill the array. Run the program
         * and see if the messages will be displayed when the constructors are called.
         */
        Exercises[] ex2 = new Exercises[3];


        /** 18) Complete the previous exercise — create objects that fill
         * the array of links.
         */
        for (int i = 0; i < ex2.length; i++) {
            ex2[i] = new Exercises(Integer.toString(i));
        }


        /** 19) Write a method that gets a list of variable-length arguments with an array
         * String. Make sure that this method can be passed as a list of objects
         * String, separated by commas, and String[].
         */
        printString("These", "are", "some", "strings");
        printString(new String[]{"These", "are", "some", "strings"});


        /** 21) Create a transfer with the names of six types of paper money. Iterate
         * over the result of values() with the output of each value and its ordinal().
         */
        for (Money m : Money.values()) {
            System.out.println(m + ", ordinal " + m.ordinal());
        }


        /** 22) Write the switch command to enumerate from the previous example.
         * For each case, output an extended description of a specific currency.
         */
        for (Money m : Money.values())
            describe(m);
    }
}

package philosophy.example.six;

class PackagedClass {
    public PackagedClass() {
        System.out.println("Creating a packaged class");
    }
}

class Connection {
    private static int count = 0;
    private int i = 0;

    private Connection() {
        System.out.println("Connection()");
    }

    // Allow creation via static method:
    static Connection makeConnection() {
        count++;
        return new Connection();
    }

    public static int howMany() {
        return count;
    }

    public String toString() {
        return ("Connection " + count);
    }
}

class SomeData {
    protected int a = 13;
}

class DataChanger {
    static void change(SomeData sd, int i) {
        sd.a = i;
    }
}

class FourWays {
    int a = 0;
    public int b = 1;
    protected int c = 2;
    private int d = 3;

    FourWays() {
        System.out.println("FourWays() constructor");
    }

    void showa() {
        System.out.println(a);
    }

    public void showb() {
        System.out.println(b);
    }

    protected void showc() {
        System.out.println(c);
    }

    private void showd() {
        System.out.println(d);
    }
}

public class Exercises {
    static int howManyLeft = 3;
    static Connection[] ca = new Connection[3];

    {
        for (Connection x : ca)
            x = Connection.makeConnection();
    }

    public static Connection getConnection() {
        if (howManyLeft > 0)
            return ca[--howManyLeft];
        else {
            System.out.println("No more connections");
            return null;
        }
    }

    /** 1) Define the class in the package. Create an instance of the class outside
     * of the package.(in every class :) )
     */

    /** 2) Convert the fragments from this section into a program. Make sure that
     * name conflicts do occur. (not)
     */

    /** 3) Create two debug and debug off packages containing the same classes with
     * the debug() method. The first version outputs its String argument to the console, the second
     * does nothing. Use the static import directive to import the class
     * into the test program and demonstrate the effect of conditional compilation.
     */
    // in package six/...

    /**
     * 4) Show that methods with the protected specifier have access within the package,
     * but are not public.
     */
    // in package six/...
    public static void main(String[] args) {
        /** 5) Create a class with fields and methods with different access levels: public,
         * p r i v a t e , p r o t e c t e d, access within the package.
         * Create an object of this class and see what messages the compiler issues when trying
         * to access different members of the class. Note that classes located in the same
         * directory are included in the "default package".
         */
        FourWays fw = new FourWays();
        fw.showa();
        fw.showb();
        fw.showc();
        fw.a = 10;
        fw.b = 20;
        fw.c = 30;
        fw.showa();
        fw.showb();
        fw.showc();
        //! fw.showd(); // private access, compiler can't touch


        /** 6) Create a class with protected data. Create a second class in the same file
         * with a method that works with protected data from the first class.
         */
        SomeData x = new SomeData();
        System.out.println(x.a);
        DataChanger.change(x, 99);
        System.out.println(x.a);

        /** 7) Create a library according to the code snippets containing
         * the access and Widget descriptions. Create a Widget object
         * in a class that is not included in the access package.
         */
        // in package six/...


        /** 8) Modeled after the Lunch example.java create a class named Connection Manager
         * that manages a fixed array of Connection objects. The client programmer should
         * not directly create Connection objects, but can only receive them using a static
         * method in the ConnectionManager class. When the ConnectionManager class has
         * exhausted its supply of objects, it should return a null reference.
         * Test the classes in the main() method.
         */
        Exercises cm = new Exercises();
        System.out.println(cm.howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(cm.getConnection());
        System.out.println(howManyLeft);

        /** 9) Place the following file in the access/local directory (presumably set
         * in the CLASSPATH variable):
         */
        PackagedClass pc = new PackagedClass();
    }
}

package philosophy.example.one;

public class Exercises {
    /** 1) Create a class with int and char fields that are not initialized in the program.
     *     Output their values to make sure that 4ToJava performs initialization
     *     by default/
     */
    static int i;
    static char ch;
    static int k = 32;

    public static void main(String[] args) {
        /** 2) Based on the HelloDate example.java in this chapter, write a "Hello
         * world" program that just outputs this message. The program will contain only
         * one method (the one that is executed when the program starts — main()). Don't forget
         * to declare it static and include a list of arguments, even if you won't
         * use it.
         */
        int t;
        long l = 10L;
        System.out.println("Hello, world!");

        /** 3) Find a code snippet with the Typename class and make a program
         * from it suitable for compilation and launch
         */
        class ATypeName {
            int ii;
            double d;
            double b;
            void show() {
                System.out.println(ii);
            }
        }
        ATypeName a = new ATypeName();
        a.ii = 25;
        a.d = 2.4255;
        a.show();


        /** 4) Do the same for the code using the Data Only class.
         */
        class DataOnly {
            int n;
            double dd;
            boolean bb;
            void see() {
                System.out.println(n);
                System.out.println(dd);
                System.out.println(bb);
            }
        }
        DataOnly data = new DataOnly();
        data.n = 3;
        data.dd = 2.876376;
        data.bb = false;
        data.see();

        /** 5) Change exercise 4 so that the data of the DataOnly class is assigned
         * values, and then print them in the main() method.
         */
        //   -//- (like in 4) in this solution)

        /** 7) Turn code snippets with the incrementable class into a working program.
         */
        class Incrementable {
            void increment() {
                Exercises.i++;
            }
        }
        Incrementable in = new Incrementable();
        in.increment();


        /** 8) Write a program that demonstrates that regardless of the number
         * of objects created, the class contains only one instance of the static field.
         */
        Exercises ex1 = new Exercises();
        Exercises ex2 = new Exercises();


        /** 9) Write a program demonstrating automatic packaging of primitive types.
         */
        char c = 'c';
        int intt = 45;
        System.out.println("char c = " + c);
        System.out.println("int intt = " + intt);
        Character C = c;
        Integer I = intt;
        System.out.println("Character C = " + C);
        System.out.println("Integer I = " + I);


        /** 10) Write a program that outputs three command line parameters. To
         * get the arguments, you will need to access the elements of the array of strings
         * (String).
         */
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);


        /** 11) Convert the example with the AllTheColorsOfTheRainbow class into a working program.
         */
        class AllTheColorsOfTheRainbow {
            int anIntegerRepresentingColors = 0;
            int hue = 0;
            void changeTheHueOfTheColor(int newHue) {
                hue = newHue;
                anIntegerRepresentingColors = 33;
            }
        }



    }
    /** 6) Write a program that includes the storage() method given earlier in this
     * chapter.
     */
    int storage(String s) {
        return s.length() + 2;
    }
}

/**
 *
 */


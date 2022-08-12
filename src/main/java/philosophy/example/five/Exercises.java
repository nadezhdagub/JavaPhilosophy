package philosophy.example.five;

public class Exercises {
    String s;
    String str1 = "Initialized at definition";
    String str2;
    public Exercises() {
    }
    public Exercises(String s1) {
        str2 = s1;
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


        /** 3)
         *
         */
    }
}

package philosophy.example.four;

import java.util.Random;

public class Exercises {
    static Random r = new Random();
    public static void main(String[] args) {
        /** 1) Write a program that outputs numbers from 1 to 100.
         */
        for (int i = 1; i < 101; i++) {
            System.out.println(i + " ");
        }

        /** 2) Write a program that generates 25 random int values. For
         * each value, the if-else command tells you in what relation it is
         * with another randomly generated number (greater than, less than, equal to)
         */
        for (int j = 0; j < 25; j++) {
            condition();
        }

        /** 3) Change exercise 2 so that the code runs in an "infinite"
         * while loop. The program should run until its execution
         * is interrupted from the keyboard (usually by pressing Ctrl+C).
         */
        while (true) {
            condition();
        }
    }

    static void condition() {
        int a = r.nextInt();
        int b = r.nextInt();
        System.out.println("a: " + a + " , " + "b: " + b);
        if(a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a == b");
        }
    }
}

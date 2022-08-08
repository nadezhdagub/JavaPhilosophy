package philosophy.example.four;

import java.util.Random;

public class Exercises {
    static Random r = new Random();
    public static void main(String[] args) {
        int max = 100;
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
       /* while (true) {
            condition();
        }*/

        /** 4) Write a program using two nested for loops and
         * the remainder operator (%) to find and output prime numbers
         * (that is, integers that are not completely divisible
         * by any other number except themselves and 1).
         */
        if (args.length != 0) {
            max = Integer.parseInt(args[0]);
        }
        for(int i = 1; i < max; i++) {
            boolean prime = true;
            for(int j = 2; j < i; j++)
                if(i % j == 0)
                    prime = false;
            if(prime)
                System.out.print(i + " ");
        }


        /** 5) Repeat exercise 1 from the previous chapter, using the ternary operator
         * and a bitwise check to output zeros and ones (instead of calling the Integer method.
         * toBinaryString()).
         */
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;
        System.out.println("i1 = "); toBinaryString(i1);
        System.out.println("i2 = "); toBinaryString(i2);
        System.out.println("~i1 = "); toBinaryString(~i1);
        System.out.println("~i2 = "); toBinaryString(~i2);
        System.out.println("i1 & i1 = "); toBinaryString(i1 & i1);
        System.out.println("i1 | i1 = "); toBinaryString(i1 | i1);
        System.out.println("i1 ^ i1 = "); toBinaryString(i1 ^ i1);
        System.out.println("i1 & i2 = "); toBinaryString(i1 & i2);
        System.out.println("i1 | i2 = "); toBinaryString(i1 | i2);
        System.out.println("i1 ^ i2 = "); toBinaryString(i1 ^ i2);

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

    private static void toBinaryString(int i) {
        char[] buffer = new char[32];
        int bufferPosition = 32;
        do {
            buffer[--bufferPosition] =
                    ((i & 0x01) != 0) ? '1' : '0';
            i >>>= 1;
        } while (i != 0);
        for(int j = bufferPosition; j < 32; j++)
            System.out.println(buffer[j]);
        System.out.println();
    }
}

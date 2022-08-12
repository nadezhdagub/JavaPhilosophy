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
        for (int i = 1; i < max; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++)
                if (i % j == 0)
                    prime = false;
            if (prime)
                System.out.print(i + " ");
        }


        /** 5) Repeat exercise 1 from the previous chapter, using the ternary operator
         * and a bitwise check to output zeros and ones (instead of calling the Integer method.
         * toBinaryString()).
         */
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;
        System.out.println("i1 = ");
        toBinaryString(i1);
        System.out.println("i2 = ");
        toBinaryString(i2);
        System.out.println("~i1 = ");
        toBinaryString(~i1);
        System.out.println("~i2 = ");
        toBinaryString(~i2);
        System.out.println("i1 & i1 = ");
        toBinaryString(i1 & i1);
        System.out.println("i1 | i1 = ");
        toBinaryString(i1 | i1);
        System.out.println("i1 ^ i1 = ");
        toBinaryString(i1 ^ i1);
        System.out.println("i1 & i2 = ");
        toBinaryString(i1 & i2);
        System.out.println("i1 | i2 = ");
        toBinaryString(i1 | i2);
        System.out.println("i1 ^ i2 = ");
        toBinaryString(i1 ^ i2);


        /** 6) Change the test() method so that it gets two additional arguments
         * begin and end, and the value of testval was checked for belonging to the range
         * [ begin, end] (with borders included).
         */
        test(10, 6, 20);
        test(54, 365, 5423);


        /** 7) Change exercise 1 so that the exit from the program
         * is carried out by the break keyword at a value of 99.
         * Try using the return keyword.
         */
        for (int i = 1; i <= 100; i++) {
            if (i == 99)
                break;
            System.out.print(i + " ");
        }

        /** 8) Create a switch command that outputs a message in each case section.
         * Place it in a for loop that checks all valid case values.
         * Each case section must end with the break command.
         * Then remove the break commands and see what happens.
         */
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("case 0");
                    break;
                case 2:
                    System.out.println("case 1");
                    break;
                case 3:
                    System.out.println("case 2");
                    break;
                case 4:
                    System.out.println("case 3");
                    break;
                case 5:
                    System.out.println("case 4");
                    break;
                default:
                    System.out.println("default");
            }
        }

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("case 0");
                case 2:
                    System.out.println("case 1");
                case 3:
                    System.out.println("case 2");
                case 4:
                    System.out.println("case 3");
                case 5:
                    System.out.println("case 4");
                default:
                    System.out.println("default");
            }
        }

        /** 9) Fibonacci numbers are a numerical sequence 1,1,2,3,5,8,13,21, 34, etc.,
         * in which each number, starting from the third, is the sum of the previous two.
         * Write a method that gets an integer argument and outputs the specified number
         * of Fibonacci numbers. For example, when running the java command Fibonacci 5
         * (where Fibonacci is the class name) the sequence should be output 1, 1, 2, 3, 5.
         */
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i < n; i++) {
            System.out.println(fib(i) + ", ");
        }


        /** 10) Vampires are numbers consisting of an even number
         * of digits and obtained by multiplying a pair of numbers,
         * each of which contains half the digits of the result.
         * The digits are taken from the original number in any order,
         * terminating zeros are not allowed. Examples:
         * 1) 1261 =21 *60;
         * 2) 1827 = 21 *87;
         * 3) 2187 = 27*81.
         * Write a program that finds all "vampires" consisting of 4 digits.
         * ((The problem is proposed by Dan Forhan.)
         */
        int[] startDigit = new int[4];
        int[] productDigit = new int[4];
        for (int num1 = 10; num1 <= 99; num1++)
            for (int num2 = num1; num2 <= 99; num2++) {
                if ((num1 * num2) % 9 != (num1 + num2) % 9) {
                    continue;
                }
                int product = num1 * num2;
                startDigit[0] = num1 / 10;
                startDigit[1] = num1 % 10;
                startDigit[2] = num2 / 10;
                startDigit[3] = num2 % 10;
                productDigit[0] = product / 1000;
                productDigit[1] = (product % 1000) / 100;
                productDigit[2] = product % 1000 % 100 / 10;
                productDigit[3] = product % 1000 % 100 % 10;
                int count = 0;
                for (int x = 0; x < 4; x++) {
                    for (int y = 0; y < 4; y++) {
                        if (productDigit[x] == startDigit[y]) {
                            count++;
                            productDigit[x] = -1;
                            startDigit[y] = -2;
                            if (count == 4) {
                                System.out.println(num1 + " * " + num2
                                        + " : " + product);
                            }
                        }
                    }
                }
            }
    }

    static void condition() {
        int a = r.nextInt();
        int b = r.nextInt();
        System.out.println("a: " + a + " , " + "b: " + b);
        if (a > b) {
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
        for (int j = bufferPosition; j < 32; j++)
            System.out.println(buffer[j]);
        System.out.println();
    }

    static int test(int testval, int begin, int end) {
        if ((testval >= begin) && (testval <= end)) {
            return 1;
        } else {
            return 0;
        }
    }

    static int fib(int n) {
        if ((n <= 2) && (n > 0)) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

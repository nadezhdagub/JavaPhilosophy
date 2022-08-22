package philosophy.example.seven;

import static java.lang.Math.log;

public class Exercises {
    /**
     * Given an integer n, return true if it is a power of four. Otherwise, return false .
     * An integer n is a power of four, if there exists an integer x such that n == 4x. Could you solve it without loops/recursion?
     * @param n
     * @return
     */
    public static boolean isPowerOfFour(int n) {
        int remains = 0;
        int ost = 0;
        int sec = n;
        while((sec>=4) && (sec != 2147483647) && (sec != -2147483648) || (n == 1)) {
            remains = sec / 4;
            ost = sec % 4;
            sec = sec-4;
        }

        if((remains == 1) && (ost == 0)|| (n == 1) && (ost == 0)) {
            System.out.println("true");return true; }
        else {System.out.println("false");return false;}
    }


    public static void main(String[] args) {
        isPowerOfFour(
                17);
    }
}

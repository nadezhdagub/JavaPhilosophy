package philosophy.example.four;

import java.util.Random;

public class Constructions {
    static int result = 0;
    static void test(int testval, int target) {
        if (testval > target) {
            result = 1;
        } else if (testval < target) {
            result = -1;
        } else {
            result = 0;
        }
    }

    static boolean condition() {
        boolean res = Math.random() < 0.99;
        System.out.println(res + ", ");
        return res;
    }
    public static void main(String[] args) {
        test(10, 5);
        System.out.println(result);
        test(5, 10);
        System.out.println(result);
        test(5, 5);
        System.out.println(result);

        while (condition()) {
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while'");

        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c)) {
                System.out.println("value: " + (int)c + "zn: " + c);
            }
        }

        Random r = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = r.nextFloat();
        }
        for (float xx : f) {
            System.out.println(xx);
        }

        for(char c : "An African Swallow".toCharArray()) {
            System.out.println(c + " ");
        }

    }
}

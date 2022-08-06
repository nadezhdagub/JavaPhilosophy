package philosophy.example.four;

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
    }
}

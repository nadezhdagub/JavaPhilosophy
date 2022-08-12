package philosophy.example.five;

class Tree {
    int height;

    Tree() {
        System.out.println("sprout");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("new tree with height");
    }

    void info() {
        System.out.println("Дерево высотой " + height + " м.");
    }

    void info(String s) {
        System.out.println(s + ": Дерево высотой " + height + " м.");
    }
}

class Rock {
    Rock() {
        System.out.println("Rock ");
    }

    Rock(int ii) {
        System.out.println("Rock " + ii);
    }
}

public class Initialization {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
        for (int ii = 0; ii < 8; ii++) {
            new Rock(ii);
        }

        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloading method");
        }

        f("Сначала строка", 11);
        f(99, "Сначала число");

        Initialization p = new Initialization();
        p.testConstVal();
        p.testChar();
        p.testByte();
        p.testShort();
        p.testInt();
        p.testLong();
        p.testFloat();
        p.testDouble();

    }

    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    void f1(char x) {
        System.out.println("fl(char)");
    }

    void f1(byte x) {
        System.out.println("fl(byte)");
    }

    void f1(short x) {
        System.out.println("fl(short)");
    }

    void f1(int x) {
        System.out.println("fl(int)");
    }

    void f1(long x) {
        System.out.println("fl(long)");
    }

    void f1(float x) {
        System.out.println("fl(float)");
    }

    void f1(double x) {
        System.out.println("fl(double)");
    }

    void f2(byte x) {
        System.out.println("f2(byte)");
    }

    void f2(short x) {
        System.out.println("f2(short)");
    }

    void f2(int x) {
        System.out.println("f2(int)");
    }

    void f2(long x) {
        System.out.println("f2(long)");
    }

    void f2(float x) {
        System.out.println("f2(float)");
    }

    void f2(double x) {
        System.out.println("f2(double)");
    }

    void f3(short x) {
        System.out.println("f3(short)");
    }

    void f3(int x) {
        System.out.println("f3(int)");
    }

    void f3(long x) {
        System.out.println("f3(long)");
    }

    void f3(float x) {
        System.out.println("f3(float)");
    }

    void f3(double x) {
        System.out.println("f3(double)");
    }

    void f4(int x) {
        System.out.println("f4(int)");
    }

    void f4(long x) {
        System.out.println("f4(long)");
    }

    void f4(float x) {
        System.out.println("f4(float)");
    }

    void f4(double x) {
        System.out.println("f4(double)");
    }

    void f5(long x) {
        System.out.println("f5(long)");
    }

    void f5(float x) {
        System.out.println("f5(float)");
    }

    void f5(double x) {
        System.out.println("f5(double)");
    }

    void f6(float x) {
        System.out.println("f6(float)");
    }

    void f6(double x) {
        System.out.println("f6(double)");
    }

    void f7(double x) {
        System.out.println("f7(double)");
    }

    void testConstVal() {
        System.out.println("5: ");
        f1(5);
        f2(5);
        f3(5);
        f4(5);
        f5(5);
        f6(5);
        f7(5);
        System.out.println();
    }

    void testChar() {
        char x = 'x';
        System.out.println("char: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testByte() {
        byte x = 0;
        System.out.println("byte: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
    }

    void testShort() {
        short x = 0;
        System.out.println("short: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testInt() {
        int x = 0;
        System.out.println("int: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testLong() {
        long x = 0;
        System.out.println("long: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testFloat() {
        float x = 0;
        System.out.println("float: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testDouble() {
        double x = 0;
        System.out.println("double: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }
}

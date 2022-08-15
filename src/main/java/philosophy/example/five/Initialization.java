package philosophy.example.five;

import java.util.Arrays;
import java.util.Random;

class Other {
    public static void main(String[] args) {
        for(String s : args)
            System.out.print(s + " ");
    }
}

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cupl;
    static Cup cup2;

    static {
        cupl = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void fl(int marker) {
        System.out.println("fl(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.fl(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.fl(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut)
            System.out.println("Ошибка: checkedOut");
// О б ы ч н о э т о делается так:
// Super.finalize(); // Вызов версии базового класса
    }
}


class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

class Banana {
    void peel(int i) { /* . . . */ }
}

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
    boolean t;
    char c;
    byte b;
    short sh;
    long l;
    float f;
    double d;
    Initialization reference;
    int i = 0;

    void printInitialValues() {
        System.out.println("Tnn данных " + "Начальное значение");
        System.out.println("boolean " + t);
        System.out.println("char [ " + c + "]");
        System.out.println("byte " + b);
        System.out.println("short " + sh);
        System.out.println("long " + l);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("reference " + reference);
    }

    Initialization increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    int petalCount = 0;
    String s = "initial value";

    Initialization(int petals) {
        petalCount = petals;
        System.out.println("KoHCTpyKTOp с параметром int, petalCount= " + petalCount);
    }

    Initialization(String ss) {
        System.out.println("KoHCTpyKTop с параметром String, s = " + ss);
        s = ss;
    }

    Initialization(String s, int petals) {
        this(petals);
//! this(s); // Вызов другого конструктора запрещен!
        this.s = s; // Другое использование "this"
        System.out.println("ApryMeHTbi String и int");
    }

    Initialization() {
        this("hi", 47);
        System.out.println("KOHCTpyKTop по умолчанию (без аргументов)");
    }

    void printPetalCount() {
//! this(ll); // Разрешается только в конструкторах!
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

    Mug mugl;
    Mug mug2;
    {
        mugl = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mugl & mug2 инициализированы");
    }

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

        Banana a = new Banana(),
                b = new Banana();
        a.peel(1);
        b.peel(2);
        // =
        //Banana.peel(a,1);
        //Banana.peel(b,2);

        Initialization x = new Initialization();
        x.increment().increment().increment().print();

        new Person().eat(new Apple());

        Initialization xx = new Initialization();
        xx.printPetalCount();

        Book novel = new Book(true);
        // Правильная очистка:
        novel.checkIn();
        // Теряем ссылку, забыли про очистку:
        new Book(true);
        // Принудительная уборка мусора и финализация:
        System.gc();

        Initialization iv = new Initialization();
        iv.printInitialValues();


        System.out.println("Co3flaHMe нового объекта Cupboard в main()");
        new Cupboard();
        System.out.println("Co3flaHne нового объекта Cupboard в main()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);


        System.out.println("Inside main()");
        Cups.cupl.f(99);

        System.out.println("B методе main()");
        new Initialization();
        System.out.println("new Mugs() завершено");
        new Initialization(1);
        System.out.println("new Mugs(l) завершено");


        int[] arr1 = {1, 2, 3, 4, 5 };
        int[] arr2;
        arr2 = arr1;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + 1;
        }
        for(int i = 0; i < arr1.length; i++) {
            System.out.println("al[" + i + "] = " + arr1[i]);
        }

        int[] aa;
        Random rand = new Random(47);
        aa = new int[rand.nextInt(20)];
        System.out.println("flAMHa а = " + aa.length);
        System.out.println(Arrays.toString(aa));

        Random rand1 = new Random(47);
        Integer[] a1 = new Integer[rand1.nextInt(20)];
        System.out.println("AnnHa а = " + a1.length);
        for(int i = 0; i < a1.length; i++) {
            a1[i] = rand.nextInt(500); // Автоматическая упаковка
        }
        System.out.println(Arrays.toString(a1));

        Integer[] a2 = {
                new Integer(1),
                new Integer(2),
                3, // Autoboxing
        };
        Integer[] bb = new Integer[]{
                new Integer(1),
                new Integer(2),
                3, // Автоматическая упаковка
        };
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(bb));

        Other.main(new String[]{ "fiddle", "de", "dum" });


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

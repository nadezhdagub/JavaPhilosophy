package philosophy.example.three;

import java.util.Random;

class Letter {
    char c;
}

class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter l = new Letter();
        l.c = 'a';
        System.out.println("1: l.c: " + l.c);
        f(l);
        System.out.println("2: l.c: " + l.c);
    }
}

class Tank {
    int level;
}

class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);     // 9  and 47
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);     // 47  and 47
        t1.level = 27;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);     // 27  and 27
    }
}

public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2 / 2 + z;
        int b = x + (y - 2) / (2 + z);
        System.out.println("a = " + a + " b = " + b);

        Random rand = new Random(47);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);
        i = j + k;
        System.out.println("j + k :" + i);
        i = j - k;
        System.out.println("j - k :" + i);
        i = j * k;
        System.out.println("j * k :" + i);
        i = k / j;
        System.out.println("j / k :" + i);
        i = k % j;
        System.out.println("j % k :" + i);
        j %= k;
        System.out.println("j %/ k :" + j);

        Tank tk1 = new Tank();
        Tank tk2 = new Tank();
        tk1.level = tk2.level = 100;
        System.out.println(tk1.equals(tk2));

        Random rand1 = new Random(47);
        int ii = rand1.nextInt(100);
        int jj = rand1.nextInt(100);
        System.out.println("ii is: " + ii);
        System.out.println("jj is: " + jj);
        System.out.println("ii > jj is: " + (ii > jj));
        System.out.println("ii < jj is: " + (ii < jj));
        System.out.println("ii >= jj is: " + (ii >= jj));
        System.out.println("ii <= jj is: " + (ii <= jj));
        System.out.println("ii == jj is: " + (ii == jj));
        System.out.println("ii != jj is: " + (ii != jj));


        boolean bb = test1(0) && test2(2) && test3(2);
        System.out.println("expression " + bb);


        float expFloat = 1.39e-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d;
        double expDouble2 = 47e47;
        System.out.println(expDouble);
        System.out.println(expDouble2);


        int u = -1;
        System.out.println(Integer.toBinaryString(u));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(u));
        long l = -1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));
        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));
        byte by = -1;
        System.out.println(Integer.toBinaryString(by));
        by >>>= 10;
        System.out.println(Integer.toBinaryString(by));
        by = -1;
        System.out.println(Integer.toBinaryString(by));
        System.out.println(Integer.toBinaryString(by >>> 10));


        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));


        int xx = 0, уy = 1, zz = 2;
        String ss = "x, у, z ";
        System.out.println(ss + xx + уy + zz);
        System.out.println(xx + " " + ss);
        ss += "(summed) = ";
        System.out.println(ss + (xx + уy + zz));
        System.out.println("" + xx);


        int f = 200;
        long lng = (long)f;
        lng = f;
        long lng2 = (long)200;
        lng2 = 200;
        f = (int)lng2;


        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)above: " + (int)above);
        System.out.println("(int)below: " + (int)below);
        System.out.println("(int)fabove: " + (int)fabove);
        System.out.println("(int)fbelow: " + (int)fbelow);


        double above1 = 0.7, below1 = 0.4;
        float fabove1 = 0.7f, fbelow1 = 0.4f;
        System.out.println("Math.round(above1): " + Math.round(above1));
        System.out.println("Math.round(below1): " + Math.round(below1));
        System.out.println("Math.round(fabove1): " + Math.round(fabove1));
        System.out.println("Math.round(fbelow1): " +Math.round(fbelow1));

    }

    static boolean test1(int val) {
        System.out.println("test1( + val + )");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        System.out.println("test2( + val + )");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        System.out.println("test3( + val + )");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }

    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int standardIfElse(int i) {
        if (i < 10)
            return i * 100;
        else
            return i * 10;
    }

}

package philosophy.example.three;

import java.util.Random;

class VelocityCalculator {
    static float velocity (float d, float t) {
        if(t == 0) return 0f;
        else return d/t;
    }
}

class Dog {
    String name, says;
    void setName(String n) {
        name = n;
    }
    void setSays(String s) {
        says = s;
    }
    void getName() {
        System.out.println(name);
    }
    void getSays() {
        System.out.println(says);
    }
}

class Fl {
    float fl;
}

class Tube {
    float level;
}

public class Exercises {
    public static void main(String[] args) {
        /** 2) Create a class with a float type field.
         * Use it to demonstrate the combination of names
         */
        Tube t1 = new Tube();
        Tube t2 = new Tube();
        t1.level = 0.9f;
        t2.level = 0.47f;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 0.27f;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);

        /** 3) Create a class with a float type field.
         * Use it to demonstrate the combination of names when calling methods
         */
        Fl fl1 = new Fl();
        fl1.fl = 5.57863f;
        System.out.println("1: fl1.fl: " + fl1.fl);
        foo(fl1);
        System.out.println("2: fl1.fl: " + fl1.fl);

        /** 4) Write a program that calculates the speed for constant values
         * of distance and time.
         */
        float d = 565.3f;
        float t = 3.6f;
        System.out.println("Distance: " + d);
        System.out.println("Time: " + t);
        float v = VelocityCalculator.velocity(d, t);
        System.out.println("Velocity: " + v);



        /** 5) Create a Dog class containing two String type fields: name and status.
         * In the main method, create two Dog objects with different names (spot and scruffy) and messages.
         * Print the values of both fields for each of the objects.
         */
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.setName("Spot");
        spot.setSays("Ruff");
        spot.getName();
        spot.getSays();
        scruffy.setName("Scruffy");
        scruffy.setSays("ffy");
        scruffy.getName();
        scruffy.getSays();


        /** 6) In exercise 5, create a new Dog reference and assign it to the spot object.
         * Compare the links with the == operator and the equals() method.
         */
        Dog spott = new Dog();
        Dog scruffyy = new Dog();
        Dog bruf = new Dog();
        spott.setName("Spot");
        spott.setSays("Ruff");
        spott.getName();
        spott.getSays();
        scruffyy.setName("Scruffy");
        scruffyy.setSays("ffy");
        scruffyy.getName();
        scruffyy.getSays();
        bruf.setName("Br");
        bruf.setSays("brrrrrrr");
        bruf.getName();
        bruf.getSays();
        System.out.println("Comparison: ");
        System.out.println("spot == butch: " + (spott == bruf));
        System.out.println("spot.equals(butch): " + spott.equals(bruf));
        System.out.println("butch.equals(spot): " + bruf.equals(spott));
        System.out.println("Now assign: spot = butch");
        spott = bruf;
        System.out.println("Compare again: ");
        System.out.println("spot == butch: " + (spott == bruf));
        System.out.println("spot.equals(butch): " + spott.equals(bruf));
        System.out.println("butch.equals(spot): " + bruf.equals(spott));
        System.out.println("Spot: ");
        spott.getName();
        spott.getSays();
        System.out.println("Butch: ");
        bruf.getName();
        bruf.getSays();


        /** 7) Write a program that simulates a coin toss
         */
        Random rand = new Random(0);
        byte coin = (byte) rand.nextInt(2);
        if (coin == 0) {
            System.out.println("tails");
        } else if (coin == 1) {
            System.out.println("heeds");
        }


        /** 8) Show that hexadecimal and octal entries can be used
         * with the long type. To output the results, use the Long.toBinaryString() method.
         */
        long l = 0123l;
        long ll = 0x56l;
        System.out.println("long n2 in oct = " + Long.toBinaryString(l));
        System.out.println("long n1 in hex = " + Long.toBinaryString(ll));


        /** 9) Print the largest and smallest numbers in exponential notation for
         * the float and double types.
         */
        double max = java.lang.Double.MAX_VALUE;
        System.out.println("Max double = " + max);
        double min = java.lang.Double.MIN_VALUE;
        System.out.println("Min double = " + min);
        float maxf = java.lang.Float.MAX_VALUE;
        System.out.println("Max float = " + maxf);
        float minf = java.lang.Float.MIN_VALUE;
        System.out.println("Min float = " + minf);


        /** 10) Write a program with two constants: both constants consist
         * of alternating zeros and ones, but one has the lowest bit equal to zero,
         * and the other has the highest (hint: constants are easiest to define in hexadecimal form).
         * Combine these two constants with all possible bitwise operators.
         * To output the results, use the Integer.toBinaryString() method.
         */
        int i = 1 + 4 + 16 + 64;
        int j = 2 + 8 + 32 + 128;
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("i & j = " + Integer.toBinaryString(i & j));
        System.out.println("i | j = " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
        System.out.println("~i = " + Integer.toBinaryString(~i));
        System.out.println("~j = " + Integer.toBinaryString(~j));


        /** 11) Start with a number containing a binary 1 in the highest bit
         * (hint: use a hexadecimal constant).
         * Using the signed right shift operator, shift the sign to the rightmost position,
         * with the output of all intermediate results using the integer.toBinaryString() method.
         */
        int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        for(int k = 0; k < 28; k++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }


        /** 12) Start with a number consisting of binary units.
         * Shift it to the left, and then use an unsigned
         * right shift operator for all binary positions,
         * with the output of all intermediate results using the
         * integer.toBinaryString() method.
         */
        int hh = -1;
        System.out.println(Integer.toBinaryString(hh));
        hh <<= 10;
        System.out.println(Integer.toBinaryString(hh));
        for(int kk = 0; kk < 32; kk++) {
            hh >>>= 1;
            System.out.println(Integer.toBinaryString(hh));
        }


        /** 13) Write a method to output char in binary representation.
         * Demonstrate its operation on several different symbols.
         */
        char c = 'a';
        System.out.println(Integer.toBinaryString(c));
        c = 'b';
        System.out.println(Integer.toBinaryString(c));
        c = 'c';
        System.out.println(Integer.toBinaryString(c));
        c = 'd';
        System.out.println(Integer.toBinaryString(c));
        c +=1;
        System.out.println(Integer.toBinaryString(c));
        c = 'A';
        System.out.println(Integer.toBinaryString(c));
        for(int n = 0; n < 26; n++) {
            c +=1;
            System.out.println(Integer.toBinaryString(c));
        }


        /** 14) Write a method that receives two String arguments, performs
         * all logical comparison operations with them, and outputs the results.
         * For the == and I = operations, also perform the equals() check.
         * Call your method from main() for several different String objects.
         */
        String s = "one";
        String tt = "two";
        Exercises.Eq(s, tt);
    }

    static void foo(Fl ff) {
        ff.fl = 2.5472f;
    }

    static void Eq(String s, String t) {
        f(s == t);
        f(s != t);
        f(s.equals(t));
    }
    static void f(boolean b) {
        if (b == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

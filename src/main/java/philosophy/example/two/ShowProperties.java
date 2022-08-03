package philosophy.example.two;

import java.util.Date;

class DataOnly {
    int i;
    double d;
    boolean b;
    static int ii = 48;

    DataOnly data = new DataOnly();

    // data.i = 47;  //in java 5
    // DataOnly.i++;  //only for static fields

    static void increment() {
        DataOnly.ii++;
    }

    public static void main(String[] args) {
        // data.increment();  //only for java5
        DataOnly.increment();
        System.out.println("Hello, world");
        System.out.println(new Date());
        System.getProperties().list(System.out);
    }
}

public class ShowProperties {
}

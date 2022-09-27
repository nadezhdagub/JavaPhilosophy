package philosophy.example.seven;

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "skonstruirovan";
    }

    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private String
            s1 = "Happy",
            s2 = "happy",
            s3, s4;
    private WaterSource soap;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public SprinklerSystem() {
        System.out.println("In constructor SprinklerSystem()");
        s3 = "Funny";
        f = 3.14f;
        soap = new WaterSource();
    }

    {
        i = 47;
    }

    public String toString() {
        if (s4 == null) {
            s4 = "funny";
        }
        return
                "valve1 = " + valve1 + " " +
                        "valve2 = " + valve2 + " " +
                        "valve3 = " + valve3 + " " +
                        "valve4 = " + valve4 + "\n" +
                        "i = " + i + " " + "f = " + f + " " +
                        "source = " + source +
                        "soap = " + soap;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class Art {
    Art() {
        System.out.println("KoHCTpyKTop Art");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("KoHCTpyKTop Drawing");
    }
}

class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("KoHCTpyKTop Cartoon");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

class Game {
    Game(int i) {
        System.out.println("KoHCTpyKTop Game");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("KoHCTpyKTop BoardGame");
    }
}

class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("KoHCTpyKTop Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

class Detergent extends Cleanser {
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Check base class");
        Cleanser.main(args);
    }
}

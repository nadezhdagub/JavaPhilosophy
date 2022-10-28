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

class SpaceShipControls {
    void up(int velocity) {
    }

    void down(int velocity) {
    }

    void left(int velocity) {
    }

    void right(int velocity) {
    }

    void forward(int velocity) {
    }

    void back(int velocity) {
    }

    void turboBoost() {
    }
}

class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
    }
}

class SpaceShipDelegator {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegator(String name) {
        this.name = name;
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegator protector = new SpaceShipDelegator("NSEA Protector");
        protector.forward(100);
    }
}

class Plate {
    Plate(int i) {
        System.out.println("Constructor Plate");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("Constructor DinnerPlate");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Constructor Utensil");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Constructor Spoon");
    }
}


class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Constructor Fork");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("Constructor Knife");
    }
}

class Custom {
    Custom(int i) {
        System.out.println("Constructor Custom");
    }
}

class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("Constructor PlaceSetting");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
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

class Shape {
    Shape(int i) {
        System.out.println("Constructor Shape");
    }

    void dispose() {
        System.out.println("Ending Shape");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Draw circle Circle");
    }

    void dispose() {
        System.out.println("Clean circle Circle");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Draw triangle Triangle");
    }

    void dispose() {
        System.out.println("Clean triangle Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Draw line Line: " + start + ", " + end);
    }

    void dispose() {
        System.out.println("Clean line Line: " + start + ", " + end);
        super.dispose();
    }
}

class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combinated constructor");
    }

    void dispose() {
        System.out.println("CADSystem.dispose()");
        // Завершение осуществляется в порядке,
        // обратном порядку инициализации
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
        // kod and exception handling
        } finally {
            x.dispose();
        }
    }
}

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {}

class Bart extends Homer {
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}

class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}

class Instrument {
    public void play() {}
    static void tune(Instrument i) {
// ...
        i.play();
    }
}

class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}

class Villain {
    private String name;
    protected void set(String nm) {name = nm;}
    public Villain(String name) {this.name = name;}
    public String toString() {
        return "I love Villain and my name " + name;
    }
}

class Orc extends Villain {
    private int orcNumber;
    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        System.out.println(orc);
    }
}

//class Lisa extends Homer {
//    @Override
//    void doh(Milhouse m) {
//        System.out.println("doh(Milhouse)");
//    }
//}

package philosophy.example.seven;

import java.util.Random;

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

class Milhouse {
}

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
    public void play() {
    }

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

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

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

class Value {
    int i; // доступ в пределах пакета

    public Value(int i) {
        this.i = i;
    }
}

class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    // Могут быть кон стантам и времени компиляции:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // Типичная открытая константа :
    public static final int VALUE_THREE = 39;
    // Не может быть константой времени компиляции:
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value vl = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    // Массивы:
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + " : " + " i4 = " + i4 + " , INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fdl = new FinalData(" f d l ");
        // ! fdl.valueOne++ ; // Ошибка: значение нельзя изменить
        fdl.v2.i++; // Объект не является неизменным!
        fdl.vl = new Value(9); // OK - неявляется неизменным
        for (int i = 0; i < fdl.a.length; i++)
            fdl.a[i]++; // Объект неявляется неизменным!
        // ! fdl.v2 = new Value ( 0 ) ; // Ошибка: ссылку
        // ! fdl.VAL_3 = new Value ( l ) ; // нельзя изменить
        // ! fdl.a = new i n t [ 3 ] ;
        System.out.println(fdl);
        System.out.println(" Co3 flae M FinalData ");
        FinalData fd2 = new FinalData(" fd2 ");
        System.out.println(fdl);
        System.out.println(fd2);
    }
}

class Poppet {
    private int i;

    Poppet(int ii) {
        i = ii;
    }
}

class BlankFinal {
    private final int i = 0; // Инициализированная константа
    private final int j; // Пустая константа
    private final Poppet p; // Пустая константа -ссылка

    // Пустые константы НЕОБХОДИМО инициализировать
// в конструкторе :
    public BlankFinal() {
        j = 1; // Инициализация пустой константы
        p = new Poppet(1); // Инициализация пустой неизменной ссылки
    }

    public BlankFinal(int x) {
        j = x; // Инициализация пустой константы
        p = new Poppet(x); // Инициализация пустой неизменной ссылки
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);

    }
}

class Gizmo {
    public void spin() {}
}

class FinalArguments {
    void with(final Gizmo g) {
        // ! g = new Gizmo(); // Запрещено -- g объявлено final
    }

    void without(Gizmo g) {
        g = new Gizmo(); // Разрешено -- g не яаляется final
        g.spin();
    }

    // void f(final int i) {i++;}  // нельзя изменять, неизменные примитивы доступны только для чтенияЖ
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}

class WithFinals {
    // То же, что и просто private
    private final void f() {
        System.out.println("WithFinals.f()");
    }
    // Также автоматически является final
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // Можно провести восходящее преобразование:
        OverridingPrivate op = op2;
        // Но методы при этом вызвать невозможно:
        //! op.f();
        //! op.g();
        // И тоже самое здесь:
        WithFinals wf = op2;
        //! wf.f();
        //! wf.g();
    }
}

class SmallBrain {}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f() {}
}

//! class Further extends Dinosaur {}
// Ошибка: Нельзя расширить неизменный класс Dinosaur

class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("Поле static Insert.x1 инициализировано");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Поле static Beetle.x2 инициализировано");

    public static void main(String[] args) {
        System.out.println("Constructor Beetle");
        Beetle b = new Beetle();
    }
}


//class Lisa extends Homer {
//    @Override
//    void doh(Milhouse m) {
//        System.out.println("doh(Milhouse)");
//    }
//}

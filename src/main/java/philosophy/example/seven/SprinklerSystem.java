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

package philosophy.example.seven;

class Simple {
    String s;
    protected Simple(String ss) {this.s = ss;}
    public String toString() { return s;}
    public void setString(String sn) {this.s = sn;}
}

public class Exercises {
    /**
     * 1) Create a simple class. In the second class,
     * define a reference to an object of the first class.
     * Use deferred initialization to create instances of this class.
     */
    Simple simple;
    String s;
    public Exercises(String ss) {
        this.s = ss;
    }
    private Simple lazy() {
        if(simple == null) {
            System.out.println("Creating Simple");
            simple = new Simple(s);
        }
        return simple;
    }

    public static void main(String[] args) {
        /**
         * 1)
         */
        Exercises exercises = new Exercises("In");
        exercises.lazy();

        
    }
}

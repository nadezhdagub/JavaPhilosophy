package philosophy.example.eight;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument{
    public void play(Note n) {
        System.out.println("Instrument.play");
    }
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}

class String edextendsInstrument {
public void play(Note n) {
print("Stringed.play()" + n );
    }
}

class Brass extends Instrument {
public void play(Note n) {
print("Brass.play()" + n );
}
}

class Music2 {
public static void tune(Wind i) {
i.play (Note.MIDDLEC);
}
    
public static void tune(String edi) {
i.play(Note.MIDDLE_C);
}
    
public static void tune(Brass i) {
i.play (Note.MIDDLE_C);
}
    
public static void tune (Instrumenti) {
// ...
i.play(Note.MIDDLE_C);
} 
    
Brass frenchHorn = new Brass();
tune (flute); // Без восходящ его п реобразовани я
tune (violin);
tune (frenchHorn);
}
}  

/*
class Shape {
public void draw() {}
public void erase() {} 
}
*/

class Circle extends Shape {
public void draw() { print( "Circle.draw()" ); }
public void erase() { print("Circle.erase()" ); }
} 

class Square extends Shape {
public void draw() { print("Square.draw()" ); }
public void erase() { print("Square.erase()" ); }
}

class Triangle extends Shape {
public void draw() { print(" riangle.draw()" ); }
public void erase() { print("Triangle.erase()" ); }
}

class Random ShapeGenerator {
private Random rand = new Random(47);
public Shape next() {
switch(rand.nextInt(3)) {
default:
case 0 : return new Circle() ;
case 1: return new Square() ;
case 2: return new Triangle() ;
}
    }
    }
    
public static void main (String[] args) {
Wind flute = new Wind();
String edviolin = new Stringed();

public class Polimorphyzm {
    public static void tune(Instrument i) {
// ..
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);       //восход\щее преобразование
    }
}

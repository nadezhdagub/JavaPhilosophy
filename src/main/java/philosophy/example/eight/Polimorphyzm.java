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
public void play (Noten) {
print("Stringed.play()" + n );
    }
}

class Brass extends Instrument {
public void play (Noten) {
print("Brass.play()" + n ) ;
}
}

class Music2 {
public static void tune (Wind i) {
i. play (Note.MIDDLEC ) ;
}
    
public static void tune(String edi) {
i.play(Note.MIDDLE_C) ;
}
    
public static void tune (Brassi) {
i.play ( Note.MIDDLE_C) ;
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

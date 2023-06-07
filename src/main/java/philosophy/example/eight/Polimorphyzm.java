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

class Shapes {
private static Random ShapeGeneratorgen = new Random ShapeGenerator();
public static void main (String[] args) {
Shape[] s = new Shape[9];
// Заполняем м асси в ф игурами:
for (int i = 0 ; i < s.length; i++)
s[i] = gen.next() ;
// Полиморфные вызовы методов :
for (Shapeshp : s)
shp.draw() ;
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
    
class Instrument {
     void play(Note n) {print("Instrument.play()" + n ); }
     String what() { return "Instrument"; }
     void adjust() { print("Adjust ing Instrument" ) ; }
}   

class Wind extends Instrument {
     void play ( Note n) { print ("Wind.play()" + n ) ; }
     String what() { return "Wind"; }
     void adjust() { print ( "Adjusting Wind"); }
}

class Percussion extends Instrument {
     void play (Note n) { print ("Percussion.play()" + n ) ; }
     String what() { return "Percussion" ; }
     void adjust() { print ("Adjusting Percussion" ) ; }
}    

class Stringed extends Instrument {
void play ( Note n ) { print ( "Stringed.play()" + n ) ; }
String what() { return "String ed " ; }
void adjust() { print ( " Adjusting String ed " ) ; }
}    
    
class Brass extends Wind {
void play( Note n ) { print ( "8rass.play()" + n ) ; }
void adjust() { print ( "Adjusting Brass” ) ; }
}
    
class Woodwind extends Wind {
void play ( Note n ) { print ( "Woodwind.play()” + n ) ; }
String what() { return "Woodwind” ; }
               }

class Music3 {
// Работа метода не зависит от фактического типа объекта ,
// поэтому типы, добавленные в систему, будут работать правильно:
public static void tune ( Instrument i ) {
// ...
i.play (Note.MIDDLE_C) ;
}
public static void tuneAll( Instrument[] e ) {
for ( Instrumenti : e)
tune ( i ) ;
}
                              
public static void main( String[] args ) {
// Восходящее преобразование при добавлении в массив:
Instrument[] orchestra = {
new Wind() ,
new Percussion() ,
new Stringed() ,
new Brass() ,
new Woodwind()
    };
tuneAll(orchestra ) ;
}
    } 

class PrivateOverride {
private void f() { print( "privatef()" ); }
public static void main (String[] args) {
PrivateOverride po = new Derived();
po.f();
}
    }
                              
class Derived extends Private Override {
public void f() { print( "publicf()") ; }
}   
                              
class Super {
public int field = 0 ;
public int getField() { return field ; }
}                              

class Sub extends Super {
public int field = 1 ;
public int getField() { return field ; }
public int getSuperField() { return super.field ; }
}
                              
class FieldAccess{
public static void main (String[] args) {
Super sup = new Sub(); // Upcast
System.out.println("sup.field= " + sup.field +
", sup.getField() = " + sup.getField());
Sub sub = new Sub();
System.out.println( "sub.field = " +
sub.field + " , sub.getField() = " +
sub. getField() +
" , sub.getSuperField() = " +
sub.getSuperField()) ;
}
}

class StaticSuper {
public static String staticGet() {
return "Базовая версия staticGet()" ;
    }
public String dynamicGet() {
return "Базовая версия dynamicGet()" ;
}
}
                              
class StaticSub extends StaticSuper {
public static String staticGet( ) {
return "Производная версия staticGet() " ;
}
public String dynamicGet() {
return "Производная версия dynamicGet()" ;
}
}

class StaticPolymorphism {
public static void main( String[] args) {
StaticSuper sup = new StaticSub(); // Восходящ ее преобразование
System.out.println( sup.staticGet());
System.out.println( sup.dynamicGet());
}
}                              

class Meal {
Meal() { print ("Meal()" ) ; }
}                              

class Bread {
Bread() { print("Bread()"); }
                          }                              
class Cheese {
Cheese() { print( "Cheese()" ); }
                }
                              
class Lettuce {
Lettuce() { print( "Lettuce()" ); }
}

class Lunch extends Meal {
Lunch() { print( "Lunch()") ; }
              }

class PortableLunch extends Lunch {
PortableLunch() { print ( " PortableLunch()" ); }
}                              

class Sandwich extends PortableLunch {
private Breadb = new Bread();
private Cheesec = new Cheese();
private Lettuce1 = new Lettuce();
public Sandwich() { print("Sandwich()"); }
public static void main( String[ ] args ) {
new Sandwich() ;
}
    }                              

class Characteristic {
private Strings ;
Characteristic ( String s ) {
this.s = s ;
print( "Co3flae M Characteristic" + s ) ;
}
protected void dispose() {
print("3aeepujae M Characteristic" + s ) ;
}
    }

class Description {
private String s;
Description( String s) {
this.s = s;
print( "Co3flae M Description" + s);
}
protected void dispose() {
print(" 3aeepujae M Description" + s);
}
}                              

// живое существо
class LivingCreature {
private Characteristicp = new Characteristic( "x n Boe существо");
private Descriptiont = new Description("o6ычное живое существо");
LivingCreature() {
print("LivingCreature()");
           }
protected void dispose() {
print("dispose() в LivingCreature");
t.dispose();
p.dispose();
}
    }
                              
// животное
class Anitnal extends LivingCreature {
private Characteristic p = new Characteristic( "H MeeT сердце");
private Descriptiont = new Description('^nBOTHoe, не растение");
Animal() { print("Animal()"); }
protected void dispose() {
print("dispose() в Animal");
t.dispose();
p.dispose();
super.dispose();
}
    }

class Amphibian extends Animal {
private Characteristic p = new Characteristic("MoxeT жить в воде");
private Description t = new Description("nо воде, и на земле");
Amphibian() {
print("Amphibian()");
          }
protected void dispose() {
print("dispose() в Amphibian");
t.dispose();
p.dispose();
super.dispose();
}
    }                                       

// лягушка
public class Frog extends Amphibian {
private Characteristic p = new Characteristic("KBaKaeT");
private Description t = new Description("ecT жуков");
public Frog() { print(''Frog()"); }
protected void dispose() {
print("3aBepmeHHe Frog");
t.dispose();
p.dispose();
super.dispose();
}
public static void main(String [] args) {
Frog frog = new Frog();
print("noKa!");
frog.dispose();
}
}                                       

class Shared {
private int refcount = 0 ;
private static long counter = 0;
private final long id = counter++ ;
public Shared() {
print("Co3AaeM" + this);
}
public void addRef() { refcount++ ; }
protected void dispose() {
if( --refcount == 0)
print("Disposing" + this);
}
public String toString() { return "Shared" + id;)
                                          }                      

class Composing {
private Shared shared;
private static long counter = 0;
private final long id = counter++;
public Composing(Shared shared) {
print("Co3flaeM" + this);
this.shared = shared;
this.shared.addRef();
}
protected void dispose() {
print("disposing " + this);
shared.dispose();
}
public String toString() ( return "Composing" + id;}
                                            }
    
class ReferenceCounting {
public static void main(String[] args) {
Shared shared = new Shared();
Composing[] composing = { new Composing(shared),
new Composing(shared), new Composing(shared),
new Composing(shared), new Composing(shared));
for(Composing c : composing)
c.dispose() ;
}
)

class Glyph {
void draw() { print("Glyph.draw()"); }
Glyph() {
print("Glyph() перед вызовом draw()");
draw();
print("Glyph() после вызова draw()");
}
    }    

class RoundGlyph extends Glyph {
private int radius = 1;
RoundGlyph(int r) {
radius = r;
print(''RoundGlyph.RoundGlyph()j radius = " + radius);
}
void draw() {
print("RoundGlyph.draw(), radius = " + radius);
}
      }   

class Grain {
public StringtoString() { return "Grain"; }
}
      
class Wheat extends Grain {
public String toString() { return "Wheat"j }
}

      class Mill {
Grain process() { return new Grain(); }
                 }

class WheatMill extends Mill {
Wheat process() { return new Wheat()j }
}      

class CovariantReturn {
public static void main(String[] args) {
Mill m = new Mill();
Grain g - m.process();
System.out.println(g);
m = new WheatMill();
g = m.process();
System.out.println(g)j
    }
    }      

class Actor {
public void act() {}
                   }
      
class HappyActor extends Actor {
public void act() { print("HappyActor"); }
                   }

class SadActor extends Actor {
public void act() { print("SadActor"); )
                   }   

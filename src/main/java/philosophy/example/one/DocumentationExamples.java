package philosophy.example.one;
//: exampleFolder/.../DocumentationExamples.java
import java.util.*;

/** Программа-пример книги
 * Выводит строку и текущее число.
 * @author Брюс Эккель
 * @author www.MindView.net
 * @version 4.0
 */
public class DocumentationExamples {
    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     * @throws /*exceptions Исключения не выдаются
     */
    public static void main(String[] args) {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());
    }
} /* Output: (55% match)
Привет, сеодня:
Wed Oct 05 14:39:36 MDT 2005
*///:~
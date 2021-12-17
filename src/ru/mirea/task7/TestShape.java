package ru.mirea.task7;
import java.lang.*;
public class TestShape {
    public static void main(String[] args) {
        Shape a1 = new Circle(5, "red", true);
        Shape a2 = new Rectangle(6, 7,  "yellow", false);
        Shape a3 = new Square(10);

        System.out.println(a1);
        System.out.println(a1.getColor());
        a1.setColor("brown");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
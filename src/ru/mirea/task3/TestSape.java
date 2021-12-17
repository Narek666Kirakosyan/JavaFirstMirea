package ru.mirea.task3;
import java.util.Scanner;
public class TestSape {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите радиус: ");
        double r=scanner.nextDouble();
       Circle c=new Circle(r,"blue",true);
       System.out.println(c);
       System.out.println("Введите длину и ширину: ");
       double w =scanner.nextDouble();
       double l =scanner.nextDouble();
       Rectangle R=new Rectangle(w,l,"blue",true);
       System.out.println(R);
       System.out.println("Введите сторону: ");
       double s=scanner.nextDouble();
       Square S=new Square(s,"red",true);
       System.out.println(S);
    }
}

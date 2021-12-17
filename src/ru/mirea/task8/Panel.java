package ru.mirea.task8;
        import javax.swing.*;
        import java.awt.*;
        import java.util.ArrayList;
        import java.util.Random;

//Создайте окно, нарисуйте в нем 20 случайных фигур случайного цвета. Классы фигур должны наследоваться от
// абстрактного класса Shape, в котором описаны свойства фигуры: цвет, позиция.
public class Panel extends JFrame {

    private int Width = 500;
    private int Height = 500;

    public static void main(String[] args) {
        new Panel().setVisible(true);
    }

    public Panel() {
        super("Shapes");

        setSize(Width, Height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    void generateShapes() {
        Random random = new Random();
        int number = 20;
        for (int i = 0; i < number; i++) {
            double randomX = Math.random();
            double randomY = Math.random();

            int r = Math.abs(random.nextInt() % 256);
            int g = Math.abs(random.nextInt() % 256);
            int b = Math.abs(random.nextInt() % 256);

            Color randomColor = new Color(r, g, b);

            switch (random.nextInt() % 3) {
                case 0:
                    shapes.add(new Circle(randomColor, randomX, randomY));
                    break;
                case 1:
                    shapes.add(new Square(randomColor, randomX, randomY));
                    break;
                case 2:
                    shapes.add(new Triangle(randomColor, randomX, randomY));
                    break;
            }
        }
    }

    void drawShapes(Graphics g) {
        for (Shape shape : shapes) {
            shape.drawShape(g, Width, Height);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        generateShapes();
        drawShapes(g);
    }

}
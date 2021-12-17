package ru.mirea.task8;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


public abstract class Shape {

    private Color color;
    private double x;
    private double y;

    public Shape(Color color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract void drawShape(Graphics g, int windowWidth, int windowHeight);
}

class Circle extends Shape {

    public Circle(Color color, double x, double y) {
        super(color, x, y);
    }
    public void drawShape(Graphics g, int windowWidth, int windowHeight) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());

        java.awt.Shape circle = new Ellipse2D.Float((float) (windowWidth * getX()), (float) (windowHeight * getY()), 50.0f, 50.0f);

        g2.fill(circle);
    }

}

class Square extends Shape {

    public Square(Color color, double x, double y) {
        super(color, x, y);
    }

    public void drawShape(Graphics g, int windowWidth, int windowHeight) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());

        java.awt.Shape square = new Rectangle2D.Float((float) (windowWidth * getX()), (float) (windowHeight * getY()), 50.0f, 50.0f);

        g2.fill(square);
    }
}

class Triangle extends Shape {

    public Triangle(Color color, double x, double y) {
        super(color, x, y);
    }

    public void drawShape(Graphics g, int windowWidth, int windowHeight) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());

        double centerX = windowWidth * getX();
        double centerY = windowHeight * getY();

        Polygon triangle = new Polygon(new int[] {(int) (centerX - 25), (int) centerX, (int) (centerX + 25)}, new int[] {(int) centerY, (int) centerY - 50, (int) centerY}, 3);

        g2.fillPolygon(triangle);
    }

}
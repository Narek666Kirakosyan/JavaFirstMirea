package ru.mirea.task7;
import java.math.*;
import java.lang.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.filled = false;
        this.color = "black";
    };
    public Shape(String c, boolean f) {
        color = c;
        filled = f;
    }

    public String getColor() { return color; }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    public String toString() {
        return "Shape: something, color: "+this.color;
    }
}


class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.filled = false;
        this.color = "black";
        radius = 1;
    }
    public Circle(double radius){
        this.filled = false;
        this.color = "black";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() { return Math.PI*radius*radius; }
    @Override
    public double getPerimeter() { return 2*Math.PI*radius; }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "black";
        width = 1;
        length = 1;
    }
    public Rectangle(double width, double length){
        this.filled = false;
        this.color = "black";
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth() { return width; }
    public void setWidth(double width) {
        this.width = width;
    }
    public double geLength() { return length; }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() { return width*length; }
    @Override
    public double getPerimeter() { return 2*(width+length); }
    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+", length: "+this.length+", color: "+this.color;
    }
}



class Square extends Rectangle{
    protected double  side;
    public Square(){
        this.filled = false;
        this.color = "black";
        side = 1;
    }
    public Square(double side){
        this.filled = false;
        this.color = "black";
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() { return side; }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() { return side*side; }
    @Override
    public double getPerimeter() { return 4*side; }
    @Override
    public String toString() {
        return "Shape: square, side: "+this.side+", color: "+this.color;
    }
}
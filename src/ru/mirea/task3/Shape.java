package ru.mirea.task3;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape(){
      color="blue";
      filled=true;
    }
    Shape(String c, boolean f){
      color=c;
      filled=f;
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color= color;
    }
    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
        this.filled=filled;
    }
    public double getArea(){
        return getArea();
    }
    public double getPerimeter(){
        return getPerimeter();
    }
    public String toString(){
        return this.color+" filled "+ this.filled;
    }
}
//------------------------------------------------------
class Circle extends Shape{
    protected double radius;

    Circle(){
        radius=2.0;
        color="blue";
        filled=true;
    }
    Circle(double r){
        radius=r;
        color="red";
        filled=true;
    }
    Circle(double r, String c, boolean f){
        radius=r;
        color=c;
        filled=f;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return  Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color+" Filled: "+this.filled+" Area "+this.getArea() + " Perimeter " +this.getPerimeter();
    }
}
//--------------------------------------------------------
class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle(){
        width=3.0;
        length=4.0;
        color="blue";
        filled=true;
    }
    Rectangle(double w, double l){
        width=w;
        length=l;
        color="red";
        filled=true;
    }
    Rectangle(double w, double l, String c, boolean f){
        width=w;
        length=l;
        color=c;
        filled=f;
    }
    double getWidth(){
        return width;
    }
    void setWidth(double width){
        this.width=width;
    }
    double getLength(){
        return length;
    }
    void setLength(double length){
        this.length=length;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2*width+2*length;
    }
    @Override
    public String toString() {
        return "Shape: Rectangle, width and length " + this.width+" "+ this.length + " ,color "+this.color + " Filled: "+this.filled +" Area "+ this.getArea()+ " Perimeter " +this.getPerimeter();
    }
}
//--------------------------------------------------------
class Square extends Rectangle{
    Square(){
    }
    Square(double s){
        this.width=s;
        this.length=s;
        color="red";
        filled=true;
    }
    Square(double s, String c, boolean f){
        this.width=s;
        this.length=s;
        color=c;
        filled=f;
    }
    double getSide(){
        return width;
    }
    void setSide(double side){
        this.width=side;
    }
    @Override
    void setWidth(double side){
        this.width=side;
    }
    @Override
    void setLength(double side){
        this.length=side;
    }
    @Override
    public String toString(){
        return "Rectangle: Square, side "+this.width+" color "+this.color+" Filled: "+this.filled+" Area "+this.getArea() + " Perimeter " +this.getPerimeter();
    }
}
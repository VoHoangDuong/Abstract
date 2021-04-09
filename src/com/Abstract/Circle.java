package com.Abstract;

public class Circle extends Shape{
    protected double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius + super.toString() + " Area = " + getArea() + " Perimeter = " + getPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5,"red",true);
        System.out.println(circle);
    }
}

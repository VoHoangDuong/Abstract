package com.demointerface;

public class Circle implements IShape {
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public void display() {
        System.out.println("Circle");
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter : " + getPerimeter());
    }
}

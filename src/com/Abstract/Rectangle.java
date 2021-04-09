package com.Abstract;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    @Override
    double getArea() {
        return this.length*this.width;
    }


    @Override
    double getPerimeter() {
        return (this.width + this.length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length + super.toString() +
                '}';
    }
}

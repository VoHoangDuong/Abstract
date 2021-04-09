package com.demointerface;

import com.Abstract.Shape;

public class Rectangle implements IShape {

    private double width;
    private double length;

    public Rectangle(){

    }

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width)*2;
    }

    @Override
    public void display() {
        System.out.println("Rectangle ");
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter : " + getPerimeter());
    }
}

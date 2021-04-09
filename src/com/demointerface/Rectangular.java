package com.demointerface;

public class Rectangular extends Rectangle implements IVolumShape {

    private double height;

    public Rectangular(){

    }
    public Rectangular(double length, double width, double height){
        super(length, width);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double getVolume() {
        return super.getArea()*this.height;
    }
    public void display(){
        System.out.println("Rectangular ");
        System.out.println("Height : " + this.height);
        System.out.println("Area : " + getArea());
        System.out.println("Volume : " + getVolume());
    }
}

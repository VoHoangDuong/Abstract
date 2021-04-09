package com.demointerface;

public class Cylinder extends Circle implements IVolumShape {

    private double heightCylinder;

    public Cylinder(double radius, double heightCylinder){
        super(radius);
        this.heightCylinder = heightCylinder;
    }
    public void setHeightCylinder(double heightCylinder){
        this.heightCylinder = heightCylinder;
    }
    public double getHeightCylinder(){
        return heightCylinder;
    }

    @Override
    public double getVolume() {
        return super.getArea()*this.heightCylinder;
    }
    public void display(){
        System.out.println("Cylinder ");
        System.out.println("Are : " + getArea());
        System.out.println("Height : " + this.heightCylinder);
        System.out.println("Volume : " + getVolume());
    }
}

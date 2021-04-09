package com.demointerface;

import com.Abstract.Shape;

public class TestShape {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Cylinder(4,5);
        shapes[2] = new Rectangle(4,2);
        shapes[3] = new Rectangular(4,5,6);
        for (IShape shape: shapes
             ) {
            shape.display();
            System.out.println("**************************");
        }
    }
}

package com.Abstract;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);

    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLength(double length){
        setSide(length);
    }

    @Override
    public String toString() {
        return super.toString() + "side = " + getSide();
    }

    public static void main(String[] args) {
        Square square = new Square(4,"red", false);
        System.out.println(square.toString());
    }
}

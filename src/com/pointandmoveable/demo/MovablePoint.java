package com.pointandmoveable.demo;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    public MovablePoint(){

    }
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float [] out = {this.xSpeed, this.ySpeed};
        return out;
    }

    @Override
    public String toString() {
        return super.toString() + " speed = ( " + getXSpeed() + ", " + getYSpeed() + " )";
    }
    public MovablePoint move(){
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this ;
    }
}

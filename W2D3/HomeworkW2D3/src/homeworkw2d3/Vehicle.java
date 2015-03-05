/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d3;

/**
 *
 * @author Lai
 */
public abstract class Vehicle {
    private double x;
    private double y;
    protected int speed;
    private int direction;

    public void move(){
        x = x + (Math.cos(direction*Math.PI/180)*speed);
        y = y + (Math.sin(direction*Math.PI/180)*speed);
    }
    
    public void turn(int amount){
        direction += amount;
        while (direction < 0){
            direction = direction + 360;
        }
        while (direction > 360){
            direction = 360 - direction;
        }
    }
    
    public abstract void accelerate();
    public abstract void brake();
    
    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Lai
 */
public class BetterCar {
    private int x;
    private int y;

    public void moveUp(int y){
        this.y = this.y + y;
    }
    
    public void moveDown(int y){
        this.y = this.y - y;
    }
    
    public void moveRight(int x){
        this.x = this.x + x;
    }
    
    public void moveLeft(int x){
        this.x = this.x - x;
    }
    
    public String returnLocation(){
        return x + ", " + y;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}

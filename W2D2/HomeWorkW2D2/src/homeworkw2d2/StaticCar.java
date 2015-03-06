/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d2;

/**
 *
 * @author Lai
 */
public class StaticCar {
    private int x;
    private int y;
    
    public StaticCar(){
    }
    
    public StaticCar(int x, int y){
        StaticCar.setX(this, x);
        StaticCar.setY(this, y);
    }
    
    public static void moveUp(StaticCar This, int y){
        This.y = This.y + y;
    }
    
    public static void moveDown(StaticCar This, int y){
        This.y = This.y - y;
    }
    
    public static void moveRight(StaticCar This, int x){
        This.x = This.x + x;
    }
    
    public static void moveLeft(StaticCar This, int x){
        This.x = This.x - x;
    }
    
    public static String returnLocation(StaticCar This){
        return This.x + ", " + This.y;
    }
    
    public static int getX(StaticCar This) {
        return This.x;
    }

    public static void setX(StaticCar This, int x) {
        This.x = x;
    }

    public static int getY(StaticCar This) {
        return This.y;
    }

    public static void setY(StaticCar This, int y) {
        This.y = y;
    }
    
    
        
}

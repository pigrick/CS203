/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d2;

import java.util.ArrayList;
/**
 *
 * @author Lai
 */
public class Garage {
    private String make;
    private String model;
    private int year;
    private String color;
    private int speed;    
    private ArrayList<Item> item = new ArrayList<>();
    private Automobile a;

    public void store(Automobile a){
        this.a = a;
    }
    
    public void store(Item i){
        item.add(i);
    }
    
    public Automobile retrieve(){
        return this.a;
    }
    
    public Item retrieve(int i){
        return this.item.get(i);
    }
   
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public Automobile getA() {
        return a;
    }

    public void setA(Automobile a) {
        this.a = a;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieprogram;

/**
 *
 * @author Lai
 */
public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.setTitle("Gone with the stock");
        one.setGenre("Tragic");
        one.setRating(-2);
        
        Movie two = new Movie();
        two.setTitle("Lost in the Cubicle Space");
        two.setGenre("Comedy");
        two.setRating(5);
        
        Movie three = new Movie();
        three.setTitle("Byte Club");
        three.setGenre("Tragic but ultimately uplifting");
        three.setRating(127);
        
        System.out.println(one.getTitle()+ ", " + one.getGenre() + ", " + one.getRating());
        System.out.println(two.getTitle()+ ", " + two.getGenre() + ", " + two.getRating());
        System.out.println(three.getTitle()+ ", " + three.getGenre() + ", " + three.getRating());
        
        one.playIt();
        two.playIt();
        three.playIt();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d6;
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author Lai
 */
public class CalendarTestDrive {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Type in your name: ");
        String name = in.nextLine();
        System.out.print("Type in the birthyear: ");
        int year = in.nextInt();
        System.out.print("Type in the birthmonth: ");
        int month = in.nextInt();
        System.out.print("Type in the birthday: ");
        int day = in.nextInt();
        
        Calendar c = Calendar.getInstance();
        c.set(year, (month-1), day);        
        System.out.printf(name + "'s birthday is %tB %te %tY", c, c, c); 
    }
}

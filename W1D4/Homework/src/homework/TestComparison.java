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
public class TestComparison {
    public static void main(String[] args0){
        byte b = 5;
        short s = 5;
        int i = 5;
        long L= 5;
        float f = 5.0f;
        double d = 5.0;
        String s1 = "Mi";
        String s2 = "Mi";
        String s3 = "MiMi";
    
        System.out.println(b==s);
        System.out.println(b==i);
        System.out.println(b==L);
        System.out.println(b==f);
        System.out.println(b==d);
        System.out.println(s==i);
        System.out.println(s==L);
        System.out.println(s==f);
        System.out.println(s==d);
        System.out.println(i==L);
        System.out.println(i==f);
        System.out.println(i==d);
        System.out.println(L==f);
        System.out.println(L==d);
        System.out.println(f==d);
        
        System.out.println(s1==s2);
        System.out.println(s3==(s1 + s2));
        
    
    }
    

}

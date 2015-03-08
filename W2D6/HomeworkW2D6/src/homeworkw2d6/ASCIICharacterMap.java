/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d6;

/**
 *
 * @author Lai
 */
public class ASCIICharacterMap {
    public static void main(String[] args){
        System.out.println("Dec\tHex\tOct\tChar");
        for(int i = 32; i < 129; i++){
            System.out.printf("%d\t%x\t%o\t%c\n", i, i, i, i);
        }
    }
}

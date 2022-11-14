/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */
import java.util.Scanner;
public class exp4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("deger gir");
        int x = input.nextInt();
        System.out.println("deger gir");
        int y = input.nextInt();
        if (x<y) {
            for (;x<=y; x++) {
                if(x%3==0){
                    System.out.println(x);
                }if(x%4==0){
                    System.out.println(x);
                }if(x%5==0){
                    System.out.println(x);
                }
                
            }
            
        }
        if (y<x) {
            for (;y<=x; y++) {
                if(y%3==0){
                    System.out.println(y);
                }if(y%4==0){
                    System.out.println(y);
                }if(y%5==0){
                    System.out.println(y);
                }
                
            }
            
        }
        
        
            
        
            
        
            
            
        
}
}

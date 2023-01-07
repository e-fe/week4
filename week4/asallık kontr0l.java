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
public class exp6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("+ SAYI GİR");
        int x = input.nextInt();
        boolean asalmi = true;
        for (int i = 2;i<x;i++){
            if(x%i == 0){
                asalmi = false;
            }
        }
        if (asalmi==true && x!=1){
            System.out.println("sayı asal");
        }else{
            System.out.println("sayı asal deıl");
        }
    }
}

                
        
    


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
public class exp1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("SAYI GİR ");
        int x = input.nextInt();
        int s = 1;
        int toplam = 0;
        int ttoplam = 0;
        while(s<=x){
            if(s%2==0){
                toplam=toplam+s;
            }
            if(s%2!=0){
                ttoplam=ttoplam+s;
            }
            s++;
            
        }
        System.out.println("ÇİFT TOPLAM : "+toplam);
        System.out.println("TEK TOPLAM : "+ttoplam);
        
        
    }
    
}

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

public class exp5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DEĞER GİR");
        int x = input.nextInt();
        int toplam = 0;
        while (x>0) {
            int y =x%10;
            toplam=toplam+y;
           x = x/10;
            
            
            
        }
        System.out.println(toplam);
        
    }

}

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

public class hw48 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("BÖLÜNMESİ İSTENEN SAYI");
        int x = input.nextInt();
        System.out.println("BÖLEN SAYI");
        int y = input.nextInt();
        int tam = x/y;
        System.out.println(tam);
        for (; (x%y)<y ;) {
            int z = x%y*10/y;
            System.out.println(z);
            
            
            
            
            
        }
        
        

    }

}

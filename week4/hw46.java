/*
1.başla
2.deger al
3.0dan kucukse git adım 6
4.degerin mod10 unu yazdır
5.degeri 10 a bol
6.bitir
 */

/**
 *
 * @author mehme
 */
import java.util.Scanner;
public class hw46 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("deger gir");
        int x = input.nextInt();
        while(0<x){
            System.out.print(x%10);
            x = x/10;
        }
        
    }
    
}

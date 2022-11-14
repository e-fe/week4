/* 
A1.BAŞLA
A2.S=1
A3.EĞER S>99 ADIM 6 YA GİT
A4.EĞER S%5=0 İSE S YAZDIR
A5.S=S+1
A6.ADIM 3 E GİT
A7.BİTİR
 * 
 */

/**
 *
 * @author mehme
 */
import java.util.Scanner;
public class exp3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("değer gir d");
        int x = input.nextInt();
        System.out.println("değer gir");
        int y = input.nextInt();
        if(x<=y){
        for (;  x<=y ; x++) {
            if(x%5==0){
                System.out.println(x);
            }}
            }
        if(y<=x){
        for (;  y<=x ; y++) {
            if(y%5==0){
                System.out.println(y);
            }
            }
            
        }
            
        
        
        
        
    }}
    


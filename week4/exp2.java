/* 
A1.basla
A2.x değerini klavyeden al
A3.fak=1 s=1
A4.eğer s>x adım 8 e git
A5.fak=fak*s
A6.s=s+1
A7.adım 4 e git
A8.fak yazdır
A9.bitir
 */

/**
 *
 * @author mehme
 */
import java.util.Scanner;

public class exp2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SAYI GİR");
        int x = input.nextInt();
        int s = 1;
        int fak = 1;
        while(s<=x){
            fak=fak*s;
            s++;
        }
        System.out.println(fak);
    }

}

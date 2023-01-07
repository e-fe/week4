/*
1.başlat
2.klavyeden değer al
3.fonk=y
4.fonk<0 negatif değer yazdır
5.fonk>0 pozitif deger yazdır
6.fonk=0 fonk köku yazdır
7.bitir
 * 
 */

/**
 *
 * @author mehme
 */
import java.util.Scanner;
//import java.lang.Math;

public class hw30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y =  (int)Math.pow(x, 2) - (5 * x) + 3;
        if (y < 0) {
            System.out.println("fonk NEGATİF");
        } else if (y > 0) {
            System.out.println("fonk POZİTİF");
        } else {
            System.out.println("DENKLEMİN KÖKÜ");
        }

    }

}

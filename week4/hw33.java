/*
1.başla
2.kalvyeden deger al
3.girilen degeri cm,
3.girilen degeri mm,
3.girilen degeri dm,
3.girilen degeri km,
4.degeri ayzdır
5.bitir

 * 
 */

/**
 *
 * @author mehme
 */
import java.util.Scanner;

public class hw33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("METRE DEGERINI GIR");
        int m = input.nextInt();
        System.out.println("YAPTIRMAK ISTEDIGIN DEGERİ GİR:\n1-cm\n2-mm\n3-dm\n4-km");
        int y = input.nextInt();
        switch (y) {
            case 1 :
                System.out.println(m * 100);
                break;
            case 2 :
                System.out.println(m * 1000);
                break;
            case 3 :
                System.out.println(m * 10);
                break;
            case 4 :
                System.out.println(m / 1000);
                break;
            default:
                System.out.println("YARRAM DUZGUN GİR");

        }

    }

}

/*
c(8,4)= {8!/[4!*(8-4)!]}
 * 
 */

/**
 *
 * @author mehme
 */
import java.util.Scanner;

public class hw23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("KAÇ ELEMANLI KÜME");
        int x = input.nextInt();
        System.out.println("KAÇLI KOMBİNASYONU");
        int y = input.nextInt();
        int z = x-y;
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 1; i <= x; i++) {
            f1 = f1 * i;
        }
        //System.out.println(f1);
        for (int i = 1; i <= y; i++) {
            f2 = f2 * i;
        }
        //System.out.println(f2);
        for (int i = 1; i <=(x-y); i++) {
            f3= f3* i;
        }
        //System.out.println(f3);
        System.out.println(f1/(f2*f3));

    }
}

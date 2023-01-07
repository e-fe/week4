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

public class hw22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DEGER GİR");
        int x = input.nextInt();
        int y = 1;
        int xt = (x * (x + 1)) / 2;
        System.out.println(xt);
        int xtt = 0;
        int xct = 0;
        while (y <= x) {
            if (y % 2 == 0) {
                xct = xct + y;
            }
            if (y % 2 != 0) {
                xtt = xtt + y;
            }
            y++;
        }
        System.out.println(xtt);
        System.out.println(xct);

    }

}

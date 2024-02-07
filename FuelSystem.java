/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forwhile;

import java.util.Scanner;

/**
 *
 * @author Behruz Tapdiqov
 */
public class salam15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nov;
        while (true) {
            System.out.println("Yanacag secimi edin:"
                    + "\n1.Dizel"
                    + "\n2.92"
                    + "\n3.95");
            nov = sc.nextInt();
            if (nov == 1 || nov == 2 || nov == 3) {
                break;
            } else if (nov == 0) {
                System.exit(0);

            } else {
                System.out.println("Duzgun secim edin:");
            }
        }

        System.out.println("Litri daxil edin:");
        int litr = sc.nextInt();
        double mebleg = 0;
        if (nov == 1) {
            mebleg = litr * 0.8;

        } else if (nov == 2) {
            mebleg = litr * 2;

        } else if (nov == 3) {
            mebleg = litr * 1;

        }
        if (mebleg % 1 == 0) {
            System.out.println("Sizin odeyeceyiniz mebleg: " + (int) mebleg + " manat");
        } else {
            System.out.println("Sizin odeyeceyiniz mebleg: " + mebleg + " manat");
        }
    }

}

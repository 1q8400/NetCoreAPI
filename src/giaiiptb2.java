package src;

import java.util.Scanner;

public class giaiiptb2 {
    public static void main(String[] args) {
        double a, b, c, denta;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(" nhap a: ");
            a = sc.nextDouble();
        } while (a == 0);
        System.out.print(" nhap b: ");
        b = sc.nextDouble();
        System.out.print(" nhap c: ");
        c = sc.nextDouble();
        denta = b * b - 4 * a * c;
        if (denta < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (denta == 0) {
            System.out.println(" phuong trinh co nghiem kep x = " + (-b / (2 * a)));
        } else {
            System.out.println("phuong trinh co nghiem x1= " + (-b + Math.sqrt(denta)) / (2 * a));
            System.out.println("phuong trinh co nghiem x2= " + (-b - Math.sqrt(denta)) / (2 * a));
        }
        sc.close();
    }

}

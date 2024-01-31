package src;

import java.util.Scanner;

public class giaiptb1 {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        a = sc.nextDouble();
        System.out.println("nhap b");
        b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong tih vo so nghiem");
            } else {
                System.out.println("phuong trinh co nghiem");
            }
        } else {
            System.out.println("x=" + (-b / a));

        }
        sc.close();

    }
}
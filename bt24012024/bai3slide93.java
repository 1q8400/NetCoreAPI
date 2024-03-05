package bt24012024;

import java.util.Scanner;

public class bai3slide93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten ");
        String name = sc.nextLine();
        System.out.println("nhap nam sinh");
        int year = sc.nextInt();
        int age = 2024 - year;
        if (age < 16) {
            System.out.println("ban " + name + " o tuoi vi thanh nien");

        } else if (age >= 16 && age < 18) {
            System.out.println("ban " + name + " o do tuoi truongw thanh ");

        } else {

            System.out.println("ban " + name + " da gia roi do ban oi");
        }
        sc.close();
    }
}

package bt24012024;
import java.util.Scanner;
public class slide35 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap so a");
    int a = sc.nextInt();
    System.out.println("nhap so b");
    int b = sc.nextInt();
        int min =a;
        if (b<min) {
            min = b;
        }
    System.out.println("so nho nhat trong 2 so la "+ min);
    sc.close();
    }
}

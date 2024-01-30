package bt24012024;
import java.util.Scanner;   
public class slide47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        do {
            System.out.println("nhap so nguyen n");
            n = sc.nextInt();
            sum += n;
        } while(sum <= 100);
        System.out.println("tong cua cac so nguyen la "+ sum);
    
    }
}

package bt24012024;
import java.util.Scanner;
public class slide30 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap so nguyên n");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int tong = 0 ;
        for(int i = 0; i< str.length(); i++ ){
            tong+= str.charAt(i)- '0';
            System.out.println("tong cac chu so "+n+ "la :"+ tong);
        }
        sc.close();
    }

}

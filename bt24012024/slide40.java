package bt24012024;
import java.util.Scanner;
public class slide40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ngay");
        int day = sc.nextInt();
        String thu ="";
        switch (day) {
            case 1:
                thu = "Thu hai";
                break;
            case 2:
                thu = "Thu ba";
                break;
            case 3:
                thu = "Thu tu";
                break;
            case 4:
                thu = "Thu nam";
                break;
            case 5:
                thu = "Thu sau";
                break;
            case 6:
                thu = "Thu bay";
                break;
            case 7:
                thu = "Chu nhat";
                break;
    }
    System.out.println(" so ngay "+ day + " la "+ thu);
    sc.close();
}
}

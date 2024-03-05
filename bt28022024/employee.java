package bt28022024;

    import java.util.Scanner;

public class employee {

    public String hoTen;
    public int Tuoi;
    public String diaChi;
    public float luong;

    public void NhapHoTen()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("  nhap ho va ten: ");
        hoTen = sc.nextLine();
        sc.close();
    }
    
    public void NhapTuoi()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("  nhap tuoi: ");
        Tuoi = sc.nextInt();
        sc.close();
    }

    public void NhapDiaChi()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("  nhap dia chi: ");
        diaChi = sc.nextLine();
        sc.close();
    }

    public void NhapLuong()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("  nhap luong: ");
        luong = sc.nextFloat();
        sc.close();
    }
}


package Testing;

import java.util.Scanner;
import Class.KhachSan;

public class Test {

    public static void main(String[] args) {
        Scanner sc123 = new Scanner(System.in);

        KhachSan ql123 = new KhachSan();

        ql123.nhapDanhSach(sc123);

        System.out.print("Nhap vao khach tro can tinh tien: ");
        int thuTu123 = sc123.nextInt();

        System.out.println("==> Tong tien la: " + ql123.tinhTienTheoThuTu(thuTu123));

        sc123.close();
    }
}

package Class;

import java.sql.Date;
import java.util.Scanner;

public class KhachTro extends Nguoi {
    private int soNgayTro123;
    private String loaiPhong123;
    private double giaPhong123;

    public KhachTro() {
    }
    public KhachTro(String hoTen123, Date ngaySinh123, int CMND123, int soNgayTro123, String loaiPhong123, double giaPhong123) {
        super(hoTen123, ngaySinh123, CMND123);
        this.soNgayTro123 = soNgayTro123;
        this.loaiPhong123 = loaiPhong123;
        this.giaPhong123 = giaPhong123;
    }
    public void nhapThongTin(Scanner sc123) {
        super.nhapThongTin(sc123);
        System.out.print("\tNhap so ngay tro: ");
        soNgayTro123 = sc123.nextInt();
        sc123.nextLine();
        System.out.print("\tNhap loai phong: ");
        loaiPhong123 = sc123.nextLine();
        System.out.print("\tNhap gia phong: ");
        giaPhong123 = sc123.nextDouble();
        sc123.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo ngay tro: " + soNgayTro123);
        System.out.println("\tLoai phong: " + loaiPhong123);
        System.out.println("\tGia phong: " + giaPhong123);
    }

    public int getSoNgayTro123() {
        return soNgayTro123;
    }

    public double getGiaPhong123() {
        return giaPhong123;
    }
}

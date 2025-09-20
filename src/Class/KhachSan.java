package Class;
import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> ds123;

    public KhachSan() {
        ds123 = new ArrayList<KhachTro>(10);
    }
    public void themKhachTro(KhachTro kt123) {
        ds123.add(kt123);
    }
    public void nhapDanhSach(Scanner sc123) {
        KhachTro khach123;
        System.out.print("Nhap vao so luong khach: ");
        int n123 = sc123.nextInt();
        sc123.nextLine();
        System.out.println("Nhap vao thong tin khach tro:");
        for (int i123 = 0; i123 < n123; i123++) {
            System.out.println("Khach tro thu " + (i123 + 1) + " la:");
            khach123 = new KhachTro();
            khach123.nhapThongTin(sc123);
            themKhachTro(khach123);
        }
    }

    public void hienThiDanhSach() {
        for (KhachTro khach123 : ds123) {
            khach123.hienThiThongTin();
        }
    }

    public double tinhTienTheoThuTu(int thuTu123) {
        if (thuTu123 >= 1 && thuTu123 <= ds123.size()) {
            KhachTro khach123 = ds123.get(thuTu123 - 1);
            return khach123.getSoNgayTro123() * khach123.getGiaPhong123();
        }
        return 0;
    }
}

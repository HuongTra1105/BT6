package Class;
import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	private ArrayList<KhachTro> ds;
	public KhachSan() {
		ds = new ArrayList<KhachTro>(10);
	}
	public void themKhachTro(KhachTro kt) {
		ds.add(kt);
	}
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach;
		System.out.print("Nhap vao so luong khach: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao thong tin khach tro:");
		for (int i = 0; i < n; i++) {
			System.out.println("Khach tro thu " + (i + 1) + " la:");
			khach = new KhachTro();
			khach.nhapThongTin(sc);
			themKhachTro(khach);
		}
	}
	public void hienThiDanhSach() {
		for (KhachTro khach : ds) {
			khach.hienThiThongTin();
		}
	}
	public double tinhTienTheoThuTu(int thuTu) {
	    if (thuTu >= 1 && thuTu <= ds.size()) {
	        KhachTro khach = ds.get(thuTu - 1);
	        return khach.getSoNgayTro() * khach.getGiaPhong();
	    }
	    return 0;
	}
}

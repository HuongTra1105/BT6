package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen123;
    protected Date ngaySinh123;
    protected int CMND123;

    public Nguoi() {
    }

    public Nguoi(String hoTen123, Date ngaySinh123, int CMND123) {
        this.hoTen123 = hoTen123;
        this.ngaySinh123 = ngaySinh123;
        this.CMND123 = CMND123;
    }

    public void nhapThongTin(Scanner sc123) {
        System.out.print("\tNhap ho ten: ");
        hoTen123 = sc123.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        String strDate123 = sc123.nextLine();
        ngaySinh123 = strToDate(strDate123);
        System.out.print("\tNhap CMND: ");
        CMND123 = sc123.nextInt();
        sc123.nextLine();
    }

    private Date strToDate(String strDate123) {
        Date date123 = null;
        SimpleDateFormat sdf123 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date123 = sdf123.parse(strDate123);
        } catch (ParseException e123) {
            System.out.println("Loi dinh dang ngay thang!");
        }
        return date123;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen123);
        System.out.println("\tNgay sinh: " + ngaySinh123);
        System.out.println("\tCMND: " + CMND123);
    }

    public int getCMND123() {
        return CMND123;
    }

    public Date getNgaySinh123() {
        return ngaySinh123;
    }

    public String getHoTen123() {
        return hoTen123;
    }
}

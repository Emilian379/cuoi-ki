import java.util.Scanner;

public class ThongTinKhachHang {
    static Scanner in = new Scanner(System.in);

    public static void tenKhachHang() {
        System.out.println("Thông tin khách hàng:");
        Scanner in = new Scanner(System.in);
        System.out.println("Họ và tên:");
        String ten = in.nextLine();
        String name = "[a-z A-Z]+";
        if (!ten.matches(name)) {
            System.out.println("Lỗi! vui lòng nhập lại");
        } else {
            System.out.println("Họ và tên khách hàng: " + ten);
        }
    }

    public static void canCuocKhachHang() {
        System.out.println("căn cước công dân:");
        String cmnd = in.nextLine();
        String id = "[0-9]{12}";
        if (!cmnd.matches(id)) {
            System.out.println("Lỗi! Vui lòng nhập lại");
        }
        else {
            System.out.println("căn cước của khách hàng: "+cmnd);
        }
    }
    public static void maTaiKhoan() {
        System.out.println("Xin nhập mã tài khoản:");
        String ma = in.nextLine();
        String pass = "[0-9]{6,12}";
        if (!ma.matches(pass)) {
            System.out.println("Lỗi! vui lòng nhập lại");
        }
        else {
            System.out.println("mã tài khoản khách hàng: "+ma);
        }
    }
}
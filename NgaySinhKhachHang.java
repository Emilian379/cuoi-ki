import java.util.Scanner;

public class NgaySinhKhachHang {
    public static void ngaySinh() {
        Scanner out = new Scanner(System.in);
        try {
            System.out.println("Xin nhập ngày sinh:");
            int sinh = out.nextInt();
            System.out.println("Ngày sinh khách hàng: "+sinh);
        }
        catch (Exception e) {
            System.out.println("Lỗi! vui lòng nhập lại");
        }
    }
}
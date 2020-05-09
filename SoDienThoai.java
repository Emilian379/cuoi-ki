import java.util.Scanner;

public class SoDienThoai {
    public static void phoneNum() {
        Scanner on = new Scanner(System.in);
        try {
            System.out.println("số điện thoại:");
            int phonenum = on.nextInt();
            System.out.println("Số điện thoại khách hàng: 0"+phonenum);
        }
        catch (Exception e) {
            System.out.println("Lỗi! Vui lòng nhập lại");
        }
    }
}
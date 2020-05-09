import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO auto generated
        ThongTinKhachHang.tenKhachHang();
        NgaySinhKhachHang.ngaySinh();
        ThongTinKhachHang.canCuocKhachHang();
        SoDienThoai.phoneNum();
        ThongTinKhachHang.maTaiKhoan();
        Scanner scan = new Scanner(System.in); 
        try {
            System.out.println("Xin mời nhập số tiền:");
            int X = scan.nextInt();
            System.out.println("Số tiền quý khách đã nhập vào: "+X);
        System.out.println("Giá cổ phiếu hôm nay:");
        int [] gia = {2000, 4200, 3000, 5300, 3600, 5000};
        System.out.println("Giá cổ phiếu A: "+gia[0]+"/1 cổ phiếu ở giá trần và "+gia[1]+"/1 cổ phiếu ở giá sàn.");
        System.out.println("Giá cổ phiếu B: "+gia[2]+"/1 cổ phiếu ở giá trần và "+gia[3]+"/1 cổ phiếu ở giá sàn.");
        System.out.println("Giá cổ phiếu C: "+gia[4]+"/1 cổ phiếu ở giá trần và "+gia[5]+"/1 cổ phiếu ở giá sàn.");
        System.out.println("");
        int a1 = X/gia[0];
        int a2 = X/gia[1];
        int b1 = X/gia[2];
        int b2 = X/gia[3];
        int c1 = X/gia[4];
        int c2 = X/gia[5];
        System.out.println("Quý khách có thể mua:");
        System.out.println("CỔ phiếu A: "+a1+" cổ phiếu ở giá trần và "+a2+" cổ phiếu ở giá sàn.");
        System.out.println("CỔ phiếu B: "+b1+" cổ phiếu ở giá trần và "+b2+" cổ phiếu ở giá sàn.");
        System.out.println("CỔ phiếu C: "+c1+" cổ phiếu ở giá trần và "+c2+" cổ phiếu ở giá sàn.");
        int i = X/2 - X/2/gia[1]*4200;
        int e = X/2 - X/2/gia[3]*5300;
        int f = X/2 - X/2/gia[5]*5000;
        if (4000<=i && i<4200) {
            System.out.println("Quý khách có thể mua: "+X/2/gia[1]+2+" cổ phiếu A với "+X/2);
        }
        else {
            if (2000<=i && i<4000) {
                System.out.println("Quý khách có thể mua: "+X/2/gia[1]+1+" cổ phiếu A với "+X/2);
            }
            else {
                System.out.println("Quý khách có thể mua: "+X/2/gia[1]+" cổ phiếu A với "+X/2);
            }
        }
        if (3000<=e && e<5300) {
            System.out.println("Quý khách có thể mua: "+X/2/gia[3]+1+" cổ phiếu B với "+X/2);
        }
        else {
            System.out.println("Quý khách có thể mua: "+X/2/gia[3]+" cổ phiếu B với "+X/2);
        }
        if (3600<=f && f<5000) {
            System.out.println("Quý khách có thể mua: "+X/2/gia[5]+1+" cổ phiếu C với "+X/2);
        }
        else {
            System.out.println("Quý khách có thể mua: "+X/2/gia[5]+" cổ phiếu C với "+X/2);
        }
    }
    catch (Exception e) {
        System.out.println("Lỗi! vui lòng nhập lại");
    }
}
}
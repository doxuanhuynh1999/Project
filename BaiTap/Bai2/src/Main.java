import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luaChon;
        String tiepTuc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---Menu--");
            System.out.print("1: Thêm mới tài liệu \n" +
                    "2: Xóa tìa liệu \n" +
                    "3: Hiện thị thông tin \n" +
                    "4: Tìm kiêm theo loại \n"
            );
            System.out.print("Nhập giá trị bạn muốn xem: ");
            luaChon =sc.nextInt();
            if(luaChon > 4 || luaChon < 0){
                System.out.print("Nhập lại giá trị bạn muốn xem: ");
                luaChon = sc.nextInt();
            }
            switch (luaChon){
                case 1:
                    Function.themMoi();
                    break;
                case 2:
                    Function.xoaTaiLieu();
                    break;
                case 3:
                    Function.hienThi();
                    break;
                case 4:
                    Function.timKiem();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục không nếu muốn hãy ấn yes,y, nếu không hay ấn no: ");
            tiepTuc = sc.next();
        }while (tiepTuc.equalsIgnoreCase("y") || tiepTuc.equalsIgnoreCase("yes"));
    }
}

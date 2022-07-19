import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luaChon;
        String tiepTuc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---Menu--");
            System.out.print("1: Thêm thí sinh mới \n" +
                    "2: Hiện thị thí sinh \n" +
                    "3: Tìm kiếm theo số báo danh \n"
            );
            System.out.print("Nhập giá trị bạn muốn xem: ");
            luaChon =sc.nextInt();
            if(luaChon > 3 || luaChon < 0){
                System.out.print("Nhập lại giá trị bạn muốn xem: ");
                luaChon = sc.nextInt();
            }
            switch (luaChon){
                case 1:
                    TuyenSInh.themThiSinh();
                    break;
                case 2:
                    TuyenSInh.hienThi();
                    break;
                case 3:
                    TuyenSInh.timKiem();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục không nếu muốn hãy ấn yes,y, nếu không hay ấn no: ");
            tiepTuc = sc.next();
        }while (tiepTuc.equalsIgnoreCase("y") || tiepTuc.equalsIgnoreCase("yes"));
    }
}

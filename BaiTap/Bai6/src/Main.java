import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luaChon;
        String tiepTuc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---Menu--");
            System.out.print("1: Thêm người\n" +
                    "2:Hiện thị \n" +
                    "3: Hiện thị học sinh 20 tuổi \n"
                    + "4: Số lượng học sinh có tuổi là 23 và quê DN \n"
            );
            System.out.print("Nhập giá trị bạn muốn xem: ");
            luaChon =sc.nextInt();
            if(luaChon > 4 || luaChon < 0){
                System.out.print("Nhập lại giá trị bạn muốn xem: ");
                luaChon = sc.nextInt();
            }
            switch (luaChon){
                case 1:
                    Truong.themHocSinh();
                    break;
                case 2:
                    Truong.hienThi();
                    break;
                case 3:
                    Truong.hienThiHs20();
                    break;
                case 4:
                    Truong.soLuong();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục không nếu muốn hãy ấn yes,y, nếu không hay ấn no: ");
            tiepTuc = sc.next();
        }while (tiepTuc.equalsIgnoreCase("y") || tiepTuc.equalsIgnoreCase("yes"));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luaChon;
        String tiepTuc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---Menu--");
            System.out.print("1: Thêm cán bộ \n" +
                    "\n" +
                    "2: Tìm kiếm theo tên nhân viên \n" +
                    "\n"+
                    "3: In ra danh sách cán bộ \n"

            );
            System.out.print("Nhập giá trị bạn muốn xem: ");
            luaChon =sc.nextInt();
            if(luaChon > 3 || luaChon < 0){
                System.out.print("Nhập lại giá trị bạn muốn xem: ");
                luaChon = sc.nextInt();
            }
            switch (luaChon){
                case 1:
                    Function.add();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục không nếu muốn hãy ấn yes,y, nếu không hay ấn no: ");
            tiepTuc = sc.next();
        }while (tiepTuc.equalsIgnoreCase("y")||tiepTuc.equalsIgnoreCase("yes"));
    }
}

package mains;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luaChon;
        String tiepTuc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---Menu--");
            System.out.print("1: Thêm \n" +
                    "2:Sửa \n" +
                    "3: Hiện thị theo từng loại \n" +
                    "4: Hiện thị cả công ty \n" +
                    "5: Xóa \n"
            );
            System.out.print("Nhập giá trị bạn muốn xem: ");
            luaChon = sc.nextInt();
            if (luaChon > 5 || luaChon < 0) {
                System.out.print("Nhập lại giá trị bạn muốn xem: ");
                luaChon = sc.nextInt();
            }
            switch (luaChon) {
                case 1:
                    Function.addEmployee();
                    break;
                case 2:
                    Function.fixEmployee();
                    break;
                case 3:
                    Function.displayTypeEmployee();
                    break;
                case 4:
                    Function.display();
                    break;
                case 5:
                    Function.deleteEmployee();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục không nếu muốn hãy ấn yes,y, nếu không hay ấn no: ");
            tiepTuc = sc.next();
        } while (tiepTuc.equalsIgnoreCase("y") || tiepTuc.equalsIgnoreCase("yes"));
    }
}

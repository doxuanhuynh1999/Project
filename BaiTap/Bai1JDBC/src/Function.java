import java.sql.*;
import java.util.Scanner;

public class Function {
    static Scanner sc = new Scanner(System.in);
    public static void show(ResultSet resultSet) throws SQLException {
        resultSet.getInt(1);
        resultSet.getString(2);
        resultSet.getString(3);
        resultSet.getString(4);
        resultSet.getString(5);
        resultSet.getString(6);
        resultSet.getString(7);
    }
    public static void add(){
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bai1","root","huynh28011999");
            System.out.print("Ho : ");
            String ho = sc.next();
            System.out.print("Ten : ");
            String ten = sc.next();
            System.out.print("Tuoi : ");
            int tuoi = sc.nextInt();
            System.out.print("Gioi tinh : ");
            String gioiTinh = sc.next();
            System.out.print("Dia chi : ");
            String diaChi = sc.next();
            int luaChon;
            System.out.println("1: Ban muon them Cong nhan");
            System.out.println("2: Ban muon them Ky Su");
            System.out.println("3: Ban muon them Nhan vien");
            do {
                System.out.print("Lua chon cua ban la: ");
                luaChon = sc.nextInt();
            }while (luaChon != 1 && luaChon != 2 && luaChon != 3);
            if (luaChon == 1){
                System.out.print("Bac : ");
                int bac = sc.nextInt();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into staff(officer_id,staff_name,age,gender,address,specialized_att) values(?,?,?,?,?,?)");
                preparedStatement.setInt(1,1);
                preparedStatement.setString(2,ten);
                preparedStatement.setInt(3,tuoi);
                preparedStatement.setString(4,gioiTinh);
                preparedStatement.setString(5,diaChi);
                preparedStatement.setInt(6,bac);
                int i = preparedStatement.executeUpdate();
                if (i == 0){
                    System.out.println("update sql fail");
                }else {
                    System.out.println("update success");
                }
            }else if (luaChon == 2){
                System.out.print("Nganh dao tao : ");
                String nghanhDaoTao = sc.next();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into staff(officer_id,staff_name,age,gender,address,specialized_att) values(?,?,?,?,?,?)");
                preparedStatement.setInt(1,2);
                preparedStatement.setString(2,ten);
                preparedStatement.setInt(3,tuoi);
                preparedStatement.setString(4,gioiTinh);
                preparedStatement.setString(5,diaChi);
                preparedStatement.setString(6,nghanhDaoTao);
                int i = preparedStatement.executeUpdate();
                if (i == 0){
                    System.out.println("update sql fail");
                }else {
                    System.out.println("update success");
                }

            }else if (luaChon == 3){
                System.out.print("Cong viec : ");
                String congViec = sc.next();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into staff(officer_id,staff_name,age,gender,address,specialized_att) values(?,?,?,?,?,?)");
                preparedStatement.setInt(1,3);
                preparedStatement.setString(2,ten);
                preparedStatement.setInt(3,tuoi);
                preparedStatement.setString(4,gioiTinh);
                preparedStatement.setString(5,diaChi);
                preparedStatement.setString(6,congViec);
                int i = preparedStatement.executeUpdate();
                if (i == 0){
                    System.out.println("update sql fail");
                }else {
                    System.out.println("update success");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

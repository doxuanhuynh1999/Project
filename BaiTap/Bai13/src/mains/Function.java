package mains;

import staff.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    static ArrayList<Employee> listEmployee = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    // kiểm tra id khi thêm vào nếu mà trùng sẽ xóa đi và thêm mới vào
    public static void checkID(String id){
        Employee employee = listEmployee.stream().filter(e -> e.getID().equalsIgnoreCase(id)).findAny().orElse(null);
        if (employee == null){
            return;
        }else {
            listEmployee.remove(employee);
        }
    }
    // Thêm Experience
    public static void addExperience(){
        boolean checkName;
        boolean checkEmail;
        boolean checkBirth;
        boolean checkPhone;
        System.out.print("ID: ");
        String ID = sc.next();
        sc.nextLine();
        // check Id xem có trùng hay không
        checkID(ID);
        System.out.print("Name: ");
        String name;
        // kiểm tra tên xem có hợp lệ không
        do {
            name = sc.nextLine();
            if (Validate.checkName(name)==false){
                System.out.print("Name: ");
                checkName = false;
            }else {
                checkName = true;
            }
        }while (checkName == false);
        // nhập và kiểm tra ngày sinh
        System.out.print("BirthDay: ");
        String birthDay;
        do {
            birthDay = sc.next();
            if (Validate.checkBirth(birthDay)==false){
                System.out.print("Birth Day: ");
                checkBirth = false;
            }else {
                checkBirth = true;
            }
        }while (checkBirth == false);
        // nhập và kiểm tra số điện thoại
        System.out.print("Phone: ");
        String phone;
        do {
            phone = sc.next();
            if (Validate.checkPhone(phone)==false){
                System.out.print("Phone: ");
                checkPhone = false;
            }else {
                checkPhone = true;
            }
        }while (checkPhone == false);
        // Nhập và kiểm tra email
        System.out.print("Email: ");
        String email;
        do {
            email = sc.next();
            if (Validate.checkEmail(email)==false){
                System.out.print("Email: ");
                checkEmail = false;
            }else {
                checkEmail = true;
            }
        }while (checkEmail == false);
        // nhập certificate
        System.out.print("How many certificate: ");
        int n = sc.nextInt();
        ArrayList<Certificate> certificateArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.println("Certificate " + (i+1));
            System.out.print("CertificateID: ");
            String certificateID = sc.next();
            System.out.print("CertificateName: ");
            String certificateName = sc.next();
            System.out.print("CertificateRank: ");
            String certificateRank = sc.next();
            System.out.print("CertificateDate: ");
            String certificateDate = sc.next();
            Certificate certificate = new Certificate(certificateID,certificateName,certificateRank,certificateDate);
            certificateArrayList.add(certificate);
        }
        System.out.print("ExplnYear: ");
        int explnYear = sc.nextInt();
        System.out.print("ProSkill: ");
        String proSkill = sc.next();
        // tạo ra một experience xong thêm vào list employee
        Experience experience = new Experience(ID,name,birthDay,phone,email,certificateArrayList,explnYear,proSkill);
        listEmployee.add(experience);
    }
    // thêm fresher
    public static void addFresher(){
        boolean checkName;
        boolean checkEmail;
        boolean checkBirth;
        boolean checkPhone;
        System.out.print("ID: ");
        String ID = sc.next();
        sc.nextLine();
        // check Id xem có trùng hay không
        checkID(ID);
        System.out.print("Name: ");
        String name;
        // kiểm tra tên xem có hợp lệ không
        do {
            name = sc.nextLine();
            if (Validate.checkName(name)==false){
                System.out.print("Name: ");
                checkName = false;
            }else {
                checkName = true;
            }
        }while (checkName == false);
        // nhập và kiểm tra ngày sinh
        System.out.print("BirthDay: ");
        String birthDay;
        do {
            birthDay = sc.next();
            if (Validate.checkBirth(birthDay)==false){
                System.out.print("Birth Day: ");
                checkBirth = false;
            }else {
                checkBirth = true;
            }
        }while (checkBirth == false);
        // nhập và kiểm tra số điện thoại
        System.out.print("Phone: ");
        String phone;
        do {
            phone = sc.next();
            if (Validate.checkPhone(phone)==false){
                System.out.print("Phone: ");
                checkPhone = false;
            }else {
                checkPhone = true;
            }
        }while (checkPhone == false);
        // Nhập và kiểm tra email
        System.out.print("Email: ");
        String email;
        do {
            email = sc.next();
            if (Validate.checkEmail(email)==false){
                System.out.print("Email: ");
                checkEmail = false;
            }else {
                checkEmail = true;
            }
        }while (checkEmail == false);
        // nhập certificate
        System.out.print("How many certificate: ");
        int n = sc.nextInt();
        ArrayList<Certificate> certificateArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.println("Certificate " + (i+1));
            System.out.print("CertificateID: ");
            String certificateID = sc.next();
            System.out.print("CertificateName: ");
            String certificateName = sc.next();
            System.out.print("CertificateRank: ");
            String certificateRank = sc.next();
            System.out.print("CertificateDate: ");
            String certificateDate = sc.next();
            Certificate certificate = new Certificate(certificateID,certificateName,certificateRank,certificateDate);
            certificateArrayList.add(certificate);
        }
        System.out.print("Graduation date: ");
        String graduationDate = sc.next();
        System.out.print("Graduation Rank: ");
        String graduationRank = sc.next();
        System.out.println("University name: ");
        String universityName = sc.next();
        // thêm fresher và thêm vào listployee
        Fresher fresher = new Fresher(ID,name,birthDay,phone,email,certificateArrayList,graduationDate,graduationRank,universityName);
        listEmployee.add(fresher);
    }
    public static void addIntern(){
        boolean checkName;
        boolean checkEmail;
        boolean checkBirth;
        boolean checkPhone;
        System.out.print("ID: ");
        String ID = sc.next();
        sc.nextLine();
        // check Id xem có trùng hay không
        checkID(ID);
        System.out.print("Name: ");
        String name;
        // kiểm tra tên xem có hợp lệ không
        do {
            name = sc.nextLine();
            if (Validate.checkName(name)==false){
                System.out.print("Name: ");
                checkName = false;
            }else {
                checkName = true;
            }
        }while (checkName == false);
        // nhập và kiểm tra ngày sinh
        System.out.print("BirthDay: ");
        String birthDay;
        do {
            birthDay = sc.next();
            if (Validate.checkBirth(birthDay)==false){
                System.out.print("Birth Day: ");
                checkBirth = false;
            }else {
                checkBirth = true;
            }
        }while (checkBirth == false);
        // nhập và kiểm tra số điện thoại
        System.out.print("Phone: ");
        String phone;
        do {
            phone = sc.next();
            if (Validate.checkPhone(phone)==false){
                System.out.print("Phone: ");
                checkPhone = false;
            }else {
                checkPhone = true;
            }
        }while (checkPhone == false);
        // Nhập và kiểm tra email
        System.out.print("Email: ");
        String email;
        do {
            email = sc.next();
            if (Validate.checkEmail(email)==false){
                System.out.print("Email: ");
                checkEmail = false;
            }else {
                checkEmail = true;
            }
        }while (checkEmail == false);
        // nhập certificate
        System.out.print("How many certificate: ");
        int n = sc.nextInt();
        ArrayList<Certificate> certificateArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.println("Certificate " + (i+1));
            System.out.print("CertificateID: ");
            String certificateID = sc.next();
            System.out.print("CertificateName: ");
            String certificateName = sc.next();
            System.out.print("CertificateRank: ");
            String certificateRank = sc.next();
            System.out.print("CertificateDate: ");
            String certificateDate = sc.next();
            Certificate certificate = new Certificate(certificateID,certificateName,certificateRank,certificateDate);
            certificateArrayList.add(certificate);
        }
        System.out.print("Majors: ");
        String majors = sc.next();
        System.out.print("Semester: ");
        int semester = sc.nextInt();
        System.out.println("University name; ");
        String universityName = sc.next();
        // tạo intern mới và thêm vào listemloyee
        Intern intern = new Intern(ID,name,birthDay,phone,email,certificateArrayList,majors,semester,universityName);
        listEmployee.add(intern);
    }
    // thêm employee
    public static void addEmployee(){
        System.out.println("Bạn muốn thêm: \n" +
                "1: Thêm Experience \n" +
                "2: Thêm Fresher \n" +
                "3: Thêm Intern");
        System.out.print("Lựa chọn của bạn là: ");
        int luaChon = sc.nextInt();
        if (luaChon == 1){
            addExperience();
            System.out.println("Done!");
        }else if (luaChon == 2){
            addFresher();
            System.out.println("Done!");
        }else if (luaChon == 3){
            addIntern();
            System.out.println("Done!");
        }
    }
    // sửa employee thêm id
    public static void fixEmployee(){
        System.out.print("ID bạn muốn sửa: ");
        String id = sc.next();
        Employee employee = listEmployee.stream().filter(e -> e.getID().equalsIgnoreCase(id)).findFirst().orElse(null);
        if (employee == null){
            System.out.println("Không tìm thấy id bạn muốn sửa");
        }else {
            boolean checkName;
            boolean checkEmail;
            boolean checkBirth;
            boolean checkPhone;
            System.out.print("Name: ");
            String name;
            sc.nextLine();
            // kiểm tra tên xem có hợp lệ không
            do {
                name = sc.nextLine();
                if (Validate.checkName(name)==false){
                    System.out.print("Name: ");
                    checkName = false;
                }else {
                    checkName = true;
                }
            }while (checkName == false);
            // nhập và kiểm tra ngày sinh
            System.out.print("BirthDay: ");
            String birthDay;
            do {
                birthDay = sc.next();
                if (Validate.checkBirth(birthDay)==false){
                    System.out.print("Birth Day: ");
                    checkBirth = false;
                }else {
                    checkBirth = true;
                }
            }while (checkBirth == false);
            // nhập và kiểm tra số điện thoại
            System.out.print("Phone: ");
            String phone;
            do {
                phone = sc.next();
                if (Validate.checkPhone(phone)==false){
                    System.out.print("Phone: ");
                    checkPhone = false;
                }else {
                    checkPhone = true;
                }
            }while (checkPhone == false);
            // Nhập và kiểm tra email
            System.out.print("Email: ");
            String email;
            do {
                email = sc.next();
                if (Validate.checkEmail(email)==false){
                    System.out.print("Email: ");
                    checkEmail = false;
                }else {
                    checkEmail = true;
                }
            }while (checkEmail == false);
            // nhập certificate
            System.out.print("How many certificate: ");
            int n = sc.nextInt();
            ArrayList<Certificate> certificateArrayList = new ArrayList<>();
            for (int i = 0; i < n; i++){
                System.out.println("Certificate " + (i+1));
                System.out.print("CertificateID: ");
                String certificateID = sc.next();
                System.out.print("CertificateName: ");
                String certificateName = sc.next();
                System.out.print("CertificateRank: ");
                String certificateRank = sc.next();
                System.out.print("CertificateDate: ");
                String certificateDate = sc.next();
                Certificate certificate = new Certificate(certificateID,certificateName,certificateRank,certificateDate);
                certificateArrayList.add(certificate);
            }
            employee.setName(name);
            employee.setBirthDay(birthDay);
            employee.setPhone(phone);
            employee.setEmail(email);
            employee.setCertificates(certificateArrayList);
        }
    }
    // Xóa employee theo id
    public static void deleteEmployee(){
        System.out.print("ID bạn muốn sửa: ");
        String id = sc.next();
        Employee employee = listEmployee.stream().filter(e -> e.getID().equalsIgnoreCase(id)).findFirst().orElse(null);
        if (employee == null){
            System.out.println("Không tìm thấy id bạn muốn sửa");
        }else {
            listEmployee.remove(employee);
        }
    }
    // hiển thị danh sách theo từng loại Employee
    public static void displayExperience(){
        listEmployee.stream().filter(e -> e instanceof Experience).forEach(e -> e.showMe());
    }
    public static void displayFresher(){
        listEmployee.stream().filter(e -> e instanceof Fresher).forEach(e -> e.showMe());
    }
    public static void displayIntern(){
        listEmployee.stream().filter(e -> e instanceof Intern).forEach(e -> e.showMe());
    }
    public static void displayTypeEmployee(){
        System.out.println("Bạn muốn hiện thị theo: \n" +
                "0: Experience \n" +
                "1: Fresher \n" +
                "2: Intern");
        System.out.print("Lựa chọn của bạn: ");
        int luaChon = sc.nextInt();
        if (luaChon == 0){
            displayExperience();
        }else if (luaChon == 1){
            displayFresher();
        }else if (luaChon == 2){
            displayIntern();
        }
    }
    public static void display(){
        listEmployee.stream().forEach(e -> e.showMe());
    }

}

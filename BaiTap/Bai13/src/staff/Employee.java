package staff;

import java.util.ArrayList;

public abstract class Employee {
    public static int count = 0;
    private String ID;
    private String name;
    private String birthDay;
    private String phone;
    private String email;
    private ArrayList<Certificate> certificates;

    public Employee(String ID, String name, String birthDay, String phone, String email, ArrayList<Certificate> certificates) {
        this.ID = ID;
        this.name = name;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.certificates = certificates;
    }

    public Employee() {
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(ArrayList<Certificate> certificates) {
        this.certificates = certificates;
    }
    // method abstrac
    public abstract void showMe();

    @Override
    public String toString() {
        return
                "ID='" + ID + " - " +
                ", name='" + name + " - " +
                ", birthDay='" + birthDay +" - " +
                ", phone='" + phone + " - " +
                ", email='" + email + " - " +
                ", certificates=" + certificates ;
    }
}

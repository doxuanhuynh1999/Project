package staff;

import java.util.ArrayList;

public class Fresher extends Employee{
    private String graduationDate;
    private String GraduationRank;
    private String education;

    public Fresher(String ID, String name, String birthDay, String phone, String email, ArrayList<Certificate> certificates, String graduationDate, String graduationRank, String education) {
        super(ID, name, birthDay, phone, email, certificates);
        this.graduationDate = graduationDate;
        GraduationRank = graduationRank;
        this.education = education;
    }

    public Fresher() {
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return GraduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        GraduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showMe() {
        System.out.println("Fresher" + super.toString() + " - Graduation Date" + this.graduationDate + " - Graduation Rank" + this.GraduationRank + " - Education " + this.education);
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduationDate='" + graduationDate + '\'' +
                ", GraduationRank='" + GraduationRank + '\'' +
                ", education='" + education + '\'' +
                "} " + super.toString();
    }
}

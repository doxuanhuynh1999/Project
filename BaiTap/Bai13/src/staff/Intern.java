package staff;

import java.util.ArrayList;

public class Intern extends  Employee{
    private String majors;
    private int semester;
    private String universityName;

    public Intern(String ID, String name, String birthDay, String phone, String email, ArrayList<Certificate> certificates, String majors, int semester, String universityName) {
        super(ID, name, birthDay, phone, email, certificates);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern() {
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void showMe() {
        System.out.println("Intern" + super.toString() + " - Majors " + this.majors + " - Semester " + this.semester + " - University name " + this.universityName);
    }

    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                "} " + super.toString();
    }
}

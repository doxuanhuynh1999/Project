package staff;

import java.util.ArrayList;

public class Experience extends Employee{
    private int ExplnYear;
    private String proSkill;
    public Experience(String ID, String name, String birthDay, String phone, String email, ArrayList<Certificate> certificates, int explnYear, String proSkill) {
        super(ID, name, birthDay, phone, email, certificates);
        ExplnYear = explnYear;
        this.proSkill = proSkill;
    }
    public Experience() {
    }

    public int getExplnYear() {
        return ExplnYear;
    }

    public void setExplnYear(int explnYear) {
        ExplnYear = explnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showMe() {
        System.out.println("Experience" + super.toString() + " - ExplnYear "+ this.ExplnYear + " - ProSkill " + this.proSkill);
    }

    @Override
    public String toString() {
        return "Experience{" +
                "ExplnYear=" + ExplnYear +
                ", proSkill='" + proSkill + '\'' +
                "} " + super.toString();
    }
}

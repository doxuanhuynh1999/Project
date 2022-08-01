package staff;

import java.util.Date;

public class Certificate {
    private String certificateID;
    private String CertificateName;
    private String certificateRank;
    private String certificateDate;
    public Certificate(String certificateID, String certificateName, String certificateRank, String certificateDate){
        this.certificateID = certificateID;
        this.CertificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }
    public Certificate(){};

    public String getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(String certificateID) {
        this.certificateID = certificateID;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }

    @Override
    public String toString() {
        return
                "certificateID='" + certificateID + '\'' +
                ", CertificateName='" + CertificateName + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                ", certificateDate='" + certificateDate + '\'' ;
    }
}

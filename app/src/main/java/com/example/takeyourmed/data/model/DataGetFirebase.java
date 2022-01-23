package com.example.takeyourmed.data.model;

public class DataGetFirebase {

    String DocName, DocPhone, DocMail, diseaseName, diseasePercent;

    public DataGetFirebase() {
    }

    public DataGetFirebase(String docName, String docPhone, String docMail, String diseaseName, String diseasePercent) {
        DocName = docName;
        DocPhone = docPhone;
        DocMail = docMail;
        this.diseaseName = diseaseName;
        this.diseasePercent = diseasePercent;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String docName) {
        DocName = docName;
    }

    public String getDocPhone() {
        return DocPhone;
    }

    public void setDocPhone(String docPhone) {
        DocPhone = docPhone;
    }

    public String getDocMail() {
        return DocMail;
    }

    public void setDocMail(String docMail) {
        DocMail = docMail;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseasePercent() {
        return diseasePercent;
    }

    public void setDiseasePercent(String diseasePercent) {
        this.diseasePercent = diseasePercent;
    }
}

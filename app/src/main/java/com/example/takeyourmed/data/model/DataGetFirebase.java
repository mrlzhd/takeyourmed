package com.example.takeyourmed.data.model;

public class DataGetFirebase {

    String DocName, DocPhone, DocMail;

    public DataGetFirebase() {
    }

    public DataGetFirebase(String docName, String docPhone, String docMail) {
        DocName = docName;
        DocPhone = docPhone;
        DocMail = docMail;
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
}

package com.epam.mailService.dao;

/**
 * Created by Herzen on 28.11.2016.
 */
public class Email {
    private String address;
    private String subj;
    private String body;

    public Email(){}

    public Email(String address,String subj, String body){
        this.address=address;
        this.subj=subj;
        this.body=body;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubj() {
        return subj;
    }

    public void setSubj(String subj) {
        this.subj = subj;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (address != null ? !address.equals(email.address) : email.address != null) return false;
        if (subj != null ? !subj.equals(email.subj) : email.subj != null) return false;
        return body != null ? body.equals(email.body) : email.body == null;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (subj != null ? subj.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }
}

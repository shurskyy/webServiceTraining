package com.epam.mailService.dao;

import java.util.ArrayList;

/**
 * Created by Herzen on 28.11.2016.
 */
public class SoapEmailDAO implements EmailDAO {

    ArrayList<Email> emails = new ArrayList<Email>();

    public Boolean sendMail(String address, String subj, String body) {
        emails.add(new Email(address,subj,body));
        return true;
    }

    public ArrayList<Email> getAllMails() {
        return emails;
    }

    public Email getMailByAddress(String address) {
        for (Email email : emails) {
            if (email.getAddress().equals(address)) {
                return email;
            }
        }
        return null;
    }

    public Email getMailBySubject(String subj) {
        System.out.println(emails.size());
        for (Email email : emails) {
            if (email.getAddress().equals(subj)) {
                return email;
            }
        }
        return null;
    }

    public Boolean deleteMailBySubject(String address) {
        for (Email email : emails) {
            if (email.getAddress().equals(address)) {
                return true;
            }
        }
        return false;
    }
}

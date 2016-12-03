package com.epam.mailService.dao;

import java.util.ArrayList;

/**
 * Created by Herzen on 28.11.2016.
 */
public interface EmailDAO {

    public Boolean sendMail(String address, String subj, String body);

    public ArrayList<Email> getAllMails();

    public Email getMailByAddress(String address);

    public Email getMailBySubject(String subj);

    public Boolean deleteMailBySubject(String address);
}

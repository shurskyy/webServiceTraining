package com.epam.mailService.Service;

import com.epam.mailService.dao.Email;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by Herzen on 28.11.2016.
 */

@WebService
public interface MailService {
    @WebMethod
    public Boolean sendMail(String mail, String subj, String body);
    @WebMethod
    public ArrayList<Email> getAllMails();
    @WebMethod
    public Email getMailByAddress(String address);
    @WebMethod
    public Email getMailBySubject(String subj);
    @WebMethod
    public Boolean deleteMailByAddress(String address);
}

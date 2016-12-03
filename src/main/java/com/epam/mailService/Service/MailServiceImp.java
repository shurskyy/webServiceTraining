package com.epam.mailService.Service;

import com.epam.mailService.dao.Email;
import com.epam.mailService.dao.SoapEmailDAO;

import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by Herzen on 28.11.2016.
 */
@WebService(endpointInterface = "com.epam.mailService.Service.MailService")

public class MailServiceImp implements MailService {

    SoapEmailDAO soapEmailDAO = new SoapEmailDAO();

    public Boolean sendMail(String mail, String subj, String body) {
        soapEmailDAO.sendMail(mail, subj, body);
        return true;
    }

    public ArrayList<Email> getAllMails() {
        return soapEmailDAO.getAllMails();
    }

    public Email getMailByAddress(String address) {
        return soapEmailDAO.getMailByAddress(address);
    }

    public Email getMailBySubject(String subj) { return soapEmailDAO.getMailBySubject(subj); }

    public Boolean deleteMailByAddress(String address) {
        return soapEmailDAO.deleteMailBySubject(address);
    }
}

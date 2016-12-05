package com.epam.mailService.Service;

import com.epam.mailService.dao.Email;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.ArrayList;

/**
 * Created by Herzen on 28.11.2016.
 */

@WebService
public interface MailService {
    @WebMethod
    public Boolean sendMail(@WebParam(name = "address") String mail, @WebParam (name = "subject") String subj, @WebParam(name = "body") String body);
    @WebMethod
    public ArrayList<Email> getAllMails();
    @WebMethod
    public Email getMailByAddress(@WebParam(name = "address") String address);
    @WebMethod
    @WebResult(partName="getSubjectResponse")
    public Email getMailBySubject(@WebParam(name = "subject") String subj);
    @WebMethod
    public Boolean deleteMailByAddress(@WebParam(name = "address") String address);
}

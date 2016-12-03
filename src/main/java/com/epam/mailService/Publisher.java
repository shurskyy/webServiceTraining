package com.epam.mailService;

import com.epam.mailService.Service.MailServiceImp;

import javax.xml.ws.Endpoint;

/**
 * Created by Herzen on 28.11.2016.
 */
public class Publisher {
    public static void main(String[] args){
        Endpoint.publish("http://localhost:9090/MailServiceImp", new MailServiceImp());
    }
}

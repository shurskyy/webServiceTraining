
package com.epam.mailService.Service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "sendMail", namespace = "http://Service.mailService.epam.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMail", namespace = "http://Service.mailService.epam.com/", propOrder = {
    "address",
    "subject",
    "body"
})
public class SendMail {

    @XmlElement(name = "address", namespace = "")
    private String address;
    @XmlElement(name = "subject", namespace = "")
    private String subject;
    @XmlElement(name = "body", namespace = "")
    private String body;

    /**
     * 
     * @return
     *     returns String
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 
     * @param address
     *     the value for the address property
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * 
     * @param subject
     *     the value for the subject property
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getBody() {
        return this.body;
    }

    /**
     * 
     * @param body
     *     the value for the body property
     */
    public void setBody(String body) {
        this.body = body;
    }

}

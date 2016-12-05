
package com.epam.mailService.Service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getMailBySubject", namespace = "http://Service.mailService.epam.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMailBySubject", namespace = "http://Service.mailService.epam.com/")
public class GetMailBySubject {

    @XmlElement(name = "subject", namespace = "")
    private String subject;

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

}

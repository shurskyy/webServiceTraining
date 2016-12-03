
package com.epam.mailService.Service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getMailBySubjectResponse", namespace = "http://Service.mailService.epam.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMailBySubjectResponse", namespace = "http://Service.mailService.epam.com/")
public class GetMailBySubjectResponse {

    @XmlElement(name = "return", namespace = "")
    private com.epam.mailService.dao.Email _return;

    /**
     * 
     * @return
     *     returns Email
     */
    public com.epam.mailService.dao.Email getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.epam.mailService.dao.Email _return) {
        this._return = _return;
    }

}


package com.epam.mailService.Service.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllMailsResponse", namespace = "http://Service.mailService.epam.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllMailsResponse", namespace = "http://Service.mailService.epam.com/")
public class GetAllMailsResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<com.epam.mailService.dao.Email> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Email>
     */
    public ArrayList<com.epam.mailService.dao.Email> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<com.epam.mailService.dao.Email> _return) {
        this._return = _return;
    }

}

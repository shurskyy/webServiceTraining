
package com.epam.mailService.Service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "deleteMailByAddress", namespace = "http://Service.mailService.epam.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMailByAddress", namespace = "http://Service.mailService.epam.com/")
public class DeleteMailByAddress {

    @XmlElement(name = "address", namespace = "")
    private String address;

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

}

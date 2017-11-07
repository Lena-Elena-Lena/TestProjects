
package com.sap.document.sap.soap.functions.mc_style;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IvCardNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IvTelNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ivCardNum",
    "ivTelNum"
})
@XmlRootElement(name = "ZfmShanAirpinSoapServHead")
public class ZfmShanAirpinSoapServHead {

    @XmlElement(name = "IvCardNum", required = true)
    protected String ivCardNum;
    @XmlElement(name = "IvTelNum", required = true)
    protected String ivTelNum;

    /**
     * Gets the value of the ivCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvCardNum() {
        return ivCardNum;
    }

    /**
     * Sets the value of the ivCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvCardNum(String value) {
        this.ivCardNum = value;
    }

    /**
     * Gets the value of the ivTelNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvTelNum() {
        return ivTelNum;
    }

    /**
     * Sets the value of the ivTelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvTelNum(String value) {
        this.ivTelNum = value;
    }

}

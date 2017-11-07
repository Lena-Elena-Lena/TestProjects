
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
 *         &lt;element name="EvGuidCadr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EvRezult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "evGuidCadr",
    "evRezult"
})
@XmlRootElement(name = "ZfmShanAirpinSoapServHeadResponse")
public class ZfmShanAirpinSoapServHeadResponse {

    @XmlElement(name = "EvGuidCadr", required = true)
    protected String evGuidCadr;
    @XmlElement(name = "EvRezult", required = true)
    protected String evRezult;

    /**
     * Gets the value of the evGuidCadr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvGuidCadr() {
        return evGuidCadr;
    }

    /**
     * Sets the value of the evGuidCadr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvGuidCadr(String value) {
        this.evGuidCadr = value;
    }

    /**
     * Gets the value of the evRezult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvRezult() {
        return evRezult;
    }

    /**
     * Sets the value of the evRezult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvRezult(String value) {
        this.evRezult = value;
    }

}

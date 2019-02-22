
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Encapsulates the generic errors thrown when there's an error with user
 *             request.
 *           
 * 
 * <p>Java class for RequestError complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}ApiError"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201809}RequestError.Reason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestError", propOrder = {
    "reason"
})
public class RequestError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected RequestErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link RequestErrorReason }
     *     
     */
    public RequestErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestErrorReason }
     *     
     */
    public void setReason(RequestErrorReason value) {
        this.reason = value;
    }

}

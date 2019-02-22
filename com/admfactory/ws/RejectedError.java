
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Indicates that a field was rejected due to compatibility issues.
 *           
 * 
 * <p>Java class for RejectedError complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RejectedError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}ApiError"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201809}RejectedError.Reason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedError", propOrder = {
    "reason"
})
public class RejectedError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected RejectedErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedErrorReason }
     *     
     */
    public RejectedErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedErrorReason }
     *     
     */
    public void setReason(RejectedErrorReason value) {
        this.reason = value;
    }

}

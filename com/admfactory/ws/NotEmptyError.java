
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors corresponding with violation of a NOT EMPTY check.
 *           
 * 
 * <p>Java class for NotEmptyError complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotEmptyError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}ApiError"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201809}NotEmptyError.Reason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotEmptyError", propOrder = {
    "reason"
})
public class NotEmptyError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected NotEmptyErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link NotEmptyErrorReason }
     *     
     */
    public NotEmptyErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotEmptyErrorReason }
     *     
     */
    public void setReason(NotEmptyErrorReason value) {
        this.reason = value;
    }

}

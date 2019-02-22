
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Base error class for {@link TrafficEstimatorService}.
 *           
 * 
 * <p>Java class for TrafficEstimatorError complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficEstimatorError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}ApiError"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/o/v201809}TrafficEstimatorError.Reason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficEstimatorError", namespace = "https://adwords.google.com/api/adwords/o/v201809", propOrder = {
    "reason"
})
public class TrafficEstimatorError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected TrafficEstimatorErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficEstimatorErrorReason }
     *     
     */
    public TrafficEstimatorErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficEstimatorErrorReason }
     *     
     */
    public void setReason(TrafficEstimatorErrorReason value) {
        this.reason = value;
    }

}

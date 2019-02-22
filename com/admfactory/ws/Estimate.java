
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Abstract class representing an reply to an {@link EstimateRequest}.
 *           
 * 
 * <p>Java class for Estimate complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Estimate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Estimate.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estimate", namespace = "https://adwords.google.com/api/adwords/o/v201809", propOrder = {
    "estimateType"
})
@XmlSeeAlso({
    AdGroupEstimate.class,
    CampaignEstimate.class,
    KeywordEstimate.class
})
public class Estimate {

    @XmlElement(name = "Estimate.Type")
    protected String estimateType;

    /**
     * Gets the value of the estimateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimateType() {
        return estimateType;
    }

    /**
     * Sets the value of the estimateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimateType(String value) {
        this.estimateType = value;
    }

}

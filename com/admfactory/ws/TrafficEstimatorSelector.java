
package com.admfactory.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains a list of campaigns to perform a traffic estimate on.
 *           
 * 
 * <p>Java class for TrafficEstimatorSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficEstimatorSelector"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campaignEstimateRequests" type="{https://adwords.google.com/api/adwords/o/v201809}CampaignEstimateRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="platformEstimateRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficEstimatorSelector", namespace = "https://adwords.google.com/api/adwords/o/v201809", propOrder = {
    "campaignEstimateRequests",
    "platformEstimateRequested"
})
public class TrafficEstimatorSelector {

    protected List<CampaignEstimateRequest> campaignEstimateRequests;
    protected Boolean platformEstimateRequested;

    /**
     * Gets the value of the campaignEstimateRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignEstimateRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignEstimateRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignEstimateRequest }
     * 
     * 
     */
    public List<CampaignEstimateRequest> getCampaignEstimateRequests() {
        if (campaignEstimateRequests == null) {
            campaignEstimateRequests = new ArrayList<CampaignEstimateRequest>();
        }
        return this.campaignEstimateRequests;
    }

    /**
     * Gets the value of the platformEstimateRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlatformEstimateRequested() {
        return platformEstimateRequested;
    }

    /**
     * Sets the value of the platformEstimateRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlatformEstimateRequested(Boolean value) {
        this.platformEstimateRequested = value;
    }

}

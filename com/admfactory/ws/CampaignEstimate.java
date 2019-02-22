
package com.admfactory.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the estimate results for a single campaign.
 *           
 * 
 * <p>Java class for CampaignEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignEstimate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201809}Estimate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="adGroupEstimates" type="{https://adwords.google.com/api/adwords/o/v201809}AdGroupEstimate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="platformEstimates" type="{https://adwords.google.com/api/adwords/o/v201809}PlatformCampaignEstimate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignEstimate", namespace = "https://adwords.google.com/api/adwords/o/v201809", propOrder = {
    "campaignId",
    "adGroupEstimates",
    "platformEstimates"
})
public class CampaignEstimate
    extends Estimate
{

    protected Long campaignId;
    protected List<AdGroupEstimate> adGroupEstimates;
    protected List<PlatformCampaignEstimate> platformEstimates;

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the adGroupEstimates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adGroupEstimates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupEstimates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupEstimate }
     * 
     * 
     */
    public List<AdGroupEstimate> getAdGroupEstimates() {
        if (adGroupEstimates == null) {
            adGroupEstimates = new ArrayList<AdGroupEstimate>();
        }
        return this.adGroupEstimates;
    }

    /**
     * Gets the value of the platformEstimates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the platformEstimates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlatformEstimates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlatformCampaignEstimate }
     * 
     * 
     */
    public List<PlatformCampaignEstimate> getPlatformEstimates() {
        if (platformEstimates == null) {
            platformEstimates = new ArrayList<PlatformCampaignEstimate>();
        }
        return this.platformEstimates;
    }

}

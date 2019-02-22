
package com.admfactory.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the estimate results for a single ad group.
 *           
 * 
 * <p>Java class for AdGroupEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupEstimate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201809}Estimate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="keywordEstimates" type="{https://adwords.google.com/api/adwords/o/v201809}KeywordEstimate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupEstimate", namespace = "https://adwords.google.com/api/adwords/o/v201809", propOrder = {
    "adGroupId",
    "keywordEstimates"
})
public class AdGroupEstimate
    extends Estimate
{

    protected Long adGroupId;
    protected List<KeywordEstimate> keywordEstimates;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the keywordEstimates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordEstimates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordEstimates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordEstimate }
     * 
     * 
     */
    public List<KeywordEstimate> getKeywordEstimates() {
        if (keywordEstimates == null) {
            keywordEstimates = new ArrayList<KeywordEstimate>();
        }
        return this.keywordEstimates;
    }

}

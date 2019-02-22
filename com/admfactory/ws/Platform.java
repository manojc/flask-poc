
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents Platform criterion.
 *             <p>A criterion of this type can only be created using an ID.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for Platform complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Platform"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}Criterion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="platformName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Platform", propOrder = {
    "platformName"
})
public class Platform
    extends Criterion
{

    protected String platformName;

    /**
     * Gets the value of the platformName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * Sets the value of the platformName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformName(String value) {
        this.platformName = value;
    }

}

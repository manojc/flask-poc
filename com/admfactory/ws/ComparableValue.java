
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Comparable types for constructing ranges with.
 *           
 * 
 * <p>Java class for ComparableValue complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComparableValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComparableValue.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComparableValue", propOrder = {
    "comparableValueType"
})
@XmlSeeAlso({
    Money.class,
    NumberValue.class
})
public abstract class ComparableValue {

    @XmlElement(name = "ComparableValue.Type")
    protected String comparableValueType;

    /**
     * Gets the value of the comparableValueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparableValueType() {
        return comparableValueType;
    }

    /**
     * Sets the value of the comparableValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparableValueType(String value) {
        this.comparableValueType = value;
    }

}


package com.admfactory.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Exception class for holding a list of service errors.
 *           
 * 
 * <p>Java class for ApiException complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}ApplicationException"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errors" type="{https://adwords.google.com/api/adwords/cm/v201809}ApiError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiException", propOrder = {
    "errors"
})
public class ApiException
    extends ApplicationException
{

    protected List<ApiError> errors;

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiError }
     * 
     * 
     */
    public List<ApiError> getErrors() {
        if (errors == null) {
            errors = new ArrayList<ApiError>();
        }
        return this.errors;
    }

}

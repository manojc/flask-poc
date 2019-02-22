
package com.admfactory.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The API error base class that provides details about an error that occurred
 *             while processing a service request.
 *             
 *             <p>The OGNL field path is provided for parsers to identify the request data
 *             element that may have caused the error.</p>
 *           
 * 
 * <p>Java class for ApiError complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldPathElements" type="{https://adwords.google.com/api/adwords/cm/v201809}FieldPathElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApiError.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiError", propOrder = {
    "fieldPath",
    "fieldPathElements",
    "trigger",
    "errorString",
    "apiErrorType"
})
@XmlSeeAlso({
    AdxError.class,
    AuthenticationError.class,
    AuthorizationError.class,
    ClientTermsError.class,
    CollectionSizeError.class,
    DatabaseError.class,
    DateError.class,
    DistinctError.class,
    EntityAccessDenied.class,
    EntityNotFound.class,
    IdError.class,
    InternalApiError.class,
    NotEmptyError.class,
    NullError.class,
    OperationAccessDenied.class,
    OperatorError.class,
    QuotaCheckError.class,
    RangeError.class,
    RateExceededError.class,
    ReadOnlyError.class,
    RegionCodeError.class,
    RejectedError.class,
    RequestError.class,
    RequiredError.class,
    SizeLimitError.class,
    StringFormatError.class,
    StringLengthError.class,
    CurrencyCodeError.class,
    TrafficEstimatorError.class
})
public abstract class ApiError {

    protected String fieldPath;
    protected List<FieldPathElement> fieldPathElements;
    protected String trigger;
    protected String errorString;
    @XmlElement(name = "ApiError.Type")
    protected String apiErrorType;

    /**
     * Gets the value of the fieldPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldPath() {
        return fieldPath;
    }

    /**
     * Sets the value of the fieldPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldPath(String value) {
        this.fieldPath = value;
    }

    /**
     * Gets the value of the fieldPathElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldPathElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldPathElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldPathElement }
     * 
     * 
     */
    public List<FieldPathElement> getFieldPathElements() {
        if (fieldPathElements == null) {
            fieldPathElements = new ArrayList<FieldPathElement>();
        }
        return this.fieldPathElements;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the errorString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * Sets the value of the errorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorString(String value) {
        this.errorString = value;
    }

    /**
     * Gets the value of the apiErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiErrorType() {
        return apiErrorType;
    }

    /**
     * Sets the value of the apiErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiErrorType(String value) {
        this.apiErrorType = value;
    }

}

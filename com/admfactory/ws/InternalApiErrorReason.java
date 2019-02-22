
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalApiError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InternalApiError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNEXPECTED_INTERNAL_API_ERROR"/&gt;
 *     &lt;enumeration value="TRANSIENT_ERROR"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="DOWNTIME"/&gt;
 *     &lt;enumeration value="ERROR_GENERATING_RESPONSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InternalApiError.Reason")
@XmlEnum
public enum InternalApiErrorReason {


    /**
     * 
     *                 API encountered an unexpected internal error.
     *               
     * 
     */
    UNEXPECTED_INTERNAL_API_ERROR,

    /**
     * 
     *                 A temporary error occurred during the request. Please retry.
     *               
     * 
     */
    TRANSIENT_ERROR,

    /**
     * 
     *                 The cause of the error is not known or only defined in newer versions.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The API is currently unavailable for a planned downtime.
     *               
     * 
     */
    DOWNTIME,

    /**
     * 
     *                 Mutate succeeded but server was unable to build response. Client should not retry mutate.
     *               
     * 
     */
    ERROR_GENERATING_RESPONSE;

    public String value() {
        return name();
    }

    public static InternalApiErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

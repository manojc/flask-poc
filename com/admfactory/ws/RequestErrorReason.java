
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="INVALID_INPUT"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_VERSION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestError.Reason")
@XmlEnum
public enum RequestErrorReason {


    /**
     * 
     *                 Error reason is unknown.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Invalid input.
     *               
     * 
     */
    INVALID_INPUT,

    /**
     * 
     *                 The api version in the request has been discontinued. Please update
     *                 to the new AdWords API version.
     *               
     * 
     */
    UNSUPPORTED_VERSION;

    public String value() {
        return name();
    }

    public static RequestErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

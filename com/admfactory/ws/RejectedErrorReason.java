
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectedError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN_VALUE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectedError.Reason")
@XmlEnum
public enum RejectedErrorReason {


    /**
     * 
     *                 Unknown value encountered
     *               
     * 
     */
    UNKNOWN_VALUE;

    public String value() {
        return name();
    }

    public static RejectedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

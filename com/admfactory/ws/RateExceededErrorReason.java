
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateExceededError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateExceededError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RATE_EXCEEDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateExceededError.Reason")
@XmlEnum
public enum RateExceededErrorReason {


    /**
     * 
     *                 Rate exceeded.
     *               
     * 
     */
    RATE_EXCEEDED;

    public String value() {
        return name();
    }

    public static RateExceededErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

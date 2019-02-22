
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RangeError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TOO_LOW"/&gt;
 *     &lt;enumeration value="TOO_HIGH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RangeError.Reason")
@XmlEnum
public enum RangeErrorReason {

    TOO_LOW,
    TOO_HIGH;

    public String value() {
        return name();
    }

    public static RangeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

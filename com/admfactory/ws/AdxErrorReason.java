
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdxError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdxError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNSUPPORTED_FEATURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdxError.Reason")
@XmlEnum
public enum AdxErrorReason {


    /**
     * 
     *                 Attempt to use non-AdX feature by AdX customer.
     *               
     * 
     */
    UNSUPPORTED_FEATURE;

    public String value() {
        return name();
    }

    public static AdxErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

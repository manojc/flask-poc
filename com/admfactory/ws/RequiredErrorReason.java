
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequiredError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REQUIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequiredError.Reason")
@XmlEnum
public enum RequiredErrorReason {


    /**
     * 
     *                 Missing required field.
     *               
     * 
     */
    REQUIRED;

    public String value() {
        return name();
    }

    public static RequiredErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

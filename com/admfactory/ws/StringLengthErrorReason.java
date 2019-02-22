
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringLengthError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StringLengthError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TOO_SHORT"/&gt;
 *     &lt;enumeration value="TOO_LONG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StringLengthError.Reason")
@XmlEnum
public enum StringLengthErrorReason {

    TOO_SHORT,
    TOO_LONG;

    public String value() {
        return name();
    }

    public static StringLengthErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

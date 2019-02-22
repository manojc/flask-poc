
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringFormatError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StringFormatError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="ILLEGAL_CHARS"/&gt;
 *     &lt;enumeration value="INVALID_FORMAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StringFormatError.Reason")
@XmlEnum
public enum StringFormatErrorReason {

    UNKNOWN,

    /**
     * 
     *                 The input string value contains disallowed characters.
     *               
     * 
     */
    ILLEGAL_CHARS,

    /**
     * 
     *                 The input string value is invalid for the associated field.
     *               
     * 
     */
    INVALID_FORMAT;

    public String value() {
        return name();
    }

    public static StringFormatErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

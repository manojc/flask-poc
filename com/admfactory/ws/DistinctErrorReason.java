
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistinctError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistinctError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DUPLICATE_ELEMENT"/&gt;
 *     &lt;enumeration value="DUPLICATE_TYPE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistinctError.Reason")
@XmlEnum
public enum DistinctErrorReason {

    DUPLICATE_ELEMENT,
    DUPLICATE_TYPE;

    public String value() {
        return name();
    }

    public static DistinctErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

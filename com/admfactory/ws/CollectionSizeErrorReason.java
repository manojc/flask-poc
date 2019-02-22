
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionSizeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectionSizeError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TOO_FEW"/&gt;
 *     &lt;enumeration value="TOO_MANY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollectionSizeError.Reason")
@XmlEnum
public enum CollectionSizeErrorReason {

    TOO_FEW,
    TOO_MANY;

    public String value() {
        return name();
    }

    public static CollectionSizeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

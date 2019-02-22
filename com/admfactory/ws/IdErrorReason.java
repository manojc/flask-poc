
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_FOUND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdError.Reason")
@XmlEnum
public enum IdErrorReason {


    /**
     * 
     *                 Id not found
     *               
     * 
     */
    NOT_FOUND;

    public String value() {
        return name();
    }

    public static IdErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

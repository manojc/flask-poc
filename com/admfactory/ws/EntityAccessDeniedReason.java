
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityAccessDenied.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityAccessDenied.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="READ_ACCESS_DENIED"/&gt;
 *     &lt;enumeration value="WRITE_ACCESS_DENIED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityAccessDenied.Reason")
@XmlEnum
public enum EntityAccessDeniedReason {


    /**
     * 
     *                 User did not have read access.
     *               
     * 
     */
    READ_ACCESS_DENIED,

    /**
     * 
     *                 User did not have write access.
     *               
     * 
     */
    WRITE_ACCESS_DENIED;

    public String value() {
        return name();
    }

    public static EntityAccessDeniedReason fromValue(String v) {
        return valueOf(v);
    }

}

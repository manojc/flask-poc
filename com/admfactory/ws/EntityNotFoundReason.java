
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityNotFound.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNotFound.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID_ID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityNotFound.Reason")
@XmlEnum
public enum EntityNotFoundReason {


    /**
     * 
     *                 The specified id refered to an entity which either doesn't exist or is not accessible to the
     *                 customer. e.g. campaign belongs to another customer.
     *               
     * 
     */
    INVALID_ID;

    public String value() {
        return name();
    }

    public static EntityNotFoundReason fromValue(String v) {
        return valueOf(v);
    }

}

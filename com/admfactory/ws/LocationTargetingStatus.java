
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationTargetingStatus.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationTargetingStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="OBSOLETE"/&gt;
 *     &lt;enumeration value="PHASING_OUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationTargetingStatus")
@XmlEnum
public enum LocationTargetingStatus {


    /**
     * 
     *                 The location is active.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 The location is not available for targeting.
     *               
     * 
     */
    OBSOLETE,

    /**
     * 
     *                 The location is phasing out, it will marked obsolete soon.
     *               
     * 
     */
    PHASING_OUT;

    public String value() {
        return name();
    }

    public static LocationTargetingStatus fromValue(String v) {
        return valueOf(v);
    }

}

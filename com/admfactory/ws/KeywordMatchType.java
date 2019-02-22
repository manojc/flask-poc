
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordMatchType.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeywordMatchType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXACT"/&gt;
 *     &lt;enumeration value="PHRASE"/&gt;
 *     &lt;enumeration value="BROAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeywordMatchType")
@XmlEnum
public enum KeywordMatchType {


    /**
     * 
     *                 Exact match
     *               
     * 
     */
    EXACT,

    /**
     * 
     *                 Phrase match
     *               
     * 
     */
    PHRASE,

    /**
     * 
     *                 Broad match
     *               
     * 
     */
    BROAD;

    public String value() {
        return name();
    }

    public static KeywordMatchType fromValue(String v) {
        return valueOf(v);
    }

}

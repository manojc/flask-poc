
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCodeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCodeError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNSUPPORTED_CURRENCY_CODE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCodeError.Reason", namespace = "https://adwords.google.com/api/adwords/o/v201809")
@XmlEnum
public enum CurrencyCodeErrorReason {

    UNSUPPORTED_CURRENCY_CODE;

    public String value() {
        return name();
    }

    public static CurrencyCodeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

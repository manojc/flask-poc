
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaCheckError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotaCheckError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID_TOKEN_HEADER"/&gt;
 *     &lt;enumeration value="ACCOUNT_DELINQUENT"/&gt;
 *     &lt;enumeration value="ACCOUNT_INACCESSIBLE"/&gt;
 *     &lt;enumeration value="ACCOUNT_INACTIVE"/&gt;
 *     &lt;enumeration value="INCOMPLETE_SIGNUP"/&gt;
 *     &lt;enumeration value="DEVELOPER_TOKEN_NOT_APPROVED"/&gt;
 *     &lt;enumeration value="TERMS_AND_CONDITIONS_NOT_SIGNED"/&gt;
 *     &lt;enumeration value="MONTHLY_BUDGET_REACHED"/&gt;
 *     &lt;enumeration value="QUOTA_EXCEEDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuotaCheckError.Reason")
@XmlEnum
public enum QuotaCheckErrorReason {


    /**
     * 
     *                 Customer passed in an invalid token in the header.
     *               
     * 
     */
    INVALID_TOKEN_HEADER,

    /**
     * 
     *                 Customer is marked delinquent.
     *               
     * 
     */
    ACCOUNT_DELINQUENT,

    /**
     * 
     *                 Customer is a fraudulent.
     *               
     * 
     */
    ACCOUNT_INACCESSIBLE,

    /**
     * 
     *                 Inactive Account.
     *               
     * 
     */
    ACCOUNT_INACTIVE,

    /**
     * 
     *                 Signup not complete
     *               
     * 
     */
    INCOMPLETE_SIGNUP,

    /**
     * 
     *                 Developer token is not approved for production access, and the customer
     *                 is attempting to access a production account.
     *               
     * 
     */
    DEVELOPER_TOKEN_NOT_APPROVED,

    /**
     * 
     *                 Terms and conditions are not signed.
     *               
     * 
     */
    TERMS_AND_CONDITIONS_NOT_SIGNED,

    /**
     * 
     *                 Monthly budget quota reached.
     *               
     * 
     */
    MONTHLY_BUDGET_REACHED,

    /**
     * 
     *                 Monthly budget quota exceeded.
     *               
     * 
     */
    QUOTA_EXCEEDED;

    public String value() {
        return name();
    }

    public static QuotaCheckErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

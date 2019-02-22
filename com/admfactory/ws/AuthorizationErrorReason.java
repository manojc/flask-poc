
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorizationError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNABLE_TO_AUTHORIZE"/&gt;
 *     &lt;enumeration value="NO_ADWORDS_ACCOUNT_FOR_CUSTOMER"/&gt;
 *     &lt;enumeration value="USER_PERMISSION_DENIED"/&gt;
 *     &lt;enumeration value="EFFECTIVE_USER_PERMISSION_DENIED"/&gt;
 *     &lt;enumeration value="CUSTOMER_NOT_ACTIVE"/&gt;
 *     &lt;enumeration value="USER_HAS_READONLY_PERMISSION"/&gt;
 *     &lt;enumeration value="NO_CUSTOMER_FOUND"/&gt;
 *     &lt;enumeration value="SERVICE_ACCESS_DENIED"/&gt;
 *     &lt;enumeration value="TWO_STEP_VERIFICATION_NOT_ENROLLED"/&gt;
 *     &lt;enumeration value="ADVANCED_PROTECTION_NOT_ENROLLED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthorizationError.Reason")
@XmlEnum
public enum AuthorizationErrorReason {


    /**
     * 
     *                 Could not complete authorization due to an internal problem.
     *               
     * 
     */
    UNABLE_TO_AUTHORIZE,

    /**
     * 
     *                 Customer has no AdWords account.
     *               
     * 
     */
    NO_ADWORDS_ACCOUNT_FOR_CUSTOMER,

    /**
     * 
     *                 User doesn't have permission to access customer.
     *               
     * 
     */
    USER_PERMISSION_DENIED,

    /**
     * 
     *                 Effective user doesn't have permission to access this customer.
     *               
     * 
     */
    EFFECTIVE_USER_PERMISSION_DENIED,

    /**
     * 
     *                 Access denied since the customer is not active.
     *               
     * 
     */
    CUSTOMER_NOT_ACTIVE,

    /**
     * 
     *                 User has read-only permission cannot mutate.
     *               
     * 
     */
    USER_HAS_READONLY_PERMISSION,

    /**
     * 
     *                 No customer found.
     *               
     * 
     */
    NO_CUSTOMER_FOUND,

    /**
     * 
     *                 Developer doesn't have permission to access service.
     *               
     * 
     */
    SERVICE_ACCESS_DENIED,

    /**
     * 
     *                 The customer has a policy to enforce 2-Step Verification, but the user is not enrolled.
     *               
     * 
     */
    TWO_STEP_VERIFICATION_NOT_ENROLLED,

    /**
     * 
     *                 The customer has a policy to enforce enrollment in the Advanced Protection Program, but
     *                 the user is not enrolled.
     *               
     * 
     */
    ADVANCED_PROTECTION_NOT_ENROLLED;

    public String value() {
        return name();
    }

    public static AuthorizationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

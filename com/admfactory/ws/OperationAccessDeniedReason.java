
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationAccessDenied.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationAccessDenied.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTION_NOT_PERMITTED"/&gt;
 *     &lt;enumeration value="ADD_OPERATION_NOT_PERMITTED"/&gt;
 *     &lt;enumeration value="REMOVE_OPERATION_NOT_PERMITTED"/&gt;
 *     &lt;enumeration value="SET_OPERATION_NOT_PERMITTED"/&gt;
 *     &lt;enumeration value="MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT"/&gt;
 *     &lt;enumeration value="OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE"/&gt;
 *     &lt;enumeration value="ADD_AS_REMOVED_NOT_PERMITTED"/&gt;
 *     &lt;enumeration value="OPERATION_NOT_PERMITTED_FOR_REMOVED_ENTITY"/&gt;
 *     &lt;enumeration value="OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationAccessDenied.Reason")
@XmlEnum
public enum OperationAccessDeniedReason {


    /**
     * 
     *                 Unauthorized invocation of a service's method (get, mutate, etc.)
     *               
     * 
     */
    ACTION_NOT_PERMITTED,

    /**
     * 
     *                 Unauthorized ADD operation in invoking a service's mutate method.
     *               
     * 
     */
    ADD_OPERATION_NOT_PERMITTED,

    /**
     * 
     *                 Unauthorized REMOVE operation in invoking a service's mutate method.
     *               
     * 
     */
    REMOVE_OPERATION_NOT_PERMITTED,

    /**
     * 
     *                 Unauthorized SET operation in invoking a service's mutate method.
     *               
     * 
     */
    SET_OPERATION_NOT_PERMITTED,

    /**
     * 
     *                 A mutate action is not allowed on this campaign, from this client.
     *               
     * 
     */
    MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT,

    /**
     * 
     *                 This operation is not permitted on this campaign type
     *               
     * 
     */
    OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE,

    /**
     * 
     *                 An ADD operation may not set status to REMOVED.
     *               
     * 
     */
    ADD_AS_REMOVED_NOT_PERMITTED,

    /**
     * 
     *                 This operation is not allowed because the campaign or adgroup is removed.
     *               
     * 
     */
    OPERATION_NOT_PERMITTED_FOR_REMOVED_ENTITY,

    /**
     * 
     *                 This operation is not permitted on this ad group type.
     *               
     * 
     */
    OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE,

    /**
     * 
     *                 The reason the invoked method or operation is prohibited is not known
     *                 (the client may be of an older version than the server).
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static OperationAccessDeniedReason fromValue(String v) {
        return valueOf(v);
    }

}

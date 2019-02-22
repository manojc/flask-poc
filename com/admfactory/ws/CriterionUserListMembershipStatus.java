
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriterionUserList.MembershipStatus.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriterionUserList.MembershipStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="CLOSED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CriterionUserList.MembershipStatus")
@XmlEnum
public enum CriterionUserListMembershipStatus {


    /**
     * 
     *                 Open status - list is accruing members and can be targeted to.
     *               
     * 
     */
    OPEN,

    /**
     * 
     *                 Closed status - No new members being added. Can not be used for targeting a new campaign.
     *                 Existing campaigns can still work as long as the list is not removed as a targeting criteria.
     *               
     * 
     */
    CLOSED;

    public String value() {
        return name();
    }

    public static CriterionUserListMembershipStatus fromValue(String v) {
        return valueOf(v);
    }

}

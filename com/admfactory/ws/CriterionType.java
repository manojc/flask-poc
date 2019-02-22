
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Criterion.Type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Criterion.Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTENT_LABEL"/&gt;
 *     &lt;enumeration value="KEYWORD"/&gt;
 *     &lt;enumeration value="PLACEMENT"/&gt;
 *     &lt;enumeration value="VERTICAL"/&gt;
 *     &lt;enumeration value="USER_LIST"/&gt;
 *     &lt;enumeration value="USER_INTEREST"/&gt;
 *     &lt;enumeration value="MOBILE_APPLICATION"/&gt;
 *     &lt;enumeration value="MOBILE_APP_CATEGORY"/&gt;
 *     &lt;enumeration value="PRODUCT_PARTITION"/&gt;
 *     &lt;enumeration value="IP_BLOCK"/&gt;
 *     &lt;enumeration value="WEBPAGE"/&gt;
 *     &lt;enumeration value="LANGUAGE"/&gt;
 *     &lt;enumeration value="LOCATION"/&gt;
 *     &lt;enumeration value="AGE_RANGE"/&gt;
 *     &lt;enumeration value="CARRIER"/&gt;
 *     &lt;enumeration value="OPERATING_SYSTEM_VERSION"/&gt;
 *     &lt;enumeration value="MOBILE_DEVICE"/&gt;
 *     &lt;enumeration value="GENDER"/&gt;
 *     &lt;enumeration value="PARENT"/&gt;
 *     &lt;enumeration value="PROXIMITY"/&gt;
 *     &lt;enumeration value="PLATFORM"/&gt;
 *     &lt;enumeration value="PREFERRED_CONTENT"/&gt;
 *     &lt;enumeration value="AD_SCHEDULE"/&gt;
 *     &lt;enumeration value="LOCATION_GROUPS"/&gt;
 *     &lt;enumeration value="PRODUCT_SCOPE"/&gt;
 *     &lt;enumeration value="CUSTOM_AFFINITY"/&gt;
 *     &lt;enumeration value="CUSTOM_INTENT"/&gt;
 *     &lt;enumeration value="YOUTUBE_VIDEO"/&gt;
 *     &lt;enumeration value="YOUTUBE_CHANNEL"/&gt;
 *     &lt;enumeration value="APP_PAYMENT_MODEL"/&gt;
 *     &lt;enumeration value="INCOME_RANGE"/&gt;
 *     &lt;enumeration value="INTERACTION_TYPE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Criterion.Type")
@XmlEnum
public enum CriterionType {


    /**
     * 
     *                 Content label for exclusion.
     *               
     * 
     */
    CONTENT_LABEL,

    /**
     * 
     *                 Keyword. e.g. 'mars cruise'
     *               
     * 
     */
    KEYWORD,

    /**
     * 
     *                 Placement. aka Website. e.g. 'www.flowers4sale.com'
     *               
     * 
     */
    PLACEMENT,

    /**
     * 
     *                 Vertical, e.g. 'category::Animals>Pets'  This is for vertical targeting on the content
     *                 network.
     *               
     * 
     */
    VERTICAL,

    /**
     * 
     *                 User lists, are links to sets of users defined by the advertiser.
     *               
     * 
     */
    USER_LIST,

    /**
     * 
     *                 User interests, categories of interests the user is interested in.
     *               
     * 
     */
    USER_INTEREST,

    /**
     * 
     *                 Mobile applications to target.
     *               
     * 
     */
    MOBILE_APPLICATION,

    /**
     * 
     *                 Mobile application categories to target.
     *               
     * 
     */
    MOBILE_APP_CATEGORY,

    /**
     * 
     *                 Product partition (product group) in a shopping campaign.
     *               
     * 
     */
    PRODUCT_PARTITION,

    /**
     * 
     *                 IP addresses to exclude.
     *               
     * 
     */
    IP_BLOCK,

    /**
     * 
     *                 Webpages of an advertiser's website to target.
     *               
     * 
     */
    WEBPAGE,

    /**
     * 
     *                 Languages to target.
     *               
     * 
     */
    LANGUAGE,

    /**
     * 
     *                 Geographic regions to target.
     *               
     * 
     */
    LOCATION,

    /**
     * 
     *                 Age Range to exclude.
     *               
     * 
     */
    AGE_RANGE,

    /**
     * 
     *                 Mobile carriers to target.
     *               
     * 
     */
    CARRIER,

    /**
     * 
     *                 Mobile operating system versions to target.
     *               
     * 
     */
    OPERATING_SYSTEM_VERSION,

    /**
     * 
     *                 Mobile devices to target.
     *               
     * 
     */
    MOBILE_DEVICE,

    /**
     * 
     *                 Gender to exclude.
     *               
     * 
     */
    GENDER,

    /**
     * 
     *                 Parent to target and exclude.
     *               
     * 
     */
    PARENT,

    /**
     * 
     *                 Proximity (area within a radius) to target.
     *               
     * 
     */
    PROXIMITY,

    /**
     * 
     *                 Platforms to target.
     *               
     * 
     */
    PLATFORM,

    /**
     * 
     *                 Representing preferred content bid modifier.
     *               
     * 
     */
    PREFERRED_CONTENT,

    /**
     * 
     *                 AdSchedule or specific days and time intervals to target.
     *               
     * 
     */
    AD_SCHEDULE,

    /**
     * 
     *                 Targeting based on location groups.
     *               
     * 
     */
    LOCATION_GROUPS,

    /**
     * 
     *                 Scope of products. Contains a list of product dimensions, all of which a product has to match
     *                 to be included in the campaign.
     *               
     * 
     */
    PRODUCT_SCOPE,

    /**
     * 
     *                 Custom Affinity, a criterion used for custom audience targeting.
     *               
     * 
     */
    CUSTOM_AFFINITY,

    /**
     * 
     *                 Custom Intent, a criterion used for custom audience targeting.
     *               
     * 
     */
    CUSTOM_INTENT,

    /**
     * 
     *                 YouTube video to target.
     *               
     * 
     */
    YOUTUBE_VIDEO,

    /**
     * 
     *                 YouTube channel to target.
     *               
     * 
     */
    YOUTUBE_CHANNEL,

    /**
     * 
     *                 Enables advertisers to target paid apps.
     *               
     * 
     */
    APP_PAYMENT_MODEL,

    /**
     * 
     *                 Income range to target and exclude.
     *               
     * 
     */
    INCOME_RANGE,

    /**
     * 
     *                 Interaction type to bid modify.
     *               
     * 
     */
    INTERACTION_TYPE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CriterionType fromValue(String v) {
        return valueOf(v);
    }

}

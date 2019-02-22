
package com.admfactory.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficEstimatorError.Reason.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficEstimatorError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_CAMPAIGN_FOR_AD_GROUP_ESTIMATE_REQUEST"/&gt;
 *     &lt;enumeration value="NO_AD_GROUP_FOR_KEYWORD_ESTIMATE_REQUEST"/&gt;
 *     &lt;enumeration value="NO_MAX_CPC_FOR_KEYWORD_ESTIMATE_REQUEST"/&gt;
 *     &lt;enumeration value="TOO_MANY_KEYWORD_ESTIMATE_REQUESTS"/&gt;
 *     &lt;enumeration value="TOO_MANY_CAMPAIGN_ESTIMATE_REQUESTS"/&gt;
 *     &lt;enumeration value="TOO_MANY_ADGROUP_ESTIMATE_REQUESTS"/&gt;
 *     &lt;enumeration value="TOO_MANY_TARGETS"/&gt;
 *     &lt;enumeration value="KEYWORD_TOO_LONG"/&gt;
 *     &lt;enumeration value="KEYWORD_CONTAINS_BROAD_MATCH_MODIFIERS"/&gt;
 *     &lt;enumeration value="INVALID_INPUT"/&gt;
 *     &lt;enumeration value="SERVICE_UNAVAILABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficEstimatorError.Reason", namespace = "https://adwords.google.com/api/adwords/o/v201809")
@XmlEnum
public enum TrafficEstimatorErrorReason {


    /**
     * 
     *                 When the request with {@code null} campaign ID in {@link CampaignEstimateRequest} contains an
     *                 {@link AdGroupEstimateRequest} with an ID.
     *               
     * 
     */
    NO_CAMPAIGN_FOR_AD_GROUP_ESTIMATE_REQUEST,

    /**
     * 
     *                 When the request with {@code null} adgroup ID in {@link AdGroupEstimateRequest} contains a
     *                 {@link KeywordEstimateRequest} with an ID.
     *               
     * 
     */
    NO_AD_GROUP_FOR_KEYWORD_ESTIMATE_REQUEST,

    /**
     * 
     *                 All {@link KeywordEstimateRequest} items should have maxCpc associated with them.
     *               
     * 
     */
    NO_MAX_CPC_FOR_KEYWORD_ESTIMATE_REQUEST,

    /**
     * 
     *                 When there are more {@link KeywordEstimateRequest}s in the request than
     *                 TrafficEstimatorService allows.
     *               
     * 
     */
    TOO_MANY_KEYWORD_ESTIMATE_REQUESTS,

    /**
     * 
     *                 When there are more {@link CampaignEstimateRequest}s in the request than
     *                 TrafficEstimatorService allows.
     *               
     * 
     */
    TOO_MANY_CAMPAIGN_ESTIMATE_REQUESTS,

    /**
     * 
     *                 When there are more {@link AdGroupEstimateRequest}s in the request than
     *                 TrafficEstimatorService allows.
     *               
     * 
     */
    TOO_MANY_ADGROUP_ESTIMATE_REQUESTS,

    /**
     * 
     *                 When there are more targets in the request than TrafficEstimatorService allows. See
     *                 documentation on {@link CampaignEstimateRequest} for more information about this error.
     *               
     * 
     */
    TOO_MANY_TARGETS,

    /**
     * 
     *                 Request contains a keyword that is too long for backends to handle.
     *               
     * 
     */
    KEYWORD_TOO_LONG,

    /**
     * 
     *                 Request contains a keyword that contains broad match modifiers.
     *               
     * 
     */
    KEYWORD_CONTAINS_BROAD_MATCH_MODIFIERS,

    /**
     * 
     *                 When an unexpected error occurs.
     *               
     * 
     */
    INVALID_INPUT,

    /**
     * 
     *                 When backend service calls fail.
     *               
     * 
     */
    SERVICE_UNAVAILABLE;

    public String value() {
        return name();
    }

    public static TrafficEstimatorErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

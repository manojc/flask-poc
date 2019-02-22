
package com.admfactory.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.admfactory.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/o/v201809", "ApiExceptionFault");
    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/o/v201809", "RequestHeader");
    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/o/v201809", "ResponseHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.admfactory.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdxError }
     * 
     */
    public AdxError createAdxError() {
        return new AdxError();
    }

    /**
     * Create an instance of {@link ApiException }
     * 
     */
    public ApiException createApiException() {
        return new ApiException();
    }

    /**
     * Create an instance of {@link ApplicationException }
     * 
     */
    public ApplicationException createApplicationException() {
        return new ApplicationException();
    }

    /**
     * Create an instance of {@link AuthenticationError }
     * 
     */
    public AuthenticationError createAuthenticationError() {
        return new AuthenticationError();
    }

    /**
     * Create an instance of {@link AuthorizationError }
     * 
     */
    public AuthorizationError createAuthorizationError() {
        return new AuthorizationError();
    }

    /**
     * Create an instance of {@link ClientTermsError }
     * 
     */
    public ClientTermsError createClientTermsError() {
        return new ClientTermsError();
    }

    /**
     * Create an instance of {@link CollectionSizeError }
     * 
     */
    public CollectionSizeError createCollectionSizeError() {
        return new CollectionSizeError();
    }

    /**
     * Create an instance of {@link Criterion }
     * 
     */
    public Criterion createCriterion() {
        return new Criterion();
    }

    /**
     * Create an instance of {@link DatabaseError }
     * 
     */
    public DatabaseError createDatabaseError() {
        return new DatabaseError();
    }

    /**
     * Create an instance of {@link DateError }
     * 
     */
    public DateError createDateError() {
        return new DateError();
    }

    /**
     * Create an instance of {@link DistinctError }
     * 
     */
    public DistinctError createDistinctError() {
        return new DistinctError();
    }

    /**
     * Create an instance of {@link DoubleValue }
     * 
     */
    public DoubleValue createDoubleValue() {
        return new DoubleValue();
    }

    /**
     * Create an instance of {@link EntityAccessDenied }
     * 
     */
    public EntityAccessDenied createEntityAccessDenied() {
        return new EntityAccessDenied();
    }

    /**
     * Create an instance of {@link EntityNotFound }
     * 
     */
    public EntityNotFound createEntityNotFound() {
        return new EntityNotFound();
    }

    /**
     * Create an instance of {@link FieldPathElement }
     * 
     */
    public FieldPathElement createFieldPathElement() {
        return new FieldPathElement();
    }

    /**
     * Create an instance of {@link IdError }
     * 
     */
    public IdError createIdError() {
        return new IdError();
    }

    /**
     * Create an instance of {@link InternalApiError }
     * 
     */
    public InternalApiError createInternalApiError() {
        return new InternalApiError();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link LongValue }
     * 
     */
    public LongValue createLongValue() {
        return new LongValue();
    }

    /**
     * Create an instance of {@link MobileAppCategory }
     * 
     */
    public MobileAppCategory createMobileAppCategory() {
        return new MobileAppCategory();
    }

    /**
     * Create an instance of {@link MobileApplication }
     * 
     */
    public MobileApplication createMobileApplication() {
        return new MobileApplication();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link NetworkSetting }
     * 
     */
    public NetworkSetting createNetworkSetting() {
        return new NetworkSetting();
    }

    /**
     * Create an instance of {@link NotEmptyError }
     * 
     */
    public NotEmptyError createNotEmptyError() {
        return new NotEmptyError();
    }

    /**
     * Create an instance of {@link NullError }
     * 
     */
    public NullError createNullError() {
        return new NullError();
    }

    /**
     * Create an instance of {@link OperationAccessDenied }
     * 
     */
    public OperationAccessDenied createOperationAccessDenied() {
        return new OperationAccessDenied();
    }

    /**
     * Create an instance of {@link OperatorError }
     * 
     */
    public OperatorError createOperatorError() {
        return new OperatorError();
    }

    /**
     * Create an instance of {@link Placement }
     * 
     */
    public Placement createPlacement() {
        return new Placement();
    }

    /**
     * Create an instance of {@link Platform }
     * 
     */
    public Platform createPlatform() {
        return new Platform();
    }

    /**
     * Create an instance of {@link QuotaCheckError }
     * 
     */
    public QuotaCheckError createQuotaCheckError() {
        return new QuotaCheckError();
    }

    /**
     * Create an instance of {@link RangeError }
     * 
     */
    public RangeError createRangeError() {
        return new RangeError();
    }

    /**
     * Create an instance of {@link RateExceededError }
     * 
     */
    public RateExceededError createRateExceededError() {
        return new RateExceededError();
    }

    /**
     * Create an instance of {@link ReadOnlyError }
     * 
     */
    public ReadOnlyError createReadOnlyError() {
        return new ReadOnlyError();
    }

    /**
     * Create an instance of {@link RegionCodeError }
     * 
     */
    public RegionCodeError createRegionCodeError() {
        return new RegionCodeError();
    }

    /**
     * Create an instance of {@link RejectedError }
     * 
     */
    public RejectedError createRejectedError() {
        return new RejectedError();
    }

    /**
     * Create an instance of {@link RequestError }
     * 
     */
    public RequestError createRequestError() {
        return new RequestError();
    }

    /**
     * Create an instance of {@link RequiredError }
     * 
     */
    public RequiredError createRequiredError() {
        return new RequiredError();
    }

    /**
     * Create an instance of {@link SizeLimitError }
     * 
     */
    public SizeLimitError createSizeLimitError() {
        return new SizeLimitError();
    }

    /**
     * Create an instance of {@link SoapHeader }
     * 
     */
    public SoapHeader createSoapHeader() {
        return new SoapHeader();
    }

    /**
     * Create an instance of {@link SoapResponseHeader }
     * 
     */
    public SoapResponseHeader createSoapResponseHeader() {
        return new SoapResponseHeader();
    }

    /**
     * Create an instance of {@link StringFormatError }
     * 
     */
    public StringFormatError createStringFormatError() {
        return new StringFormatError();
    }

    /**
     * Create an instance of {@link StringLengthError }
     * 
     */
    public StringLengthError createStringLengthError() {
        return new StringLengthError();
    }

    /**
     * Create an instance of {@link CriterionUserInterest }
     * 
     */
    public CriterionUserInterest createCriterionUserInterest() {
        return new CriterionUserInterest();
    }

    /**
     * Create an instance of {@link CriterionUserList }
     * 
     */
    public CriterionUserList createCriterionUserList() {
        return new CriterionUserList();
    }

    /**
     * Create an instance of {@link Vertical }
     * 
     */
    public Vertical createVertical() {
        return new Vertical();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link TrafficEstimatorSelector }
     * 
     */
    public TrafficEstimatorSelector createTrafficEstimatorSelector() {
        return new TrafficEstimatorSelector();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link TrafficEstimatorResult }
     * 
     */
    public TrafficEstimatorResult createTrafficEstimatorResult() {
        return new TrafficEstimatorResult();
    }

    /**
     * Create an instance of {@link AdGroupEstimate }
     * 
     */
    public AdGroupEstimate createAdGroupEstimate() {
        return new AdGroupEstimate();
    }

    /**
     * Create an instance of {@link AdGroupEstimateRequest }
     * 
     */
    public AdGroupEstimateRequest createAdGroupEstimateRequest() {
        return new AdGroupEstimateRequest();
    }

    /**
     * Create an instance of {@link CampaignEstimate }
     * 
     */
    public CampaignEstimate createCampaignEstimate() {
        return new CampaignEstimate();
    }

    /**
     * Create an instance of {@link CampaignEstimateRequest }
     * 
     */
    public CampaignEstimateRequest createCampaignEstimateRequest() {
        return new CampaignEstimateRequest();
    }

    /**
     * Create an instance of {@link CurrencyCodeError }
     * 
     */
    public CurrencyCodeError createCurrencyCodeError() {
        return new CurrencyCodeError();
    }

    /**
     * Create an instance of {@link Estimate }
     * 
     */
    public Estimate createEstimate() {
        return new Estimate();
    }

    /**
     * Create an instance of {@link KeywordEstimate }
     * 
     */
    public KeywordEstimate createKeywordEstimate() {
        return new KeywordEstimate();
    }

    /**
     * Create an instance of {@link KeywordEstimateRequest }
     * 
     */
    public KeywordEstimateRequest createKeywordEstimateRequest() {
        return new KeywordEstimateRequest();
    }

    /**
     * Create an instance of {@link PlatformCampaignEstimate }
     * 
     */
    public PlatformCampaignEstimate createPlatformCampaignEstimate() {
        return new PlatformCampaignEstimate();
    }

    /**
     * Create an instance of {@link StatsEstimate }
     * 
     */
    public StatsEstimate createStatsEstimate() {
        return new StatsEstimate();
    }

    /**
     * Create an instance of {@link TrafficEstimatorError }
     * 
     */
    public TrafficEstimatorError createTrafficEstimatorError() {
        return new TrafficEstimatorError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/o/v201809", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/o/v201809", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/o/v201809", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

}

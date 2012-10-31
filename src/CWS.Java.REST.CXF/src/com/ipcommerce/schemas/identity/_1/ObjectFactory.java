
package com.ipcommerce.schemas.identity._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipcommerce.schemas.identity._1 package. 
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

    private final static QName _LockedByAdminFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "LockedByAdminFault");
    private final static QName _ArrayOfClaimMetaData_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "ArrayOfClaimMetaData");
    private final static QName _ClaimMappingsNotFoundFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMappingsNotFoundFault");
    private final static QName _BaseFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "BaseFault");
    private final static QName _STSUnavailableFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault");
    private final static QName _SendEmailFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "SendEmailFault");
    private final static QName _PasswordInvalidFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "PasswordInvalidFault");
    private final static QName _OneTimePasswordFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "OneTimePasswordFault");
    private final static QName _UserNotFoundFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "UserNotFoundFault");
    private final static QName _RelyingPartyNotAssociatedToSecurityDomainFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "RelyingPartyNotAssociatedToSecurityDomainFault");
    private final static QName _AuthorizationFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault");
    private final static QName _ExpiredTokenFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault");
    private final static QName _BadAttemptThresholdExceededFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "BadAttemptThresholdExceededFault");
    private final static QName _GeneratePasswordFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "GeneratePasswordFault");
    private final static QName _AuthenticationFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault");
    private final static QName _ClaimMetaData_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMetaData");
    private final static QName _InvalidEmailFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidEmailFault");
    private final static QName _SystemFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault");
    private final static QName _InvalidTokenFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault");
    private final static QName _ClaimNotFoundFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimNotFoundFault");
    private final static QName _PasswordExpiredFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "PasswordExpiredFault");
    private final static QName _NonRenewableTokenFault_QNAME = new QName("http://schemas.ipcommerce.com/Identity/1.0/", "NonRenewableTokenFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipcommerce.schemas.identity._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfClaimMetaData }
     * 
     */
    public ArrayOfClaimMetaData createArrayOfClaimMetaData() {
        return new ArrayOfClaimMetaData();
    }

    /**
     * Create an instance of {@link PasswordExpiredFault }
     * 
     */
    public PasswordExpiredFault createPasswordExpiredFault() {
        return new PasswordExpiredFault();
    }

    /**
     * Create an instance of {@link PasswordInvalidFault }
     * 
     */
    public PasswordInvalidFault createPasswordInvalidFault() {
        return new PasswordInvalidFault();
    }

    /**
     * Create an instance of {@link NonRenewableTokenFault }
     * 
     */
    public NonRenewableTokenFault createNonRenewableTokenFault() {
        return new NonRenewableTokenFault();
    }

    /**
     * Create an instance of {@link RelyingPartyNotAssociatedToSecurityDomainFault }
     * 
     */
    public RelyingPartyNotAssociatedToSecurityDomainFault createRelyingPartyNotAssociatedToSecurityDomainFault() {
        return new RelyingPartyNotAssociatedToSecurityDomainFault();
    }

    /**
     * Create an instance of {@link STSUnavailableFault }
     * 
     */
    public STSUnavailableFault createSTSUnavailableFault() {
        return new STSUnavailableFault();
    }

    /**
     * Create an instance of {@link ExpiredTokenFault }
     * 
     */
    public ExpiredTokenFault createExpiredTokenFault() {
        return new ExpiredTokenFault();
    }

    /**
     * Create an instance of {@link ClaimNotFoundFault }
     * 
     */
    public ClaimNotFoundFault createClaimNotFoundFault() {
        return new ClaimNotFoundFault();
    }

    /**
     * Create an instance of {@link BadAttemptThresholdExceededFault }
     * 
     */
    public BadAttemptThresholdExceededFault createBadAttemptThresholdExceededFault() {
        return new BadAttemptThresholdExceededFault();
    }

    /**
     * Create an instance of {@link GeneratePasswordFault }
     * 
     */
    public GeneratePasswordFault createGeneratePasswordFault() {
        return new GeneratePasswordFault();
    }

    /**
     * Create an instance of {@link ClaimMetaData }
     * 
     */
    public ClaimMetaData createClaimMetaData() {
        return new ClaimMetaData();
    }

    /**
     * Create an instance of {@link OneTimePasswordFault }
     * 
     */
    public OneTimePasswordFault createOneTimePasswordFault() {
        return new OneTimePasswordFault();
    }

    /**
     * Create an instance of {@link InvalidTokenFault }
     * 
     */
    public InvalidTokenFault createInvalidTokenFault() {
        return new InvalidTokenFault();
    }

    /**
     * Create an instance of {@link AuthenticationFault }
     * 
     */
    public AuthenticationFault createAuthenticationFault() {
        return new AuthenticationFault();
    }

    /**
     * Create an instance of {@link InvalidEmailFault }
     * 
     */
    public InvalidEmailFault createInvalidEmailFault() {
        return new InvalidEmailFault();
    }

    /**
     * Create an instance of {@link ClaimMappingsNotFoundFault }
     * 
     */
    public ClaimMappingsNotFoundFault createClaimMappingsNotFoundFault() {
        return new ClaimMappingsNotFoundFault();
    }

    /**
     * Create an instance of {@link UserNotFoundFault }
     * 
     */
    public UserNotFoundFault createUserNotFoundFault() {
        return new UserNotFoundFault();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link LockedByAdminFault }
     * 
     */
    public LockedByAdminFault createLockedByAdminFault() {
        return new LockedByAdminFault();
    }

    /**
     * Create an instance of {@link AuthorizationFault }
     * 
     */
    public AuthorizationFault createAuthorizationFault() {
        return new AuthorizationFault();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link SendEmailFault }
     * 
     */
    public SendEmailFault createSendEmailFault() {
        return new SendEmailFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockedByAdminFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "LockedByAdminFault")
    public JAXBElement<LockedByAdminFault> createLockedByAdminFault(LockedByAdminFault value) {
        return new JAXBElement<LockedByAdminFault>(_LockedByAdminFault_QNAME, LockedByAdminFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClaimMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "ArrayOfClaimMetaData")
    public JAXBElement<ArrayOfClaimMetaData> createArrayOfClaimMetaData(ArrayOfClaimMetaData value) {
        return new JAXBElement<ArrayOfClaimMetaData>(_ArrayOfClaimMetaData_QNAME, ArrayOfClaimMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimMappingsNotFoundFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "ClaimMappingsNotFoundFault")
    public JAXBElement<ClaimMappingsNotFoundFault> createClaimMappingsNotFoundFault(ClaimMappingsNotFoundFault value) {
        return new JAXBElement<ClaimMappingsNotFoundFault>(_ClaimMappingsNotFoundFault_QNAME, ClaimMappingsNotFoundFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "BaseFault")
    public JAXBElement<BaseFault> createBaseFault(BaseFault value) {
        return new JAXBElement<BaseFault>(_BaseFault_QNAME, BaseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STSUnavailableFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "STSUnavailableFault")
    public JAXBElement<STSUnavailableFault> createSTSUnavailableFault(STSUnavailableFault value) {
        return new JAXBElement<STSUnavailableFault>(_STSUnavailableFault_QNAME, STSUnavailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "SendEmailFault")
    public JAXBElement<SendEmailFault> createSendEmailFault(SendEmailFault value) {
        return new JAXBElement<SendEmailFault>(_SendEmailFault_QNAME, SendEmailFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordInvalidFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "PasswordInvalidFault")
    public JAXBElement<PasswordInvalidFault> createPasswordInvalidFault(PasswordInvalidFault value) {
        return new JAXBElement<PasswordInvalidFault>(_PasswordInvalidFault_QNAME, PasswordInvalidFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OneTimePasswordFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "OneTimePasswordFault")
    public JAXBElement<OneTimePasswordFault> createOneTimePasswordFault(OneTimePasswordFault value) {
        return new JAXBElement<OneTimePasswordFault>(_OneTimePasswordFault_QNAME, OneTimePasswordFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserNotFoundFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "UserNotFoundFault")
    public JAXBElement<UserNotFoundFault> createUserNotFoundFault(UserNotFoundFault value) {
        return new JAXBElement<UserNotFoundFault>(_UserNotFoundFault_QNAME, UserNotFoundFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelyingPartyNotAssociatedToSecurityDomainFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "RelyingPartyNotAssociatedToSecurityDomainFault")
    public JAXBElement<RelyingPartyNotAssociatedToSecurityDomainFault> createRelyingPartyNotAssociatedToSecurityDomainFault(RelyingPartyNotAssociatedToSecurityDomainFault value) {
        return new JAXBElement<RelyingPartyNotAssociatedToSecurityDomainFault>(_RelyingPartyNotAssociatedToSecurityDomainFault_QNAME, RelyingPartyNotAssociatedToSecurityDomainFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "AuthorizationFault")
    public JAXBElement<AuthorizationFault> createAuthorizationFault(AuthorizationFault value) {
        return new JAXBElement<AuthorizationFault>(_AuthorizationFault_QNAME, AuthorizationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpiredTokenFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "ExpiredTokenFault")
    public JAXBElement<ExpiredTokenFault> createExpiredTokenFault(ExpiredTokenFault value) {
        return new JAXBElement<ExpiredTokenFault>(_ExpiredTokenFault_QNAME, ExpiredTokenFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BadAttemptThresholdExceededFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "BadAttemptThresholdExceededFault")
    public JAXBElement<BadAttemptThresholdExceededFault> createBadAttemptThresholdExceededFault(BadAttemptThresholdExceededFault value) {
        return new JAXBElement<BadAttemptThresholdExceededFault>(_BadAttemptThresholdExceededFault_QNAME, BadAttemptThresholdExceededFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratePasswordFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "GeneratePasswordFault")
    public JAXBElement<GeneratePasswordFault> createGeneratePasswordFault(GeneratePasswordFault value) {
        return new JAXBElement<GeneratePasswordFault>(_GeneratePasswordFault_QNAME, GeneratePasswordFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "AuthenticationFault")
    public JAXBElement<AuthenticationFault> createAuthenticationFault(AuthenticationFault value) {
        return new JAXBElement<AuthenticationFault>(_AuthenticationFault_QNAME, AuthenticationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "ClaimMetaData")
    public JAXBElement<ClaimMetaData> createClaimMetaData(ClaimMetaData value) {
        return new JAXBElement<ClaimMetaData>(_ClaimMetaData_QNAME, ClaimMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidEmailFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "InvalidEmailFault")
    public JAXBElement<InvalidEmailFault> createInvalidEmailFault(InvalidEmailFault value) {
        return new JAXBElement<InvalidEmailFault>(_InvalidEmailFault_QNAME, InvalidEmailFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "SystemFault")
    public JAXBElement<SystemFault> createSystemFault(SystemFault value) {
        return new JAXBElement<SystemFault>(_SystemFault_QNAME, SystemFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidTokenFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "InvalidTokenFault")
    public JAXBElement<InvalidTokenFault> createInvalidTokenFault(InvalidTokenFault value) {
        return new JAXBElement<InvalidTokenFault>(_InvalidTokenFault_QNAME, InvalidTokenFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimNotFoundFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "ClaimNotFoundFault")
    public JAXBElement<ClaimNotFoundFault> createClaimNotFoundFault(ClaimNotFoundFault value) {
        return new JAXBElement<ClaimNotFoundFault>(_ClaimNotFoundFault_QNAME, ClaimNotFoundFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordExpiredFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "PasswordExpiredFault")
    public JAXBElement<PasswordExpiredFault> createPasswordExpiredFault(PasswordExpiredFault value) {
        return new JAXBElement<PasswordExpiredFault>(_PasswordExpiredFault_QNAME, PasswordExpiredFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonRenewableTokenFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/Identity/1.0/", name = "NonRenewableTokenFault")
    public JAXBElement<NonRenewableTokenFault> createNonRenewableTokenFault(NonRenewableTokenFault value) {
        return new JAXBElement<NonRenewableTokenFault>(_NonRenewableTokenFault_QNAME, NonRenewableTokenFault.class, null, value);
    }

}

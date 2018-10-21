package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.DateTimePeriod;

import javax.validation.Valid;
  
/**
 * AgreementBase
 */
public class AgreementBase   {
  private Object servicingMandateAgreementRecord = null;

  private String partyReference = null;

  private String servicingMandateAgreementType = null;

  private String servicingMandateAgreementJurisdiction = null;

  private DateTimePeriod servicingMandateAgreementValidFromToDate = null;

  private String servicingMandateAgreementSignaturesResponsibleParties = null;

  private String documentReference = null;

  private String servicingMandateAgreementProductServiceProfileReference = null;

  private String servicingMandateAgreementProductServiceProfile = null;

  private String productServiceType = null;

  private String servicingMandateAgreementProductServiceTypeEligibility = null;


  /**
   * generalInfo: all listed terms combined for the complete agreement record `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return servicingMandateAgreementRecord
  **/

  public Object getServicingMandateAgreementRecord() {
    return servicingMandateAgreementRecord;
  }

  public void setServicingMandateAgreementRecord(Object servicingMandateAgreementRecord) {
    this.servicingMandateAgreementRecord = servicingMandateAgreementRecord;
  }


  /**
   * generalInfo: reference to the party granted the servicing mandate - a service provider `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * generalInfo: allows for different categories of third party mandates `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingMandateAgreementType
  **/

  public String getServicingMandateAgreementType() {
    return servicingMandateAgreementType;
  }

  public void setServicingMandateAgreementType(String servicingMandateAgreementType) {
    this.servicingMandateAgreementType = servicingMandateAgreementType;
  }


  /**
   * generalInfo: defines the geographic coverage/scope `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingMandateAgreementJurisdiction
  **/

  public String getServicingMandateAgreementJurisdiction() {
    return servicingMandateAgreementJurisdiction;
  }

  public void setServicingMandateAgreementJurisdiction(String servicingMandateAgreementJurisdiction) {
    this.servicingMandateAgreementJurisdiction = servicingMandateAgreementJurisdiction;
  }


  /**
   * Get servicingMandateAgreementValidFromToDate
   * @return servicingMandateAgreementValidFromToDate
  **/

  public DateTimePeriod getServicingMandateAgreementValidFromToDate() {
    return servicingMandateAgreementValidFromToDate;
  }

  public void setServicingMandateAgreementValidFromToDate(DateTimePeriod servicingMandateAgreementValidFromToDate) {
    this.servicingMandateAgreementValidFromToDate = servicingMandateAgreementValidFromToDate;
  }


  /**
   * generalInfo: authorities and interested parties `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingMandateAgreementSignaturesResponsibleParties
  **/

  public String getServicingMandateAgreementSignaturesResponsibleParties() {
    return servicingMandateAgreementSignaturesResponsibleParties;
  }

  public void setServicingMandateAgreementSignaturesResponsibleParties(String servicingMandateAgreementSignaturesResponsibleParties) {
    this.servicingMandateAgreementSignaturesResponsibleParties = servicingMandateAgreementSignaturesResponsibleParties;
  }


  /**
   * generalInfo: filed documents pertaining to the agreement `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingMandateAgreementProductServiceProfileReference
  **/

  public String getServicingMandateAgreementProductServiceProfileReference() {
    return servicingMandateAgreementProductServiceProfileReference;
  }

  public void setServicingMandateAgreementProductServiceProfileReference(String servicingMandateAgreementProductServiceProfileReference) {
    this.servicingMandateAgreementProductServiceProfileReference = servicingMandateAgreementProductServiceProfileReference;
  }


  /**
   * generalInfo: the is the overarching product/service access profile permitted under the mandate `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingMandateAgreementProductServiceProfile
  **/

  public String getServicingMandateAgreementProductServiceProfile() {
    return servicingMandateAgreementProductServiceProfile;
  }

  public void setServicingMandateAgreementProductServiceProfile(String servicingMandateAgreementProductServiceProfile) {
    this.servicingMandateAgreementProductServiceProfile = servicingMandateAgreementProductServiceProfile;
  }


  /**
   * generalInfo: defines all available products/services `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * generalInfo: defines if and under what terms a product/service is accessable under the mandate `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingMandateAgreementProductServiceTypeEligibility
  **/

  public String getServicingMandateAgreementProductServiceTypeEligibility() {
    return servicingMandateAgreementProductServiceTypeEligibility;
  }

  public void setServicingMandateAgreementProductServiceTypeEligibility(String servicingMandateAgreementProductServiceTypeEligibility) {
    this.servicingMandateAgreementProductServiceTypeEligibility = servicingMandateAgreementProductServiceTypeEligibility;
  }


}


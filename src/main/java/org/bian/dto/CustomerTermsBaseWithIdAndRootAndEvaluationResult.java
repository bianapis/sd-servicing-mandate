package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * details the specific servicing mandate terms applicable to an individual customer
 */
public class CustomerTermsBaseWithIdAndRootAndEvaluationResult   {
  private String servicingMandateAgreementCustomerProductServiceProfileReference = null;

  private String customerReference = null;

  private String servicingMandateAgreementReference = null;

  private Object servicingMandateAgreementRecord = null;

  private String servicingMandateAgreementCustomerProductServiceProfile = null;

  private String productServiceType = null;

  private String servicingMandateAgreementCustomerProductServiceTypeAccess = null;

  private String servicingMandateAgreementCustomerProductServiceTypeUsage = null;

  private String evaluationResult = null;


  /**
   * generalInfo: refers to the terms in force for a specific customer covered by the mandate `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingMandateAgreementCustomerProductServiceProfileReference
  **/

  public String getServicingMandateAgreementCustomerProductServiceProfileReference() {
    return servicingMandateAgreementCustomerProductServiceProfileReference;
  }

  public void setServicingMandateAgreementCustomerProductServiceProfileReference(String servicingMandateAgreementCustomerProductServiceProfileReference) {
    this.servicingMandateAgreementCustomerProductServiceProfileReference = servicingMandateAgreementCustomerProductServiceProfileReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingMandateAgreementReference
  **/

  public String getServicingMandateAgreementReference() {
    return servicingMandateAgreementReference;
  }

  public void setServicingMandateAgreementReference(String servicingMandateAgreementReference) {
    this.servicingMandateAgreementReference = servicingMandateAgreementReference;
  }


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
   * generalInfo: this details the specific customer access allowed under the mandate `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingMandateAgreementCustomerProductServiceProfile
  **/

  public String getServicingMandateAgreementCustomerProductServiceProfile() {
    return servicingMandateAgreementCustomerProductServiceProfile;
  }

  public void setServicingMandateAgreementCustomerProductServiceProfile(String servicingMandateAgreementCustomerProductServiceProfile) {
    this.servicingMandateAgreementCustomerProductServiceProfile = servicingMandateAgreementCustomerProductServiceProfile;
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
   * generalInfo: defines if and under what terms a product/service can be accessed for this customer under the mandate `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingMandateAgreementCustomerProductServiceTypeAccess
  **/

  public String getServicingMandateAgreementCustomerProductServiceTypeAccess() {
    return servicingMandateAgreementCustomerProductServiceTypeAccess;
  }

  public void setServicingMandateAgreementCustomerProductServiceTypeAccess(String servicingMandateAgreementCustomerProductServiceTypeAccess) {
    this.servicingMandateAgreementCustomerProductServiceTypeAccess = servicingMandateAgreementCustomerProductServiceTypeAccess;
  }


  /**
   * generalInfo: records the usage of products/service under the mandate for control purposes `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingMandateAgreementCustomerProductServiceTypeUsage
  **/

  public String getServicingMandateAgreementCustomerProductServiceTypeUsage() {
    return servicingMandateAgreementCustomerProductServiceTypeUsage;
  }

  public void setServicingMandateAgreementCustomerProductServiceTypeUsage(String servicingMandateAgreementCustomerProductServiceTypeUsage) {
    this.servicingMandateAgreementCustomerProductServiceTypeUsage = servicingMandateAgreementCustomerProductServiceTypeUsage;
  }


  /**
   * generalInfo: evaluation result information `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return evaluationResult
  **/

  public String getEvaluationResult() {
    return evaluationResult;
  }

  public void setEvaluationResult(String evaluationResult) {
    this.evaluationResult = evaluationResult;
  }


}


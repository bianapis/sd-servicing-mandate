/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ServicingMandateApiService {

	CustomerTermsBaseWithIdAndRootAndEvaluationResult evaluateCustomerTerms(String crReferenceId, CustomerTermsBase request);
	
	AgreementBaseWithId initiate(AgreementBase request);
	
	CustomerTermsBaseWithIdAndRoot initiateCustomerTerms(String crReferenceId, CustomerTermsBase request);
	
	ServicingMandateRefreshResponse requestPut(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	AgreementBaseWithId retrieve(String crReferenceId);
	
	CustomerTermsBaseWithIdAndRoot retrieveCustomerTerms(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	List<String> retrieveBQs();
	
	Void terminateCustomerTerms(String crReferenceId, String bqReferenceId);
	
	AgreementBaseWithId update(String crReferenceId, AgreementBase request);
	
	CustomerTermsBaseWithIdAndRoot updateCustomerTerms(String crReferenceId, String bqReferenceId, CustomerTermsBase request);
	
}

/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ServicingMandateApiServiceImpl implements ServicingMandateApiService {

	public CustomerTermsBaseWithIdAndRootAndEvaluationResult evaluateCustomerTerms(String crReferenceId, CustomerTermsBase request){
		return JsonReader.read("evaluate-CustomerTermsBaseWithIdAndRootAndEvaluationResult.json",new TypeReference<CustomerTermsBaseWithIdAndRootAndEvaluationResult>(){});
	}
	
	public AgreementBaseWithId initiate(AgreementBase request){
		return JsonReader.read("initiate-AgreementBaseWithId.json",new TypeReference<AgreementBaseWithId>(){});
	}
	
	public CustomerTermsBaseWithIdAndRoot initiateCustomerTerms(String crReferenceId, CustomerTermsBase request){
		return JsonReader.read("initiate-CustomerTermsBaseWithIdAndRoot.json",new TypeReference<CustomerTermsBaseWithIdAndRoot>(){});
	}
	
	public ServicingMandateRefreshResponse requestPut(String crReferenceId){
		return JsonReader.read("requestPut-ServicingMandateRefreshResponse.json",new TypeReference<ServicingMandateRefreshResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public AgreementBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-AgreementBaseWithId.json",new TypeReference<AgreementBaseWithId>(){});
	}
	
	public CustomerTermsBaseWithIdAndRoot retrieveCustomerTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerTermsBaseWithIdAndRoot.json",new TypeReference<CustomerTermsBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public Void terminateCustomerTerms(String crReferenceId, String bqReferenceId){
		return null;
	}
	
	public AgreementBaseWithId update(String crReferenceId, AgreementBase request){
		return JsonReader.read("update-AgreementBaseWithId.json",new TypeReference<AgreementBaseWithId>(){});
	}
	
	public CustomerTermsBaseWithIdAndRoot updateCustomerTerms(String crReferenceId, String bqReferenceId, CustomerTermsBase request){
		return JsonReader.read("update-CustomerTermsBaseWithIdAndRoot.json",new TypeReference<CustomerTermsBaseWithIdAndRoot>(){});
	}
	
}

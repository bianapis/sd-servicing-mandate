/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.AgreeTerms;

@BianRestController
public class ServicingMandateApiController {

	@Autowired
	ServicingMandateApiService service;
	
	@BQ("customer-terms")
	@AgreeTerms.Evaluate
	public BianResponse<CustomerTermsBaseWithIdAndRootAndEvaluationResult> evaluateCustomerTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerTermsBase> bianRequest) {
		return BianResponse.forSuccess(service.evaluateCustomerTerms(crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Initiate
	public BianResponse<AgreementBaseWithId> initiate(@RequestBody BianRequest<AgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@BQ("customer-terms")
	@AgreeTerms.Initiate
	public BianResponse<CustomerTermsBaseWithIdAndRoot> initiateCustomerTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerTermsBase> bianRequest) {
		return BianResponse.forSuccess(service.initiateCustomerTerms(crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.RequestPut
	public BianResponse<ServicingMandateRefreshResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId));
	}
	
	@AgreeTerms.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@AgreeTerms.Retrieve
	public BianResponse<AgreementBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("customer-terms")
	@AgreeTerms.Retrieve
	public BianResponse<CustomerTermsBaseWithIdAndRoot> retrieveCustomerTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCustomerTerms(crReferenceId, bqReferenceId));
	}
	
	@AgreeTerms.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@AgreeTerms.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("customer-terms")
	@AgreeTerms.Terminate
	public BianResponse<Void> terminateCustomerTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.terminateCustomerTerms(crReferenceId, bqReferenceId));
	}
	
	@AgreeTerms.Update
	public BianResponse<AgreementBaseWithId> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("customer-terms")
	@AgreeTerms.Update
	public BianResponse<CustomerTermsBaseWithIdAndRoot> updateCustomerTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerTermsBase> bianRequest) {
		return BianResponse.forSuccess(service.updateCustomerTerms(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}

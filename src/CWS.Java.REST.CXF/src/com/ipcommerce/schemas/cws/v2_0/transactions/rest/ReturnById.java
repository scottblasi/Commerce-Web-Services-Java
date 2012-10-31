package com.ipcommerce.schemas.cws.v2_0.transactions.rest;

import com.ipcommerce.schemas.cws.v2_0.transactions.Transaction;

/*
 * The following code was not generated, however it could be generated using the CWS Rest schemas provided.
 */

public class ReturnById implements java.io.Serializable {

	private String applicationProfileId;	
	private String merchantProfileId;
	private com.ipcommerce.schemas.cws.v2_0.transactions.Return differenceData;
	
	public ReturnById() {
	}
	
	public ReturnById(String applicationProfileId, String merchantProfileId, com.ipcommerce.schemas.cws.v2_0.transactions.Return differenceData) {
		this.applicationProfileId = applicationProfileId;
		this.merchantProfileId = merchantProfileId;
		this.differenceData = differenceData;
	}
	
	public String getApplicationProfileId()
	{
		return applicationProfileId;
	}
	
	public void setApplicationProfileId(String applicationProfileId)
	{
		this.applicationProfileId = applicationProfileId;
	}
	
	public String getMerchantProfileId() {
		return merchantProfileId;
	}

	public void setMerchantProfileId(String merchantProfileId) {
		this.merchantProfileId = merchantProfileId;
	}	
	
	public com.ipcommerce.schemas.cws.v2_0.transactions.Return getReturn()
	{
		return this.differenceData;
	}
	
	public void setUndo(com.ipcommerce.schemas.cws.v2_0.transactions.Return differenceData)
	{
		this.differenceData = differenceData;
	}
}


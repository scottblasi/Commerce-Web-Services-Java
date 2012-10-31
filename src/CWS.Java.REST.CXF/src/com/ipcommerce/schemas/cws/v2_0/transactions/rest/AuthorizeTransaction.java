package com.ipcommerce.schemas.cws.v2_0.transactions.rest;

import com.ipcommerce.schemas.cws.v2_0.transactions.Transaction;

/*
 * The following code was not generated, however it could be generated using the CWS Rest schemas provided.
 */

public class AuthorizeTransaction implements java.io.Serializable {

	private String applicationProfileId;
	private String merchantProfileId;
	private Transaction transaction;
	
	public AuthorizeTransaction() {
	}
	
	public AuthorizeTransaction(String applicationProfileId, String merchantProfileId, Transaction transaction) {
		this.applicationProfileId = applicationProfileId;
		this.merchantProfileId = merchantProfileId;
		this.transaction = transaction;
	}
	
	public String getApplicationProfileId()
	{
		return applicationProfileId;
	}
	
	public void setApplicationProfileId(String applicationProfileId)
	{
		this.applicationProfileId = applicationProfileId;
	}
	
	public String getMerchantProfileId()
	{
		return merchantProfileId;
	}
	
	public void setMerchantProfileId(String merchantProfileId)
	{
		this.merchantProfileId = merchantProfileId;
	}
	
	public Transaction getTransaction()
	{
		return transaction;
	}
	
	public void setTransaction(Transaction transaction)
	{
		this.transaction = transaction;
	}	

}


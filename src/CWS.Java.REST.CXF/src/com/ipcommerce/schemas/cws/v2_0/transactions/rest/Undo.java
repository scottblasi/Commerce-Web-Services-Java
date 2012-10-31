package com.ipcommerce.schemas.cws.v2_0.transactions.rest;

import com.ipcommerce.schemas.cws.v2_0.transactions.Transaction;

/*
 * The following code was not generated, however it could be generated using the CWS Rest schemas provided.
 */

public class Undo implements java.io.Serializable {

	private String applicationProfileId;	
	private com.ipcommerce.schemas.cws.v2_0.transactions.Undo differenceData;
	
	public Undo() {
	}
	
	public Undo(String applicationProfileId, com.ipcommerce.schemas.cws.v2_0.transactions.Undo undo) {
		this.applicationProfileId = applicationProfileId;
		this.differenceData = undo;
	}
	
	public String getApplicationProfileId()
	{
		return applicationProfileId;
	}
	
	public void setApplicationProfileId(String applicationProfileId)
	{
		this.applicationProfileId = applicationProfileId;
	}
	
	public com.ipcommerce.schemas.cws.v2_0.transactions.Undo getUndo()
	{
		return this.differenceData;
	}
	
	public void setUndo(com.ipcommerce.schemas.cws.v2_0.transactions.Undo undo)
	{
		this.differenceData = undo;
	}	
}


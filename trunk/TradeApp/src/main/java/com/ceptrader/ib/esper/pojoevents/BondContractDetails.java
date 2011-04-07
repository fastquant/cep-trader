package com.ceptrader.ib.esper.pojoevents;

import com.ceptrader.util.BasicUtils;
import com.ib.client.ContractDetails;

public class BondContractDetails extends ContractDetailsCommon {
	private static final long	serialVersionUID	= 1L;
	
	@Deprecated
	public BondContractDetails() {
	}
	
	public BondContractDetails(final int reqId,
	        final ContractDetails contractDetails) {
		super(reqId, contractDetails);
	}
	
	@Override
	public String toString() {
		return BasicUtils.toString(this);
	}
}

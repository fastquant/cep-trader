package com.ceptrader.ib.esper.pojoevents;

import com.ceptrader.generic.esper.pojoevents.DataItem;
import com.ceptrader.util.BasicUtils;

public class ScannerParameters implements DataItem {
	private static final long	serialVersionUID	= 1L;
	private String	          xml;
	
	@Deprecated
	public ScannerParameters() {
	}
	
	public ScannerParameters(final String xml) {
		this.xml = xml;
	}
	
	public String getXml() {
		return xml;
	}
	
	public void setXml(final String xml) {
		this.xml = xml;
	}
	
	@Override
	public String toString() {
		return BasicUtils.toString(this);
	}
}

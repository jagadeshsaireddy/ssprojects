package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class BioData {
	@ValueMapValue
	private String mName;
	@ValueMapValue
	private String sName;
	
	@ValueMapValue
	private String pinNo;

	public String getmName() {
		return mName;
	}

	public String getsName() {
		return sName;
	}

	public String getPinNo() {
		return pinNo;
	}

	
	
	

}

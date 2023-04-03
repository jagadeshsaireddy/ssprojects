package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ArticlePage {
	@Optional
	@ValueMapValue 
	private String socialLinks;
	@Optional
	@ValueMapValue 
	private String socialMedia;
	@Optional
	@ValueMapValue
	private String dropDown;
	@Optional
	@ValueMapValue
	private String checkbox;
	
	@Optional
	public String getSocialLinks() {
		return socialLinks;
	}@Optional
	public String getSocialMedia() {
		return socialMedia;
	}@Optional
	public String getDropDown() {
		return dropDown;
	}@Optional
	public String getCheckbox() {
		return checkbox;
	}
	 

}

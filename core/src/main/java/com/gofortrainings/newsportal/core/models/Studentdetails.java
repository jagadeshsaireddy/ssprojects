package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.gofortrainings.newsportal.core.service.ArticledetailsService;

@Model(adaptables=Resource.class)
public class Studentdetails {
	@ValueMapValue
	private String name;
	@ValueMapValue
	private String ids;
	@ValueMapValue
	private String phno;
	@OSGiService
	ArticledetailsService articledetailsService;
	  private String data;
	  
	public String getName() {
		return name;
	}
	public String getIds() {
		return ids;
	}
	public String getPhno() {
		return phno;
	}
	public String getData(){
	   return data;
	}

}

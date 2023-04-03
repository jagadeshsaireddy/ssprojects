package com.gofortrainings.newsportal.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.gofortrainings.newsportal.core.service.TigerService;

import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

@Model(adaptables=Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ArticleDetails {
	@Optional
	@ValueMapValue
	private String articletitle;
	@Optional
	@ValueMapValue 
	private String articledesc; 
   // @OSGiService
   // @Optional 
   // private String sss;
    
   // TigerService tiger;
	@ChildResource
	//@Optional
	//public List<ArticlePage> articlePage;
	
    //public List<BioData>bio;

	@Optional
	private String extendedtitle;
	@Optional
	public String getArticletitle() {
		return articletitle;
	}
	@Optional
	public String getArticledesc() {
		return articledesc;
	}
	
	//@Optional
	//public List<ArticlePage> getArticlePage() {
		//return articlePage;
	//}
	@Optional
	public String getExtendedtitle() {
		return extendedtitle;
	}

	
	
	//@Optional
	//public String getSss() {
		//return sss;
	//}
	//@Optional
	//public TigerService getTiger() {
		//return tiger;
	//}@Optional
	//@PostConstruct
	//public void init() {
		//sss=tiger.food();
	}
//}

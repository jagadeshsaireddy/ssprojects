package com.gofortrainings.newsportal.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.component.annotations.Deactivate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Component(immediate =true ,service=ArticledetailsService.class)
@Designate(ocd=ArticleConfig.class)
public class ArticledetailsService {
	private static final Logger logger=(Logger) LoggerFactory.getLogger(ArticledetailsService.class);
 
	@Reference
	ArticleConfig articleConfig;
	private String article;
	
	
	
	
@Activate	
public void activate() {
	logger.info("Newsportal Bundles is activated....");
	logger.info("read a text is:"+articleConfig.read());
	this.articleConfig=articleConfig;
	article=articleConfig.read();
	
	
}

@Modified
public void update() {
	logger.info("Newsportal Bundles is update....");
	
}
@Deactivate
public void deactivate() {
	logger.info("Newsportal Bundles is deactivated....");
}
public String read() {
	return article;
}
}

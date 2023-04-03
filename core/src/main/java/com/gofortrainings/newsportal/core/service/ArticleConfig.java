package com.gofortrainings.newsportal.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "articleCONFIG", description="this config is  RUNTIME")
public @interface ArticleConfig {
 @AttributeDefinition (name="read",description="What config", required = true)

public String read()  ;

}
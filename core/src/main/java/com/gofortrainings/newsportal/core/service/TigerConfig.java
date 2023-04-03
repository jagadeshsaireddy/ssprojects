package com.gofortrainings.newsportal.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "tiger configuration",description="this config is  RUNTIME")
public @interface TigerConfig {
	@AttributeDefinition(name="food",description="What tiger eats", required = true)
	public String food() default   "Test Meal";
}
 
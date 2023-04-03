package com.gofortrainings.newsportal.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = TigerService.class)
@Designate(ocd=TigerConfig.class)
public class TigerService {
private static final Logger logger = LoggerFactory.getLogger(TigerService.class);
	
	@Reference
	private AnimalService animalService;
	TigerConfig tigerConfig;
   private String tiger;
	@Activate
	public void active(TigerConfig tigerConfig) {
		//logger.info("Newsportal Bundles is activated from Tiger....");
		//logger.info("This is TigerService : " + animalService.eat("meat"));
		 this.tigerConfig = tigerConfig;
		logger.info("Tiger config value : " + tigerConfig.food());
		tiger=tigerConfig.food();
}
	public String food() {
		return tiger;
		
	}
}

/**
 * 
 */
package com.ofs.sms.ui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lalitha
 *
 */
@Configuration
public class BeansConfiguration {
	 @Bean
     public RestTemplate getRestTemplate() {
         RestTemplate restTemplate = new RestTemplate();
         return restTemplate;
     }
}

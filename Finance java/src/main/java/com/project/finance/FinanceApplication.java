package com.project.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceApplication {

	//private static final Logger log = LoggerFactory.getLogger(SportViewApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FinanceApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			Answer[] quote = restTemplate.getForObject(
//					"https://www.scorebat.com/video-api/v1/", Answer[].class);
//			System.out.println(quote[0].getTitle());
//		};
//	}

}

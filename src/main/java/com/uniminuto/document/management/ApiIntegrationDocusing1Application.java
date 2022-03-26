package com.uniminuto.document.management;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ApiIntegrationDocusing1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiIntegrationDocusing1Application.class, args);
	}
	
	@Bean(name = "messageSource")
	public ReloadableResourceBundleMessageSource getMessageSource() {
	    final ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
	    res.setDefaultEncoding("UTF-8");
	    res.setFallbackToSystemLocale(false); // will force to use specified locale even if locale for current env is different
	    //res.addBasenames("classpath:messages/validation", "classpath:messages/messages", "classpath:messages/titles");
	    return res;
	}

	@Bean
	public MessageSourceAccessor getMessageSourceAccessor(final MessageSource messageSource) {
	    return new MessageSourceAccessor(messageSource, Locale.US);
	}
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(PathSelectors.any()).build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Document Management API")
				.description("API Rest Document Management referece for developers")
				.termsOfServiceUrl("")
				.licenseUrl("").version("1.0").build();
	}

}

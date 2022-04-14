package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

/*
	스프링 부트를 쓰면 메세지 소스를 자동으로 스프링 빈으로 등록해준다.
	스프링 부트에 메세지 소스를 설정하려면 properties에 파일에 스프링 베이스 네임을 설정하면 된다.
	spring.messages.basename=messages,cofig.i18n.messages 이렇게 프로퍼티 파일에 설정할 수 있다 ( 스프링 부트 )
	별도의 설정을 하지 않으면 spring.messages.basename=messages
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages", "errors");
		messageSource.setDefaultEncoding("utf-8");
		return messageSource;
	}
*/
}

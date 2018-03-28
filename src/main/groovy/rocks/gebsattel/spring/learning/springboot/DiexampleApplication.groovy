package rocks.gebsattel.spring.learning.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ImportResource
import rocks.gebsattel.spring.learning.controllers.GreetingController

@SpringBootApplication
// @ComponentScan("rocks.gebsattel.spring.learning") // ==> moved to resources/spring/spring-config.xml
@ImportResource("classpath:/spring/spring-config.xml")
class DiexampleApplication {

	static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiexampleApplication.class, args)
		GreetingController controller = (GreetingController) ctx.getBean("greetingController")
        controller.sayHello()
	}
}

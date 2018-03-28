package rocks.gebsattel.spring.learning.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller
import rocks.gebsattel.spring.learning.services.HelloWorldService
import rocks.gebsattel.spring.learning.services.HelloWorldServiceGermanImpl

// @Controller // ==> moved to resources/spring/spring-config.xml
class GreetingController {

    HelloWorldService helloWorldService
    HelloWorldService helloWorldServiceGerman
    HelloWorldService helloWorldServiceFrench

    // Inversion of Control to spring framework with Setter
    // Autowiring by type 'HelloWorldService'
    // @Autowired //==> moved to resources/spring/spring-config.xml
    void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService
    }

    // Autowired by name of method 'helloWorldServiceGerman' which declares the Bean
    // remember: by type 'HelloWorldService' is already registered bean
    /* ==> moved to resources/spring/spring-config.xml
     * @Autowired
     * @Qualifier("helloWorldServiceGerman")
     */
    void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman
    }

    // Autowired by explicit spring bean name
    /* ==> moved to resources/spring/spring-config.xml
     * @Autowired
     * @Qualifier("french")
     */
    void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench
    }

    public String sayHello(){

        String greeting = helloWorldService.getGreeting()
        println(greeting)
        println(helloWorldServiceGerman.getGreeting())
        println(helloWorldServiceFrench.getGreeting())
        return greeting
    }

}

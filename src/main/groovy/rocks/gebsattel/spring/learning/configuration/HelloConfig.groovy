package rocks.gebsattel.spring.learning.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import rocks.gebsattel.spring.learning.services.HelloWorldFactory
import rocks.gebsattel.spring.learning.services.HelloWorldService
import rocks.gebsattel.spring.learning.services.HelloWorldServiceEnglishImpl
import rocks.gebsattel.spring.learning.services.HelloWorldServiceSpanishImpl

/*
 * "Java-Configuration in Spring" -
 * use this configuration class instead of @Component/@Service-Annotations in the particular spring bean classes:
 * useful e.g. for imported Java-Classes, where you don't want to change code etc.
 */


@Configuration
class HelloConfig {

    /* ==> moved to resources/spring/spring-config.xml:
     * @Bean
     * HelloWorldFactory helloWorldFactory(){
     * return new HelloWorldFactory()
     * }
     */

    @Bean
    @Profile(["default","english"])
    @Primary
    HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory){
        return factory.createHelloWorldService("en")
    }

    @Bean
    @Profile("spanish")
    @Primary
    HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory){
        return factory.createHelloWorldService("es")
    }

    @Bean
    HelloWorldService helloWorldServiceRussian(HelloWorldFactory factory){
        return factory.createHelloWorldService("ru")
    }

    @Bean
    HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
        return factory.createHelloWorldService("de")
    }

    @Bean
    HelloWorldService helloWorldServicePolish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("pl")
    }

    @Bean(name = "french")
    HelloWorldService helloWorldService(HelloWorldFactory factory){
        return factory.createHelloWorldService("fr")
    }


}

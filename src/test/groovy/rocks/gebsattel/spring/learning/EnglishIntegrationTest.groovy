package rocks.gebsattel.spring.learning

import junit.extensions.TestSetup
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import rocks.gebsattel.spring.learning.services.HelloWorldService

// Test is running without Spring-Profiles
// @ContextConfiguration uses explicit set 'english-helloworld-config.xml'

@RunWith(SpringRunner)
@ContextConfiguration(locations= ["classpath:/spring/helloworld-config.xml",
                                  "classpath*:/spring/english-helloworld-config.xml"])
class EnglishIntegrationTest {

    @Autowired
    HelloWorldService helloWorldService

    @Test
    void testHelloWorld(){
        String greeting = helloWorldService.getGreeting()

        assert greeting == "Hello World"
    }
}

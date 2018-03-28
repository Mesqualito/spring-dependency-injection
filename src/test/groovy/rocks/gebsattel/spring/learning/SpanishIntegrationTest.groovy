package rocks.gebsattel.spring.learning

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import rocks.gebsattel.spring.learning.services.HelloWorldService

import static org.junit.Assert.*;

// Test is running without Spring-Profiles
// @ContextConfiguration uses explicit set 'spanish-helloworld-config.xml'

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= ["classpath:/spring/helloworld-config.xml",
        "classpath*:/spring/spanish-helloworld-config.xml"])
class SpanishIntegrationTest {

    @Autowired
    HelloWorldService helloWorldService

    @Test
    void testHelloWorld(){
        String greeting = helloWorldService.getGreeting()

        assertEquals("Hola mundo", greeting)
    }
}

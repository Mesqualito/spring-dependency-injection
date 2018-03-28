package rocks.gebsattel.spring.learning.services

class HelloWorldServiceFrenchImpl implements HelloWorldService {

    @Override
    String getGreeting() {
        return "Bonjour le monde"
    }
}

package rocks.gebsattel.spring.learning.services

class HelloWorldServicePolishImpl implements HelloWorldService {

    @Override
    String getGreeting() {
        return "Witaj, świecie"
    }
}

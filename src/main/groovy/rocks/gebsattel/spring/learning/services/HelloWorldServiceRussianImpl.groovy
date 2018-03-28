package rocks.gebsattel.spring.learning.services

class HelloWorldServiceRussianImpl implements HelloWorldService {

    @Override
    String getGreeting() {
        return "Привет мир (Privet mir)"
    }
}

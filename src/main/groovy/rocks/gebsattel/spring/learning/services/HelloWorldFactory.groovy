package rocks.gebsattel.spring.learning.services

class HelloWorldFactory {

    HelloWorldService createHelloWorldService(String language) {
        HelloWorldService service = null

        switch(language) {
            case "en":
                service = new HelloWorldServiceEnglishImpl()
                break
            case "de":
                service = new HelloWorldServiceGermanImpl()
                break
            case "pl":
                service = new HelloWorldServicePolishImpl()
                break
            case "es":
                service = new HelloWorldServiceSpanishImpl()
                break
            case "fr":
                service = new HelloWorldServiceFrenchImpl()
                break
            case "ru":
                service = new HelloWorldServiceRussianImpl()
                break
            default:
                service = new HelloWorldServiceEnglishImpl()
        }

        return service
    }

}

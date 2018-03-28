
/* ==> Java-configuration-class moved completely to resources/spring/spring-config.xml
 * (in the github-branch 'xml_configuration'
 *
 * "Java-Configuration in Spring" -
 * use this configuration class instead of @Component/@Service-Annotations in the particular spring bean classes:
 * useful e.g. for imported Java-Classes, where you don't want to change code etc.
 */

/* ==> moved to resources/spring/spring-config.xml:
 * @Configuration
 * class HelloConfig {
 */

/* ==> moved to resources/spring/spring-config.xml:
* @Bean
* HelloWorldFactory helloWorldFactory(){
* return new HelloWorldFactory()
* }
*/

/* ==> moved to resources/spring/spring-config.xml:
 * @Bean
 * @Profile("spanish")
 * @Primary
 * HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
 *     return factory.createHelloWorldService("es")
 * }
 */

/* ==> moved to resources/spring/spring-config.xml:
 * @Bean
 * @Profile(["default", "english"])
 * @Primary
 * HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
 *     return factory.createHelloWorldService("en")
 * }
 */

/* ==> moved to resources/spring/spring-config.xml:
 * @Bean
 * HelloWorldService helloWorldServiceRussian(HelloWorldFactory factory) {
 *    return factory.createHelloWorldService("ru")
 * }
 */

/* ==> moved to resources/spring/spring-config.xml:
 * @Bean
 * HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
 *    return factory.createHelloWorldService("de")
 * }
 */

/* ==> moved to resources/spring/spring-config.xml:
 * @Bean
 * HelloWorldService helloWorldServicePolish(HelloWorldFactory factory) {
 *    return factory.createHelloWorldService("pl")
 * }
 */

/* ==> moved to resources/spring/spring-config.xml:
* @Bean(name = "french")
* HelloWorldService helloWorldService(HelloWorldFactory factory){
*    return factory.createHelloWorldService("fr")
* }
*
* }
*/

# README
# rest-java-framework

Author:Mateusz Łada

### Overview
This is the template of the test automation framework written in Java used for testing REST API. The framework is a template to download and start testing any REST API application by reusing the code and the structure. It does not present all features of used tools but provides examples about possible usage. It also does not comprehensively test REST API as the target test automation solution and test coverage should address dedicated test strategy.

### Technology stack
- Java
- Rest-assured https://rest-assured.io/
- JUnit 5 https://junit.org/junit5/
- Apache Maven

### Application Under Test (REST API)
https://swapi.dev/

### Framework usage
1. Install required software: Java, Git, Maven
2. Download repository `git clone https://github.com/mateuszlada/rest-java-framework.git`
3. Build maven project `mvn clean install`
4. Run tests `mvn test`
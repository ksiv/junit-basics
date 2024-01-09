# JUnit-cheatsheet
##### What is it
This is a set of JUnit tests describing the main JUnit features.
Implemented in a form of maven project. (https://maven.apache.org/) 
The project is properly configured.

##### For whom this mini guide is intended
Starter test engineer who has some issues setting it up

Tested on
- Maven version: Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
- Java: jdk-11.0.14.101-openj9

JUnit 5 has different syntax from JUnit 4
This project uses JUnit5 
- implementation :org.junit.jupiter 5.10.1 

This document describes only configuration, the tests are self-describing.

## Configuration



One can easily put in aggregator dependencies in pom.xml and it will work.

        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.1</version>
            <scope>compile</scope>
        </dependency>


Although, it's best to understand what is inside if something goes not well.  
You need two basic components: ENGINE and API. 
For parameterized tests you need one more component: Params 


API - provides basic annotations such as @Test, @BeforeEach, @AfterEach etc

PARAMS - provides annotations to work with parameterized test such as: @ValueSource, @EnumSource, @MethodSource etc. 

ENGINE - is a runtime it is responsible for test execution.


In case you use Maven for test execution you need a Maven plugin called Surefire.

!!! Check the last version compatible

            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.2.3</version>
            </plugin>
			
In case you plan to use @Suite annotation you need again two components for it

!!! Check the versions again
        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-suite-api</artifactId>
            <version>1.10.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-suite-engine</artifactId>
            <version>1.10.1</version>
            <scope>test</scope>
        </dependency>

If something does not work - check if a newer version is available first.


the error messages you ll get in these cases unfortunately not very clear.
Sometime there is not any messages so you can not understand what you do wrong.


## Execution 

### using docker
1. pull latest maven image
    `docker pull maven`   
2. interactively runs container based on this image and executes command shell inside
    `docker run -it --name my-maven-container maven bash`
3. changes active directory to one of the active user (default 'root')    
    `cd`
4. 
    `git clone https://github.com/ksiv/junit-cheatsheet.git`
5. go to 'junit-cheatsheet' folder
    `cd junit-cheatsheet`
5. run the tests
    ` mvn clean test`


This one is easy if you do not have any issues with internet connection like firewall.
`mvn clean test` should download all the dependencies and run your tests.

If you have an IDE you might get into trouble as they might have their own build-in versions
of Maven and their own issues connecting to repositories.

## Possible issues
1. you have not included all dependencies or have not configured them 
2. you put dependencies in the wrong pom.xml section
3. there is a version incompatibility between these dependencies 
4. IDE can not download your Maven dependency from a repository in spite of it being correctly configured. 
5. you can not download dependencies because there is a firewall on your computer or on ISP level.

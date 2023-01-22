# Cucumber-BDD Project

What is BDD?
• Behavioral Driven Development (BDD) is a software development approach that has evolved from TDD (Test Driven Development)
• Behavior Driven Development (BDD) is a branch of Test Driven Development (TDD)
• It Improves communication between tech and non-tech teams and stakeholders
• In both development approaches, tests are written ahead of the code, but in BDD, tests are more user-focused and based on the system's behavior
BDD is a way for software teams to work that closes the gap between business
people and technical people
BDD is more user focused - for this BDD use user stories for every feature to be tested Ex - Login feature
• BDD uses human readable descriptions of user requirements - Writing the scripts using Gherkin Language



## Agile and BDD
 - Agile Planning work in small increments of value like User Stories.
 - BDD does not replace your existing agile process, it enhances it.
 - BDD as a set of plug-in for your existing process that will make your team more able to deliver on the promises of agile:
 - BDD encourages working in rapid iterations, continuously breaking down your user's problems into small pieces that can flow through your development process as quickly as possible.

## Cucumber:
• It is a testing tool that supports Behavior Driven Development (BDD) framework. It defines application behavior using simple English text, defined by a language called Gherkin.

## Gherkin Language:
• It is a Business Readable, Domain Specific Language created especially for behavior descriptions.
The 'Given-When-And-Then' formula BDD example
This is the proposed template for writing BDD test cases for a user story, which can be defined as:

Feature: Description of the feature
Scenario:
  • Given a certain scenario which is prerequisite
  • When an action takes place - Action
  • And some more action
  • Then this should be the outcome - Expected Result

BDD Tools
Cucumber
• Cucumber is a test framework that supports BDD. In Cucumber, the BDD specifications are written in plain, simple English which is defined by the Gherkin language. In other words, Gherkin is a language that Cucumber understands.
Spec flow
• Specflow evolved from the Cucumber framework using Ruby on Rails, and is used mainly for .Net projects. SpecFlow also uses the Gherkin language.
• Jbehave
• Test Left
• JDave

# To Create this project steps to be followed:
 1. Create a Maven Project
 2. Add dependencies - Selenium java, webdrivermanager, cucumber-java, junit, cucumber-junit
 3. Create Features folder in src/test/resources
 4. Create a new feature file. extension is .feature
 5. Install Cucumber Eclipse plug-in or natural plug-in and Restart the eclipse.
 6. Create a new feature file to get all the options
 7. Write Scenarios in feature file
 8. Run the feature file
 9. Create step definition class or glue code under src/test/java package
 10. Create a runner package/class
• @RunWith(Cucumber.class)
• @CucumberOptions(features="src/test/resources/Features",glue={"com.St epDefinition"\



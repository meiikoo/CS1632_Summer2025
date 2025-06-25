- [Introduction](#introduction)
- [JUnit Problems](#junit-problems)
  * [ValueTest.java](#valuetestjava)
  * [SquareTest.java](#squaretestjava)
    + [Integration Test](#integration-test)
    + [Unit Test](#unit-test)
  * [DeathStarTest.java](#deathstartestjava)
    + [Integration Test](#integration-test-1)
    + [Unit Test](#unit-test-1)
- [Cucumber Problems](#cucumber-problems)
  * [Testing Value.java](#testing-valuejava)
    + [value_incVal.feature](#value-incvalfeature)
    + [ValueStepDefinitions.java](#valuestepdefinitionsjava)
  * [Testing DeathStar.java](#testing-deathstarjava)
    + [deathStar_shoot.feature](#deathstar-shootfeature)
    + [DeathStarStepDefinitions.java](#deathstarstepdefinitionsjava)
- [Creating a Maven Project](#creating-a-maven-project)
  * [Generate project folder from quick start archetype](#generate-project-folder-from-quick-start-archetype)
  * [Add implementation and test Java classes](#add-implementation-and-test-java-classes)

# Introduction

You can open this folder from VSCode using the "Open Folder" menu.  It is a
Maven project so you will be able to run Cucumber as well as JUnit.  There are
a bunch of problems that you can solve in this project listed below.  But you
can also use this project for the purposes of testing code that you write
during the exam.  You can add new Java and JUnit classes and try running them
on the project.

# JUnit Problems

Running the Maven test phase will run all JUnit tests (including the Cucumber tests):

```
mvn test
```

## ValueTest.java

There is a bug in the JUnit class.  What is the bug and how would you fix it?

## SquareTest.java

### Integration Test

We want to integration test Square.setSquared.  Implement the test according
to the preconditions, execution steps, and postconditions described in the
comment.

### Unit Test

Now we want to unit test Square.setSquared using mocks.  Modify the above
code to convert it to a unit test.

## DeathStarTest.java

### Integration Test

We want to integration test DeathStar.shoot. As before, implement the test
according to the preconditions, execution steps, and postconditions
described in the comment.

### Unit Test

Now we want to unit test DeathStar.shoot again using mocks.  Modify the
above code to convert it to a unit test.

# Cucumber Problems

The below scenarios can be executed through Run As > Cucumber Feature on
Eclipse for individual scenarios, or Run As > Maven Test if you want to run
the entire test suite, including the JUnit tests.  You can also run "mvn
test" on the commandline as we did for Supplementary Exercise 1.

The below scenarios can be executed through Run As > Maven Test on Eclipse
to run the entire test suite, including the JUnit tests.  You can also
run "mvn test" on the commandline as we did for Supplementary Exercise 1.

## Testing Value.java

### value_incVal.feature

Fill in the 3 scenarios using Gherkin Given, When, and Then steps.

### ValueStepDefinitions.java

Fill in the class with step definitions for the above steps.  Use the same
Value class we used for JUnit testing.  If you do this properly, you should
be able to implement everything with just 3 steps.

## Testing DeathStar.java

### deathStar_shoot.feature

Add a deathStar_shoot.feature file to the project under src/test/resources/
and complete the Gherkin file with a scenario that is identical to the
DeathStarTest.testShootPlanet JUnit test case.

### DeathStarStepDefinitions.java

Add a DeathStarStepDefinitions.java file to the project under src/test/java/
and implement the step definitions corresponding to the Gherkin steps that
you used above.

# Creating a Maven Project

You may want to create a Maven project of your own to practice JUnit or
Cucumber testing, or in preparation for the exam which will contain coding
questions.  These instructions are adapted from the [Maven in 5 minutes
Tutorial](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html).

## Generate project folder from quick start archetype

Please execute the following command in the location where you want to
create your new project folder (replacing the artifactId junit-app with
whatever you want the project name to be):

```
mvn archetype:generate "-DgroupId=edu.pitt.cs" "-DartifactId=junit-app" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DarchetypeVersion=1.4" "-DinteractiveMode=false"
```

The above will create a generic project with JUnit testing.  If you want to create a project for both JUnit and Cucumber testing, you can use the cucumber-archetype artifact to create your project:

```
mvn archetype:generate "-DgroupId=edu.pitt.cs" "-DartifactId=cucumber-app" "-DarchetypeGroupId=io.cucumber" "-DarchetypeArtifactId=cucumber-archetype" "-DarchetypeVersion=6.7.0" "-DinteractiveMode=false"
```

This will create a folder my-app and under it, you will see a pom.xml file
and an src/ folder with some sample code under it.  Please edit the pom.xml
file in the following way.

1. Replace 1.7 or 1.8 with 11 in either the maven.compiler.source and
   maven.compiler.target properties near the top or the maven-compiler-plugin configuration.  This will instruct Maven
to use verion 11 of the Java compiler.

1. Replace the dependencies section with the following block (so that you have Mockito):

   ```
   <dependencies>
           <dependency>
                   <groupId>io.cucumber</groupId>
                   <artifactId>cucumber-java</artifactId>
                   <version>6.7.0</version>
                   <scope>test</scope>
           </dependency>

           <dependency>
                   <groupId>io.cucumber</groupId>
                   <artifactId>cucumber-junit</artifactId>
                   <version>6.7.0</version>
                   <scope>test</scope>
           </dependency>

           <dependency>
                   <groupId>junit</groupId>
                   <artifactId>junit</artifactId>
                   <version>4.13.2</version>
                   <scope>test</scope>
           </dependency>

           <dependency>
                   <groupId>org.mockito</groupId>
                   <artifactId>mockito-core</artifactId>
                   <version>5.7.0</version>
           </dependency>
   </dependencies>
   ```
## Add implementation and test Java classes

Now, you are ready to add any Java files or Gherkin feature files under the
src/ directory.  For starters, try copying over files from this Midterm 1
Practice project.

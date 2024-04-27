# mock-worldline-task1

Create a Maven Project:
Open Eclipse and create a new Maven project.
Select "Create a simple project" and click "Next".
Enter Group Id and Artifact Id, then click "Finish".
Add Dependencies to pom.xml:
Open the pom.xml file of your Maven project.
Add the dependencies for Cucumber, Apache POI, and Selenium WebDriver:

![image](https://github.com/shindenikhil659/mock-worldline-task1/assets/95039067/6f56023f-7bf0-4f27-a2ad-9fc4b2cdb053)

Create Feature File:
Create a new feature file search.feature in the src/test/resources directory.
Add the following content to the file:

![image](https://github.com/shindenikhil659/mock-worldline-task1/assets/95039067/4aa59cdc-241a-4855-b746-757d6e6933de)

Create Step Definitions:
Create a new Java class SearchStepDefinitions.java in the src/test/java directory.
Add the step definitions code:

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions {
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        System.out.println("Navigating to the home page...");
        // Code to navigate to the home page
    }

    @When("I search for {string}")
    public void iSearchForProduct(String product) {
        System.out.println("Searching for product: " + product);
        // Code to perform the search using the given product
    }

    @Then("I should see search results for {string}")
    public void iShouldSeeSearchResultsForProduct(String product) {
        System.out.println("Verifying search results for product: " + product);
        // Code to verify search results for the given product
    }
}




Create ExcelReader Class:
Create a new Java class ExcelReader.java in the src/main/java directory.
Add the code to read test data from the Excel file:
![image](https://github.com/shindenikhil659/mock-worldline-task1/assets/95039067/48337e32-0032-4fe7-a20a-544ae7427c01)



Implement Test Runner Class:
Create a new Java class TestRunner.java in the src/test/java directory.
Add the code to execute the Cucumber tests:

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = "stepdefinitions"
)
public class TestRunner {
}



Run the Test:
Right-click on TestRunner.java.
Select "Run As" -> "JUnit Test".

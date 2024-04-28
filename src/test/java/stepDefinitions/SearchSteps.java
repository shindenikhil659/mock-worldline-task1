package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class SearchSteps {
    private WebDriver driver;

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        // Set up WebDriver (Assuming ChromeDriver is used)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shind\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
    }

    @When("I search for {string}")
    public void i_search_for(String product) {
        // Perform search
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Then("I should see search results for {string}")
    public void i_should_see_search_results_for(String product) {
        // Verify search results
        String pageTitle = driver.getTitle();
        assert pageTitle.contains(product);
        // Close WebDriver
        driver.quit();
    }

    // Add this method to read data from Excel
    private static String[][] readTestData(String filePath, String sheetName) throws Exception {
        Workbook workbook = WorkbookFactory.create(new File(filePath));
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i + 1);
            for (int j = 0; j < colCount; j++) {
                data[i][j] = row.getCell(j).toString();
            }
        }
        return data;
    }

    public static void main(String[] args) throws Exception {
        // Example usage of readTestData method
        String[][] testData = null;
		try {
			testData = readTestData("products.xlsx", "Sheet1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        for (String[] row : testData) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}




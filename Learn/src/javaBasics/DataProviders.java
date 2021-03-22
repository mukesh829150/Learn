package javaBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
    WebDriver driver;
    String driverPath = System.getProperty("user.dir")+"\\Drivers";
    

    @BeforeTest
    public void setup(){
    	System.out.println(driverPath);
        String chromePath = driverPath + "\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", chromePath);
         driver = new ChromeDriver();
         driver.get("https://google.com");
         driver.manage().window().maximize();
    }
 
    /** Test case to verify google search box
     * @param author
     * @param searchKey
     * @throws InterruptedException
     */

    @Test(dataProvider="SearchProvider")
    public void testMethod(String author,String searchKey) throws InterruptedException{
    {
        WebElement searchText = driver.findElement(By.name("q"));
        //search value in google searchbox
        searchText.sendKeys(searchKey);
        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        Thread.sleep(3000);
        String testValue = searchText.getAttribute("value");
        System.out.println(testValue +"::::"+searchKey);
        searchText.clear();
        //Verify if the value in google search box is correct
        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
    }
    }
    /**
     * @return Object[][] where first column contains 'author'
     * and second column contains 'searchKey'
     */

    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    String[][] str= 
    	{
            { "Guru99", "India" },
            { "Krishna", "UK" },
            { "Bhupesh", "USA" }
        };
    	return str;

    }
    @AfterTest
    public void closeBrowser() {
    	driver.close();
    }
}

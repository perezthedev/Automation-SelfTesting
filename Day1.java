
//Ryan Perez
//Nov. 18, 2019

//First automation code written out, learning how to use selenium.
//Currently runs but doesn't actually open chrome, I think it is
// just configuration settings giving issues. Though not sure.

package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

    WebDriver driver;

    public void invokeBrowser(){

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver"); //need to install drivers for web browsers and set path HERE
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //driver.setBinary

        driver.get("http://www.google.com");
        searchCourse();

    }

    public void searchCourse(){

        try{
            driver.findElement(By.id("search-inp1")).sendKeys("Java");
            Thread.sleep(3000);
            driver.findElement(By.id("search-button-bottom")).click();

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Day1 myObj = new Day1();
        myObj.invokeBrowser();
    }
}

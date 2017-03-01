package com.githubauto.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver",
        "/Users/lakshmigopalakrishna/Downloads/geckodriver");
    WebDriver driver = new FirefoxDriver(); 
    GithubHomePage home = new GithubHomePage(driver);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    GithubLoginPage loginPage = home.Signin();
    loginPage.login("gvtester5", "googletesting123");

  }

}

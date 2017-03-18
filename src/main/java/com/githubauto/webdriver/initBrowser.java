package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class initBrowser {
  private static WebDriver driver = null;

  public static WebDriver getDriver(){
    if (driver == null){
      System.setProperty("webdriver.chrome.driver", "/Users/lakshmigopalakrishna/Downloads/chromedriver");

      WebDriver driver = new ChromeDriver();
      return driver;
    }
     return driver;
  }

}

package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubHomePage {
  private WebDriver driver;

  public GithubHomePage(WebDriver driver) {
    this.driver = driver;
  }
  
  public void load(){
    driver.navigate().to("https://github.com/");
  }
  
  public GitHubFeaturesPage gotoFeatures(){
    //click features link
    driver.findElement(By.linkText("Features")).click();
    //featuresLink.get
    //return new page
    return new GitHubFeaturesPage(driver);
  }

  public GithubLoginPage Signin() {
    driver.get("https://github.com");
    driver.findElement(By.linkText("Sign in")).click();;
    return new GithubLoginPage(driver);
  }
  public String getTitle(){
    return driver.getTitle();
    
  }

}

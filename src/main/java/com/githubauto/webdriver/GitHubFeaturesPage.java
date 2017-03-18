package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GitHubFeaturesPage {
  private WebDriver driver;

  public GitHubFeaturesPage(WebDriver driver) {
    this.driver = driver;
  }
  
  public void load(){
    driver.navigate().to("https://github.com/");
  }
  
  public void featureclick(){
    driver.findElement(By.linkText("Features")).click();;
  }
  public String getTitle(){
    return driver.getTitle();
}
  
}
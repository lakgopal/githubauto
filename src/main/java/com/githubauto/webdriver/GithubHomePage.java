package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GithubHomePage {
  private WebDriver driver;

  public GithubHomePage(WebDriver driver) {
    this.driver = driver;
  }

  public GithubLoginPage Signin() {
    driver.get("https://github.com");
    driver.findElement(By.linkText("Sign in")).click();;
    return new GithubLoginPage(driver);
  }

}

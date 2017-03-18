package com.githubauto.webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubHomeTest {

  /*
   * In Manual: 1. Open Browser 2. Go to github.com 3. Verify Title
   * 
   * In Automation: 1. Create a webdriver (firefox, Chrome) 2. Create a GithubHomePAge instance and
   * pass driver to it 3. GithubHomePage.load-> will load github home page 4.
   * GithubHomePage.getTitle -> get the title 4. verify the title
   */

  public WebDriver driver;

  public GithubHomeTest() {
    driver = initBrowser.getDriver();
  }

  @Test
  public void verifyTitleWithoutLogin() {

    GithubHomePage homePage = new GithubHomePage(driver);
    homePage.load();
    String title = homePage.getTitle();
    System.out.println(title);
    Assert.assertEquals("The world's leading software development platform · GitHub", title);
  }

  @Test
  public void verifyTitleFeaturePage() {
    GithubHomePage homePage = new GithubHomePage(driver);
    homePage.load();
    GitHubFeaturesPage featurePage = new GitHubFeaturesPage(driver);
    featurePage.featureclick();
    String titleFeature = featurePage.getTitle();
    System.out.println(titleFeature);
    Assert.assertEquals(
        "Features For Collaborative Coding - Developers Work Better, Together | GitHub · GitHub",
        titleFeature);
  }

}

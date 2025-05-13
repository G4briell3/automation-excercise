package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import TestData.URL;
pulic class PersistentClassActions extends BaseTest
{
@Before @Override
  public void before()
  {
    super.before();
    driver.get(URL.MainPage);
    mainPage.checkIconsOnPage();
  }
  


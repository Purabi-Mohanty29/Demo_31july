package com.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	WebDriver driver;

      

    By logfil=By.xpath("//button[@id='react-burger-menu-btn']");

    By logout=By.id("logout_sidebar_link");

   
    

    public LogoutPage(WebDriver driver) {

        this.driver=driver;

    }
 

    public void logfil() {

        driver.findElement(logfil).click();

    }

    public void logout() {

        driver.findElement(logout).click();

    }

}


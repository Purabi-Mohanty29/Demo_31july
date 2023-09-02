package com.tesng;

import org.testng.Assert;
import org.testng.annotations.Test;



import org.testng.annotations.Test;



 

public class SecondTest {

  @Test(priority=-1)//retryAnalyzer=com.listerners.RetryFailed.class) // run method 2 times

  public void log() {

      System.out.println("Log");

     // Assert.assertEquals(false, true);

  }

  

  @Test(priority=0)

  public void search() {

      System.out.println("Search");

      //Assert.assertEquals(false, true);

  }

  

  @Test(priority=1)  // will not run - ignore

  public void addToCart() {

      System.out.println("Add to cart");

  }

  

  @Test(priority=2)

  public void checkOut() {

      System.out.println("Check out");

  }

}

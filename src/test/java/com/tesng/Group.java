package com.tesng;

import org.testng.annotations.Test;

public class Group {
	 @Test (groups="sanity")
	  public void log() {
		  System.out.println("login method");
	  }
	  @Test (groups="regression")
	  public void search() {
		  System.out.println("search method");
		  
	  }
	  @Test (groups={"sanity","regression"})
	  public void addtocart() {
		  System.out.println("cart method");
		  
	  }
	  @Test (groups="regression")
	  public void checkout() {
		  System.out.println("checkout method");
		  
	  }
	}

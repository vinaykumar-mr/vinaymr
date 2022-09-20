package org.treebo.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasicFeatureTestNg {
  @BeforeSuite()
  public void TestNGPracticeTest1() {
	  System.out.println("TC1 pass");
  }
@Test()
public void TestNGPracticeTest2() {
	System.out.println("TC2 Pass");
}
@BeforeClass
public void TestNGPracticeTest3() {
	System.out.println("TC3 Pass");
}
@AfterClass
public void TestNGPracticeTest4() {
	System.out.println("TC4 Pass");
}

}

package t1;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Test2{
	
	
	
  @Test(priority = 0)
  public void cTest() {
	  System.out.println("@Test-cTest");
	  System.out.println(" ");
  }
  @Test(priority = 1)
  public void bTest() {
	  System.out.println("@Test-bTest");
  }
  @Test(priority = 0)
  public void dTest() {
	  System.out.println("@Test-dTest");
	  Assert.assertEquals("5","6");
  }
  @Test(priority = 2)
  public void aTest() {
	  System.out.println("@Test-aTest");
	  
  }
  @BeforeTest
  public void BeforeTest() {
	  System.out.println("@BeforeTest-BeforeTest");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest-afterTest");
  }
  @BeforeClass
  public void BeforeClass() {
	  System.out.println("@BeforeClass-BeforeClass");
  }
  /*
@BeforeTest-BeforeTest
@BeforeClass-BeforeClass
@Test-cTest
@Test-dTest
@Test-bTest
@Test-aTest
@AfterTest-afterTest
PASSED: cTest
PASSED: dTest
PASSED: bTest
PASSED: aTest
   */

}

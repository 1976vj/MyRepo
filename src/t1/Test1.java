package t1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
  @BeforeTest
 public void aBeforetest() {
	  
	  System.out.println("@BeforeTest-aBeforetest");
  }
  @AfterTest
  public void cAftertest() {
 	  
 	  System.out.println("@AfterTest-cAftertest");
   }
  @AfterTest
  public void aAftertest() {
 	  
 	  System.out.println("@AfterTest-aAftertest");
   }
  
  @Test
  public void c() {
	  
	  System.out.println("@Test-c");
  }
  @Test
  public void b() {
	  
	  System.out.println("@Test-b");
	  
  }
   @BeforeMethod
public void aBeforeMethod() {
	  
	  System.out.println("@BeforeMethod-aBeforeMethod");
  }
  @AfterMethod
public void cAfterMethod() {
	  System.out.println("@AfterMethod-cAfterMethod");
  }
  @BeforeClass
public void cBeforeClass() {
	 
	  System.out.println("@BeforeClass-cBeforeClass");
  }
  @AfterClass
public void cAfterClass() {
	  
	  System.out.println("@AfterClass-cAfterClass");
  }
  
  /*
@BeforeTest-aBeforetest
@BeforeClass-cBeforeClass
@BeforeMethod-aBeforeMethod
@Test-b
@AfterMethod-cAfterMethod
@BeforeMethod-aBeforeMethod
@Test-c
@AfterMethod-cAfterMethod
@AfterClass-cAfterClass
@AfterTest-aAftertest
@AfterTest-cAftertest
PASSED: b
PASSED: c
   */
}

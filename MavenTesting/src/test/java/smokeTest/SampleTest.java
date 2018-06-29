package smokeTest;

import org.testng.annotations.Test;

import utilities.CommanUtilities;

public class SampleTest {
  @Test
  public void f() {
	  
	  
	  CommanUtilities.getCurrentDate();
	  CommanUtilities.getCurrentTime();
	  for(int i=1;i<=25;i++)
	  {
	  System.out.println(CommanUtilities.getRandomEmail());
	  }
	  
	 
  }
}

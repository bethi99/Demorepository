package testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBoxDemo1 
{
	  @Test
    public void CheckBoxDemo1Displayed() throws InterruptedException 
    {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\subbu selenium\\chromedriver_win32 (2)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	    
    WebElement CheckBox3G= driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
	 boolean actualCheckBox3GIsDisplayed=CheckBox3G.isDisplayed();
	
	
	 
//	  SoftAssert sAssert = new SoftAssert();
	
//	   sAssert.assertTrue(actualCheckBox3GIsDisplayed);
	  
	    
//   	    sAssert.assertTrue(actualCheckBox3GIsDisplayed);
//	    System.out.println("CheckBox1 is not Displayed");
	    Assert.assertEquals(true, actualCheckBox3GIsDisplayed,"checkbox is not Displayed");
	    System.out.println("CheckBoxDemo1 is Displayed");
	    boolean actualCheckBox3GIsEnable=CheckBox3G.isEnabled();
	    Assert.assertEquals(true, actualCheckBox3GIsEnable,"checkbox is not Enable");
	    System.out.println("CheckBoxDemo1 is Enable");
	    CheckBox3G.click();
		 Thread.sleep(10000);
		 boolean actualCheckBox3GIsSelected=CheckBox3G.isSelected();
	    Assert.assertEquals(actualCheckBox3GIsSelected, true,"checkbox is not seleted");
	    System.out.println("CheckBoxDemo1 is seleted");
	    
	    
	    
	    driver.quit();
    
    }    
	
}


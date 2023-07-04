package homepage;
/*1. create class "TopMenuTest"


2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
2.1 Mouse hover on “Laptops & Notebooks” Tab and click
2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
2.3 Verify the text ‘Laptops & Notebooks’
3. verifyUserShouldNavigateToComponentsPageSuccessfully()
3.1 Mouse hover on “Components” Tab and click
3.2 call selectMenu method and pass the menu = “Show All Components”
3.3 Verify the text ‘Components’
*/

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
  String baseUrl ="http://tutorialsninja.com/demo/index.php?";
 // 1.1 create method with name "selectMenu" it has one parameter name "menu" of type String

//1.2 This method should click on the menu whatever name is passed as parameter.
    public void selectMenu(String  menu){

clickOnElement(By.name(menu));
    }
  @Before
  public void setUrl(){
   openBrowser(baseUrl);

  }

  @Test
 public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
//Write the following Test:
//1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
      System.out.println(getTextFromElement(By.xpath("//li[[@class='dropdown-toggle']//a[text()='Desktops']")));
//1.1 Mouse hover on “Desktops” Tab and click
      mouseHoveronelement(By.xpath("//li[[@class='dropdown-toggle']//a[text()='Desktops']"));

//1.2 call selectMenu method and pass the menu = “Show All Desktops”
      System.out.println("Show All Desktops”");
      mouseHover(By.xpath("//li[[@class='dropdown-toggle']//a[text()='Desktops']"),By.xpath("//a[contains(text(),'Show AllDesktops')]"));
//1.3 Verify the text ‘Desktops’
      String expected ="Desktops";
      String actual =getTextFromElement(By.xpath("//li[[@class='dropdown-toggle']//a[text()='Desktops']"));
      Assert.assertEquals("Both text are equal",expected,actual);
  }

  @Test
  public void  verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
   //2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()

      String expected ="Laptops & Notebooks";
     driver.findElement(By.xpath("//li[@class='dropdown']//a[text()='Laptops & Notebooks']")).getText();
      String actual=driver.getCurrentUrl();
      System.out.println(actual);
     // Assert.assertEquals("Both text ar eequal",expected,actual);

      //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
      mouseHoveronelement(By.xpath("//li[@class='dropdown']//a[text()='Laptops & Notebooks']"));

      //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
      selectMenu("Show All Laptops & Notebooks");
      //2.3 Verify the text ‘Laptops & Notebooks’
      String expected1="Laptops & Notebooks";
     String actual1 = getTextFromElement(By.xpath("//li[@class='dropdown']//a[text()='Laptops & Notebooks']"));
     Assert.assertEquals("Both text are equal",expected,actual);

  }

  @Test
  public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
      //3. verifyUserShouldNavigateToComponentsPageSuccessfully()
      //3.1 Mouse hover on “Components” Tab and click
      mouseHoveronelement(By.xpath("//li[@class='dropdown']//a[text()='Components']"));

      //3.2 call selectMenu method and pass the menu = “Show All Components”
      selectMenu("Show All Components");
      //3.3 Verify the text ‘Components’
  }
  @After
 public void tearbrowser(){
   closeBrowser();
  }
}

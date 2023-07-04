package desktops;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

//1. Create class “DesktopsTest”
public class DesktopsTest extends Utility {
    String baseUrl="http://tutorialsninja.com/demo/index.php?";
    @Before
    public void setUrl(){
        openBrowser(baseUrl);
    }
    @Test//Write the following Test:
    //1.Test name verifyProductArrangeInAlphaBaticalOrder()
    public void verifyProductArrangeInAlphaBaticalOrder() {
        //1.1 Mouse hover on Desktops Tab.and click
      //  mouseHover(By.xpath("li[[@class='dropdown-toggle']//a[text()='Desktops']"));
        clickOnElement(By.xpath(""));

        //1.2 Click on “Show All Desktops”
        clickOnElement(By.xpath("//a[contains(text(),'Show AllDesktops')]"));

        //1.3 Select Sort By position "Name: Z to A"
        System.out.println(getTextFromElement(By.name("Name: Z to A")));
        //1.4 Verify the Product will arrange in Descending order.

    }

    @Test//2. Test name verifyProductAddedToShoppingCartSuccessFully()
    public void verifyProductAddedToShoppingCartSuccessFully() {
        //2.1 Mouse hover on Desktops Tab. and click
        mouseHoveronelement(By.xpath("li[[@class='dropdown-toggle']//a[text()='Desktops']"));
        //2.2 Click on “Show All Desktops”
        clickOnElement(By.xpath("//a[contains(text(),'Show AllDesktops')]"));
        //2.3 Select Sort By position "Name: A to Z"

        //2.4 Select product “HP LP3065”
        //2.5 Verify the Text "HP LP3065"
        //2.6 Select Delivery Date "2022-11-30"
        //
        //2.7.Enter Qty "1” using Select class.
        //2.8 Click on “Add to Cart” button
        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        //2.10 Click on link “shopping cart” display into success message
        //2.11 Verify the text "Shopping Cart"
        //2.12 Verify the Product name "HP LP3065"
        //2.13 Verify the Delivery Date "2022-11-30"
        //2.14 Verify the Model "Product21"
        //2.15 Verify the Todat "£74.73"

    }
    //● Create package laptopsandnotebooks
    //Create the class LaptopsAndNotebooksTest
    //Write the following test
    //1. Test name verifyProductsPriceDisplayHighToLowSuccessfully()
    //1.1 Mouse hover on Laptops & Notebooks Tab.and click
    //1.2 Click on “Show All Laptops & Notebooks”
    //1.3 Select Sort By "Price (High > Low)"
    //1.4 Verify the Product price will arrange in High to Low order.
    //2. Test name verifyThatUserPlaceOrderSuccessfully()
    //2.1 Mouse hover on Laptops & Notebooks Tab and click
    //2.2 Click on “Show All Laptops & Notebooks”
    //2.3 Select Sort By "Price (High > Low)"
    //2.4 Select Product “MacBook”
    //2.5 Verify the text “MacBook”
    //2.6 Click on ‘Add To Cart’ button
    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    //2.8 Click on link “shopping cart” display into success message
    //2.9 Verify the text "Shopping Cart"
    //2.10 Verify the Product name "MacBook"
    //2.11 Change Quantity "2"
    //2.12 Click on “Update” Tab
    //2.13 Verify the message “Success: You have modified your shopping cart!”
    //2.14 Verify the Total £737.45
    //2.15 Click on “Checkout” button
    //2.16 Verify the text “Checkout”
    //2.17 Verify the Text “New Customer”
    //2.18 Click on “Guest Checkout” radio button
    //2.19 Click on “Continue” tab
    //2.20 Fill the mandatory fields
    //2.21 Click on “Continue” Button
    //2.22 Add Comments About your order into text area
    //2.23 Check the Terms & Conditions check box
    //2.24 Click on “Continue” button
    //2.25 Verify the message “Warning: Payment method required!”
    //


    @After
    public void teardownBrowser(){
        closeBrowser();
    }
}
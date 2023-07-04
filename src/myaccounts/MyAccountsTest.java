package myaccounts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

/**
 * Create the class MyAccountsTest*/


    public class MyAccountsTest extends Utility {
        String baseUrl = "http://tutorialsninja.com/demo/index.php?";

        @Before
        public void setup() {

            openBrowser(baseUrl);
        }

        public void selectMyAccountOptions(String options)  {
            List<WebElement> option = driver.findElements(By.xpath("//nav[@id='top']"));
            clickOnElement(By.linkText(options));

        }


        @Test
        public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
            //1.1 Click on My Account Link.
            clickOnElement(By.xpath("//span[contains(text(),'My Account')]"));
            Thread.sleep(1000);
            //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
            selectMyAccountOptions("Register");
            Thread.sleep(1000);
            //1.3 Verify the text “Register Account”.
            verifyText(By.xpath("//h1[contains(text(),'Register Account')]"), "Register Account");
        }

        @Test
        public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
            //2.1 Click on My Account Link.
            clickOnElement(By.xpath("//span[contains(text(),'My Account')]"));
            Thread.sleep(1000);
            //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
            selectMyAccountOptions("Login");
            Thread.sleep(1000);
            //2.3 Verify the text “Returning Customer”.
            verifyText(By.xpath("//h2[contains(text(),'Returning Customer')]"), "Returning Customer");
            Thread.sleep(1000);
        }

        @Test
        public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
            //3.1 Click on My Account Link.
            clickOnElement(By.xpath("//span[contains(text(),'My Account')]"));
            Thread.sleep(1000);
            //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
            selectMyAccountOptions("Register");
            Thread.sleep(1000);
            //3.3 Enter First Name
            sendTextToElement(By.xpath("//input[@id='input-firstname']"), "nina");
            Thread.sleep(1000);
            //3.4 Enter Last Name
            sendTextToElement(By.xpath("//input[@id='input-lastname']"), "Mehta");
            Thread.sleep(1000);
            //3.5 Enter Email
            sendTextToElement(By.xpath("//input[@id='input-email']"), "ngjoshi@gmail.com");
            Thread.sleep(1000);
            //3.6 Enter Telephone
            sendTextToElement(By.xpath("//input[@id='input-telephone']"), "02696766");
            Thread.sleep(1000);
            //3.7 Enter Password
            sendTextToElement(By.xpath("//input[@id='input-password']"), "ninamehta123");
            Thread.sleep(1000);
            //3.8 Enter Password Confirm
            sendTextToElement(By.xpath("//input[@id='input-confirm']"),"ninamehta123");
            Thread.sleep(1000);
            //3.9 Select Subscribe Yes radio button
            clickOnElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]"));
            Thread.sleep(1000);
            //3.10 Click on Privacy Policy check box
            clickOnElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
            Thread.sleep(1000);
            //3.11 Click on Continue button
            clickOnElement(By.xpath("//input[@value ='Continue']"));
            Thread.sleep(1000);
            //3.12 Verify the message “Your Account Has Been Created!”
            verifyText(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"), "Your Account Has Been Created!");
            Thread.sleep(1000);
            //3.13 Click on Continue button
            clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
            Thread.sleep(1000);
            //3.14 Click on My Account Link.
            clickOnElement(By.xpath("//span[contains(text(),'My Account')]"));
            Thread.sleep(1000);
            //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
            selectMyAccountOptions("Logout");
            Thread.sleep(1000);
            //3.16 Verify the text “Account Logout”
            verifyText(By.xpath("//h1[contains(text(),'Account Logout')]"), "Account Logout");
            Thread.sleep(1000);
            //3.17 Click on Continue button
            clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
            Thread.sleep(1000);
        }

        @Test
        public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
            //4.1 Click on My Account Link.
            clickOnElement(By.xpath("//span[contains(text(),'My Account')]"));
            Thread.sleep(1000);
            //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
            selectMyAccountOptions("Login");
            Thread.sleep(1000);
            //4.3 Enter Email address
            sendTextToElement(By.xpath("//input[@id='input-email']"), "ngjoshi@gmail.com");
            Thread.sleep(1000);
            //4.4 Enter Password
            sendTextToElement(By.xpath("//input[@id='input-password']"), "ninamehra123");
            Thread.sleep(1000);
            //4.6 Click on Login button
            clickOnElement(By.xpath("//input[@value='Login']"));
            Thread.sleep(1000);
            //4.7 Verify text “My Account”
            verifyText(By.xpath("//h2[contains(text(),'My Account')]"), "My Account");
            Thread.sleep(1000);
            //4.8 Click on My Account Link.
            clickOnElement(By.xpath("//span[contains(text(),'My Account')]"));
            Thread.sleep(1000);
            //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
            selectMyAccountOptions("Logout");
            Thread.sleep(1000);
            //4.10 Verify the text “Account Logout”
            verifyText(By.xpath("//h1[contains(text(),'Account Logout')]"), "Account Logout");
            Thread.sleep(1000);
            //4.11 Click on Continue button
            clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
            Thread.sleep(1000);
        }

        @After
        public void tearDown() {
            closeBrowser();
        }

    }


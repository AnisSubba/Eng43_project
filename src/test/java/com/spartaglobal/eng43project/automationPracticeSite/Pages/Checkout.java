package com.spartaglobal.eng43project.automationPracticeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {

    private WebDriver driver;
    private String checkoutUrl = "http://automationpractice.com/index.php";
    private By addressUpdateButton = By.cssSelector("#address_delivery > li.address_update > a");
    private By addressDropDown = By.id("id_address_delivery");
    private By dropDownHomeAddress = By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/div[1]/div[1]/div/div/select/option[2]");

    private By billingUpdateButton = By.cssSelector("#address_invoice > li.address_update > a");

    private By addNewAddressButton = By.xpath("//*[@id=\"center_column\"]/form/div/p/a");

    private By saveAddressChanges = By.id("submitAddress");

    private By proceedToCheckoutButtonInAddress = By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span");
    private By proceedToCheckoutButtonInShipping = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span");
    private By tcCheckbox = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input");
    private By commentBox = By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/div[3]/textarea");

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public Checkout goToCheckoutURL() {
        driver.navigate().to(checkoutUrl);
        return this;
    }

    public Checkout clickDeliveryAddressUpdateButton(){
        driver.findElement(addressUpdateButton).click();
        return this;
    }



    public Checkout clickDropDownMenu(){

        driver.findElement(addressDropDown).click();


        return this;

    }

    public Checkout selectAddressFromDropDown(){
        driver.findElement(dropDownHomeAddress).click();
        return this;
    }


    public Checkout clickBillingUpdateButton(){
        driver.findElement(billingUpdateButton).click();
        return this;
    }

    public Checkout clickAddNewAddressButton() {
        driver.findElement(addNewAddressButton).click();
        return this;
    }

    public Checkout clickSaveAddressButton(){
        driver.findElement(saveAddressChanges).click();
        return this;
    }

    public Checkout clickProceedToCheckoutAddress()
    {
        driver.findElement(proceedToCheckoutButtonInAddress).click();
        return this;
    }

    public Checkout fillInCommentBox(){
        driver.findElement(commentBox).sendKeys("What is my name?");
        return this;
    }

    public Checkout clickProceedToCheckoutShipping()
    {
        driver.findElement(proceedToCheckoutButtonInShipping).click();
        return this;
    }

    public Checkout agreeTermsConditions(){
        driver.findElement(tcCheckbox).click();
        return this;
    }



}

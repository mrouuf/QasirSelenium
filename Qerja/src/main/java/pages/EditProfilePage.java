package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditProfilePage {

    private WebDriver driver;

    //sign in page element
    private By phoneNumberField = By.id("sign-in-phonenumber");
    private By passwordField = By.id("password");
    private By loginButton = By.id("submit-btn-signin");

    //chose outlet page element
    private By selectOutletBox = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div[4]/div/div[1]/div");

    //dashboard page element
    private By accountButton = By.xpath("/html/body/div[4]/div[1]/div/div/ul[1]/li/a");
    private By profileButton = By.xpath("/html/body/div[4]/div[1]/div/div/ul[1]/li/ul/li[3]/a");

    //profile page element
    private By firstNameField = By.name("first_name");
    private By lastNameField = By.name("last_name");
    private By simpanButton = By.xpath("/html/body/main/div/div[3]/form/div[2]/div[2]/div[4]/div/div/button");

    public EditProfilePage(WebDriver driver){
        this.driver = driver;
    }

    public void setPhoneNumber(String phonenumber){
        driver.findElement(phoneNumberField).sendKeys(phonenumber);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn(){
        driver.findElement(loginButton).click();
    }

    public void clickOutlet(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(selectOutletBox));
        driver.findElement(selectOutletBox).click();
    }

    public void clickAccountButton(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(accountButton));
        driver.findElement(accountButton).click();
        driver.findElement(profileButton).click();
    }

    public void editProfile(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));

        driver.findElement(firstNameField).sendKeys("muhamad");
        driver.findElement(lastNameField).sendKeys("edited by rouuf");
        driver.findElement(simpanButton).click();
    }


}

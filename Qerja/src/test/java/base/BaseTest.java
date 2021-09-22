package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.EditProfilePage;

public class BaseTest {

    private WebDriver driver;
    protected EditProfilePage editProfilePage;


    @BeforeClass
    public void setUp() {
        //you need to change the location for the chromedriver.exe
        System.setProperty("webdriver.chrome.driver","C:\\Users\\syiha\\IdeaProjects\\Qerja\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.qasir.id/sign-in");
        driver.manage().window().maximize();

        editProfilePage = new EditProfilePage(driver);

    }

    //if you want to quit the browser after the test is done, you can uncomment statement inside tearDown method
    @AfterClass
    public void tearDown() {
        //driver.quit();
    }

}

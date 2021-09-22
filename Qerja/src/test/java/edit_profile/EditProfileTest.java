package edit_profile;

import base.BaseTest;
import org.testng.annotations.Test;


public class EditProfileTest extends BaseTest {

    @Test
    public void successfulSignIn(){
        editProfilePage.setPhoneNumber("85894935298");
        editProfilePage.setPassword("123456");
        editProfilePage.clickSignIn();
    }

    @Test(dependsOnMethods = "successfulSignIn")
    public void choseOutlet(){
        editProfilePage.clickOutlet();
    }

    @Test(dependsOnMethods = "choseOutlet")
    public void clickButtonAccount(){
        editProfilePage.clickAccountButton();
    }

    @Test(dependsOnMethods = "clickButtonAccount")
    public void editProfile(){
        editProfilePage.editProfile();

    }

}

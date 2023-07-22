package tests;

import org.testng.annotations.Test;
import pages.FirstPage;
import pages.LoginPage;

public class FirstPageTest extends BaseTest{

    @Test(groups = {"Regression"})
    public void verifyJanuaryMonthDropdown(){
        FirstPage firstPage = new FirstPage();
        firstPage.selectMonth("Mar");
    }

//    @Test
//    public void verifyFebruaryMonthDropdown(){
//        FirstPage firstPage = new FirstPage();
//        firstPage.selectMonth("Feb");
//    }

}

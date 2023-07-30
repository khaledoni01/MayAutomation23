package testngTests;

import org.testng.annotations.Test;
import pages.FirstPage;

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

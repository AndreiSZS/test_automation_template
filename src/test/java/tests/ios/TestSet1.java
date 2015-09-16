package tests.ios;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.Console;

/**
 * Created by andrei.yermakovich on 15-09-15.
 */
public class TestSet1 {

    @BeforeMethod(alwaysRun = true)
    public void beforeClass() {
        System.out.println("IOS:TestSet1:BeforeMethod");
    }

    @AfterMethod(alwaysRun = true)
    public void afterClass(){
        System.out.println("IOS:TestSet1:AfterMethod");
    }

    @Test(groups = {"IOS_UI", "Name_IOS_Name1"})
    public void testMethod1(){
        System.out.println("IOS:TestSet1:testMethod1");
    }

}

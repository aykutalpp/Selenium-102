import base.BasePage;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class MyListener extends BasePage implements ITestListener {
    //ctrl+alt+l is a shortcut to format lines

    public MyListener() throws IOException {
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test succeed.");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("========= Test Name = " + result.getName() + " =========");
    }

    public void onTestFailure(ITestResult result) {
        try {
            takeSnapShot(driver);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test failed and screenshot saved.");
    }


}

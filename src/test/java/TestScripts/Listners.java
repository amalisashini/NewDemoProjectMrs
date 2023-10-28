package TestScripts;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

    public void onTestStart(ITestResult result) {

        System.out.println("Test started "+result.getName());

    }

    public void onTestSuccess(ITestResult result) {

        System.out.println("Test is successfully executed "+result.getName());

    }

    public void onTestFailure(ITestResult result) {

        System.out.println("Test is failed "+result.getName());

    }

    public void onTestSkipped(ITestResult result) {

        System.out.println("Test is skipped "+result.getName());

    }

}

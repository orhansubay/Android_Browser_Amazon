package step;

import utilities.MyScreenRecorder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setUp() throws Exception {
        //Maximize current window
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Record evey test case
        //MyScreenRecorder.startRecord("amazon-test-record");
    }

    //close the browser after test cases are executed
    @After
    public void tearDown(Scenario scenario) throws Exception {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image.png", "screenshot");
        }
        Thread.sleep(3000);
        Driver.closeDriver();
        MyScreenRecorder.stopRecord();
    }
}

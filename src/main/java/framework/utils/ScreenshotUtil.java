package framework.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenshotUtil {

    public static void capture(WebDriver driver, String testName) {
        try {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            Path screenshotDir = Paths.get("target/screenshots");
            Files.createDirectories(screenshotDir);

            Path screenshotFile = screenshotDir.resolve(testName + ".png");
            Files.write(screenshotFile, screenshotBytes);

            System.out.println("[ScreenshotUtil] Saved screenshot: " + screenshotFile.toAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
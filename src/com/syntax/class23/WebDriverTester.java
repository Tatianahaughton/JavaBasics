package com.syntax.class23;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] webDrivers={new ChromeDriver(), new FireFox()};
        for(WebDriver webDriver:webDrivers){
            webDriver.openBrowser();
            webDriver.closeBrowser();
            webDriver.maximizeWindow();
            webDriver.findElement();
        }
    }
}

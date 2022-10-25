package groupProject2;

public class WebDriverTest {
    public static void main(String[] args) {

        RemoteWebDriver[] webdrivers = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
        for (RemoteWebDriver driver : webdrivers) {
            driver.open();
            driver.close();
            driver.getTitle();
            //driver.getScreenshot();
            driver.navigate();
        }

        ChromeDriver ch = new ChromeDriver();//only chrome obj can get this method
        ch.getScreenshot();


    }
}

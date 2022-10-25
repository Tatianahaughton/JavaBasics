package groupProject2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends WebDriver {
    void navigate();
}

interface TakesScreenshot extends RemoteWebDriver {
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver {
    public void open() {
        System.out.println("Opening ChromeDriver");
    }

    public void close() {
        System.out.println("Closing ChromeDriver");
    }
    public String getTitle() {
        String title = "Chrome";
        return title;
    }
    public void getScreenshot() {
        System.out.println("Screenshot on ChromeDrver");
    }
    public void navigate() {
        System.out.println("chrome navigating");
    }
}

    class FireFoxDriver implements RemoteWebDriver {
        public void open() {
            System.out.println("Opening FireFoxDriver");
        }

        public void close() {
            System.out.println("Closing FireFoxDriver");
        }

        public String getTitle() {
            String title = "Chrome";
            return title;
        }

        public void getScreenshot() {
            System.out.println("Screenshot on FireFoxDriver");
        }

        public void navigate() {
            System.out.println("FireFoxDriver navigating");
        }
    }


        class SafariDriver implements RemoteWebDriver {
            public void open() {
                System.out.println("Opening SafariDriver");
            }

            public void close() {
                System.out.println("Closing SafariDriver");
            }

            public String getTitle() {
                String title = "Safari";
                return title;
            }

            public void getScreenshot() {
                System.out.println("Screenshot on SafariDriver");
            }

            public void navigate() {
                System.out.println("SafariDriver navigating");
            }
        }





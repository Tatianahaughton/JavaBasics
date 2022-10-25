package com.syntax.class21;

public class Browser {

    void openBrowser() {
        System.out.println("Opening a browser");
    }
    void navigate() {
        System.out.println("opening the url");
    }
    void test() {
        System.out.println("Testing teh webpage");
    }
    void closeBrowser() {
        System.out.println("Closing the browser");
    }
}

class Chrome extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("opening the browser in less thatn 1 sec");//overriding method
    }
}

class Firefox {
    void openBrowser() {
        System.out.println("opening Firefox browser in less than 2 sec");
    }
}

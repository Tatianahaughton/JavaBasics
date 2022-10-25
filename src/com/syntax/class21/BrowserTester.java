package com.syntax.class21;

public class BrowserTester {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.openBrowser();//using method inside Chrome class
        chrome.closeBrowser();//using it from parent class where it exists

        Firefox fire=new Firefox();
        fire.openBrowser();
    }
}

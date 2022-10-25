package com.syntax.class23;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void  findElement();
}
class ChromeDriver implements WebDriver {
    public void openBrowser() {
        System.out.println("Opening Chrome");
    }
    public void closeBrowser() {
        System.out.println("Closing Chrome");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window on Chrome");
    }
    public void findElement() {
        System.out.println("Finding element in Chrome");
    }
}
class FireFox implements WebDriver {
    public void openBrowser() {
        System.out.println("Opening FireFox");
    }
        public void closeBrowser() {
            System.out.println("Closing FireFox");
        }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window on FireFox");
    }
    public void findElement() {
        System.out.println("Finding element in FireFox");
    }
}
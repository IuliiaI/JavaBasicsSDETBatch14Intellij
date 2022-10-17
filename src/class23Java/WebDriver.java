package class23Java;
public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Window in Chrome browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in Chrome browser");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Window in Firefox browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in Firefox browser");
    }
}
package class23Java;
public class HW2 {
    /*     Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(), maximizeWindow(), findElement().
     Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
          */
    public static void main(String[] args) {
        WebDriver[] webdrivers={new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver w:webdrivers){
            w.openBrowser();
            w.closeBrowser();
            w.maximizeWindow();
            w.findElement();
        }
    }
}

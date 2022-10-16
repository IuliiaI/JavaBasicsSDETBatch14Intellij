package class22Java;

public class WebDriverTester {
    public static void main(String[] args) {
        /*Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();

        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.closeBrowser();*/

        /*Safari safari=new Safari();
        Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        WebDriver[] browsers={Chrome,FireFox(),Safari()};*/

        //creating objects of all Child classes and storing them in our array of type Webdriver we can do this
        //because upcasting allows us to do it

        WebDriver[] browsers={new Chrome(),new FireFox(),new Safari()};
        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }
        for(int i=0;i< browsers.length;i++){
            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();
        }
    }
}

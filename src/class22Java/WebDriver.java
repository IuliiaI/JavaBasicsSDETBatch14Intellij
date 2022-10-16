package class22Java;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the Browser");
    }
    public void test(){
        System.out.println("Perform the testing");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
    class Chrome extends WebDriver{
        public void startBrowser(){
            System.out.println("Starting the Google Chrome");
        }
        public void test(){
            System.out.println("Perform the Google Chrome");
        }
        public void closeBrowser(){
            System.out.println("Closing the Google Chrome");
        }
}
class FireFox extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the FireFox");
    }
    public void test(){
        System.out.println("Perform the  FireFox");
    }
    public void closeBrowser(){
        System.out.println("Closing the  FireFox");
    }
}
class Safari extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Safari");
    }
    public void test(){
        System.out.println("Perform the  Safari");
    }
    public void closeBrowser(){
        System.out.println("Closing the  Safari");
    }
}
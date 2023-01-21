package week19_01_14_2023.selenium_drivers;

public class RemoteWebDriver implements JavaScriptExecutor,TakeScreenShot,WebDriver{

    @Override
    public void executeScript(String script) {
        System.out.println("I will execute that " + script);
    }


    @Override
    public String getScreenshotAs() {
        return "PNG";
    }

    @Override
    public void get(String url) {
        System.out.println("open the " +url +" in " +getClass().getSimpleName());
    }

    @Override
    public void close() {
        System.out.println("CLOSE the " +getClass().getSimpleName());
    }

    @Override
    public void quit() {
        System.out.println("QUIT the " +getClass().getSimpleName());
    }


}

package class23Project;

import Class23.ChromeDriver;
import Class23.WebDriver;

public class Diagram {


    class Main {
        public static void main(String[] args) {
            // set path to chromedriver exe file
            String path = "/path/to/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", path);
            // create ChromeDriver object
            WebDriver driver = new ChromeDriver();
            // navigate to website
            driver.get("https://www.google.com");
            // print page title
            System.out.println(driver.getTitle());
            // close browser
            driver.quit();
        }
    }

}

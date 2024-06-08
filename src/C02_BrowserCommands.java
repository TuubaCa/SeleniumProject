import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class C02_BrowserCommands {
    /*
→Create main method
→Set Path
→Create chrome driver
→Open google home page:https://www.google.com
→Get Title on page
→Get Current URLon page
→Close/Quit the browser
     */


    public static void main(String[] args) {

// →Set Path (bu kullanilan bir meth degil bunu sil yok et hatirlama!)
  System.setProperty("webdriver.chrome.driver", "/Users/tubakara/IdeaProjects/SeleniumProject/Drivers/chromedriver");
//→Create chrome driver
        WebDriver driver = new ChromeDriver();
// →Open google home page:https://www.clarusway.com
        driver.get("https://www.clarusway.com");
// →Get Title on page
         String title = driver.getTitle();
         System.out.println("title = " + title);
// →Get Current URLon page
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

// →Close/Quit the browser
        driver.quit();






    }




    }












import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {
    /*
    Invoke Chrome Browser
    Navigate to URL:https://clarusway.com/
    Navigate to URL: http://google.com/
    Come back to the Clarusway using the back command.
    Again go back to the Google website using forward command
    Refresh the Browser using refresh command.
    Close the Browser.
 */
    public static void main(String[] args) throws InterruptedException {

//        Invoke Chrome Browser
        WebDriver driver = new ChromeDriver();

//       Navigate to URL:https://clarusway.com/
        driver.get("https://clarusway.com/");

//        Navigate to URL:"http://google.com/"
        driver.navigate().to("http://google.com/");// Bu yontem mevcut tarayici penceresine yeni bir web sayfasi yukler.get() komutu ile calisir.

//        //Come back to the Clarusway using the back command.
        driver.navigate().back();//back methodu onceki sayfaya doner.
        Thread.sleep(3000); //3000 millis yani 3 saniye bekler anlaminda!

//        //Again go back to the Google website using forward command

        driver.navigate().forward();//Bu yontem web tarayicisinin mevcut tarayici penceresindeki ileri dugmesine tiklamayi saglar
        Thread.sleep(3000); //3000 millis yani 3 saniye bekler anlaminda!

//        //Refresh the Browser using refresh command.
        driver.navigate().refresh();
        Thread.sleep(3000);

//        //Close the Browser.
        driver.quit();




    }

}

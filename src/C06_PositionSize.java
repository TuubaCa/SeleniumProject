import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_PositionSize {
    /*
         Go to the Google URL : https://www.google.com/
         Print the position and size of the page.
         Adjust the position and size of the page as desired.
         Test that the page is in the position and size you want.
         Close the page.
    */
    public static void main(String[] args) throws InterruptedException {

//        Maximize the window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//         Go to the Clarusway URL : https://www.google.com/
        driver.get("https://www.google.com/");

//         Print the position and size of the page.
        Point position = driver.manage().window().getPosition();
        Dimension size = driver.manage().window().getSize();
        System.out.println("position = " + position);
        System.out.println("size = " + size);

//         Adjust the position and size of the page as desired.
        Point newPoint = new Point(100, 100);
        Dimension newDimension = new Dimension(600, 300);

        driver.manage().window().setPosition(newPoint);
        driver.manage().window().setSize(newDimension);

//         Test that the page is in the position and size you want.
//         Close the page.
        Thread.sleep(3000);
        driver.quit();




    }
}
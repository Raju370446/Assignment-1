package goibibo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/superaxis/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        Thread.sleep(5000);

        WebElement clickFlights = driver.findElement(By.xpath("//a[@data-decider-header=\"flights\"]/span/following-sibling::span"));
        clickFlights.click();

        WebElement clickOneWay = driver.findElement(By.xpath("//input[@value=\"1\"]/parent::div"));
        clickOneWay.click();

        WebElement from = driver.findElement(By.xpath("//div[@class=\"css-hm3w49\"]"));
        from.click();
        Thread.sleep(1000);

        WebElement removeSelectedCity = driver.findElement(By.xpath("//input[@class=\"css-bwf0ll\"]"));
        removeSelectedCity.click();
        Thread.sleep(1000);

        WebElement enterFromCity = driver.findElement(By.xpath("//input[@class=\"css-1tl2oa1\"]"));
        enterFromCity.sendKeys("Mumbai");
        Thread.sleep(1000);
        enterFromCity.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        enterFromCity.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(("//span[text()=\"BOM\"]/parent::div"))).click();

        WebElement To= driver.findElement(By.xpath("//input[@class=\"css-g0pg3f-SearchboxInput\"]"));
        To.click();

        WebElement enterToCity = driver.findElement(By.xpath("//input[@placeholder=\"Where to?\"]/parent::div[@class=\"css-526oso\"]/input"));
        enterToCity.sendKeys("Delhi");
        Thread.sleep(1000);
        enterToCity.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()=\"DEL\"]/parent::div")).click();

        WebElement date = driver.findElement(By.xpath("//button[@aria-label=\"Depart\"]"));
        date.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class=\"Calendar-module__root___-ToJj\"]/button[1]")).click();

        WebElement selectDate = driver.findElement(By.xpath("//span[@aria-label=\"30 September 2022\"]/parent::td"));
        selectDate.click();
        Thread.sleep(1000);

        WebElement search = driver.findElement(By.xpath("//button[@class=\"css-ya5gr9 wide\"]"));
        search.click();
        Thread.sleep(3000);

        WebElement clickDate = driver.findElement(By.xpath("//input[@class=\"css-g0pg3f-SearchboxInput\"]"));
        clickDate.click();
        Thread.sleep(2000);

        WebElement modifyDate = driver.findElement(By.xpath("//span[@aria-label=\"1 October 2022\"]/parent::td"));
        modifyDate.click();
        Thread.sleep(1000);

        WebElement modifySearch = driver.findElement(By.xpath("//button[@class=\"css-ya5gr9 wide\"]"));
        modifySearch.click();
        Thread.sleep(3000);

        WebElement selectFirstFlight = driver.findElement(By.xpath("//div[@id=\"flightcard-0\"]/div/div/div/div/div/following-sibling::div/div/following-sibling::div/button"));
        selectFirstFlight.click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//label[@for=\"__bui-61\"]"));
        driver.findElement(By.xpath("//label[@for=\"__bui-90\"]"));
        driver.findElement(By.xpath("//label[@for=\"__bui-109\"]"));

       // WebElement button = driver.findElement(By.xpath("//label[@for=\"__bui-109\"]/parent::div/parent::div/parent::div/button/span"));
       // Actions action = new Actions(driver);
        // action.moveToElement(button).click();

        String s = driver.findElement(By.xpath("//div[@class=\"Text-module__root--variant-body_2___-3fYM css-ccdn7j\"]/parent::div[@class=\"css-1f10jkc\"]/div[2]"))
                .getText();
        System.out.println(s);









       /* driver.findElement(By.xpath("//div[@class=\"sc-bkkeKt gAqCbJ fswFld \"]/span[text()=\"From\"]")).click();
        WebElement from = driver.findElement(By.xpath("//div[@class=\"sc-cidDSM dOEpbS\"]/span/following-sibling::input"));
        from.sendKeys("Mumbai");
        Thread.sleep(3000);
        from.sendKeys(Keys.ENTER);


        WebElement to = driver.findElement(By.xpath("//div[@class=\"sc-cidDSM dOEpbS\"]/input"));
        to.sendKeys("Delhi");
        Thread.sleep(3000);
        to.sendKeys(Keys.ENTER);


        WebElement date = driver.findElement(By.xpath("//div[@aria-label=\"Thu Sep 29 2022\"]/p[text()=\"29\"]"));
        date.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()=\"Done\"]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@class=\"sc-dtMgUX daltrV\"]")).click();
        Thread.sleep(3000);

        WebElement search = driver.findElement(By.xpath("//span[@class=\"sc-fHeRUh jHgPBA\"]"));
        search.click();
        Thread.sleep(3000);

        WebElement modifyDate = driver.findElement(By.xpath("//input[@value=\"29 Sep '22\"]"));
        modifyDate.click();
        Thread.sleep(2000);

        WebElement selectDate = driver.findElement(By.xpath("//span[text()=\"30\"]"));
        selectDate.click();
        Thread.sleep(2000);

        WebElement updateSearch = driver.findElement(By.xpath("//button[text()=\"UPDATE SEARCH\"]"));
        updateSearch.click();
        Thread.sleep(2000);

        WebElement selectIndigo = driver.findElement(By.xpath("//span[@class=\"filtersstyles__CheckBox-sc-1hyeel5-19 bLcaWl\"]/following-sibling::span/span[text()=\"IndiGo\"]/parent::span/preceding-sibling::span"));
        selectIndigo.click();
        Thread.sleep(2000);*/

    }
}

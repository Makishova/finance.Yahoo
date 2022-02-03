import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.HashMap;
import java.util.Map;


public class finance {
@Test
public  void test() throws InterruptedException {

    WebDriver driver;
    Map <String,String>stockPrices =new HashMap<>();
    WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
    driver.get("https://www.finance.yahoo.com");

    WebElement searchBox= driver.findElement(By.xpath("//input[@id='yfin-usr-qry']"));
    searchBox.sendKeys("QCOM"+ Keys.RETURN);
    Thread.sleep(300);
    WebElement  qcom= driver.findElement(By.xpath("//*[@id='quote-header-info']//fin-streamer[@data-test='qsp-price']"));
    String qcomPrice= qcom.getAttribute("value");
    stockPrices.put("QCOM", qcomPrice);
    System.out.println("QCOM"+" "+ qcomPrice);

    searchBox= driver.findElement(By.xpath("//input[@id='yfin-usr-qry']"));
    searchBox.sendKeys("SWKS"+ Keys.RETURN);
    Thread.sleep(300);
    WebElement  swks= driver.findElement(By.xpath("//*[@id='quote-header-info']//fin-streamer[@data-test='qsp-price']"));
    String swksPrice= swks.getAttribute("value");
    stockPrices.put("SWKS", swksPrice);
    System.out.println("SWKS"+" "+ swksPrice);

    searchBox= driver.findElement(By.xpath("//input[@id='yfin-usr-qry']"));
    searchBox.sendKeys("QRVO"+ Keys.RETURN);
    Thread.sleep(300);
    WebElement  qrvo= driver.findElement(By.xpath("//*[@id='quote-header-info']//fin-streamer[@data-test='qsp-price']"));
    String qrvoprice= qrvo.getAttribute("value");
    stockPrices.put("QRVO", qrvoprice);
    System.out.println("QRVO"+" "+ qrvoprice);


    searchBox= driver.findElement(By.xpath("//input[@id='yfin-usr-qry']"));
    searchBox.sendKeys("KLAC"+ Keys.RETURN);
    Thread.sleep(300);
    WebElement klac  = driver.findElement(By.xpath("//*[@id='quote-header-info']//fin-streamer[@data-test='qsp-price']"));
    String klacprice= klac.getAttribute("value");
    stockPrices.put("KLAC", klacprice);
    System.out.println("KLAC"+" "+ klacprice);

    searchBox= driver.findElement(By.xpath("//input[@id='yfin-usr-qry']"));
    searchBox.sendKeys("ASML"+ Keys.RETURN);
    Thread.sleep(300);
    WebElement asml  = driver.findElement(By.xpath("//*[@id='quote-header-info']//fin-streamer[@data-test='qsp-price']"));
    String asmlprice= asml.getAttribute("value");
    stockPrices.put("ASML", asmlprice);
    System.out.println("ASML"+" "+ asmlprice);


    searchBox= driver.findElement(By.xpath("//input[@id='yfin-usr-qry']"));
    searchBox.sendKeys("ASM"+ Keys.RETURN);
    Thread.sleep(300);
    WebElement asm  = driver.findElement(By.xpath("//*[@id='quote-header-info']//fin-streamer[@data-test='qsp-price']"));
    String asmprice= asm.getAttribute("value");
    stockPrices.put("ASM", asmprice);
    System.out.println("ASM"+" "+ asmprice);


    for (String key: stockPrices.keySet()){
        Assert.assertEquals(stockPrices.get(key), "ExpectedPrice");  //We can change
                                                                            //ExpectedPrice with Other
                                                                            //Data for data validation
                                                                            //Currently hardcoded

    }




}
}

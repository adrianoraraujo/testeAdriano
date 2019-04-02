package br.ucsal.testes.adriano.testeSiteAdriano;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver;
		WebElement element;
		WebElement element2;
		

		WebElement email;

		WebElement button;
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		ChromeOptions chrome = new ChromeOptions();
		//chrome.setHeadless(false);
		driver = new ChromeDriver(chrome);

		driver.get("https://adrianoraraujo.herokuapp.com");
		element = driver.findElement(By.xpath("//*[@id=\"contact\"]/form/p[1]/input"));
		email = driver.findElement(By.name("entry.1166974658"));
element2 = driver.findElement(By.name("entry.839337160"));
		element.sendKeys("Vinicius");
		email.sendKeys("vinicius_gb@gmail.com");
		element2.sendKeys("Teste de mensagem");
		driver.findElement(By.xpath("//*[@id=\"contact\"]/form/p[4]/button")).click();
		
    }
}

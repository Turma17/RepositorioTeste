package automacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {
	
	WebDriver navegador;
	
fsdfadgdgdfgdfsgsfgf
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().window().maximize();	
		navegador.get("https://inter.co/");
		navegador.manage().window().maximize();
		navegador.findElement(By.xpath("//*[@id=\"my-scroll-container\"]/div[1]/div/div/div/div/div/button")).click();
		Thread.sleep(2000);
		navegador.findElement(By.id("nome")).sendKeys("Liz Alice Jesus");
		navegador.findElement(By.id("celular")).sendKeys("38022461");
		navegador.findElement(By.id("email")).sendKeys("liz.alice.jesus@uniube.br");
		navegador.findElement(By.id("cpf")).sendKeys("54164343923");
		navegador.findElement(By.id("dataNascimento")).sendKeys("19011989");
		Thread.sleep(5000);
		navegador.findElement(By.cssSelector("col-12 d-flex flex-column px-0 px-md-3")).click();
		navegador.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/form/div/div[7]/div[2]/button")).click();
	}
	

	@After
	public void tearDown() throws Exception {
		
		
	}

	@Test
	public void test() {
		
		
		fail("Not yet implemented");
	}

}

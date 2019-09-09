package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPages {

	static WebDriver driver;

	public CadastroPages(WebDriver driver) {
		this.driver = driver;		
		
	}
	
	public void preencherCampos(){
		WebElement nome = driver.findElement(By.name("firstName"));	
		nome.sendKeys("Bruno");
		
		WebElement snome = driver.findElement(By.name("lastName"));	
		snome.sendKeys("Cerdeira");
		
		WebElement email = driver.findElement(By.name("email"));	
		email.sendKeys("bcerdeirap@gmail.com");
		
		WebElement senha = driver.findElement(By.name("password"));	
		senha.sendKeys("12345678");
		
		WebElement confirmarsenha = driver.findElement(By.name("confirmPassword"));	
		confirmarsenha.sendKeys("12345678");
		
		//WebElement cpf = driver.findElement(By.name("cpf"));	
		//cpf.sendKeys("00000000000");
		
		WebElement rg = driver.findElement(By.name("rg"));	
		rg.sendKeys("12112221");
		
		WebElement dn = driver.findElement(By.name("dateOfBirth"));	
		dn.sendKeys("26041990");
		
		WebElement sexo = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[3]/form/fieldset[1]/div/label[1]"));	
		sexo.click();
		
		WebElement ddd = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[3]/form/fieldset[2]/div/div[1]/div/input"));	
		ddd.sendKeys("92");
		
		WebElement tel = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[3]/form/fieldset[2]/div/div[2]/div/input"));	
		tel.sendKeys("981207128");
		
		WebElement termo = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[3]/form/div[11]/label/span[2]/span"));	
		termo.click();
		
		WebElement criarconta = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[3]/form/div[12]/button[2]"));	
		criarconta.click();
		
				
	}
	
	public String validarMensagem(){
		
		return driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[3]/form/div[5]/span")).getText();
		

	}
	
	
}

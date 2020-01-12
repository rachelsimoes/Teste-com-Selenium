package rachelpackage;

import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/*para realizar os testes, é necessario instalar o Selenium, adicionar no projeto as lib, instalar o geckodriver, adicionar suas lib também*/
public class Teste1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		//estrutura de repetição, no caso o teste irá rodar 10 vezes
		int num = 1;
		while (num < 11) {
			
			//necessario o geckodriver para abrir os sites nos testes automatizados via selenium WebDriver
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
			// Criação de nova instancia do FirefoxDriver
			WebDriver driver = new FirefoxDriver();
			driver.get("https://pt.wikipedia.org/wiki/Wikip%C3%A9dia:P%C3%A1gina_principal");
			driver.manage().window().maximize();//maximizar a pagina
			System.out.println("Aplicação aberta com sucesso!");
			
			//Criação de evidencias de cada teste realizado
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Lourdes\\Desktop\\rachel"));

			Thread.sleep(5000);
			driver.quit();
			num++;
		}
	}
}

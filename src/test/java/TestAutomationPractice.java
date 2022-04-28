
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import actions.LoginAction;
import utils.Constants;
import utils.DriverContext;

class TestAutomationPractice {
	WebDriver driver;
	LoginAction account;

	@BeforeEach
	void setUp() throws Exception {

		System.setProperty("webdriver.chrome.drive", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		account = new LoginAction();

	}

	@Test
	
	void TestLogin() {
		
		account.clicarSignIn();
		account.preencherEmail("sandra_AccTeste@gmail.com");
		account.inserirPasswd("123456");
		account.clicarSign();
		account.clicarBtnHome();
		
		//Fluxo de Compra
		
		account.preencherBoxSeach("T-shirts");
		account.clicarBtnSearch();
		account.clicarCenter();
		account.clicarChangeQuant("10");
		account.clicarGroup();
		account.clicarColor();
		account.clicarBtnAddCart();
		account.clicarclickBtn();
		account.clicarbtnProcess();
		account.preencherObserv("Mercadoria Podera ser entregue para Amara!");
		account.clicarBtnChecKAdress();
		account.clicarTerms();
		account.clicarbtnCheckShipp();
		account.clicarPayBank();
		account.clicarBtnConfirm();
		account.clicarOrders();
		account.clicarHome();
		
	    
	}
	
	 @AfterEach 
	
	void tearDown() throws Exception {
		 
		 
		// driver.quit();

	 
	 }
	 

}

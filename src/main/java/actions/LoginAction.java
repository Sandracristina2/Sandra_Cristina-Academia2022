package actions;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utils.DriverContext;

public class LoginAction extends LoginPage {

	protected WebDriverWait wait;
	
	
	public LoginAction() {

		wait = new WebDriverWait(DriverContext.getDriver(), 20);

	}

	public void clicarSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();
	}

	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);

	}

	public void inserirPasswd(String passwd) {
		wait.until(ExpectedConditions.visibilityOf(inserirPasswd)).sendKeys(passwd);
	}

	public void clicarSign() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSubmit)).click();

	}

	public void clicarBtnHome() {
		wait.until(ExpectedConditions.elementToBeClickable(BtnHome)).click();

	}

	public void preencherBoxSeach(String Nome) {
		wait.until(ExpectedConditions.visibilityOf(txtNome)).sendKeys(Nome);
	}

	public void clicarBtnSearch() {
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Search)).click();

	}

	public void clicarCenter() {
		wait.until(ExpectedConditions.elementToBeClickable(clickCenter)).click();
	}

	public void clicarChangeQuant(String quantity) {
		wait.until(ExpectedConditions.visibilityOf(changeQuant)).clear();
		wait.until(ExpectedConditions.visibilityOf(changeQuant)).sendKeys(quantity);
	}

	public void clicarGroup() {
	     wait.until(ExpectedConditions.elementToBeClickable(clickGroup)).click();
		 
	}
	
	public void clicarColor() {
		wait.until(ExpectedConditions.elementToBeClickable(clickColor)).click();
	}
	
	public void clicarBtnAddCart() {
		wait.until(ExpectedConditions.elementToBeClickable(BtnAddCart)).click();
		
	}
	
	public void clicarclickBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(clickBtn)).click();
		
	}
	
   public void clicarbtnProcess() {
		wait.until(ExpectedConditions.elementToBeClickable(btnProcess)).click();
		
    }

  	public void preencherObserv(String texto) {
  	    wait.until(ExpectedConditions.visibilityOf(txtObserv)).sendKeys(texto);
    
    
  	}
  	
	public void clicarBtnChecKAdress() {
	    wait.until(ExpectedConditions.elementToBeClickable(BtnChecKAdress)).click();
	
	}
	
	public void clicarTerms() {
		wait.until(ExpectedConditions.elementToBeClickable(clickTerms)).click();
	
	 }

	public void clicarbtnCheckShipp() {
		wait.until(ExpectedConditions.elementToBeClickable(CheckShipp)).click();
				
	 }

	public void clicarPayBank() {
		wait.until(ExpectedConditions.elementToBeClickable(clickPay)).click();
				
	 }

	public void clicarBtnConfirm() {
		wait.until(ExpectedConditions.elementToBeClickable(clickConfirm)).click();	
			
	}

	public void clicarOrders() {
		wait.until(ExpectedConditions.elementToBeClickable(clickOrders)).click();
				
	 }

	public void clicarHome() {
		wait.until(ExpectedConditions.elementToBeClickable(clickHome)).click();	
						
			
	}	
			
			
	
}



	





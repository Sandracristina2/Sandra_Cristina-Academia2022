package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import utils.DriverContext;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);

	}

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	protected WebElement linkSignIn;

	@FindBy(how = How.ID, using = "email")
	protected WebElement txtEmail;

	@FindBy(how = How.ID, using = "passwd")
	protected WebElement inserirPasswd;

	@FindBy(how = How.ID, using = "SubmitLogin")
	protected WebElement linkSubmit;

	@FindBy(how = How.ID, using = "header_logo")
	protected WebElement BtnHome;

	@FindBy(how = How.ID, using = "search_query_top")
	protected WebElement txtNome;

	@FindBy(how = How.NAME, using = "submit_search")
	protected WebElement Submit_Search;

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	protected WebElement clickCenter;

	@FindBy(id="quantity_wanted")
	protected WebElement changeQuant;
	
	@FindBy(xpath= "//option[contains(text(),'M')]")
	protected WebElement clickGroup;
	
	@FindBy(how = How.ID, using ="color_14")
	protected WebElement clickColor;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"add_to_cart\"]/button/span")
	protected WebElement BtnAddCart;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	protected WebElement clickBtn;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/p[2]/a[1]")
	protected WebElement btnProcess;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ordermsg\"]/textarea")
	protected WebElement txtObserv;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button")
	protected WebElement BtnChecKAdress;
	
	@FindBy(how = How.ID, using ="uniform-cgv")
	protected WebElement clickTerms;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button")
	protected WebElement CheckShipp;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	protected WebElement clickPay;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"cart_navigation\"]/button")
	protected WebElement clickConfirm;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/p/a")
	protected WebElement clickOrders;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/ul/li[2]/a")
	protected WebElement clickHome;
	
}

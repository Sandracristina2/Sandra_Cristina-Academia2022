package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import actions.LoginAction;

public class Comprastep {
	
	DriverManager manager = new DriverManager();
	WebDriver driver =  manager.AbrirUrl();
	LoginAction action = PageFactory.initElements(driver, LoginAction.class);
	
	public Comprastep() throws Exception{
		
	}
	
	@Given("usuario esteja na pagina inicial do site  {string}")
	public void usuario_esteja_na_pagina_inicial_do_site(String string) {
		driver.get(string);
	}

	@When("usuario clicar no botao SignIn")
	public void usuario_clicar_no_botao_sign_in() {
		action.clicarSignIn();
	}

	@And("preencher os campos {string} , {string}")
	public void preencher_os_campos(String email, String passwd) {
		action.preencherEmail(email);
		action.inserirPasswd(passwd);
	}

	@And("clicar no botao SignIn para logar")
	public void clicar_no_botao_sign_in_para_logar() {
		action.clicarSign();
	   
	}
	@Then("usuario sera redirecionado para a pagina MyAccount")
	public void usuario_sera_redirecionado_para_a_pagina_my_account() {
	    
	}
	
	@And("clicar o botao Home para ser direcionado a pagina inicial")
	public void clicar_o_botao_home_para_ser_direcionado_a_pagina_inicial() {
		action.clicarBtnHome();
		
	}
	@Given("usuario inserir nome do item no campo {string}")
	public void usuario_inserir_nome_do_item_no_campo(String string) {
		action.preencherBoxSeach(string);
	}

	@And("direcionado para a pagina de lista de itens")
	public void direcionado_para_a_pagina_de_lista_de_itens() {
		action.clicarBtnSearch();
		
	}

	@And("clicar no produto desejado")
	public void clicar_no_produto_desejado() {
		action.clicarCenter();
		
	}

	@When("usuario escolher as opcoes dos boxs {string} , {string} , {string}")
	public void usuario_escolher_as_opcoes_dos_boxs(String string, String string2, String string3) {
		action.clicarChangeQuant(string);
	    action.clicarGroup();
	    action.clicarColor();
	  
	}

	@And("clicar no botao add to cart")
	public void clicar_no_botao_add_to_cart() {
		action.clicarBtnAddCart();
		
	}

	@Then("tela resumo de compra abrira ,escolher opcao proceed to checkout")
	public void tela_resumo_de_compra_abrira_escolher_opcao_proceed_to_checkout() {
		action.clicarclickBtn();
		
	}

	@Given("usuario confirme as informacoes do summary , clicar em proceed to checkout")
	public void usuario_confirme_as_informacoes_do_summary_clicar_em_proceed_to_checkout() {
		action.clicarbtnProcess();
		
	}

	@And("na pagina Address usuario inserir comentario no campo add comment {string}")
	public void na_pagina_address_usuario_inserir_comentario_no_campo_add_comment(String string) {
		action.preencherObserv(string);
		
	}

	@When("clicar no botao proceed to checkout, sera direcionado para pagina shipping")
	public void clicar_no_botao_proceed_to_checkout_sera_direcionado_para_pagina_shipping() {
		action.clicarBtnChecKAdress();
		
	}

	@And("Devera aceitar terms of service de entrega na pagina shipping")
	public void devera_aceitar_terms_of_service_de_entrega_na_pagina_shipping() {
		action.clicarTerms();
		
	}

	@Then("clicar no botao proceed to checkout ,sera direcionado para pagina de payment")
	public void clicar_no_botao_proceed_to_checkout_sera_direcionado_para_pagina_de_payment() {
		action.clicarbtnCheckShipp(); 
		
	}

	@Given("usuario escolher a forma de pagamento pay by bank wire")
	public void usuario_escolher_a_forma_de_pagamento_pay_by_bank_wire() {
		action.clicarPayBank();
	   
	}

	@When("clicar no botao confirm my order para continuar o pagamento")
	public void clicar_no_botao_confirm_my_order_para_continuar_o_pagamento() {
		action.clicarBtnConfirm(); 
		
	}

	@And("clicar no botao back to orders, mostrara historico de compra")
	public void clicar_no_botao_back_to_orders_mostrara_historico_de_compra() {
		action.clicarOrders();
	  
	}

	@Then("usuario clicara em home para voltar a pagina inicial do site")
	public void usuario_clicara_em_home_para_voltar_a_pagina_inicial_do_site() {
		action.clicarHome();
		
		
	}


	
}
	
	
	
	
	

	


		

	

	

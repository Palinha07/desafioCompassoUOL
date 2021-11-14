package io.cucumber.manoela;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.manoela.configuracao.Configuracao;

public class Validador {
	public WebDriver browser;
	
	@Dado("que estou no site \"https:\\/\\/www.saucedemo.com\\/")
	public void que_estou_no_site_https_www_saucedemo_com() {
		Configuracao.abrir("https://www.saucedemo.com/");
	}

	@Dado("clico no campo username digito {string}")
	public void clico_no_campo_username_digito(String string) {
		 Configuracao.seletorQueryCss("#user-name").sendKeys(string);
	}

	@Dado("clico no campo password digito {string}")
	public void clico_no_campo_password_digito(String string) {
		 Configuracao.seletorQueryCss("#password").sendKeys(string);
	}

	@Dado("clico no botao login")
	public void clico_no_botao_login() {
		Configuracao.seletorQueryCss("#login-button").click();
	}

	@Entao("devo visualizar a mensagem {string}")
	public void devo_visualizar_a_mensagem(String string) {
		WebElement input = Configuracao.seletorQueryCss("#header_container > div.header_secondary_container > span");
    	assertEquals(string,input.getText());
	}

	@Entao("devo clicar no botao add to cart para adicionar a mochila preta ao carrinho")
	public void devo_clicar_no_botao_add_to_cart_para_adicionar_a_mochila_preta_ao_carrinho() {
		Configuracao.seletorQueryCss("#add-to-cart-sauce-labs-backpack").click();
	}

	@Entao("devo clicar no botao add do cart para adicionar a camisa preta ao carrinho")
	public void devo_clicar_no_botao_add_do_cart_para_adicionar_a_camisa_preta_ao_carrinho() {
		Configuracao.seletorQueryCss("#add-to-cart-sauce-labs-bolt-t-shirt").click();
	}

	@Entao("devo clicar no botao carrinho para visulizar os itens do carrinho")
	public void devo_clicar_no_botao_carrinho_para_visulizar_os_itens_do_carrinho() {
		Configuracao.seletorQueryCss("#shopping_cart_container > a").click();
	}

	@Entao("devo visualizar o item {string}")
	public void devo_visualizar_o_item(String string) {
		 WebElement input = Configuracao.seletorQueryCss("#item_4_title_link > div");
	    	assertEquals(string,input.getText());
	}

	@Entao("devo ver o item {string}")
	public void devo_ver_o_item(String string) {
		WebElement input = Configuracao.seletorQueryCss("#item_1_title_link > div");
    	assertEquals(string,input.getText());
	}

	@Entao("devo clicar no botao remover para remover a bolsa do carrinho")
	public void devo_clicar_no_botao_remover_para_remover_a_bolsa_do_carrinho() {
		Configuracao.seletorQueryCss("#remove-sauce-labs-backpack").click();
	}

	@Entao("devo clicar no botao remover para remover a camisa preta do carrinho")
	public void devo_clicar_no_botao_remover_para_remover_a_camisa_preta_do_carrinho() {
		Configuracao.seletorQueryCss("#remove-sauce-labs-bolt-t-shirt").click();
	}

	@Entao("devo clicar no botao checkout")
	public void devo_clicar_no_botao_checkout() {
		Configuracao.seletorQueryCss("#checkout").click();
	}
	
}

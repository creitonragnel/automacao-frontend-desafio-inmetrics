package br.com.inmetrics.teste.support;

import org.junit.Assert;

import br.com.inmetrics.teste.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	LoginPage login = new LoginPage();
	
	@When ("^Eu informo o meu usuario \"(.*)\"$")
	public void input_usuario(String usuario) throws Throwable {
		login.informarUsuario(usuario);
	}
	
    @And ("^Eu informo a minha senha \"(.*)\"$")
    public void input_senha(String senha) throws Throwable {
    	login.informarSenha(senha);
	}
    
    @And ("^Eu clico no botao entre$")
    public void botao_entrar() throws Throwable {
    	login.clickBotao("/html/body/div/div[2]/div/form/div[6]/button");
	}
    
    @Then ("^Eu serei direcionado para o formulário de empregados \"(.*)\"$")
    public void lista_empregados(String url) throws Throwable {
    	Assert.assertEquals(url, login.loginSucesso());
	}
    
    @Then ("^Eu clicar em sair serei direcionado para a pagina de login \"(.*)\"$")
    public void logout(String url) throws Throwable {
    	login.clickBotao("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a");
    	Assert.assertEquals(url,login.loginSucesso());
    }
    
    @Then ("^O alerta \"(.*)\" será exibido$")
    public void alerta(String alerta) throws Throwable {
    	Assert.assertEquals(alerta, login.getTextoXPath("//strong"));
    }
}

package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.UsuarioPage;

public class UsuarioSteps {
	
	private static UsuarioPage cadastroUsuario = new UsuarioPage();
	
	@And ("^Eu clicar no link cadastre-se$")
	public void cadastraSe() throws Throwable {
		cadastroUsuario.clicarLink("Cadastre-se");
	}
	
    @When ("^Eu informo o usuario \"(.*)\"$")
    public void informar_usuario(String usuario) throws Throwable {
    	cadastroUsuario.informarUsuario(usuario);
    }
    
	@And ("^Eu informo a senha \"(.*)\"$")
	public void informar_senha(String senha) throws Throwable {
		cadastroUsuario.informarSenha(senha);
    }
	
    @And ("^Eu informo a confirmacao da senha \"(.*)\"$")
    public void informar_confirma_senha(String confirma_senha) throws Throwable {
    	cadastroUsuario.informarConfirmeSenha(confirma_senha);
    }
    
    @And ("^Eu clico no botao cadastrar$")
    public void click_botao_cadastrar() throws Throwable {
    	cadastroUsuario.clickCadastrar("/html/body/div/div/div/form/div[7]/button");
    }
    
    @Then ("^Eu serei direcionado para a pagina de login \"(.*)\"$")
    public void acessar_pagina_login(String pag_login) throws Throwable {
    	Assert.assertEquals(pag_login,cadastroUsuario.cadastroSucesso());
    }
    
    @Then ("^Deverá aparecer a informação \"(.*)\"$")
    public void usuario_ja_cadastrado(String mensagem_esperada) throws Throwable {
    	Assert.assertEquals(mensagem_esperada,cadastroUsuario.usuarioJaCadastrado("/html/body/div/div/div/form/div[1]/span/div"));
    }
}

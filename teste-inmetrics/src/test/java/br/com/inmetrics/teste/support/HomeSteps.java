package br.com.inmetrics.teste.support;

import br.com.inmetrics.teste.pages.HomePage;
import cucumber.api.java.en.Given;

public class HomeSteps {
	
	private static HomePage homepage = new HomePage();
	
	@Given ("^Eu estou na home do sistema$")
	public void acessar_home_page() throws Throwable {
		homepage.acessarTelaInicial();
	}
}

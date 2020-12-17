package steps;

import cucumber.api.java.en.Given;
import pages.HomePage;

public class HomeSteps {
	
	private static HomePage homepage = new HomePage();
	
	@Given ("^Eu estou na home do sistema$")
	public void acessar_home_page() throws Throwable {
		homepage.acessarTelaInicial();
	}
}

package br.com.inmetrics.teste.pages;

import br.com.inmetrics.teste.core.BasePage;
import br.com.inmetrics.teste.core.DriverFactory;

public class HomePage extends BasePage {
	public void acessarTelaInicial(){
		DriverFactory.getDriver().get("http://www.inmrobo.tk/accounts/login/");
	}
}

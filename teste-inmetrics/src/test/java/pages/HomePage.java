package pages;

import core.BasePage;
import core.DriverFactory;

public class HomePage extends BasePage {
	public void acessarTelaInicial(){
		DriverFactory.getDriver().get("http://www.inmrobo.tk/accounts/login/");
	}
}

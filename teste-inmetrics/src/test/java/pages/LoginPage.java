package pages;

import core.BasePage;

public class LoginPage extends BasePage {
	public void informarUsuario(String usuario){
		escreverByName("username", usuario);
	}
	
	public void informarSenha(String senha){
		escreverByName("pass", senha);
	}
	
	public void clickBotao(String elemento){
		clicarBotaoByXPath(elemento);
	}
	
	public String loginSucesso(){
		return getCurrentUrl();
	}
	
	public String getTextoXPath(String elemento){
		return getTextoPagina(elemento);
	}
	
	public String ObterTextoAlerta() {
		return alertaObterTexto();
	}
	
}

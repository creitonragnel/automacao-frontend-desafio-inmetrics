package pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import core.BasePage;

public class UsuarioPage extends BasePage {
	Date dataHoraAtual = new Date();
	public void cadastrarUsuario(){
		clicarLink("Cadastre-se");
	}
	
	public void informarUsuario(String usuario){
		//LocalDateTime agora = LocalDateTime.now();
				//cadastroUsuario.informarUsuario(usuario + agora);
				
		String data_atual = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(dataHoraAtual);
		escreverByName("username", usuario + "_" + data_atual);
	}
	
	public void informarSenha(String senha){
		escreverByName("pass", senha);
	}
	
	public void informarConfirmeSenha(String senha){
		escreverByName("confirmpass", senha);
	}
	
	public void clickCadastrar(String element){
		clicarBotaoByXPath(element);
	}

	public String cadastroSucesso(){
		return getCurrentUrl();
	}
	
	public String usuarioJaCadastrado(String elemento){
		return getTextoPagina(elemento);
	}

}

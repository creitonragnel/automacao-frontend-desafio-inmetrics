package br.com.inmetrics.teste.pages;

import br.com.inmetrics.teste.core.BasePage;

public class FuncionarioPage extends BasePage {
	
	public void novoFuncionario(String elemento) {
		clicarBotaoByXPath(elemento);
	}
	
	public void informarEditarFuncionario(String elemento, String texto) {
		escreverByXPath(elemento, texto);
	}
	
	public void informarNome(String nome) {
		escreverByName("nome", nome);
	}
	
	public void informarCargo(String cargo) {
		escreverByName("cargo", cargo);
	}
	
	public void informarCPF(String cpf) {
		escrever("cpf", cpf);
	}
	
	public void informarSalario(String salario) {
		escreverByName("salario", salario);
	}
	
	public void informarSexo(String id, String valor) {
		selecionarCombo(id, valor);
	}
	
	public void informarContratacao(String tpContrato) {
		clicarRadio(tpContrato);
	}
	
	public void informarAdmissao(String admissao) {
		escreverByName("admissao", admissao);
	}
	
	public void botaoEnviar(String elemento) {
		clicarBotaoByClassName(elemento);
	}
	
	public void botaoEditar(String elemento) {
		clicarBotaoByXPath(elemento);
	}
	
	public void botaoExcluir(String elemento) {
		clicarBotaoByXPath(elemento);
	}
	
	public void botaoCancelar(String elemento) {
		clicarBotaoByXPath(elemento);
	}
	
	public String getTextoXPath(String elemento){
		return getTextoPagina(elemento);
	}

}

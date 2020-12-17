package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.FuncionarioPage;
import pages.HomePage;
import pages.LoginPage;
import cucumber.api.java.en.Then;

import org.junit.Assert;

import cucumber.api.java.en.And;

public class FuncionarioSteps {
	private static HomePage homepage = new HomePage();
	LoginPage login = new LoginPage();
	FuncionarioPage funcionario = new FuncionarioPage();
	@Given("^Eu estou logado no sistema na pagina \"(.*)\" de empregados com meu usuário \"(.*)\" e senha \"(.*)\"$")
	public void logar_sistema(String url, String usuario, String senha) throws Throwable {
		homepage.acessarTelaInicial();
		login.informarUsuario(usuario);
		login.informarSenha(senha);
		login.clickBotao("/html/body/div/div[2]/div/form/div[6]/button");
		Assert.assertEquals(url, login.loginSucesso());
	}

	@When("^Eu clico no menu novo funcionário$")
	public void novo_funcionario() throws Throwable {
		funcionario.novoFuncionario("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");
	}
	
	@When("^Eu informo o nome do funcionário \"(.*)\" que desejo manipular no campo pesquisar$")
	public void manter_funcionario(String nome) throws Throwable {
		funcionario.informarEditarFuncionario("/html/body/div/div[2]/div/div[2]/label/input", nome);
	}

	@And("^Eu informo o nome do funcionário \"(.*)\"$")
	public void informar_nome(String nome) throws Throwable {
		funcionario.informarNome(nome);
	}

	@And("^Informo o cargo \"(.*)\"$")
	public void informar_cargo(String cargo) throws Throwable {
		funcionario.informarCargo(cargo);
	}

	@And("^Informo o CPF \"(.*)\"$")
	public void informar_cpf(String cpf) throws Throwable {
		funcionario.informarCPF(cpf);
	}

	@And("^Informo o salário \"(.*)\"$")
	public void informar_salario(String salario) throws Throwable {
		funcionario.informarSalario(salario);
	}

	@And("^Informo o sexo \"(.*)\"$")
	public void informar_sexo(String sexo) throws Throwable {
		funcionario.informarSexo("slctSexo", sexo);
		Thread.sleep(2000);
	}

	@And("^Informo o tipo de contratação \"(.*)\"$")
	public void informar_tipo_contratacao(String tpContrato) throws Throwable {
		funcionario.informarContratacao(tpContrato);
	}

	@And("^Informo a data de admissão \"(.*)\"$")
	public void informar_data_admissao(String admissao) throws Throwable {
		funcionario.informarAdmissao(admissao);
	}

	@And("^Eu clico no botão enviar$")
	public void clicar_enviar() throws Throwable {
		funcionario.botaoEnviar("cadastrar-form-btn");
	}
	
	@And("^Eu clico no botão editar$")
	public void clicar_editar() throws Throwable {
		funcionario.botaoEditar("/html/body/div/div[2]/div/table/tbody/tr[1]/td[6]/a[2]/button");
	}
	
	@And("^Eu clico no botão excluir$")
	public void clicar_excluir() throws Throwable {
		funcionario.botaoExcluir("/html/body/div/div[2]/div/table/tbody/tr[1]/td[6]/a[1]/button/span");
	}

	@Then("^A mensagem de funcionário cadastrado com sucesso será exibida \"(.*)\"$")
	public void mensagem_cadastro_sucesso(String msg) throws Throwable {
		Assert.assertEquals(msg, funcionario.getTextoXPath("//strong"));
	}

} 
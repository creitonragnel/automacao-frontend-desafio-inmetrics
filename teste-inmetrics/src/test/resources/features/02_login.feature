Feature: Login Usuario
  Eu como usuário do sistema devidamente cadastrado desejo me logar no sistema

	Scenario: 01 Efetuar login e logout com sucesso
    Given Eu estou na home do sistema
    When Eu informo o meu usuario "creiton.ragnel@gmail.com"
    And Eu informo a minha senha "123"
    And Eu clico no botao entre
    Then Eu serei direcionado para o formulário de empregados "http://www.inmrobo.tk/empregados/"
    And Eu clicar em sair serei direcionado para a pagina de login "http://www.inmrobo.tk/accounts/login/"
	
	Scenario: 02 Efetuar login usuário inválido
    Given Eu estou na home do sistema
    When Eu informo o meu usuario "usuario_invalido"
    And Eu informo a minha senha "123"
    And Eu clico no botao entre
    Then O alerta "ERRO!" será exibido
  
  Scenario: 03 Efetuar login senha inválida
    Given Eu estou na home do sistema
    When Eu informo o meu usuario "creiton.ragnel@gmail.com"
    And Eu informo a minha senha "1234567"
    And Eu clico no botao entre
    Then O alerta "ERRO!" será exibido
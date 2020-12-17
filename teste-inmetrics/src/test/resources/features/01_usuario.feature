Feature: Cadastrar Usuario
  Eu como usuário do sistema quero me cadastrar para utiliza-lo

	Scenario: 01 Cadastrar usuario com sucesso
    Given Eu estou na home do sistema
    And Eu clicar no link cadastre-se
    When Eu informo o usuario "desafio_Inmetrics_"
    And Eu informo a senha "12345"
    And Eu informo a confirmacao da senha "12345"
    And Eu clico no botao cadastrar
    Then Eu serei direcionado para a pagina de login "http://www.inmrobo.tk/accounts/login/"
  
  Scenario: 02 Cadastrar usuario sem sucesso - Informar usuario ja cadastrado
    Given Eu estou na home do sistema
    And Eu clicar no link cadastre-se
    When Eu informo o usuario "desafio_Inmetrics_"
    And Eu informo a senha "12345"
    And Eu informo a confirmacao da senha "12345"
    And Eu clico no botao cadastrar
    Then Deverá aparecer a informação "Usuário já cadastrado"
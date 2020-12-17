Feature: Manter Funcionario
  Eu como administrador do sistema quero incluir, alterar e excluir funcionarios
	
	Scenario: 01 Cadastrar funcionário
    Given Eu estou logado no sistema na pagina "http://www.inmrobo.tk/empregados/" de empregados com meu usuário "creiton.ragnel@gmail.com" e senha "123"
    When Eu clico no menu novo funcionário
    And Eu informo o nome do funcionário "Desafio Inmetrics"
    And Informo o cargo "Analista"
    And Informo o CPF "629.909.940-25"
    And Informo o salário "3500,00"
    And Informo o sexo "Masculino"
    And Informo o tipo de contratação "clt"
    And Informo a data de admissão "01/12/2020"
    And Eu clico no botão enviar
    Then A mensagem de funcionário cadastrado com sucesso será exibida "SUCESSO!"
    And Eu clicar em sair serei direcionado para a pagina de login "http://www.inmrobo.tk/accounts/login/"
  
  Scenario: 02 Alterar funcionário
    Given Eu estou logado no sistema na pagina "http://www.inmrobo.tk/empregados/" de empregados com meu usuário "creiton.ragnel@gmail.com" e senha "123"
    When Eu informo o nome do funcionário "Desafio Inmetrics" que desejo manipular no campo pesquisar
    And Eu clico no botão editar
    And Eu informo o nome do funcionário "Desafio Inmetrics alterado"
    And Informo o sexo "Indiferente"
    And Informo o tipo de contratação "pj"
    And Eu clico no botão enviar
    Then A mensagem de funcionário cadastrado com sucesso será exibida "SUCESSO!"
    And Eu clicar em sair serei direcionado para a pagina de login "http://www.inmrobo.tk/accounts/login/"
  
  Scenario: 03 Excluir funcionário
    Given Eu estou logado no sistema na pagina "http://www.inmrobo.tk/empregados/" de empregados com meu usuário "creiton.ragnel@gmail.com" e senha "123"
    When Eu informo o nome do funcionário "Desafio Inmetrics alterado" que desejo manipular no campo pesquisar
    And Eu clico no botão excluir
    Then A mensagem de funcionário cadastrado com sucesso será exibida "SUCESSO!"
    And Eu clicar em sair serei direcionado para a pagina de login "http://www.inmrobo.tk/accounts/login/"
    
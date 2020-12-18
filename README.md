Introduction
Automação Site

Getting Started
Configuração de ambiente
Instalar o JDK caso ele já não esteja instalado. Para isso acesse o link http://www.oracle.com/technetwork/java/javase/downloads/index.html
Selecione o JDK adequado ao seu sistema operacional.

Instalar o Eclipse ou a ferramenta IDE da sua preferência http://www.eclipse.org/downloads/

Instalar o plugin do Cucumber. Para isso, abra o Eclipse e acesse o menu "Help > Install New Software". Na janela que abrir, digite a URL https://cucumber.io/cucumber-eclipse/update-site e tecle "ENTER". Será exibido o item "Cucumber Eclipse Plugin". Marque o checkbox e clique em "NEXT". Aceite os termos da licença e clique finish.

Importar o projeto como Maven Project.

As dependências do projeto estão configuradas no arquivo pom.xml

O código foram desenvolvidos executando em navegadoes Google Chrome Versão 87.0.4280.88 (Versão oficial) 64 bits e FireFox 84.0 (64-bits), no momento está setado para iniciar testar com Google Chrome. Caso deseje executar com FIrefox, alterar o valor da propriedade public static Browsers browser = Browsers.CHROME em Propriedades.Class.

Setar a pasta origem dos drivers Geckodriver https://github.com/mozilla/geckodriver/releases e https://chromedriver.chromium.org/downloads ChromeDriver na variavel de ambiente path do Windows com setx /M PATH "C:\LocalDosDrivers;%PATH%" no prompt de comando do Windows com administrador.

Executar o projeto com JUnit Test

Relatório da execução disponível em: target/cucumber-reports/index.html

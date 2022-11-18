# Desafio Compasso UOL

<b>Este projeto foi elaborado por:</b>
<ul>
<li>Manoela Paloma https://github.com/Palinha07</li>
</ul>

# Descrição do desafio

### Criar uma aplicação Selenium com o seguinte caso de teste

### Caso de teste 

Cenário: Preenchendo os formulários<br>
Dado que estou no site "https://www.saucedemo.com/<br>
E clico no campo username digito "standard_user"<br>
E clico no campo password digito "secret_sauce"<br>
E clico no botao login<br>
Entao devo visualizar a mensagem "PRODUCTS"<br>
E devo clicar no botao add to cart para adicionar a mochila preta ao carrinho<br>
E devo clicar no botao add do cart para adicionar a camisa preta ao carrinho<br>
E devo clicar no botao carrinho para visulizar os itens do carrinho<br>
E devo visualizar o item "Sauce Labs Backpack"<br>
E devo ver o item "Sauce Labs Bolt T-Shirt"<br>
E devo clicar no botao remover para remover a bolsa do carrinho<br>
E devo clicar no botao remover para remover a camisa preta do carrinho<br>
Entao devo clicar no botao checkout<br>

----------------------------------------------------------------------
### link para vídeo da aplicação funcionando

https://youtu.be/gX7h9XfHpEM<br>

----------------------------------------------------------------------

## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programaÃ§Ã£o para desenvolvimento da aplicaÃ§Ã£o<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependÃªncias para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsÃ¡vel por traduzir uma linguagem humana em cÃ³digo Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsÃ¡vel por fazer a integraÃ§Ã£o do cÃ³digo java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar
### PrÃ© requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME estÃ¡ configurado em seu computador



- Clone do projeto
 ```bash
git clone https://github.com/Palinha07/desafio-individual
 ```

- Entrando na pasta do projeto
 ```bash
cd estrutrura-projeto-grupo
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na rapiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```
- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

--------------------------------------------------------------------
## Estrutura de arquivos
<pre>
.gitignore
.mvn
   |-- wrapper
   |   |-- MavenWrapperDownloader.java
   |   |-- maven-wrapper.jar
   |   |-- maven-wrapper.properties
driver
   |-- chromedriver.exe
mvnw
mvnw.cmd
pom.xml
src
   |-- main
   |   |-- java
   |   |   |-- io
   |   |   |   |-- cucumber
   |   |   |   |   |-- manoela
   |   |   |   |   |   |-- Validacao.java
   |-- test
   |   |-- java
   |   |   |-- io
   |   |   |   |-- cucumber
   |   |   |   |   |-- manoela
   |   |   |   |   |   |-- RunCucumberTest.java
   |   |   |   |   |   |-- ValidadorTricentisSteps.java
   |   |   |   |   |   |-- configuracao
   |   |   |   |   |   |   |-- Configuracao.java
   |   |-- resources
   |   |   |-- io
   |   |   |   |-- cucumber
   |   |   |   |   |-- manoela
   |   |   |   |   |   |-- .gitkeep
   |   |   |   |   |   |-- validadorTricentis.feature
test.bat
test.sh
</pre>


# DesafioCompassoUOL

<b>Este projeto foi elaborado por:</b>
<ul>
<li>Manoela Paloma https://github.com/Palinha07</li>
</ul>

# Descrição do desafio

### Criar uma aplicação Selenium com o seguinte caso de teste

Utilizando o e-commerce https://www.saucedemo.com/, automatize
a funcionalidade de login e adição de alguns produto ao carrinho,
após cada ação você deve realizar uma validação de acordo com
os elementos disponíveis na tela e também a URL acessada.
O login deve ser realizado com o "standard_user" e deve ser
validado além da URL a visibilidade de um dos itens do cabeçalho
da página.
Deve ser adicionado ao carrinho a mochila e a camiseta preta e a
validação da adição deve ocorrer dentro do carrinho (URL e elemento da página).
Deve ser removido ambos os produtos do carrinho e realizado a
validação.

----------------------------------------------------------------------
### link para vídeo da aplicação funcionando

https://youtu.be/j8lkBbwZcF0

----------------------------------------------------------------------

## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programaÃ§Ã£o para desenvolvimento da aplicaÃ§Ã£o<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependÃªncias para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsÃ¡vel por traduzir uma linguagem humana em cÃ³digo Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsÃ¡vel por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar
### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME estÃ¡ configurado em seu computador



- Clone do projeto
 ```bash
git clone https://github.com/Palinha07/desafioCompassoUOL
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
   |   |   |   |   |   |-- validador.feature
test.bat
test.sh
</pre>

### Outros links para vídeos de aplicações funcionando

https://youtu.be/gX7h9XfHpEM

https://youtu.be/nP8QIM9v4HE

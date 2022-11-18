# Desafio Compasso UOL

<b>Este projeto foi elaborado por:</b>
<ul>
<li>Manoela Paloma https://github.com/Palinha07</li>
</ul>

# Descrição do desafio

### Criar uma aplicação Selenium com o seguinte caso de teste

### Caso de teste 

Preencher fomulários no site Tricentis<br>

Cenário: Preenchendo os formulários<br>
Dado que estou no site "http://sampleapp.tricentis.com/101/app.php"<br>
E clico no campo make escolho a marca da moto "bmw"<br>
E clico no campo model escolho o modelo da moto "scooter"<br>
E clico no campo Cylinder Capacity preencho a capacidade do cilindro da moto "1600"<br>
E clico no campo enginer Performance preencho a capacidade do motor em KW "44"<br>
E clico no campo Date of Maufacture preencho a data de fabricacao da moto "01/01/2020"<br>
E clico no campo Number of Seats e escolho o numero de assentos que a moto tem "2"<br>
E escolho o botao Right Hand Driver para indicar o tipo motorista de mao direita<br>
E clico na nova opcao Number of Seats escolho mais uma vez o numero de assentos na moto "2"<br>
E clico no campo Fuel Type devo escolher o tipo de combustivel usado na moto "diesel"<br>
E clico no campo Payload digito a carga util de combustivel na moto "16"<br>
E clico no campo Total Wight digito o peso total da moto "249"<br>
E clico no campo List Price digito o valor da moto "50000"<br>
E clico no campo License Plate Number digito a placa da moto "kkk111"<br>
E clico no campo Annual Mileage digito a quilometragem anual da moto "1000"<br>
E clico no botao next que encaminha para a aba enter insurant data<br>
E clico no campo First Name preencho meu primeiro nome "Manoela"<br>
E clico no campo Last name preencho o meu sobrenome "Sena"<br>
E clico no campo Date of Birth preench a minha data de nascimento "07/04/1993"<br>
E escolho no botao opcao de genero na parte Gender<br>
E clico no campo Street Address preencho meu endereco "segunda travessa ECS"<br>
E clico no campo Country e escolho o meu pais "brazil"<br>
E clico no campo zip code e digito meu CEP "54762000"<br>
E clico no campo city e digito a minha cidade "Recife"<br>
E clico no campo Occupation seleciono a minha ocupacao "employee"<br>
E clico em selecionar a opcao de hobbies<br>
E clico em website digito o minha pagina na internet "github.com/Palinha07"<br>
E clico no botao next que encaminha para aba enter product Data<br> 
E clico no campo Start e Date digito a data de inicio "01/01/2022"<br>
E clico no campo Insurance Sum digito o valor assegurado "3"<br>
E clico no campo Merit Rating escolho a classificacao "bonus 1"<br>
E clico no campo Demage Insurance escolho a opcao de cobertura do seguro "full coverage"<br>
E clico no campo Optional Products para escolher os produtos opcionais<br>
E clico no campo Courtesy Car escolho se quero o carro de cortesia "no"<br>
E clico no campo next que vai redirecionar para aba Select Price Option<br>
E clico no opcao de seguro escolhida<br>
E clico no botao next que vai redirecionar para aba Send Quote<br>
E clico no campo e-mail digito meu email "manoela@gmail.com"<br>
E clico no campo Phone digito o telefone para contato "111111111"<br>
E clico no campo Username crio um nome de usuario "Palinha"<br>
E clico no campo password crio uma senha "Teste123"<br>
E clico no campo confirm password digito a mesma senha criada anteriormente "Teste123"<br>
E clico no campo comments insero um comentario "teste"<br>
E clico no botao send<br> 
Entao devo visualizar a mensagem "Sending e-mail success!"<br>
E clicar no botao OK<br>

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


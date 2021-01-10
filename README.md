**Desafio técnico para desenvolvedores backend Java**
----
  Esta API foi desenvolvida para validar uma senha que atenda as seguintes definições: Nove ou mais caracteres, ao menos 1 dígito, ao menos 1 letra minúscula,ao menos 1 letra maiúscula, ao menos 1 caractere especial [!@#$%^&*()-+],não possuir caracteres repetidos nem espaços em branco.

* **URL:**
   http://localhost:8080/checkpasswd/

* **Method:**
   `GET`
  
* **Parâmetros da URL:**
  `senha=[String]`

* **Resposta de Sucesso:**
   Ao validar uma senha a API retorna um boolean como visto abaixo.

  * **Código:** 200 <br />
    **Conteúdo:** `{ "valid" : true }` ou `{ "valid" : false }`

* **Exemplo de chamada:**
  http://localhost:8080/checkpasswd/{senha}


* **Considerações:**

  ***Motivação:***
   Eu tentei implementar um código simples garantindo a segregação das responsabilidades, fácil manutenção e evolução e simples de testar.
  
  ***Interface Checker e classe PasswordChecker:***
   A responsabilidade por verificar se a senha tem os atributos/definições estipulados fica a cargo da classe PasswordChecker. Essa classe implementa a interface Checker e seu método que recebe uma lista de atributos e uma senha/string.
  
  ***Interface Attribute, PasswordAttribute e atributos (classes) da senha:***
   Uma senha precisa atender a alguns critérios, ou seja, precisa dispor de alguns atributos. Cada atributo exige uma lógica diferente e por isso criei classes individuais para cada atributo da senha. Essas classes individuais implementam a interface PasswordAttribute. Isso atende o conceito de "é um".
  Por sua vez a interface PasswordAttribute extende a interface Attribute. Essa por sua vez representa um atributo qualquer. Dessa forma podemos criar atributos para outros tipos de objeto, por exemplo, atributos do nome de usuário.
  
  
* **Como executar o projeto:**
    Implementei a API Rest usando Spring Boot e Maven. Abaixo seguem as intruções para executar o projeto.
    
    1. git clone https://github.com/thiago2santos/itidigital-backend-challenge
    2. Importe o projeto na IDE de sua preferência
    3. Execute a classe BackendChallengeApplication.java como "Java Application"
    4. Abra o navegador de sua preferência
    5. digite http://localhost:8080/checkpasswd/{senha}. Lembre-se de substituir {senha} pela senha a ser validada. 

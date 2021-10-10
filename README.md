# API REST com Spring Boot para praticar padrões de projeto em Java 

Foi desenvolvido um pequeno sistema para o gerenciamento de pessoa e seu endereço através de uma API REST, criada com o Spring Boot.

Este projeto foi realizado seguindo como base o projeto "Explorando Padrões de Projetos na Prática com Java", sendo mais específico a parte pratica com spring, realizado pelo Venilton FalvoJr na plataforma online Digital Innovation One. 

Foram realizados no desenvolvimento desse projeto:

* Setup inicial de projeto com o Spring Boot Initialzr
* Criação de modelo de dados para mapeamento de entidades em bacos de dados
* Desenvolvimento de operações de genênciamento (cadastro, leitura, atualização e remoção de um sistema)
* Relacionamento de cada uma das operações acima com o padrão arquitetural REST
* Utilização do webwervise gratuito [ViaCep](https://viacep.com.br/) para realizar cadastro de endereços completos com apenas o Cep 

## Padrões de Projeto usados
Foram usados como padrões para este projeto: 
* Singleton: implementado através das anotações do próprio Spring @Bean e @Autowired
* Strategy: utilizado através das anotações  @Service e @Repository
* Facade: toda a API REST foi construída com o mesmo objetivo desse padrão, abstraíndo complexidade das integrações: Sring Data JPA, utilizando um bando de dados em memória e também utilizando a ViaCEP através do client http Feign

## Foram utilizados como depêndecias desse projeto

* spring-boot-starter-data-jpa
* spring-boot-starter-web
* spring-cloud-starter-openfeign
* springdoc-openapi-ui
* h2, como banco de dados em memória

## Pré-Requisitos e Execução
São necessários os seguintes pré-requisitos para a execução desse simples projeto:

* Java 11 ou versões superiores
* Maven 3.6.3 ou versões superiores

Para executar o projeto no terminal, digite o seguinte comando no diretório do projeto:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta abrir o seguinte endereço no navegador para conseguir realizar testes com a api:

```
http://localhost:8080/swagger-ui.html
``` 

# Projeto de exemplo

Este projeto é um exemplo de como criar um microsserviço uasndo clean architeture e kafka com mongoDb.

## Descrição

Criado um projeto com Spring boot e Kafka para aprender sobre as filas com message broker em diferentes microsserviços 

## Instalação

Para instalar e rodar o projeto, siga estas etapas:

1. Clone o repositório do GitHub:
2. Rode em qualquer IDE de sua preferência como : IntellijIdea, vsCode e Eclipse.
3. Rode o comando mvn clean install para instalar as dependencia.
4. Caso não tenha os containers no docker do kafka e mongodb, será necessário rodar o docker compose que está na pasta resources/docker-local
5. Para subir o segundo serviço para testar a integração entre os serviços, na pasta wiremock a um jar em uma pasta.
6. Rode o jar usando o comando java -jar wiremock-standalone-3.2.0.jar --port 8082, o sistema já está configurado para se conectar com essa porta, caso precise trocar será necessário trocar dentro do application.yml também.

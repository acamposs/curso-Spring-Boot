# Curso API RESTful com Spirng Boot

Esse repositório é dedicado para estudos do [Curso API RESTful com Spring Boot 2022 ](https://www.youtube.com/playlist?list=PLiXotHlANc8ptwP6wajo73OZo9Nh5i597) ministrado pelo [Lucas Ângelo](https://github.com/Lucas-Angelo). O curso uma aplicação web de uma Lista de Tarefas (To Do Task) como projeto de desenvolvimento para o aprendizado.

## Ferramentas Utilizadas 
- Frontend:
  - HTML 5
  - CSS 3
  - JavaScript
  - Bootstrap 5
- Backend:
  - Java 17
  - Apache Maven
- Database:
  - MySQL Server
- Ferramenta
  - (VSCode)
  - Postman
  - Git
  - Docker

## Instruções de utilização

Estas instruções ajudarão a executar o projeto localmente para fins de teste, desenvolvimento e aprendizado.

Pré-requisitos:
  - Java
  - Maven
  - MySQL
  - Docker (Docker-Compose)

<br>

- Passo 1: Clone o repositório:
  ```bash
  git clone https://github.com/ICEI-PUC-Minas-PPLES-TI/PLF-ES-2022-2-MON-CursoAPIJava.git
  ```

<br>

- Passo 2: Configurar e iniciar a API Spring Boot (backend)

  - 2.1. Acesse o arquivo application-dev.properties:
  ```bash
  vi PLF-ES-2022-2-MON-CursoAPIJava\src\main\resources\application-dev.properties
  ```

  - 2.2. Configure as credenciais do banco de dados de acordo com a sua instalação do MySQL:
  ```proprieties
  # Configuração do banco de dados
  spring.datasource.url=jdbc:mysql://localhost:3306/todosimple?createDatabaseIfNotExist=true
  spring.datasource.username=root
  spring.datasource.password=root
  ```

  - 2.3. Navegue de volta para o diretório raiz do projeto:
  ```bash
  cd PLF-ES-2022-2-MON-CursoAPIJava\
  ```

  - 2.4. Inicie a aplicação Spring Boot:
 
    **Com Maven:**
  ```bash
  mvn clean install
  mvn spring-boot:run
  ```
   
    **Com Docker-Compose**
  ```bash
  docker-compose up
  ```
  
  - API estará rodando em http://localhost:8080/

<br>

- Passo 3: Iniciar a aplicação frontend

  - 3.1. Navegue para o diretório raiz do projeto:
  ```bash
  cd PLF-ES-2022-2-MON-CursoAPIJava
  ```

  - 3.2. Abra o arquivo index.html diretamente ou com a extensão Live Server do VS Code:
  ```bash
  cd view
  live-server login.html
  ```
  - O frontend estará disponível em: http://127.0.0.1:5500/view/login.html (caso iniciado com Live Server).

---

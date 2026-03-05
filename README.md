# API Forum Hub

Este projeto é uma API RESTful desenvolvida em Spring Boot para um sistema de fóruns.

## 🚀 Sobre o Projeto <br>
O ForumHub API é um projeto desenvolvido com foco em boas práticas de arquitetura REST, autenticação com JWT, separação em camadas (Controller, Service, Repository) e persistência de dados com JPA/Hibernate.


## ✅ Funcionalidades <br>

✔️ Cadastro de autores <br>
✔️ Cadastro de cursos <br>
✔️ Cadastro de tópicos<br>
✔️ Listagem de todos os tópicos<br>
✔️ Detalhamento de tópico por ID<br>
✔️ Atualização de tópico<br>
✔️ Exclusão de tópico<br>
✔️ Validação de dados<br>
✔️ Regras de negócio para evitar duplicidade<br>
✔️ Autenticação com login e senha<br>
✔️ Criptografia BCrypt <br><br>


## 🔁 Endpoints da API <br>

### 🔑 Autenticação <br>
| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| `POST` | `/login` |Efetua o login e retorna o Token JWT|Público|

### ✍️ Autores <br>
| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| `POST` |`/autores`|Cria um novo autor|Autenticado|

### 📚 Cursos <br>
| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| `POST` |`/cursos`|Cria um novo curso|Autenticado|

### 💬 Tópicos <br>
| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| `POST` |`/topicos`|Cria um novo tópico|Autenticado|
| `GET` |`/topicos`|Lista todos os tópicos|Autenticado|
| `GET` |`/topicos/{id}`|Detalha um tópico específico|Autenticado|
| `PUT` |`/topicos/{id}`|Atualiza um tópico|Autenticado|
| `DELETE` |`/topicos/{id}`|Deleta um tópico|Autenticado|

### 📜 Swagger <br>
| Endpoint | Descrição | Acesso |
|--------|----------|-----------|
|`/swagger-ui.html`|Exibe a documentação do projeto de forma gráfica e interativa |Público|

## 🛠️ Tecnologias Utilizadas <br>

- Java 21 <br>
- Spring Boot <br>
- Spring Security <br>
- JWT (JSON Web Token) <br>
- JPA / Hibernate <br>
- Maven<br>
- MySQL<br>
- Flyway<br>
- Swagger<br><br>

## ▶️ Como Executar o Projeto
- Clonar o repositório
`git clone git@github.com:drg0803/forum-hub.git`


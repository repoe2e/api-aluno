# Escola E2E - Cadastro de Alunos

Bem-vindo ao projeto **Escola E2E - Cadastro de Alunos**! Este é um sistema para o gerenciamento de alunos, permitindo o cadastro, consulta, atualização, exclusão e listagem de alunos em uma escola fictícia. A aplicação foi desenvolvida com **Spring Boot** e documentada com **Swagger** para facilitar a integração e entendimento dos endpoints.

---

## 📖 Sumário

- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Pré-requisitos](#pré-requisitos)
- [Como Executar o Projeto](#como-executar-o-projeto)
- [Estrutura dos Endpoints](#estrutura-dos-endpoints)
- [Documentação da API](#documentação-da-api)
- [Contribuindo](#contribuindo)
- [Contato](#contato)

---

## 🚀 Funcionalidades

- **Cadastrar Alunos**: Insira os dados de novos alunos.
- **Consultar Alunos**: Obtenha informações de um aluno específico usando o CPF.
- **Atualizar Dados**: Modifique as informações de um aluno existente.
- **Excluir Alunos**: Remova alunos do sistema.
- **Listar Alunos**: Liste todos os alunos cadastrados.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.4**
- **Maven**
- **Springdoc OpenAPI** para documentação
- **H2 Database** (opcional para testes simples)

---

## ⚙️ Pré-requisitos

Certifique-se de que você tenha instalado na sua máquina:

- **JDK 17+**
- **Maven 3.6+**
- **Git**

---

## ▶️ Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/repoe2e/api-aluno.git
   cd api-aluno
   
2. **Compile o projeto**:
mvn clean install

3. **Execute aplicação**:
mvn spring-boot:run

3. **Acesse a documentaçãp**:
- Abra seu navegador e acesse: http://localhost:8080/swagger-ui.html


## 📂 Estrutura dos Endpoints
- base url: http://localhost:8080/api/alunos

Endpoints Disponíveis
Método	Endpoint	Descrição
POST	/	Cadastrar novo aluno
GET	/{cpf}	Consultar aluno por CPF
PUT	/{cpf}	Atualizar dados de um aluno
DELETE	/{cpf}	Excluir aluno
GET	/	Listar todos os alunos

   
   


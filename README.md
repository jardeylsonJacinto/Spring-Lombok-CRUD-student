# Aluno API

## Descrição

Esta é uma API REST para gerenciamento de alunos, permitindo operações de CRUD (Create, Read, Update, Delete). A API é baseada em Spring Boot e utiliza Hibernate para manipulação do banco de dados MySQL.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4.3
- Spring Data JPA
- Hibernate
- MySQL
- Spring Boot Actuator
- Spring Boot Validation
- OpenAPI (Swagger UI)
- Lombok
- Maven
- Docker (opcional)

## Configuração do Banco de Dados

O banco de dados MySQL precisa estar configurado corretamente. No arquivo `application.properties`, defina as variáveis de ambiente ou ajuste os valores diretamente:

```properties
spring.application.name=aluno
spring.datasource.url=jdbc:mysql://localhost:3306/aluno_db
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Certifique-se de que o banco de dados "aluno_db" esteja criado antes de iniciar a aplicação.

## Endpoints da API

A API segue padrões REST e expõe os seguintes endpoints:

### 1. Listar todos os alunos

```http
GET /aluno
```

**Resposta de Sucesso (200 OK):**

```json
[
  {
    "id": 1,
    "name": "João Silva",
    "email": "joao@email.com",
    "cpf": "123.456.789-00",
    "dataCriacao": "2025-02-24T19:39:25.318Z",
    "dataAtualizacao": "2025-02-24T19:39:25.318Z"
  }
]
```

### 2. Buscar aluno por ID

```http
GET /aluno/{id}
```

**Resposta de Sucesso (200 OK):**

```json
{
  "id": 1,
  "name": "João Silva",
  "email": "joao@email.com",
  "cpf": "123.456.789-00",
  "dataCriacao": "2025-02-24T19:39:25.318Z",
  "dataAtualizacao": "2025-02-24T19:39:25.318Z"
}
```

### 3. Criar um novo aluno

```http
POST /aluno
```

**Corpo da Requisição (JSON):**

```json
{
  "name": "Maria Souza",
  "email": "maria@email.com",
  "cpf": "987.654.321-00"
}
```

**Resposta de Sucesso (200 OK):**

```json
{
  "id": 2,
  "name": "Maria Souza",
  "email": "maria@email.com",
  "cpf": "987.654.321-00",
  "dataCriacao": "2025-02-24T19:40:00.000Z",
  "dataAtualizacao": "2025-02-24T19:40:00.000Z"
}
```

### 4. Excluir um aluno por ID

```http
DELETE /aluno/{id}
```

**Resposta de Sucesso (200 OK):**

```json
{
  "message": "Aluno deletado com sucesso"
}
```

## Documentação da API

A documentação da API está disponível no Swagger UI:

[Swagger UI - OpenAPI](http://localhost:8080/swagger-ui.html)

Ou diretamente na especificação OpenAPI:

```http
GET /v3/api-docs
```

## Como Executar

1. Certifique-se de que o MySQL está rodando e o banco de dados está criado.
2. Configure as variáveis de ambiente `DB_USER` e `DB_PASSWORD`.
3. Execute a aplicação com o seguinte comando:
   ```sh
   mvn spring-boot:run
   ```
4. Acesse a API em `http://localhost:8080`.

## Autor

Desenvolvido por Jardeylson Jacinto - 2025.


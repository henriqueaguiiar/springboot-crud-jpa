
# 🧩 Web Services com Spring Boot MVC e JPA / Hibernate

---

## 🎯 Objetivos do Projeto

- Criar um projeto **Spring Boot Java MVC**
- Implementar o **modelo de domínio**
- Estruturar camadas lógicas: `resource`, `service`, `repository`
- Configurar o **banco de dados de teste (H2)**
- Povoar o banco de dados
- Implementar operações **CRUD (Create, Retrieve, Update, Delete)**
- Implementar **tratamento de exceções**
- Preparar o deploy no **Heroku** com **PostgreSQL**

---

## 🧱 Estrutura de Camadas

```

Domain Layer      → entidades do modelo de domínio
Repository Layer  → interfaces JPA para persistência
Service Layer     → regras de negócio e validações
Resource Layer    → controladores REST

````

---

## 🧩 Modelo de Domínio

O projeto contém as seguintes entidades principais:

- **User**
- **Order**
- **Category**
- **Product**
- **OrderItem**
- **Payment**

### Relacionamentos:

- `User` → `Order` (One-to-Many)
- `Order` → `OrderItem` (One-to-Many)
- `OrderItem` → `Product` (Many-to-One)
- `Product` ↔ `Category` (Many-to-Many)
- `Order` ↔ `Payment` (One-to-One)

---

## ⚙️ Configuração do Projeto

### Dependências Principais

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
  <groupId>com.h2database</groupId>
  <artifactId>h2</artifactId>
  <scope>runtime</scope>
</dependency>
````

---

## 🧪 Perfis de Aplicação

### 🔹 Test Profile (H2)

**application-test.properties**

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### 🔹 Dev Profile (PostgreSQL local)

**application-dev.properties**

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_course
spring.datasource.username=postgres
spring.datasource.password=1234567
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### 🔹 Prod Profile (Heroku)

**application-prod.properties**

```properties
spring.datasource.url=${DATABASE_URL}
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=false
jwt.secret=${JWT_SECRET}
jwt.expiration=${JWT_EXPIRATION}
```

---

## 🚀 Deploy no Heroku

### Pré-requisitos

* Conta no [Heroku](https://www.heroku.com/)
* Heroku CLI instalado
* Banco PostgreSQL provisionado

### Passos

```bash
heroku login
heroku git:remote -a nome-do-app
git add .
git commit -m "Deploy app to Heroku"
git push heroku main
```

**Arquivo necessário:**

```
system.properties
java.runtime.version=17
```

---

## 🧰 Funcionalidades Implementadas

* ✅ CRUD completo de **usuários**
* ✅ CRUD completo de **produtos e categorias**
* ✅ Relacionamento **Order ↔ OrderItem**
* ✅ Cálculo de **subtotal e total**
* ✅ Tratamento global de exceções (404, 400, 500)
* ✅ Deploy com **PostgreSQL** no Heroku

---

## 🧾 Exemplo de Requisições Teste (User)

### POST `/users`

```json
{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755",
  "password": "123456"
}
```

### PUT `/users/{id}`

```json
{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755"
}
```

---

## 🧱 Tratamento de Exceções

Classes implementadas:

* `ResourceNotFoundException`
* `DatabaseException`
* `ResourceExceptionHandler`
* `StandardError`

---

## 🧑‍💻 Tecnologias Utilizadas

| Tecnologia          | Descrição                      |
| ------------------- | ------------------------------ |
| **Java 17**         | Linguagem principal            |
| **Spring Boot**     | Framework de desenvolvimento   |
| **JPA / Hibernate** | ORM para persistência de dados |
| **H2 Database**     | Banco em memória para testes   |
| **PostgreSQL**      | Banco relacional para produção |
| **Maven**           | Gerenciador de dependências    |
| **Heroku**          | Plataforma de deploy em nuvem  |



---

## 🧑‍💻 Modelo de Dominio 
<img width="796" height="382" alt="image" src="https://github.com/user-attachments/assets/0e79c0c4-637d-4b5b-9199-b376d3187519" />

<img width="772" height="471" alt="image" src="https://github.com/user-attachments/assets/428bd33e-8db5-452a-9efe-fc2520f571b2" />

## 🧑‍💻 Camada de Lógica MVC 
<img width="704" height="449" alt="image" src="https://github.com/user-attachments/assets/6027f27d-4343-44e9-be8e-0a6b4659622e" />




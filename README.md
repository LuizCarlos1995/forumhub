# 💬 ForumHub - API REST

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
  <img src="https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=white" alt="JWT">
</div>

## 📋 Sobre o Projeto

O **ForumHub** é uma API REST desenvolvida como parte do desafio da **Alura**, simulando um fórum de discussão online. A aplicação permite que usuários autenticados criem, visualizem, atualizem e deletem tópicos de discussão, implementando um sistema completo de gerenciamento de fórum.

### 🎯 Objetivos do Desafio

Este projeto foi desenvolvido para consolidar conhecimentos em:
- Desenvolvimento de APIs REST com Spring Boot
- Implementação de segurança com JWT
- Persistência de dados com JPA/Hibernate
- Validações e tratamento de exceções
- Documentação de APIs

## ⚡ Funcionalidades

### 🔐 Autenticação e Autorização
- Sistema de login com JWT
- Controle de acesso aos endpoints
- Validação de tokens

### 📝 Gestão de Tópicos
- ✅ **CREATE** - Criar novos tópicos
- 📖 **READ** - Listar e visualizar tópicos
- ✏️ **UPDATE** - Atualizar tópicos existentes
- 🗑️ **DELETE** - Remover tópicos

### 👥 Gestão de Usuários
- Cadastro de usuários
- Perfis de usuário
- Relacionamento com tópicos criados

### 📚 Gestão de Cursos
- Organização de tópicos por curso
- Categorização de conteúdo

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Security** - Autenticação e autorização
- **Spring Data JPA** - Persistência de dados
- **MySQL** - Banco de dados
- **JWT** - Tokens de autenticação
- **Bean Validation** - Validação de dados
- **Maven** - Gerenciamento de dependências
- **Flyway** - Versionamento do banco de dados

## 🚀 Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6+
- MySQL 8.0+
- IDE de sua preferência (IntelliJ, Eclipse, VS Code)

### Configuração do Banco de Dados

1. Crie um banco de dados MySQL:
```sql
CREATE DATABASE forumhub;
```

2. Configure as credenciais no `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/forumhub
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

### Executando a Aplicação

1. Clone o repositório:
```bash
git clone https://github.com/LuizCarlos1995/forumhub.git
cd forumhub
```

2. Execute a aplicação:
```bash
mvn spring-boot:run
```

3. A API estará disponível em: `http://localhost:8080`

## 📚 Documentação da API

### Endpoints Principais

#### Autenticação
```
POST /auth/login
```

#### Tópicos
```
GET    /topicos           # Listar todos os tópicos
GET    /topicos/{id}      # Buscar tópico por ID
POST   /topicos           # Criar novo tópico
PUT    /topicos/{id}      # Atualizar tópico
DELETE /topicos/{id}      # Deletar tópico
```

#### Usuários
```
GET    /usuarios          # Listar usuários
POST   /usuarios          # Cadastrar novo usuário
```

### Exemplo de Requisição

**Criar Tópico:**
```json
POST /topicos
Content-Type: application/json
Authorization: Bearer {token}

{
  "titulo": "Dúvida sobre Spring Boot",
  "mensagem": "Como configurar profiles no Spring Boot?",
  "curso": "Spring Boot",
  "autor": "usuario@email.com"
}
```

**Resposta:**
```json
{
  "id": 1,
  "titulo": "Dúvida sobre Spring Boot",
  "mensagem": "Como configurar profiles no Spring Boot?",
  "status": "NAO_RESPONDIDO",
  "autor": "usuario@email.com",
  "curso": "Spring Boot",
  "dataCriacao": "2024-01-15T10:30:00"
}
```

## 🔒 Segurança

A API implementa as seguintes medidas de segurança:

- **Autenticação JWT** - Todos os endpoints protegidos requerem token válido
- **Validação de entrada** - Dados são validados antes do processamento
- **Controle de acesso** - Usuários só podem modificar seus próprios tópicos
- **Sanitização** - Prevenção contra ataques de injeção

## 🧪 Testes

Para executar os testes:

```bash
mvn test
```

Os testes incluem:
- Testes unitários dos serviços
- Testes de integração dos controladores
- Testes de segurança dos endpoints

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/alura/forumhub/
│   │   ├── controller/     # Controladores REST
│   │   ├── domain/         # Entidades e regras de negócio
│   │   ├── infra/          # Configurações e segurança
│   │   └── repository/     # Repositórios JPA
│   └── resources/
│       ├── application.properties
│       └── db/migration/   # Scripts Flyway
└── test/                   # Testes automatizados
```

## 🤝 Contribuição

Este é um projeto de desafio educacional da Alura. Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor

**Luiz Carlos**
- GitHub: [@LuizCarlos1995](https://github.com/LuizCarlos1995)
- LinkedIn: [Linkedin](https://www.linkedin.com/in/luiz-desenvolvedor/)

## 🎓 Agradecimentos

- **Alura** - Pela proposta do desafio e conteúdo educacional
- **Oracle Next Education** - Pelo programa de formação
- Comunidade Spring Boot - Pela documentação e suporte

---

<div align="center">
  <p>⭐ Se este projeto te ajudou, deixe uma estrela!</p>
  <p>Desenvolvido com ❤️ como parte do desafio Alura</p>
</div>

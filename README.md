## Sistema de Gerenciamento de Projetos - API em Spring Boot
Este projeto foi desenvolvido em Spring Boot com o objetivo de aplicar os conceitos de desenvolvimento de APIs RESTful. O sistema facilita o gerenciamento de projetos, permitindo a consulta de projetos cadastrados e o registro de novos projetos. Através de uma API simples, os usuários podem interagir com os dados de projetos, consultar informações e adicionar novos projetos ao sistema.

## Funcionalidades Principais
Consulta de Projetos Existentes: Permite que o usuário consulte informações sobre projetos já cadastrados no sistema. <br>
Registro de Novos Projetos: Permite que um novo projeto seja registrado no sistema, armazenando suas informações no banco de dados. <br>
## Estrutura do Sistema
O sistema é composto pelas seguintes classes principais:

ProjetoController: Controlador responsável por gerenciar as requisições HTTP para consultar e adicionar projetos. Ele utiliza o ProjetoDAO para interagir com o banco de dados.

Métodos principais:
getProjeto(Long idProjeto): Retorna um projeto específico com base no ID.
createProjeto(Projeto projeto): Registra um novo projeto no sistema.
getAllProjetos(): Retorna todos os projetos cadastrados no sistema. <br> <br>
ProjetoDAO: Classe de acesso ao banco de dados que gerencia as operações de persistência de dados. Ela utiliza o EntityManager para interagir com o banco.

Métodos principais:
inserir(Projeto projeto): Insere um novo projeto no banco de dados.
atualizar(Projeto projeto): Atualiza um projeto existente no banco de dados.
buscarPorId(Long idProjeto): Consulta um projeto específico pelo ID.
consultarTodos(): Retorna todos os projetos cadastrados no banco de dados.
Projeto: Representa o modelo de dados de um projeto, com atributos como ID, nome, descrição, e datas relevantes.

## Requisitos do Projeto
Java Development Kit (JDK) 8 ou versão superior.
Spring Boot 2.x.
Banco de Dados: O sistema utiliza um banco de dados relacional (configurável via JPA).
Como Executar o Sistema
Configuração do Ambiente: Certifique-se de ter o JDK 8 ou superior instalado e o ambiente configurado corretamente. <br>
Executar a Aplicação: Ao rodar a aplicação, a API estará disponível no endpoint http://localhost:8080/api/projeto. <br>
Interagir com a API: <br>
Consultar Projetos: Envie um GET para /api/projeto/todos para listar todos os projetos. <br>
Consultar Projeto por ID: Envie um GET para /api/projeto/{idProjeto} para obter informações sobre um projeto específico. <br>
Criar Novo Projeto: Envie um POST para /api/projeto/ com o corpo da requisição contendo os dados do projeto a ser criado.

## Principais Tecnologias Utilizadas
Spring Boot: Framework para criação da API REST. <br>
Spring Data JPA: Para facilitar a persistência dos dados em um banco relacional. <br>
EntityManager: Para interagir diretamente com o banco de dados.

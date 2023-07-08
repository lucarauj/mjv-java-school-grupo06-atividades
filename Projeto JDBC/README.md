<h1 align="center">Projeto JDBC</h1>
<h2 align="center">Grupo 6</h2>

## Tabela Professor
<p align="left"><img width="300px" src="https://github.com/lucarauj/mjv-java-school-grupo06/blob/lucas/Projeto%20JDBC/images/ENTIDADE.png" /></p>

<br>

## Dependências:

- PostgreSQL Driver
```
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <version>42.6.0</version>
</dependency>
```

<br>

## Scrip para criação da tabela Professores no banco de dados

```
CREATE TABLE professores (
  id SERIAL4 NOT NULL,
  nome VARCHAR(100) NOT NULL,
  data_nascimento DATE NOT NULL,
  carga_horaria INTERVAL NOT NULL,
  valor_hora NUMERIC(5,2) NOT NULL,
  estrangeiro BOOLEAN NOT NULL,
  horas_disponiveis INT NOT NULL,
  biografia TEXT NOT NULL,
  data_hora_cadastro TIMESTAMP NOT NULL,
  CONSTRAINT pk_professor PRIMARY KEY(id)
);
```

<br>

## Métodos disponíveis na aplicação

- IncluirProfessor();
- AlterarProfessor();
- ListarProfessores();
- ListarProfessorPorId();
- ExcluirProfessor();

<br>

## Resultado da execução dos métodos no IntelliJ e no pgAdmin

### INSERIR

<img width="800px" src="https://github.com/lucarauj/mjv-java-school-grupo06/blob/lucas/Projeto%20JDBC/images/INSERT.png"/>

<br>

### ALTERAR

<img width="800px" src="https://github.com/lucarauj/mjv-java-school-grupo06/blob/lucas/Projeto%20JDBC/images/UPDATE.png"/>

<br>

### BUSCAR TODOS

<img width="800px" src="https://github.com/lucarauj/mjv-java-school-grupo06/blob/lucas/Projeto%20JDBC/images/FINDALL.png"/>

<br>

### BUSCAR POR ID

<img width="800px" src="https://github.com/lucarauj/mjv-java-school-grupo06/blob/lucas/Projeto%20JDBC/images/FINDBYID.png"/>

<br>

### DELETE

<img width="800px" src="https://github.com/lucarauj/mjv-java-school-grupo06/blob/lucas/Projeto%20JDBC/images/DELETE.png"/>

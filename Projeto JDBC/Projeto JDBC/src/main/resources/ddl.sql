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
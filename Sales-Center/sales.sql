create table TB_Contato(
  id_Contato int,
  nome char(255),
  nascimento char(255),
  cpf char(255),
  telefone char(255),
  celular char(255),
  email char(255)
);

create table TB_Usuario(
  id_Usuario int,
  nome char(255),
  usuario char(255),  
  senha char(255),
  email char(255),
  perfil char(255)
);

create table TB_Credito(
  id_Credito int,
  nome char(255),
  plano char(255), 
  quantidade int,
  responsavel char(255),
  primary key (id_credito),
  foreign key (nome) references TB_Contato(nome)
);

create table TB_Faturamento(
  id_Faturamento int,
  formaPagamento char(255), 
  dataVencimento char(255),
  canalDeVendas char(255),
  responsavel char(255),
  produto char(255)
);

create table TB_Endereco(
  id_Endereco int,
  cep char(255),
  rua char(255),
  numero char(255),
  complemento1 char(255),
  complemento2 char(255),
  cidade char(255),
  estado char(255),
  bairro char(255)
);


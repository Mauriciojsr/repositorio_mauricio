/*INSERT INTO autor (nome, sobrenome)
VALUES('Mauricio', 'Ramos');
INSERT INTO autor (nome, sobrenome)
VALUES('Eduardo', 'Martins');
INSERT INTO autor (nome, sobrenome)
VALUES('Diego', 'Cararro');
INSERT INTO autor (nome, sobrenome)
VALUES('Athur', 'Emanuel');
INSERT INTO autor (nome, sobrenome)
VALUES('Paulo', 'Boita');
INSERT INTO autor (nome, sobrenome)
VALUES('José', 'Augusto');
INSERT INTO autor (nome, sobrenome)
VALUES('Marcelo', 'Martins');
INSERT INTO autor (nome, sobrenome)
VALUES('Marcelo', 'Ramos');
INSERT INTO autor (nome, sobrenome)
VALUES('Mateus', 'Ramos');
INSERT INTO autor (nome, sobrenome)
VALUES('Joao', 'Antonio');

/*select * from db_loja.autor;*/

/*INSERT INTO categoria (categoria)
VALUES('Alfa');
INSERT INTO categoria (categoria)
VALUES('Bravo');
INSERT INTO categoria (categoria)
VALUES('Charlei');
INSERT INTO categoria (categoria)
VALUES('Delta');
INSERT INTO categoria (categoria)
VALUES('Eco');
INSERT INTO categoria (categoria)
VALUES('Foxtrot');
INSERT INTO categoria (categoria)
VALUES('Golf');
INSERT INTO categoria (categoria)
VALUES('India');
INSERT INTO categoria (categoria)
VALUES('Juliete');
INSERT INTO categoria (categoria)
VALUES('Kilo');

select * from db_loja.categoria;*/

/*INSERT INTO contato (nome, sobrenome, ddd, telefone, data_nasc, email)
VALUES('Mauricio', 'Ramos', 49, '991782727', '21/11/1987', 'mauriciojsr@gmail.com');
INSERT INTO contato (nome, sobrenome, ddd, telefone, data_nasc, email)
VALUES('Valentina', 'Ramos', 49, '991782727', '15/05/2014', 'mauriciojsr@gmail.com');
INSERT INTO contato (nome, sobrenome, ddd, telefone, data_nasc, email)
VALUES('Caroline', 'Martins', 49, '991782727', '19/11/1986', 'mauriciojsr@gmail.com');
INSERT INTO contato (nome, sobrenome, ddd, telefone, data_nasc, email)
VALUES('Paulo', 'Odorico', 49, '991782727', '21/11/1987', 'mauriciojsr@gmail.com');
INSERT INTO contato (nome, sobrenome, ddd, telefone, data_nasc, email)
VALUES('Marcelo', 'Martins', 49, '991782727', '21/11/1987', 'mauriciojsr@gmail.com');
INSERT INTO contato (nome, sobrenome, ddd, telefone, data_nasc, email)
VALUES('Arthur', 'Ramos', 49, '991782727', '21/11/1987', 'mauriciojsr@gmail.com');
INSERT INTO contato (nome, sobrenome, ddd, telefone, data_nasc, email)
VALUES('Geneci', 'Ramos', 49, '991782727', '21/11/1987', 'mauriciojsr@gmail.com');
INSERT INTO contato (nome, sobrenome, ddd, telefone, data_nasc, email)
VALUES('José', 'Ramos', 49, '991782727', '21/11/1987', 'mauriciojsr@gmail.com');
INSERT INTO contato (nome, sobrenome, ddd, telefone, data_nasc, email)
VALUES('Mateus', 'Ramos', 49, '991782727', '21/11/1987', 'mauriciojsr@gmail.com');
INSERT INTO contato (nome, sobrenome, ddd, telefone, data_nasc, email)
VALUES('Marcelo', 'Ramos', 49, '991782727', '21/11/1987', 'mauriciojsr@gmail.com');

select * from db_loja.contato;*/

INSERT INTO curso (nome, nivel, data_inicio, data_fim, valor)
VALUES('Sistemas de Informação', 'Superior', 01/03/2022, 16/12/2026, 'R$ 50.000,00');
INSERT INTO curso (nome, nivel, data_inicio, data_fim, valor)
VALUES('Ciências Contábeis', 'Superior', 01/03/2022, 16/12/2026, 'R$ 50.000,00');
INSERT INTO curso (nome, nivel, data_inicio, data_fim, valor)
VALUES('Administração', 'Superior', 01/03/2022, 16/12/2026, 'R$ 50.000,00');
INSERT INTO curso (nome, nivel, data_inicio, data_fim, valor)
VALUES('Educação Física', 'Superior', 01/03/2022, 16/12/2026, 'R$ 50.000,00');
INSERT INTO curso (nome, nivel, data_inicio, data_fim, valor)
VALUES('Direito', 'Superior', 01/03/2022, 16/12/2026, 'R$ 50.000,00');
INSERT INTO curso (nome, nivel, data_inicio, data_fim, valor)
VALUES('Ciência da Computação', 'Superior', 01/03/2022, 16/12/2026, 'R$ 50.000,00');
INSERT INTO curso (nome, nivel, data_inicio, data_fim, valor)
VALUES('Química', 'Superior', 01/03/2022, 16/12/2026, 'R$ 50.000,00');
INSERT INTO curso (nome, nivel, data_inicio, data_fim, valor)
VALUES('Zootecnia', 'Superior', 01/03/2022, 16/12/2026, 'R$ 50.000,00');
INSERT INTO curso (nome, nivel, data_inicio, data_fim, valor)
VALUES('Odontologia', 'Superior', 01/03/2022, 16/12/2026, 'R$ 50.000,00');
INSERT INTO curso (nome, nivel, data_inicio, data_fim, valor)
VALUES('Medicina', 'Superior', 01/03/2022, 16/12/2026, 'R$ 50.000,00');

select * from db_loja.curso;

INSERT INTO editora (nome)
VALUES('Abril');
INSERT INTO editora (nome)
VALUES('Campanhia da Letra');
INSERT INTO editora (nome)
VALUES('Globo Livros');
INSERT INTO editora (nome)
VALUES('Aleph');
INSERT INTO editora (nome)
VALUES('Campo');
INSERT INTO editora (nome)
VALUES('Sestence');
INSERT INTO editora (nome)
VALUES('Forbs');
INSERT INTO editora (nome)
VALUES('Veja');
INSERT INTO editora (nome)
VALUES('Pai Amado');
INSERT INTO editora (nome)
VALUES('Tempo');

select * from db_loja.editora;

INSERT INTO email (email)
VALUES('mauricio@gmail.com');
INSERT INTO email (email)
VALUES('mjoao@gmail.com');
INSERT INTO email (email)
VALUES('marcos@gmail.com');
INSERT INTO email (email)
VALUES('joaopaulo@gmail.com');
INSERT INTO email (email)
VALUES('matheus@gmail.com');
INSERT INTO email (email)
VALUES('emanuel@gmail.com');
INSERT INTO email (email)
VALUES('arthur@gmail.com');
INSERT INTO email (email)
VALUES('alexandre@gmail.com');
INSERT INTO email (email)
VALUES('ricardo@gmail.com');
INSERT INTO email (email)
VALUES('augusto@gmail.com');

select * from db_loja.email;*/

INSERT INTO filial (razaoSocial, nomeFantasia, endereco, cidade, cep, pais, cnpj, inscricaoEstadual)
VALUES('Bigolin', 'Materiais de Construção', 'Av Fernando Machado', 'Chapeco', '89801-000', 'Brasil', '72.256.256/0001-85', '856.276612');
INSERT INTO filial (razaoSocial, nomeFantasia, endereco, cidade, cep, pais, cnpj, inscricaoEstadual)
VALUES('Mepar', 'Materiais de Construção', 'Av Fernando Machado', 'Chapeco', '89801-001', 'Brasil', '26.568.256/0001-85', '856.298612');
INSERT INTO filial (razaoSocial, nomeFantasia, endereco, cidade, cep, pais, cnpj, inscricaoEstadual)
VALUES('Siema Borrachas', 'Automotiva', 'Av Fernando Machado', 'Chapeco', '89801-002', 'Brasil', '22.256.285/0001-85', '856.2356');
INSERT INTO filial (razaoSocial, nomeFantasia, endereco, cidade, cep, pais, cnpj, inscricaoEstadual)
VALUES('Fasolo', 'Eletronica', 'Av Fernando Machado', 'Chapeco', '89801-778', 'Brasil', '72.269.256/0001-85', '856.258512');
INSERT INTO filial (razaoSocial, nomeFantasia, endereco, cidade, cep, pais, cnpj, inscricaoEstadual)
VALUES('Express Celulares', 'Eletronica', 'Av Fernando Machado', 'Chapeco', '89801-856', 'Brasil', '72.889.256/0001-85', '856.25912');
INSERT INTO filial (razaoSocial, nomeFantasia, endereco, cidade, cep, pais, cnpj, inscricaoEstadual)
VALUES('Tojo', 'Alimentação', 'Av Fernando Machado', 'Chapeco', '89801-000', 'Brasil', '72.256.356/0001-85', '856.256612');
INSERT INTO filial (razaoSocial, nomeFantasia, endereco, cidade, cep, pais, cnpj, inscricaoEstadual)
VALUES('Frigeri', 'Materiais de Construção', 'Av Fernando Machado', 'Chapeco', '89801-258', 'Brasil', '72.006.256/0001-85', '856.296612');
INSERT INTO filial (razaoSocial, nomeFantasia, endereco, cidade, cep, pais, cnpj, inscricaoEstadual)
VALUES('Maqpar', 'Materiais de Construção', 'Av Fernando Machado', 'Chapeco', '89801-025', 'Brasil', '25.256.256/0001-15', '866.256612');
INSERT INTO filial (razaoSocial, nomeFantasia, endereco, cidade, cep, pais, cnpj, inscricaoEstadual)
VALUES('Bigolin', 'Materiais de Construção', 'Av Fernando Machado', 'Chapeco', '89801-000', 'Brasil', '72.256.256/0001-85', '856.256612');
INSERT INTO filial (razaoSocial, nomeFantasia, endereco, cidade, cep, pais, cnpj, inscricaoEstadual)
VALUES('Bigolin', 'Materiais de Construção', 'Av Fernando Machado', 'Chapeco', '89801-000', 'Brasil', '72.256.256/0001-85', '856.256612');

select * from db_loja.filial;










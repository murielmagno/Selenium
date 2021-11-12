# language: pt
Funcionalidade: Busca de carros
  Tivemos a necessidade de automatizar a busca de um carro
  utilizando o BDD na automação

  Contexto:
    Dado que estou no site da webmotors "https://www.webmotors.com.br/"

  Esquema do Cenário: Cadastrar usuário válido
    E que tenho <marca> e <modelo> validos
    Quando faço a busca
    Então eu vejo os carros com essa marca e modelo

    Exemplos:
      | marca    | modelo |
      | "Honda"  | "City" |

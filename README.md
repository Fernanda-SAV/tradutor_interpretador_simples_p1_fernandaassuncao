# COMPILADORES P1 - Fernanda Sousa de Assunção Vale
Trabalho submetido à disciplina de Compiladores - Um simples tradutor à um simples interpretador.


# Tradução dirigida por sintaxe -> Um simples tradutor à um simples interpretador. 

<div align="center">
  <img src="https://img.shields.io/badge/Versão-1.0-blue.svg" alt="Versão 1.0">
  <img src="https://img.shields.io/badge/Licença-MIT-green.svg" alt="Licença MIT">
</div>

---

## Resumo do Trabalho

> Este projeto apresenta o desenvolvimento de um simples tradutor a um simples interpretador simples baseados em uma abordagem de Tradução Dirigida por Sintaxe.
O sistema foi implementado em Java, com o objetivo de demonstrar os princípios fundamentais de análise sintática e semântica utilizados na construção de compiladores.
A partir de uma gramática simplificada, o tradutor converte expressões aritméticas e comandos básicos (como atribuição e impressão) em uma sequência de instruções intermediárias, que posteriormente são executadas por um interpretador.

## Descrição
> O projeto foi dividido em duas partes principais: o tradutor (Parser e Scanner) e o interpretador.
- Tradutor:
  - Responsável por ler e analisar a estrutura sintática de um programa simples. 
  - Identifica tokens (como let, print, números, identificadores e operadores). 
  - Gera um código intermediário em formato de instruções, simulando uma tradução dirigida por sintaxe.
- Interpretador:
  - Lê as instruções intermediárias geradas pelo tradutor.
  - Executa operações aritméticas, armazena e recupera variáveis, e imprime resultados. 
  - Implementado utilizando pilha de execução e tabela de variáveis (HashMap).

## Estrutura do Repositório

- **`/src/`**: Contém o código da construção do Tradutor ao Interpretador.
- **`/src/Main.java`**: Classe principal de execução
- **`/src/Parser.java`**: Tradutor que converte código-fonte em instruções intermediárias
- **`/src/Scanner.java`**: Analisador léxico responsável por gerar tokens
- **`/src/Token.java`**: Representação de um token (tipo e lexema)
- **`/src/TokenType.java`**: Enumeração dos tipos de tokens
- **`/src/Interpretador.java`**: Executa as instruções geradas pelo Parser

---

## Autora

- [Fernanda Sousa de Assunção Vale](fernanda.sav@discente.ufma.br)


---

## Agradecimentos

- **Universidade Federal do Maranhão (UFMA)**
- **Professor Doutor Sergio Souza Costa**
- **Colegas de curso**

Agradecemos a todas as pessoas e instituições que contribuíram para a realização deste trabalho.

---

## Materiais de Apoio para o Projeto

- [Link para material usado como referência de exercícios e exemplos](https://profsergiocosta.notion.site/Tradu-o-dirigida-por-sintaxe-bc590c67d8234f81bee5cfdb505f2dd1)

---

## Copyright / License

Este material é resultado de um trabalho acadêmico para a disciplina **Compiladores**, sob a orientação do professor **Dr. SERGIO SOUZA COSTA**, no semestre letivo **2025.2**, do curso de **Engenharia da Computação** na Universidade Federal do Maranhão (**UFMA**).

Todo o material sob esta licença é **software livre**: pode ser usado para fins acadêmicos e comerciais **sem nenhum custo**. Não há papelada, nem royalties, nem restrições de “copyleft” do tipo GNU. Ele é licenciado sob os termos da **Licença MIT**, reproduzida abaixo, e, portanto, é compatível com a GPL e também se qualifica como software de código aberto. É de domínio público. O espírito desta licença é que você é livre para usar este material para qualquer finalidade, sem nenhum custo. O único requisito é que, se você usá-lo, me dê crédito.



Copyright © 2025 Material Educacional

Este material está licenciado sob a Licença MIT. É permitido o uso, cópia, modificação, e distribuição deste material para qualquer fim, desde que acompanhado deste aviso de direitos autorais.

O MATERIAL É FORNECIDO "COMO ESTÁ", SEM GARANTIA DE QUALQUER TIPO, EXPRESSA OU IMPLÍCITA, INCLUINDO, MAS NÃO SE LIMITANDO ÀS GARANTIAS DE COMERCIALIZAÇÃO, ADEQUAÇÃO A UM DETERMINADO FIM E NÃO VIOLAÇÃO. EM HIPÓTESE ALGUMA OS AUTORES OU DETENTORES DE DIREITOS AUTORAIS SERÃO RESPONSÁVEIS POR QUALQUER RECLAMAÇÃO, DANOS OU OUTRA RESPONSABILIDADE, SEJA EM UMA AÇÃO DE CONTRATO, ATO ILÍCITO OU DE OUTRA FORMA, DECORRENTE DE, OU EM CONEXÃO COM O MATERIAL OU O USO OU OUTRAS NEGOCIAÇÕES NO MATERIAL.

Para mais informações sobre a Licença MIT: https://opensource.org/licenses/MIT.

Copyright © 2025 Educational Material

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Para mais informações sobre a **Licença MIT**: [https://opensource.org/licenses/MIT](https://opensource.org/licenses/MIT).

---

<div align="center">
Feito com ♥ por <strong>Alunos UFMA</strong>
</div>
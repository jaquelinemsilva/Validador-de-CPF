# Validador de CPF

Projeto simples em Java que valida a estrutura de um CPF e a correspondência entre o CPF e o estado informado pelo usuário.

## Funcionalidades:

- Validar se o CPF digitado possui 11 dígitos numéricos válidos.
- Valida se o CPF digitado corresponde ao estado informado através do 9º dígito do CPF (região fiscal).
- Lança exceções personalizadas em caso de dados inválidos.

## Exceções:

O projeto define duas exceções personalizadas:

- CpfInvalidoException: é lançada quando é digitado um CPF que não tenha 11 dígitos.
- RegiaoCpfException é lançada quando o 9º dígito do CPF não corresponde ao estado informado pelo usuário.

Tabela com os dígitos e seus respectivos estados:

| Dígito (posição 9) | Região Correspondente |
|--------------------|------------------------|
| 0                  | Rio Grande do Sul      |
| 1                  | DF, GO, MT, MS, TO     |
| 2                  | AC, AM, AP, PA, RO, RR |
| 3                  | CE, MA, PI             |
| 4                  | AL, PB, PE, RN         |
| 5                  | BA, SE                 |
| 6                  | MG                     |
| 7                  | ES, RJ                 |
| 8                  | SP                     |
| 9                  | PR, SC                 |

A digitação dos estados precisa ter pontuação e é case-insensitive, pois na digitação do estado já será convertido para LowerCase.

## Tecnologias utilizadas:

- Java 21+
- Paradigma Orientado a Objetos (POO).

## Como executar:

- Clone o repositório:
   ```bash
   git clone https://github.com/jaquelinemsilva/Validador-de-CPF.git

- Compile e execute no terminal:
  ```bash
  javac Main.java
  java Main

# Autora:

Jaqueline Maria

- LinkedIn: https://www.linkedin.com/in/jaquelinemariadev/

- GitHub: https://github.com/jaquelinemsilva



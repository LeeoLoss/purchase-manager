![Visitantes](https://komarev.com/ghpvc/?username=leonardoloss&label=Visualizações&color=0e75b6&style=flat)

# Purchase Manager

Projeto simples em Java para gerenciar compras feitas com cartão de crédito, controlando limite, saldo e histórico de compras.

---

## Funcionalidades

- Definir limite inicial do cartão de crédito.
- Registrar compras, respeitando saldo disponível.
- Listar histórico de compras ordenado pelo valor.
- Exibir saldo restante no cartão.

---

## Como usar

1. Execute a classe `Principal`.
2. Informe o limite do cartão.
3. Insira a descrição e o valor das compras.
4. Escolha continuar ou sair após cada compra.
5. Ao finalizar, o programa exibirá o histórico de compras e o saldo final.

---

## Estrutura do projeto

- `purchases.Principal`: classe principal que executa o fluxo do programa.
- `purchases.Purchase`: representa uma compra, com descrição e valor.
- `purchases.CreditCard`: gerencia o saldo, limite e lista de compras.

---

## Requisitos

- Java 20 ou superior.

---

## Como compilar e executar

```bash
javac compras/*.java
java compras.Principal

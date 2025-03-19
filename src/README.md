# Cofrinho de Moedas - Projeto em Java

## Descrição
Este projeto implementa um sistema de cofrinho de moedas utilizando os princípios da Programação Orientada a Objetos (POO). O objetivo é permitir que o usuário gerencie um cofrinho adicionando, removendo e listando moedas, além de calcular o valor total convertido para Real.

## Funcionalidades
- **Adicionar Moedas**: Permite adicionar moedas de diferentes valores e países ao cofrinho.
- **Remover Moedas**: Remove uma moeda específica do cofrinho.
- **Listar Moedas**: Exibe todas as moedas armazenadas no cofrinho.
- **Converter para Real**: Calcula o valor total das moedas no cofrinho convertido para Real.

## Estrutura do Projeto
O projeto é composto pelas seguintes classes:
- `Moeda` (classe abstrata) - Classe mãe que define o comportamento comum das moedas.
- `Real`, `Dolar`, `Euro` - Classes que representam moedas específicas, herdando de `Moeda`.
- `Cofrinho` - Classe responsável por armazenar e gerenciar as moedas.
- `Main` - Classe principal que contém o menu interativo para o usuário.

## Como Executar
1. Importe o projeto no Eclipse ou em outra IDE compatível com Java.
2. Compile e execute a classe `Main.java`.
3. Utilize o menu interativo para adicionar, remover e visualizar moedas no cofrinho.

## Requisitos
- Java 8 ou superior.
- Eclipse ou outra IDE de sua preferência.

## Estilização do Terminal
O projeto inclui estilização do terminal utilizando ANSI SGR para melhorar a experiência do usuário. As cores e formatações ajudam a destacar mensagens importantes no menu e nas interações.




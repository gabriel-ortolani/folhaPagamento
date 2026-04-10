# 📄 Sistema de Cadastro de Funcionários (Java)

## 📌 Descrição
Este é um sistema simples em Java para cadastro de funcionários e geração de folha de pagamento.  
O programa roda no terminal e permite cadastrar diferentes tipos de funcionários, calculando automaticamente seus salários com base em regras específicas.

---

## ⚙️ Funcionalidades

O sistema possui um menu com as seguintes opções:

### 1. Cadastrar Funcionário Padrão
- Salário fixo de R$ 2000,00  
- Sem adicionais  

### 2. Cadastrar Funcionário Comissionado
- Salário base de R$ 2000,00  
- Recebe comissão sobre vendas  

### 3. Cadastrar Funcionário de Produção
- Salário base de R$ 2000,00  
- Recebe adicional baseado na quantidade de peças produzidas  

### 4. Gerar Folha de Pagamento
Exibe todos os funcionários cadastrados com:
- Nome  
- Matrícula  
- Salário total  
- Adicional recebido  

### 0. Sair do programa

---

## 🧠 Estrutura do Código

### Classe `Funcionario`
Armazena os dados de cada funcionário:

- `nome`  
- `matricula`  
- `salario`  
- `adicional`  

---

### Classe `A3`
Responsável por:

- Controlar o menu  
- Cadastrar funcionários  
- Armazenar dados em uma `ArrayList`  
- Gerar a folha de pagamento  

---

## 💰 Regras de Cálculo

### Funcionário Padrão
```java
salariob = 2000  
adicional = 0  
```
### Funcionário Comissionado
```java
adicional = valorVendas * percentual
pagamento = salariob + adicional
```
### Funcionário de Produção
```java
adicional = quantidadePeças * valorPorPeça
Salario = salariob + adicional  
```

---

## ▶️ Como Executar

1. Compile o código:  
```java
javac A3.java  
```
2. Execute o programa: 
```java
java A3  
```

## ⚠️ Validações

O programa possui validações para evitar erros:

- Valores negativos não são permitidos  
- Percentual de comissão deve estar entre 0 e 100  

---

# LAMBDA EXPRESSIONS - JAVA

Projeto em Java desenvolvido para praticar o uso de **Expressões Lambda**, `Predicate` e manipulação de listas com `forEach`.

---

# 📚 Conceitos abordados

- Expressões Lambda
- Interface funcional `Predicate`
- `forEach`
- Programação funcional no Java
- Filtragem de listas
- `ArrayList`
- Métodos de referência e critérios dinâmicos

---

# 📁 Estrutura do projeto

```bash
src/
│
├── Main.java
└── Cliente.java
```

---

# 🚀 Funcionamento do projeto

O sistema cria uma lista de clientes e utiliza expressões lambda para filtrar dados de acordo com critérios específicos.

Os clientes podem ser exibidos por:

- Clientes ativos
- Nomes com mais de 4 letras
- Nomes que começam com a letra "A"

---

# 🧠 Classe `Cliente`

Representa um cliente com os atributos:

- `id`
- `nome`
- `email`
- `ativo`

Além disso, a classe sobrescreve o método `toString()` para facilitar a exibição dos dados.

---

# ▶ Classe `Main`

Responsável por:

- Criar a lista de clientes
- Adicionar clientes ao `ArrayList`
- Exibir os dados
- Aplicar filtros usando `Predicate`

---

# ⚡ Uso de Lambda

Exemplo de expressão lambda:

```java
c -> c.isAtivo()
```

Essa lambda verifica se o cliente está ativo.

---

# 🔎 Método genérico de filtragem

O projeto utiliza um método reutilizável para aplicar diferentes critérios:

```java
public static void exibe_por_criterio(ArrayList<Cliente> lista, Predicate<Cliente> predicate)
```

Isso permite criar filtros de forma dinâmica e reutilizável.

---

# 💻 Exemplos de filtros

## Clientes ativos

```java
exibe_por_criterio(lista, c -> c.isAtivo());
```

---

## Nomes maiores que 4 letras

```java
exibe_por_criterio(lista, c -> c.getNome().length() > 4);
```

---

## Nomes que começam com "A"

```java
exibe_por_criterio(lista, c -> c.getNome().startsWith("A"));
```

---

# 🛠 Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Programação Funcional

---

# 🎯 Objetivo educacional

Este projeto foi desenvolvido para praticar:

- Expressões Lambda
- Uso de `Predicate`
- Filtragem de listas
- Boas práticas com métodos reutilizáveis
- Conceitos de programação funcional no Java

---

# 📌 Aprendizados importantes

## ✔ Lambda Expression

Permite escrever funções de forma mais curta e objetiva.

Exemplo:

```java
c -> c.isAtivo()
```

Equivale a:

```java
public boolean testar(Cliente c) {
    return c.isAtivo();
}
```

---

# 👨‍💻 Autor

Projeto desenvolvido para estudos de Java, Lambda Expressions e Programação Funcional.

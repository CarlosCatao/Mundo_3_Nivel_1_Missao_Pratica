<img src="./Estacio horizontal.png" align="left" height="64px" /><br><br>
# Curso: Desenvolvimento Full Stack
## Mundo 3 - Nível 1 - Missão Prática

## RPG0014  - Iniciando o caminho pelo Java

## 🎯 Objetivo da Prática

Este é um projeto acadêmico e tem como objetivo aplicar os fundamentos da Programação Orientada a Objetos em Java, desenvolvendo um sistema de cadastro de clientes com persistência em arquivos binários.

Esta prática esta dividida em dois procedimentos:
- Procedimento 1: Criação das Entidades e Sistema de Persistência
- Procedimento 2: Criação do Cadastro em Modo Texto

## 🛠️ Funcionalidades Implementadas

- Criação das classes `Pessoa`, `PessoaFisica` e `PessoaJuridica` utilizando herança e polimorfismo.
- Implementação da interface `Serializable` para permitir persistência em arquivos.
- Criação dos repositórios `PessoaFisicaRepo` e `PessoaJuridicaRepo` com métodos: `inserir`, `alterar`, `excluir`, `obter`, `obterTodos`, `persistir`, `recuperar`.
- Cadastro e exibição de dados no método `main`.
- Interface em modo texto com as opções:
  - Incluir, alterar, excluir, obter por ID, listar todos, salvar e recuperar dados.

## 🧩 Estrutura do Projeto

```
MUNDO_3_NIVEL_1-MISSAO_PRATICA
│
├── Procedimento 1
│   │
│   ├── cadastropoo/
│   │   │
│   │   ├── model/
│   │   │   ├── Pessoa.java
│   │   │   ├── PessoaFisica.java
│   │   │   ├── PessoaJuridica.java
│   │   │   ├── PessoaFisicaRepo.java
│   │   │   └── PessoaJuridicaRepo.java
│   │   │
│   │   ├── CadastroPOO.java  # Classe principal com │   │   │    método main
│   │   │
│   │   ├── pessoas_fisicas.dat
│   │   │
│   │   └── pessoas_juridicas.dat
│   │
│   ├── OUTPUT.pdf
│   │
│   └── RELATORIO_CARLOS_ALTOMARE_CATAO.pdf
│
├── Procedimento 2
│   │
│   ├── cadastropoo/
│   │   │
│   │   ├── model/
│   │   │   ├── Pessoa.java
│   │   │   ├── PessoaFisica.java
│   │   │   ├── PessoaJuridica.java
│   │   │   ├── PessoaFisicaRepo.java
│   │   │   └── PessoaJuridicaRepo.java
│   │   │
│   │   ├── CadastroPOO.java  # Classe principal com │   │   │    método main
│   │   │
│   │   ├── pessoas_fisicas.dat
│   │   │
│   │   └── pessoas_juridicas.dat
│   │
│   ├── OUTPUT.pdf
│   │
│   └── RELATORIO_CARLOS_ALTOMARE_CATAO.pdf
│
│
└── README.md
```

## 📋 Requisitos do Projeto

- JDK
- IDE NetBeans
- Computador com JDK e NetBeans instalados

## 🧪 Resultados da Execução

Os dados são persistidos com sucesso nos arquivos binários e recuperados corretamente. O sistema exibe os dados de forma organizada com as opções do menu.

## 🧠 Análise e Conclusão

**1. Quais as vantagens e desvantagens do uso de herança?**  
Vantagens: reutilização de código, estrutura clara e organizada.  
Desvantagens: pode causar acoplamento excessivo e dificultar mudanças futuras.

**2. Por que a interface Serializable é necessária ao efetuar persistência em arquivos binários?**  
Permite transformar objetos em bytes para que possam ser armazenados ou transmitidos.

**3. Como o paradigma funcional é utilizado pela API stream no Java?**  
Através de operações como `map`, `filter`, `forEach`, `collect`, utilizando expressões lambda e programação declarativa.

**4. Quando trabalhamos com Java, qual padrão de desenvolvimento é adotado na persistência de dados em arquivos?**  
É adotado o padrão de serialização de objetos com `ObjectOutputStream` e `ObjectInputStream`.

**5. O que são elementos estáticos e qual o motivo para o método main adotar esse modificador?**  
Elementos estáticos pertencem à classe, e não a um objeto específico. O método `main` é o ponto de entrada da aplicação e é declarado como static porque ele precisa ser executado sem a criação de uma instância da classe principal.

**6. Para que serve a classe Scanner?**  
A classe Scanner é usada para ler entradas do usuário, como textos ou números, diretamente do teclado (via System.in).

**7. Como o uso de classes de repositório impactou na organização do código?**  
O uso de repositórios promoveu uma organização do código baseada na separação de responsabilidades, tornando o código mais limpo e modular. Cada tipo de entidade (Pessoa Física ou Jurídica) tem seu próprio controle de dados, o que facilita a manutenção, a leitura e a escalabilidade do sistema.

---

## 📁 Documentação

O relatório completo da prática pode ser acessado nos arquivos:

- [📄 Relatório Procedimento 1 em PDF](./Procedimento_1/RELATORIO_CARLOS_ALTOMARE_CATAO.pdf)
- [📝 Relatório Procedimento 2 em PDF](./Procedimento_2/RELATORIO_CARLOS_ALTOMARE_CATAO.pdf)

---

## 👨‍💻 Desenvolvido por

**Carlos Altomare Catao**  
Curso: Desenvolvedor Full Stack – Estácio  
Campus: Polo Santa Luzia  
Semestre: 2025/1 - 3 Período

---

## 🔗 Repositório Git

> https://github.com/CarlosCatao/Mundo_3_Nivel_1_Missao_Pratica/tree/main

---



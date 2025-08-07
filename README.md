# 🚀 Projeto DIO - Abstraindo um Bootcamp com POO

Este projeto foi desenvolvido como parte do curso de **Programação Orientada a Objetos (POO)** da Digital Innovation One (DIO). O objetivo é colocar em prática os pilares da orientação a objetos, como **abstração**, **encapsulamento**, **herança** e **polimorfismo**, criando um modelo que representa um **Bootcamp** e seus participantes.

## 🧠 Objetivo

Modelar um sistema de **Bootcamp**, onde desenvolvedores podem se inscrever, participar de cursos e mentorias, e acumular experiência à medida que completam conteúdos.

## 🛠️ Tecnologias Utilizadas

- Java (JDK 17+)
- IDE (IntelliJ, VS Code ou Eclipse)

## 📚 Conceitos Aplicados

- Classes e Objetos
- Abstração
- Encapsulamento
- Herança
- Polimorfismo
- Coleções (List, Set, Map)
- `equals()` e `hashCode()`

## 🏗️ Estrutura do Projeto

- `Bootcamp` → contém o nome, descrição, data de início e fim, e uma lista de conteúdos.
- `Dev` → representa o desenvolvedor, com métodos para se inscrever, progredir e calcular XP.
- `Conteudo` (abstract) → classe base com título e descrição, além de método abstrato para XP.
    - `Curso` → herda de Conteudo e possui carga horária.
    - `Mentoria` → herda de Conteudo e possui data.

## 📈 Regras de Negócio

- O Dev pode se inscrever em um Bootcamp.
- O Dev progride no conteúdo conforme consome Cursos e Mentorias.
- Cada conteúdo dá uma quantidade de XP.
- O sistema deve calcular o total de XP acumulado.

## ✅ Exemplo de Funcionamento

```java
Dev rodrigo = new Dev("Rodrigo");
rodrigo.inscreverBootcamp(bootcampJava);
rodrigo.progredir();
System.out.println("XP: " + rodrigo.calcularTotalXp());

📦 Como Executar

    Clone o repositório:

    git clone https://github.com/seu-usuario/nome-do-repositorio.git

    Abra na sua IDE favorita.

    Execute a classe Main com o método main.

📝 Licença

Projeto com fins educacionais, desenvolvido no curso da DIO.
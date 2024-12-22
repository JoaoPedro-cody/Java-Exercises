----Exercícios de Java: Objetos, Encapsulamento, Vetores e Listas----

***Sobre o Repositório***

Este repositório contém uma série de exercícios práticos desenvolvidos para aprimorar meus conhecimentos em Java, com foco nos seguintes tópicos:

 * Objetos: Compreensão e implementação de classes e objetos.

 * Encapsulamento: Uso de modificadores de acesso, getters e setters para proteger e controlar os dados.

 * Vetores: Manipulação de arrays unidimensionais.

 * Listas: Uso de coleções como ArrayList para armazenar e gerenciar conjuntos dinâmicos de dados.

***Tecnologias Utilizadas***

Java: Linguagem de programação principal.

IDE: Intellij IDEA

***Estrutura do Repositório***

 * src/: Contém todos os arquivos de código fonte organizados por tópico.

   * application/: Contém a classe principal (main) que executa os exercícios.

   * entities/: Contém as classes de objetos utilizadas nos exercícios.
   
***Como Executar***

Clone o repositório:

1.git clone https://github.com/JoaoPedro-cody/ExerciciosJava

2.Importe o projeto em sua IDE de preferência.

3.Navegue até a pasta src/application/ e execute o arquivo principal.

***Exemplo de Código***

*Encapsulamento*

package Entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        salary += salary * percentage / 100;

    }

    @Override
    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

}

Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para adicionar exercicios ou comentarios.




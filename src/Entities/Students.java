package Entities;

public class Students {
    private String name;
    private double nota1;
    private double nota2;
    private double average;

    public Students(String name, double nota1, double nota2, double average) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }
}

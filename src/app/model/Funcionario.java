package app.model;

public class Funcionario {
    
    private String nome;
    private String sobrenome;
    private int idade;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String sobrenome, int idade, String cargo, double salario) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;

    
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

}

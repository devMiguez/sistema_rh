package classes;

import interfaces.Atributos;

public class Gerente extends Funcionario implements Atributos {
    private double salarioGerente = 5000.00;
    private Atributos atributos;

    //Constructor
    public Gerente(String nome, int cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.atributos = atributos;
    }

    //Getters and Setters
    public double getGerente() {
        return salarioGerente;
    }

    public void setGerente(double salarioGerente) {
        this.salarioGerente = salarioGerente;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    //Cálculo dos Atributos do Gerente
    @Override
    public void calculoFgts() {
        double resultado;

        resultado = salarioGerente * 0.08;
    }

    @Override
    public void calculoInss() {
        double resultado;

        resultado = salarioGerente * 0.09 - 15.57;
    }

    @Override
    public void calculo13() {
        double resultado;

        resultado = salarioGerente * 2;
    }

    @Override
    public void calculoFerias() {
        double resultado;

        resultado = salarioGerente * 1.33;
    }
    
}

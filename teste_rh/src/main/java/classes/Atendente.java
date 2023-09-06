package classes;

import interfaces.Atributos;

public class Atendente extends Funcionario implements Atributos{
    private double salarioAtendente = 1500.00;
    private Atributos atributos;

    //Constructor
    public Atendente(String nome, int cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.atributos = atributos;
    }
    
    //Getters and Setters
    public double getAtendente() {
        return salarioAtendente;
    }

    public void setAtendente(double salarioAtendente) {
        this.salarioAtendente = salarioAtendente;
    }


    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    //Cáulculo tributos
    @Override
    public void calculoFgts() {
        double resultado;

        resultado = salarioAtendente * 0.08;
    }

    @Override
    public void calculoInss() {
        double resultado;

        resultado = salarioAtendente * 0.09 - 15.57;
    }

    @Override
    public void calculo13() {
        double resultado;

        resultado = salarioAtendente * 2;
    }

    @Override
    public void calculoFerias() {
        double resultado;

        resultado = salarioAtendente * 1.33;
    }
}

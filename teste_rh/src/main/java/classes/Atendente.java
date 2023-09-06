package classes;

import interfaces.Atributos;

public class Atendente extends Funcionario implements Atributos{
    private double atendente;
    private Atributos atributos;

    //Constructor
    public Atendente(String nome, int cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.atributos = atributos;
    }
    
    //Getters and Setters
    public double getAtendente() {
        return atendente;
    }

    public void setAtendente(double atendente) {
        this.atendente = atendente;
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

    }

    @Override
    public void calculoInss() {

    }

    @Override
    public void calculo13() {

    }

    @Override
    public void calculoFerias() {
   
    }
}

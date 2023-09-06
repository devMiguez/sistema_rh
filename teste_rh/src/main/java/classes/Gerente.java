package classes;

import interfaces.Atributos;

public class Gerente extends Funcionario implements Atributos {
    private Atributos atributos;

    //Constructor
    public Gerente(String nome, int cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.atributos = atributos;
    }

    //Getters and Setters
    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    //Cálculo dos Atributos do Gerente
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

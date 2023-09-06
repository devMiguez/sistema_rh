package classes;

import interfaces.Atributos;

public class Atendente extends Funcionario {
    private Atributos atributos;

    //Constructor
    public Atendente(String nome, int cpf, Endereco endereco) {
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
}

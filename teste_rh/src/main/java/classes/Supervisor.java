package classes;

import interfaces.Atributos;

public class Supervisor extends Funcionario{
    private Atributos atributos;

    //Constructor
    public Supervisor(String nome, int cpf, Endereco endereco) {
        super(nome, cpf, endereco);
    }


    //Getters and Setters
    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }
    
}
